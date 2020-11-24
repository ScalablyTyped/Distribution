package typings.svgSprite.mod

import typings.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGSpriter extends js.Object {
  
  /**
    * Registering source SVG files
    * @param file Absolute path to the SVG file or a vinyl file object carrying all the necessary values (the following arguments are ignored then).
    * @param name The "local" part of the file path, possibly including subdirectories which will get traversed to CSS selectors using the shape.id.separator configuration option.
    * @param svg SVG file content.
    */
  def add(file: String, name: String, svg: String): SVGSpriter = js.native
  /**
    * Registering source SVG files
    * @param file Absolute path to the SVG file or a vinyl file object carrying all the necessary values (the following arguments are ignored then).
    */
  def add(file: File): SVGSpriter = js.native
  def add(file: File, name: String, svg: String): SVGSpriter = js.native
  
  /**
    * Triggering the sprite compilation
    * @param callback Callback triggered when the compilation has finished.
    */
  def compile(callback: CompileCallback): Unit = js.native
  /**
    * Triggering the sprite compilation
    * @param config Configuration object setting the output mode parameters for a single compilation run. If omitted, the mode property of the main configuration used for the constructor will be used.
    * @param callback Callback triggered when the compilation has finished.
    */
  def compile(config: Config, callback: CompileCallback): SVGSpriter = js.native
  
  /**
    * Accessing the intermediate SVG resources
    * @param dest Base directory for the SVG files in case the will be written to disk.
    * @param callback Callback triggered when the shapes are available.
    */
  def getShapes(dest: String, callback: GetShapesCallback): Unit = js.native
}

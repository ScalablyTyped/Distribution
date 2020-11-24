package typings.textToSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("text-to-svg", JSImport.Namespace)
@js.native
class ^ protected () extends TextToSVG {
  /**
    * Create an instance of the SVG generator, using an already parsed font file.
    *
    * You can also use {@see TextToSVG.loadSync} to create an instance with a font
    * file path or from the default font.
    *
    * @param font parsed font file
    */
  def this(font: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Font */ js.Any) = this()
}
@JSImport("text-to-svg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Asynchronously load a font from an URL and create a TextToSVG instance.
    * For supported file types see the "opentype.js" documentation.
    *
    * @param url of font to load
    * @param callback called, when instance has been created
    */
  def load(url: String, callback: LoadCallback): Unit = js.native
  
  /**
    * Synchronously load a font from the filesystem and create a TextToSVG instance.
    * For supported file types see the "opentype.js" documentation.
    * If no path is provided, the default font will be used.
    *
    * @param file path to font file
    */
  def loadSync(): TextToSVG = js.native
  def loadSync(file: String): TextToSVG = js.native
}

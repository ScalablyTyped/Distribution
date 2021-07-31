package typings.stylus.mod.Stylus

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends StObject {
  
  /**
    * Return a new `Renderer` for the given `str` and `options`.
    */
  def apply(str: String): Renderer = js.native
  def apply(str: String, options: RenderOptions): Renderer = js.native
  
  var Compiler: Instantiable0[typings.stylus.mod.Stylus.Compiler] = js.native
  
  var Evaluator: Instantiable0[typings.stylus.mod.Stylus.Evaluator] = js.native
  
  var Parser: Instantiable0[typings.stylus.mod.Stylus.Parser] = js.native
  
  var Visitor: Instantiable0[typings.stylus.mod.Stylus.Visitor] = js.native
  
  /**
    * Convert the given `css` to `stylus` source.
    */
  def convertCSS(css: String): String = js.native
  
  /**
    * Expose BIFs.
    */
  var functions: Functions = js.native
  
  /**
    * Expose middleware.
    */
  def middleware(dir: String): Middleware = js.native
  def middleware(options: js.Any): Middleware = js.native
  
  /**
    * Expose nodes.
    */
  var nodes: NodeStatic = js.native
  
  /**
    * Render the given `str` with `options` and callback `fn(err, css)`.
    */
  def render(str: String, callback: RenderCallback): Unit = js.native
  def render(str: String, options: RenderOptions, callback: RenderCallback): Unit = js.native
  
  /**
    * Return a url() function with the given `options`.
    */
  def resolver(options: js.Any): LiteralFunction = js.native
  
  /**
    * Return a url() function with the given `options`.
    */
  def url(): LiteralFunction = js.native
  def url(options: UrlOptions): LiteralFunction = js.native
  /**
    * Return a url() function with the given `options`.
    */
  @JSName("url")
  var url_Original: UrlFunction = js.native
  
  /**
    * Expose utils.
    */
  var utils: Utils = js.native
  
  /**
    * Library version.
    */
  var version: String = js.native
}

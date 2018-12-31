package typings
package stylusLib.stylusMod.StylusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var Compiler: org.scalablytyped.runtime.Instantiable0[Compiler] = js.native
  var Evaluator: org.scalablytyped.runtime.Instantiable0[Evaluator] = js.native
  var Parser: org.scalablytyped.runtime.Instantiable0[Parser] = js.native
  var Visitor: org.scalablytyped.runtime.Instantiable0[Visitor] = js.native
  /**
    * Expose BIFs.
    */
  var functions: Functions = js.native
  /**
    * Expose nodes.
    */
  var nodes: NodeStatic = js.native
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
  var version: java.lang.String = js.native
  /**
    * Return a new `Renderer` for the given `str` and `options`.
    */
  def apply(str: java.lang.String): Renderer = js.native
  def apply(str: java.lang.String, options: RenderOptions): Renderer = js.native
  /**
    * Convert the given `css` to `stylus` source.
    */
  def convertCSS(css: java.lang.String): java.lang.String = js.native
  /**
    * Expose middleware.
    */
  def middleware(dir: java.lang.String): Middleware = js.native
  def middleware(options: js.Any): Middleware = js.native
  /**
    * Render the given `str` with `options` and callback `fn(err, css)`.
    */
  def render(str: java.lang.String, callback: RenderCallback): scala.Unit = js.native
  def render(str: java.lang.String, options: RenderOptions, callback: RenderCallback): scala.Unit = js.native
  /**
    * Return a url() function with the given `options`.
    */
  def resolver(options: js.Any): LiteralFunction = js.native
  /**
    * Return a url() function with the given `options`.
    */
  def url(options: UrlOptions): LiteralFunction = js.native
}


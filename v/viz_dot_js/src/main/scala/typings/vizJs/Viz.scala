package typings.vizJs

import typings.std.HTMLImageElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viz extends StObject {
  
  def renderImageElement(src: String): js.Promise[HTMLImageElement] = js.native
  def renderImageElement(src: String, options: Options): js.Promise[HTMLImageElement] = js.native
  
  def renderJSONObject(src: String): js.Promise[js.Object] = js.native
  def renderJSONObject(src: String, options: Options): js.Promise[js.Object] = js.native
  
  def renderSVGElement(src: String): js.Promise[SVGSVGElement] = js.native
  def renderSVGElement(src: String, options: Options): js.Promise[SVGSVGElement] = js.native
  
  def renderString(src: String): js.Promise[String] = js.native
  def renderString(src: String, options: Options): js.Promise[String] = js.native
}

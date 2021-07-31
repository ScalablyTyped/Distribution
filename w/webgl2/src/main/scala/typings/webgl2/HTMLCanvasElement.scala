package typings.webgl2

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.WebGLContextAttributes
import typings.webgl2.webgl2Strings.`experimental-webgl2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCanvasElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  @JSName("getContext")
  def getContext_experimentalwebgl2(contextId: `experimental-webgl2`): WebGL2RenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_experimentalwebgl2(contextId: `experimental-webgl2`, contextAttributes: WebGLContextAttributes): WebGL2RenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: typings.webgl2.webgl2Strings.webgl2): WebGL2RenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl2(contextId: typings.webgl2.webgl2Strings.webgl2, contextAttributes: WebGLContextAttributes): WebGL2RenderingContext | Null = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
}

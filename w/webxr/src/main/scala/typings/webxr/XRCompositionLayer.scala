package typings.webxr

import typings.std.AddEventListenerOptions
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRCompositionLayer
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_redraw")
  def addEventListener(`type`: "redraw", callback: js.Function1[/* evt */ XRLayerEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_redraw")
  def addEventListener(`type`: "redraw", callback: js.Function1[/* evt */ XRLayerEvent, Any], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_redraw")
  def addEventListener(
    `type`: "redraw",
    callback: js.Function1[/* evt */ XRLayerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  var blendTextureSourceAlpha: Boolean = js.native
  
  var chromaticAberrationCorrection: js.UndefOr[Boolean] = js.native
  
  def destroy(): Unit = js.native
  
  val layout: XRLayerLayout = js.native
  
  val mipLevels: Double = js.native
  
  val needsRedraw: Boolean = js.native
  
  // Events
  def onredraw(evt: XRLayerEvent): Any = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_redraw")
  def removeEventListener(`type`: "redraw", callback: js.Function1[/* evt */ XRLayerEvent, Any]): Unit = js.native
  
  var space: XRSpace = js.native
}

package typings.webxr

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * XRInputSourceEvents are fired to indicate changes to the state of an XRInputSource.
  * ref: https://immersive-web.github.io/webxr/#xrinputsourceevent-interface
  */
@js.native
trait XRInputSourceEvent
  extends StObject
     with Event {
  
  val frame: XRFrame = js.native
  
  val inputSource: XRInputSource = js.native
  
  @JSName("type")
  val type_XRInputSourceEvent: XRInputSourceEventType = js.native
}

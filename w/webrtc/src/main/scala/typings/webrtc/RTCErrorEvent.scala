package typings.webrtc

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcerrorevent
@js.native
trait RTCErrorEvent
  extends StObject
     with Event {
  
  val error: RTCError = js.native
}

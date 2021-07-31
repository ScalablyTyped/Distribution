package typings.webxr.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRInputSourceEvent
  extends StObject
     with Event {
  
  val frame: XRFrame = js.native
  
  val inputSource: XRInputSource = js.native
}

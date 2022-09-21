package typings.webxr

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * XRSessionEvents are fired to indicate changes to the state of an XRSession.
  * ref: https://immersive-web.github.io/webxr/#xrsessionevent-interface
  */
@js.native
trait XRSessionEvent
  extends StObject
     with Event {
  
  val session: XRSession = js.native
}

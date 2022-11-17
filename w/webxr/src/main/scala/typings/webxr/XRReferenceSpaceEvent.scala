package typings.webxr

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * XRReferenceSpaceEvents are fired to indicate changes to the state of an XRReferenceSpace.
  *
  * ref: https://immersive-web.github.io/webxr/#xrreferencespaceevent-interface
  */
// tslint:disable-next-line no-unnecessary-class
@js.native
trait XRReferenceSpaceEvent
  extends StObject
     with Event {
  
  val referenceSpace: XRReferenceSpace = js.native
  
  val transform: js.UndefOr[XRRigidTransform] = js.native
  
  @JSName("type")
  val type_XRReferenceSpaceEvent: "reset" = js.native
}

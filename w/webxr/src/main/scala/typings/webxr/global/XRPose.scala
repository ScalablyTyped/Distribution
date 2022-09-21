package typings.webxr.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a position and orientation in space relative to an XRSpace.
  *
  * ref: https://immersive-web.github.io/webxr/#xrpose-interface
  */
@JSGlobal("XRPose")
@js.native
abstract class XRPose ()
  extends StObject
     with typings.webxr.XRPose {
  
  /* CompleteClass */
  override val emulatedPosition: Boolean = js.native
  
  /* CompleteClass */
  override val transform: typings.webxr.XRRigidTransform = js.native
}

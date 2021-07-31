package typings.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XRHitTestTrackableType extends StObject
@JSImport("three/src/renderers/webxr/WebXR", "XRHitTestTrackableType")
@js.native
object XRHitTestTrackableType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XRHitTestTrackableType & Double] = js.native
  
  @js.native
  sealed trait mesh
    extends StObject
       with XRHitTestTrackableType
  /* 2 */ val mesh: typings.three.webXRMod.XRHitTestTrackableType.mesh & Double = js.native
  
  @js.native
  sealed trait plane
    extends StObject
       with XRHitTestTrackableType
  /* 1 */ val plane: typings.three.webXRMod.XRHitTestTrackableType.plane & Double = js.native
  
  @js.native
  sealed trait point
    extends StObject
       with XRHitTestTrackableType
  /* 0 */ val point: typings.three.webXRMod.XRHitTestTrackableType.point & Double = js.native
}

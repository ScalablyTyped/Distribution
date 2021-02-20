package typings.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XRHitTestTrackableType extends StObject
@JSImport("three/src/renderers/webxr/WebXR", "XRHitTestTrackableType")
@js.native
object XRHitTestTrackableType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XRHitTestTrackableType with Double] = js.native
  
  @js.native
  sealed trait mesh extends XRHitTestTrackableType
  /* 2 */ val mesh: typings.three.webXRMod.XRHitTestTrackableType.mesh with Double = js.native
  
  @js.native
  sealed trait plane extends XRHitTestTrackableType
  /* 1 */ val plane: typings.three.webXRMod.XRHitTestTrackableType.plane with Double = js.native
  
  @js.native
  sealed trait point extends XRHitTestTrackableType
  /* 0 */ val point: typings.three.webXRMod.XRHitTestTrackableType.point with Double = js.native
}

package typings.webxr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XRHitTestTrackableType extends StObject
@JSImport("webxr", "XRHitTestTrackableType")
@js.native
object XRHitTestTrackableType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XRHitTestTrackableType & Double] = js.native
  
  @js.native
  sealed trait mesh
    extends StObject
       with XRHitTestTrackableType
  /* 2 */ val mesh: typings.webxr.mod.XRHitTestTrackableType.mesh & Double = js.native
  
  @js.native
  sealed trait plane
    extends StObject
       with XRHitTestTrackableType
  /* 1 */ val plane: typings.webxr.mod.XRHitTestTrackableType.plane & Double = js.native
  
  @js.native
  sealed trait point
    extends StObject
       with XRHitTestTrackableType
  /* 0 */ val point: typings.webxr.mod.XRHitTestTrackableType.point & Double = js.native
}

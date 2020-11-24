package typings.three.webXRMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XRHitTestTrackableType extends js.Object
@JSImport("three/src/renderers/webxr/WebXR", "XRHitTestTrackableType")
@js.native
object XRHitTestTrackableType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XRHitTestTrackableType with Double] = js.native
  
  @js.native
  sealed trait mesh extends XRHitTestTrackableType
  /* 2 */ @js.native
  object mesh extends TopLevel[mesh with Double]
  
  @js.native
  sealed trait plane extends XRHitTestTrackableType
  /* 1 */ @js.native
  object plane extends TopLevel[plane with Double]
  
  @js.native
  sealed trait point extends XRHitTestTrackableType
  /* 0 */ @js.native
  object point extends TopLevel[point with Double]
}

package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseReason extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseReason")
@js.native
object ReleaseReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseReason with Double] = js.native
  
  @js.native
  sealed trait ContinuousIntegration extends ReleaseReason
  /* 2 */ @js.native
  object ContinuousIntegration extends TopLevel[ContinuousIntegration with Double]
  
  @js.native
  sealed trait Manual extends ReleaseReason
  /* 1 */ @js.native
  object Manual extends TopLevel[Manual with Double]
  
  @js.native
  sealed trait None extends ReleaseReason
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Schedule extends ReleaseReason
  /* 3 */ @js.native
  object Schedule extends TopLevel[Schedule with Double]
}

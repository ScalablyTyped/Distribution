package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseReason extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseReason")
@js.native
object ReleaseReason extends js.Object {
  @js.native
  sealed trait ContinuousIntegration extends ReleaseReason
  
  @js.native
  sealed trait Manual extends ReleaseReason
  
  @js.native
  sealed trait None extends ReleaseReason
  
  @js.native
  sealed trait Schedule extends ReleaseReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseReason with Double] = js.native
  /* 2 */ @js.native
  object ContinuousIntegration extends TopLevel[ContinuousIntegration with Double]
  
  /* 1 */ @js.native
  object Manual extends TopLevel[Manual with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object Schedule extends TopLevel[Schedule with Double]
  
}


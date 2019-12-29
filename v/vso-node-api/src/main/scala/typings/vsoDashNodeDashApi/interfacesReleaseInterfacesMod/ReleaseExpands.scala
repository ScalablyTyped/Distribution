package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseExpands extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseExpands")
@js.native
object ReleaseExpands extends js.Object {
  @js.native
  sealed trait Approvals extends ReleaseExpands
  
  @js.native
  sealed trait Artifacts extends ReleaseExpands
  
  @js.native
  sealed trait Environments extends ReleaseExpands
  
  @js.native
  sealed trait ManualInterventions extends ReleaseExpands
  
  @js.native
  sealed trait None extends ReleaseExpands
  
  @js.native
  sealed trait Tags extends ReleaseExpands
  
  @js.native
  sealed trait Variables extends ReleaseExpands
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseExpands with Double] = js.native
  /* 8 */ @js.native
  object Approvals extends TopLevel[Approvals with Double]
  
  /* 4 */ @js.native
  object Artifacts extends TopLevel[Artifacts with Double]
  
  /* 2 */ @js.native
  object Environments extends TopLevel[Environments with Double]
  
  /* 16 */ @js.native
  object ManualInterventions extends TopLevel[ManualInterventions with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 64 */ @js.native
  object Tags extends TopLevel[Tags with Double]
  
  /* 32 */ @js.native
  object Variables extends TopLevel[Variables with Double]
  
}


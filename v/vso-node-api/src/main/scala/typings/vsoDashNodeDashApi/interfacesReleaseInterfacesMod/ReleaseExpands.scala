package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
  
  /* 8 */ val Approvals: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseExpands.Approvals with Double = js.native
  /* 4 */ val Artifacts: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseExpands.Artifacts with Double = js.native
  /* 2 */ val Environments: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseExpands.Environments with Double = js.native
  /* 16 */ val ManualInterventions: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseExpands.ManualInterventions with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseExpands.None with Double = js.native
  /* 64 */ val Tags: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseExpands.Tags with Double = js.native
  /* 32 */ val Variables: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseExpands.Variables with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseExpands with Double] = js.native
}


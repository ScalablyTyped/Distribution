package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseExpands extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseExpands")
@js.native
object ReleaseExpands extends js.Object {
  @js.native
  sealed trait Approvals
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseExpands
  
  @js.native
  sealed trait Artifacts
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseExpands
  
  @js.native
  sealed trait Environments
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseExpands
  
  @js.native
  sealed trait ManualInterventions
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseExpands
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseExpands
  
  @js.native
  sealed trait Tags
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseExpands
  
  @js.native
  sealed trait Variables
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseExpands
  
  /* 8 */ val Approvals: Approvals with scala.Double = js.native
  /* 4 */ val Artifacts: Artifacts with scala.Double = js.native
  /* 2 */ val Environments: Environments with scala.Double = js.native
  /* 16 */ val ManualInterventions: ManualInterventions with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 64 */ val Tags: Tags with scala.Double = js.native
  /* 32 */ val Variables: Variables with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseExpands with scala.Double
  ] = js.native
}


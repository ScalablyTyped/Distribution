package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApprovalType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalType")
@js.native
object ApprovalType extends js.Object {
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalType
  
  @js.native
  sealed trait PostDeploy
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalType
  
  @js.native
  sealed trait PreDeploy
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalType
  
  @js.native
  sealed trait Undefined
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalType
  
  /* 3 */ val All: All with scala.Double = js.native
  /* 2 */ val PostDeploy: PostDeploy with scala.Double = js.native
  /* 1 */ val PreDeploy: PreDeploy with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalType with scala.Double
  ] = js.native
}


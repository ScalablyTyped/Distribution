package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApprovalType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalType")
@js.native
object ApprovalType extends js.Object {
  @js.native
  sealed trait All extends ApprovalType
  
  @js.native
  sealed trait PostDeploy extends ApprovalType
  
  @js.native
  sealed trait PreDeploy extends ApprovalType
  
  @js.native
  sealed trait Undefined extends ApprovalType
  
  /* 3 */ val All: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalType.All with Double = js.native
  /* 2 */ val PostDeploy: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalType.PostDeploy with Double = js.native
  /* 1 */ val PreDeploy: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalType.PreDeploy with Double = js.native
  /* 0 */ val Undefined: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ApprovalType.Undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalType with Double] = js.native
}


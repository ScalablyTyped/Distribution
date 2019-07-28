package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IssueSource extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "IssueSource")
@js.native
object IssueSource extends js.Object {
  @js.native
  sealed trait None extends IssueSource
  
  @js.native
  sealed trait System extends IssueSource
  
  @js.native
  sealed trait User extends IssueSource
  
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.IssueSource.None with Double = js.native
  /* 2 */ val System: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.IssueSource.System with Double = js.native
  /* 1 */ val User: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.IssueSource.User with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IssueSource with Double] = js.native
}


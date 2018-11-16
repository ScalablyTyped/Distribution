package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IssueSource extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "IssueSource")
@js.native
object IssueSource extends js.Object {
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.IssueSource
  
  @js.native
  sealed trait System
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.IssueSource
  
  @js.native
  sealed trait User
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.IssueSource
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val System: System with scala.Double = js.native
  /* 1 */ val User: User with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.IssueSource with scala.Double
  ] = js.native
}


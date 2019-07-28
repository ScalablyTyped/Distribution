package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuthorizationHeaderFor extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AuthorizationHeaderFor")
@js.native
object AuthorizationHeaderFor extends js.Object {
  @js.native
  sealed trait OnBehalfOf extends AuthorizationHeaderFor
  
  @js.native
  sealed trait RevalidateApproverIdentity extends AuthorizationHeaderFor
  
  /* 1 */ val OnBehalfOf: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AuthorizationHeaderFor.OnBehalfOf with Double = js.native
  /* 0 */ val RevalidateApproverIdentity: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.AuthorizationHeaderFor.RevalidateApproverIdentity with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuthorizationHeaderFor with Double] = js.native
}


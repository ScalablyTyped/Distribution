package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuthorizationHeaderFor extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AuthorizationHeaderFor")
@js.native
object AuthorizationHeaderFor extends js.Object {
  @js.native
  sealed trait OnBehalfOf
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AuthorizationHeaderFor
  
  @js.native
  sealed trait RevalidateApproverIdentity
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AuthorizationHeaderFor
  
  /* 1 */ val OnBehalfOf: OnBehalfOf with scala.Double = js.native
  /* 0 */ val RevalidateApproverIdentity: RevalidateApproverIdentity with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AuthorizationHeaderFor with scala.Double
  ] = js.native
}


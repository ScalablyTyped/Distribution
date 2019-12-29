package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuthorizationHeaderFor with Double] = js.native
  /* 1 */ @js.native
  object OnBehalfOf extends TopLevel[OnBehalfOf with Double]
  
  /* 0 */ @js.native
  object RevalidateApproverIdentity extends TopLevel[RevalidateApproverIdentity with Double]
  
}


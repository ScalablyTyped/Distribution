package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuthorizationHeaderFor extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "AuthorizationHeaderFor")
@js.native
object AuthorizationHeaderFor extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuthorizationHeaderFor & Double] = js.native
  
  @js.native
  sealed trait OnBehalfOf
    extends StObject
       with AuthorizationHeaderFor
  /* 1 */ val OnBehalfOf: typings.vsoNodeApi.releaseInterfacesMod.AuthorizationHeaderFor.OnBehalfOf & Double = js.native
  
  @js.native
  sealed trait RevalidateApproverIdentity
    extends StObject
       with AuthorizationHeaderFor
  /* 0 */ val RevalidateApproverIdentity: typings.vsoNodeApi.releaseInterfacesMod.AuthorizationHeaderFor.RevalidateApproverIdentity & Double = js.native
}

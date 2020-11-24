package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentAuthorizationOwner extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentAuthorizationOwner")
@js.native
object DeploymentAuthorizationOwner extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentAuthorizationOwner with Double] = js.native
  
  @js.native
  sealed trait Automatic extends DeploymentAuthorizationOwner
  /* 0 */ @js.native
  object Automatic extends TopLevel[Automatic with Double]
  
  @js.native
  sealed trait DeploymentSubmitter extends DeploymentAuthorizationOwner
  /* 1 */ @js.native
  object DeploymentSubmitter extends TopLevel[DeploymentSubmitter with Double]
  
  @js.native
  sealed trait FirstPreDeploymentApprover extends DeploymentAuthorizationOwner
  /* 2 */ @js.native
  object FirstPreDeploymentApprover extends TopLevel[FirstPreDeploymentApprover with Double]
}

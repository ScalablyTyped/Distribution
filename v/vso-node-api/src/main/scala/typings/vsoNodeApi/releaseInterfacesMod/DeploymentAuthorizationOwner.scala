package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentAuthorizationOwner extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentAuthorizationOwner")
@js.native
object DeploymentAuthorizationOwner extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentAuthorizationOwner & Double] = js.native
  
  @js.native
  sealed trait Automatic
    extends StObject
       with DeploymentAuthorizationOwner
  /* 0 */ val Automatic: typings.vsoNodeApi.releaseInterfacesMod.DeploymentAuthorizationOwner.Automatic & Double = js.native
  
  @js.native
  sealed trait DeploymentSubmitter
    extends StObject
       with DeploymentAuthorizationOwner
  /* 1 */ val DeploymentSubmitter: typings.vsoNodeApi.releaseInterfacesMod.DeploymentAuthorizationOwner.DeploymentSubmitter & Double = js.native
  
  @js.native
  sealed trait FirstPreDeploymentApprover
    extends StObject
       with DeploymentAuthorizationOwner
  /* 2 */ val FirstPreDeploymentApprover: typings.vsoNodeApi.releaseInterfacesMod.DeploymentAuthorizationOwner.FirstPreDeploymentApprover & Double = js.native
}

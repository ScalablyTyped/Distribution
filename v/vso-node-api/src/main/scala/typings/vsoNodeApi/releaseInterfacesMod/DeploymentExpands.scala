package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentExpands extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentExpands")
@js.native
object DeploymentExpands extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentExpands & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with DeploymentExpands
  /* 0 */ val All: typings.vsoNodeApi.releaseInterfacesMod.DeploymentExpands.All & Double = js.native
  
  @js.native
  sealed trait Approvals
    extends StObject
       with DeploymentExpands
  /* 2 */ val Approvals: typings.vsoNodeApi.releaseInterfacesMod.DeploymentExpands.Approvals & Double = js.native
  
  @js.native
  sealed trait Artifacts
    extends StObject
       with DeploymentExpands
  /* 4 */ val Artifacts: typings.vsoNodeApi.releaseInterfacesMod.DeploymentExpands.Artifacts & Double = js.native
  
  @js.native
  sealed trait DeploymentOnly
    extends StObject
       with DeploymentExpands
  /* 1 */ val DeploymentOnly: typings.vsoNodeApi.releaseInterfacesMod.DeploymentExpands.DeploymentOnly & Double = js.native
}

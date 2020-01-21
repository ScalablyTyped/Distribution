package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentExpands extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentExpands")
@js.native
object DeploymentExpands extends js.Object {
  @js.native
  sealed trait All extends DeploymentExpands
  
  @js.native
  sealed trait Approvals extends DeploymentExpands
  
  @js.native
  sealed trait Artifacts extends DeploymentExpands
  
  @js.native
  sealed trait DeploymentOnly extends DeploymentExpands
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentExpands with Double] = js.native
  /* 0 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 2 */ @js.native
  object Approvals extends TopLevel[Approvals with Double]
  
  /* 4 */ @js.native
  object Artifacts extends TopLevel[Artifacts with Double]
  
  /* 1 */ @js.native
  object DeploymentOnly extends TopLevel[DeploymentOnly with Double]
  
}


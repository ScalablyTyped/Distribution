package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Approvals extends StObject {
  
  var all: scala.Double = js.native
  
  var approvals: scala.Double = js.native
  
  var artifacts: scala.Double = js.native
  
  var deploymentOnly: scala.Double = js.native
}
object Approvals {
  
  @scala.inline
  def apply(all: scala.Double, approvals: scala.Double, artifacts: scala.Double, deploymentOnly: scala.Double): Approvals = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approvals = approvals.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], deploymentOnly = deploymentOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Approvals]
  }
  
  @scala.inline
  implicit class ApprovalsMutableBuilder[Self <: Approvals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovals(value: scala.Double): Self = StObject.set(x, "approvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifacts(value: scala.Double): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentOnly(value: scala.Double): Self = StObject.set(x, "deploymentOnly", value.asInstanceOf[js.Any])
  }
}

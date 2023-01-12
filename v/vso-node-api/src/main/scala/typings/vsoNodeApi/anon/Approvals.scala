package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Approvals extends StObject {
  
  var all: scala.Double
  
  var approvals: scala.Double
  
  var artifacts: scala.Double
  
  var deploymentOnly: scala.Double
}
object Approvals {
  
  inline def apply(all: scala.Double, approvals: scala.Double, artifacts: scala.Double, deploymentOnly: scala.Double): Approvals = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approvals = approvals.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], deploymentOnly = deploymentOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Approvals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Approvals] (val x: Self) extends AnyVal {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setApprovals(value: scala.Double): Self = StObject.set(x, "approvals", value.asInstanceOf[js.Any])
    
    inline def setArtifacts(value: scala.Double): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setDeploymentOnly(value: scala.Double): Self = StObject.set(x, "deploymentOnly", value.asInstanceOf[js.Any])
  }
}

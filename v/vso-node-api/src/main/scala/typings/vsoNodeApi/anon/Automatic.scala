package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Automatic extends StObject {
  
  var automatic: scala.Double
  
  var deploymentSubmitter: scala.Double
  
  var firstPreDeploymentApprover: scala.Double
}
object Automatic {
  
  inline def apply(
    automatic: scala.Double,
    deploymentSubmitter: scala.Double,
    firstPreDeploymentApprover: scala.Double
  ): Automatic = {
    val __obj = js.Dynamic.literal(automatic = automatic.asInstanceOf[js.Any], deploymentSubmitter = deploymentSubmitter.asInstanceOf[js.Any], firstPreDeploymentApprover = firstPreDeploymentApprover.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Automatic] (val x: Self) extends AnyVal {
    
    inline def setAutomatic(value: scala.Double): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    inline def setDeploymentSubmitter(value: scala.Double): Self = StObject.set(x, "deploymentSubmitter", value.asInstanceOf[js.Any])
    
    inline def setFirstPreDeploymentApprover(value: scala.Double): Self = StObject.set(x, "firstPreDeploymentApprover", value.asInstanceOf[js.Any])
  }
}

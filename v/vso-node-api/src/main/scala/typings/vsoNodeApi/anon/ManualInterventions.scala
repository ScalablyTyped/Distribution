package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualInterventions extends StObject {
  
  var approvals: scala.Double
  
  var artifacts: scala.Double
  
  var environments: scala.Double
  
  var manualInterventions: scala.Double
  
  var none: scala.Double
  
  var tags: scala.Double
  
  var variables: scala.Double
}
object ManualInterventions {
  
  inline def apply(
    approvals: scala.Double,
    artifacts: scala.Double,
    environments: scala.Double,
    manualInterventions: scala.Double,
    none: scala.Double,
    tags: scala.Double,
    variables: scala.Double
  ): ManualInterventions = {
    val __obj = js.Dynamic.literal(approvals = approvals.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], manualInterventions = manualInterventions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualInterventions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManualInterventions] (val x: Self) extends AnyVal {
    
    inline def setApprovals(value: scala.Double): Self = StObject.set(x, "approvals", value.asInstanceOf[js.Any])
    
    inline def setArtifacts(value: scala.Double): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setEnvironments(value: scala.Double): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setManualInterventions(value: scala.Double): Self = StObject.set(x, "manualInterventions", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setTags(value: scala.Double): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: scala.Double): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}

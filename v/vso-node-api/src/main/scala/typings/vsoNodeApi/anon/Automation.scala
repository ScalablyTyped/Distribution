package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Automation extends StObject {
  
  var automation: scala.Double
  
  var deployment: scala.Double
}
object Automation {
  
  inline def apply(automation: scala.Double, deployment: scala.Double): Automation = {
    val __obj = js.Dynamic.literal(automation = automation.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Automation] (val x: Self) extends AnyVal {
    
    inline def setAutomation(value: scala.Double): Self = StObject.set(x, "automation", value.asInstanceOf[js.Any])
    
    inline def setDeployment(value: scala.Double): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Automation extends StObject {
  
  var automation: scala.Double = js.native
  
  var deployment: scala.Double = js.native
}
object Automation {
  
  @scala.inline
  def apply(automation: scala.Double, deployment: scala.Double): Automation = {
    val __obj = js.Dynamic.literal(automation = automation.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automation]
  }
  
  @scala.inline
  implicit class AutomationMutableBuilder[Self <: Automation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomation(value: scala.Double): Self = StObject.set(x, "automation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployment(value: scala.Double): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
  }
}

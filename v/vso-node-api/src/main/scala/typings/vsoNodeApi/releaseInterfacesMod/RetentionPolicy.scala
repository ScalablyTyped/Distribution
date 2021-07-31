package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionPolicy extends StObject {
  
  var daysToKeep: Double
}
object RetentionPolicy {
  
  @scala.inline
  def apply(daysToKeep: Double): RetentionPolicy = {
    val __obj = js.Dynamic.literal(daysToKeep = daysToKeep.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionPolicy]
  }
  
  @scala.inline
  implicit class RetentionPolicyMutableBuilder[Self <: RetentionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysToKeep(value: Double): Self = StObject.set(x, "daysToKeep", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentRetentionPolicy extends StObject {
  
  var daysToKeep: Double = js.native
  
  var releasesToKeep: Double = js.native
  
  var retainBuild: Boolean = js.native
}
object EnvironmentRetentionPolicy {
  
  @scala.inline
  def apply(daysToKeep: Double, releasesToKeep: Double, retainBuild: Boolean): EnvironmentRetentionPolicy = {
    val __obj = js.Dynamic.literal(daysToKeep = daysToKeep.asInstanceOf[js.Any], releasesToKeep = releasesToKeep.asInstanceOf[js.Any], retainBuild = retainBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentRetentionPolicy]
  }
  
  @scala.inline
  implicit class EnvironmentRetentionPolicyMutableBuilder[Self <: EnvironmentRetentionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysToKeep(value: Double): Self = StObject.set(x, "daysToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleasesToKeep(value: Double): Self = StObject.set(x, "releasesToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainBuild(value: Boolean): Self = StObject.set(x, "retainBuild", value.asInstanceOf[js.Any])
  }
}

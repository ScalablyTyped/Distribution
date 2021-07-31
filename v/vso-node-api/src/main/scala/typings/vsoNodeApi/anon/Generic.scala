package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Generic extends StObject {
  
  var generic: scala.Double
  
  var serviceHost: scala.Double
  
  var teamProject: scala.Double
}
object Generic {
  
  @scala.inline
  def apply(generic: scala.Double, serviceHost: scala.Double, teamProject: scala.Double): Generic = {
    val __obj = js.Dynamic.literal(generic = generic.asInstanceOf[js.Any], serviceHost = serviceHost.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generic]
  }
  
  @scala.inline
  implicit class GenericMutableBuilder[Self <: Generic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneric(value: scala.Double): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceHost(value: scala.Double): Self = StObject.set(x, "serviceHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamProject(value: scala.Double): Self = StObject.set(x, "teamProject", value.asInstanceOf[js.Any])
  }
}

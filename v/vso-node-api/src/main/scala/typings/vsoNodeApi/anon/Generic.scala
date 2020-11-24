package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Generic extends js.Object {
  
  var generic: scala.Double = js.native
  
  var serviceHost: scala.Double = js.native
  
  var teamProject: scala.Double = js.native
}
object Generic {
  
  @scala.inline
  def apply(generic: scala.Double, serviceHost: scala.Double, teamProject: scala.Double): Generic = {
    val __obj = js.Dynamic.literal(generic = generic.asInstanceOf[js.Any], serviceHost = serviceHost.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generic]
  }
  
  @scala.inline
  implicit class GenericOps[Self <: Generic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGeneric(value: scala.Double): Self = this.set("generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceHost(value: scala.Double): Self = this.set("serviceHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamProject(value: scala.Double): Self = this.set("teamProject", value.asInstanceOf[js.Any])
  }
}

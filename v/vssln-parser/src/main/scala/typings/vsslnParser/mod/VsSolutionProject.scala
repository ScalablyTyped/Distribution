package typings.vsslnParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.vsslnParser.mod.VsSolutionSectionCollection because Already inherited */ @js.native
trait VsSolutionProject extends VsSolutionSection {
  
  var name: String = js.native
  
  var path: String = js.native
  
  var projectDependencies: js.UndefOr[VsSolutionSection] = js.native
  
  var projectGuid: String = js.native
  
  var `type`: String = js.native
  
  var typeGuid: String = js.native
}
object VsSolutionProject {
  
  @scala.inline
  def apply(name: String, path: String, projectGuid: String, `type`: String, typeGuid: String): VsSolutionProject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], projectGuid = projectGuid.asInstanceOf[js.Any], typeGuid = typeGuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VsSolutionProject]
  }
  
  @scala.inline
  implicit class VsSolutionProjectOps[Self <: VsSolutionProject] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectGuid(value: String): Self = this.set("projectGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuid(value: String): Self = this.set("typeGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDependencies(value: VsSolutionSection): Self = this.set("projectDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectDependencies: Self = this.set("projectDependencies", js.undefined)
  }
}

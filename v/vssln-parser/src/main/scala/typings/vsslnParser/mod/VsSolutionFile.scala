package typings.vsslnParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.vsslnParser.mod.VsSolutionSectionCollection because Already inherited */ @js.native
trait VsSolutionFile extends VsSolutionSection {
  
  var minimumVisualStudioVersion: js.UndefOr[String] = js.native
  
  var nestedProjects: js.UndefOr[VsSolutionSection] = js.native
  
  var projectConfigurationPlatforms: js.UndefOr[VsSolutionSection] = js.native
  
  var projects: js.Array[VsSolutionProject] = js.native
  
  var solutionConfigurationPlatforms: js.UndefOr[VsSolutionSection] = js.native
  
  var solutionProperties: js.UndefOr[VsSolutionSection] = js.native
  
  var teamFoundationVersionControl: js.UndefOr[VsSolutionSection] = js.native
  
  var visualStudioVersion: js.UndefOr[String] = js.native
}
object VsSolutionFile {
  
  @scala.inline
  def apply(projects: js.Array[VsSolutionProject]): VsSolutionFile = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[VsSolutionFile]
  }
  
  @scala.inline
  implicit class VsSolutionFileOps[Self <: VsSolutionFile] (val x: Self) extends AnyVal {
    
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
    def setProjectsVarargs(value: VsSolutionProject*): Self = this.set("projects", js.Array(value :_*))
    
    @scala.inline
    def setProjects(value: js.Array[VsSolutionProject]): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumVisualStudioVersion(value: String): Self = this.set("minimumVisualStudioVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumVisualStudioVersion: Self = this.set("minimumVisualStudioVersion", js.undefined)
    
    @scala.inline
    def setNestedProjects(value: VsSolutionSection): Self = this.set("nestedProjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedProjects: Self = this.set("nestedProjects", js.undefined)
    
    @scala.inline
    def setProjectConfigurationPlatforms(value: VsSolutionSection): Self = this.set("projectConfigurationPlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectConfigurationPlatforms: Self = this.set("projectConfigurationPlatforms", js.undefined)
    
    @scala.inline
    def setSolutionConfigurationPlatforms(value: VsSolutionSection): Self = this.set("solutionConfigurationPlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionConfigurationPlatforms: Self = this.set("solutionConfigurationPlatforms", js.undefined)
    
    @scala.inline
    def setSolutionProperties(value: VsSolutionSection): Self = this.set("solutionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionProperties: Self = this.set("solutionProperties", js.undefined)
    
    @scala.inline
    def setTeamFoundationVersionControl(value: VsSolutionSection): Self = this.set("teamFoundationVersionControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamFoundationVersionControl: Self = this.set("teamFoundationVersionControl", js.undefined)
    
    @scala.inline
    def setVisualStudioVersion(value: String): Self = this.set("visualStudioVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisualStudioVersion: Self = this.set("visualStudioVersion", js.undefined)
  }
}

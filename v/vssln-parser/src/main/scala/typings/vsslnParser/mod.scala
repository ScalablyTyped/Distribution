package typings.vsslnParser

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vssln-parser", JSImport.Namespace)
  @js.native
  def apply(input: String, callback: js.Function1[/* solution */ VsSolutionFile, Unit]): Unit = js.native
  @JSImport("vssln-parser", JSImport.Namespace)
  @js.native
  def apply(input: ReadStream, callback: js.Function1[/* solution */ VsSolutionFile, Unit]): Unit = js.native
  
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
    implicit class VsSolutionFileMutableBuilder[Self <: VsSolutionFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinimumVisualStudioVersion(value: String): Self = StObject.set(x, "minimumVisualStudioVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumVisualStudioVersionUndefined: Self = StObject.set(x, "minimumVisualStudioVersion", js.undefined)
      
      @scala.inline
      def setNestedProjects(value: VsSolutionSection): Self = StObject.set(x, "nestedProjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedProjectsUndefined: Self = StObject.set(x, "nestedProjects", js.undefined)
      
      @scala.inline
      def setProjectConfigurationPlatforms(value: VsSolutionSection): Self = StObject.set(x, "projectConfigurationPlatforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectConfigurationPlatformsUndefined: Self = StObject.set(x, "projectConfigurationPlatforms", js.undefined)
      
      @scala.inline
      def setProjects(value: js.Array[VsSolutionProject]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectsVarargs(value: VsSolutionProject*): Self = StObject.set(x, "projects", js.Array(value :_*))
      
      @scala.inline
      def setSolutionConfigurationPlatforms(value: VsSolutionSection): Self = StObject.set(x, "solutionConfigurationPlatforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionConfigurationPlatformsUndefined: Self = StObject.set(x, "solutionConfigurationPlatforms", js.undefined)
      
      @scala.inline
      def setSolutionProperties(value: VsSolutionSection): Self = StObject.set(x, "solutionProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionPropertiesUndefined: Self = StObject.set(x, "solutionProperties", js.undefined)
      
      @scala.inline
      def setTeamFoundationVersionControl(value: VsSolutionSection): Self = StObject.set(x, "teamFoundationVersionControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamFoundationVersionControlUndefined: Self = StObject.set(x, "teamFoundationVersionControl", js.undefined)
      
      @scala.inline
      def setVisualStudioVersion(value: String): Self = StObject.set(x, "visualStudioVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisualStudioVersionUndefined: Self = StObject.set(x, "visualStudioVersion", js.undefined)
    }
  }
  
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
    implicit class VsSolutionProjectMutableBuilder[Self <: VsSolutionProject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectDependencies(value: VsSolutionSection): Self = StObject.set(x, "projectDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectDependenciesUndefined: Self = StObject.set(x, "projectDependencies", js.undefined)
      
      @scala.inline
      def setProjectGuid(value: String): Self = StObject.set(x, "projectGuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeGuid(value: String): Self = StObject.set(x, "typeGuid", value.asInstanceOf[js.Any])
    }
  }
  
  type VsSolutionSection = StringDictionary[js.Any]
  
  type VsSolutionSectionCollection = StringDictionary[VsSolutionSection]
}

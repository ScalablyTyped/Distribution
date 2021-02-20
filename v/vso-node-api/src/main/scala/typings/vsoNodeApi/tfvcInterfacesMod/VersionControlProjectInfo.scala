package typings.vsoNodeApi.tfvcInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.SourceControlTypes
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionControlProjectInfo extends StObject {
  
  var defaultSourceControlType: SourceControlTypes = js.native
  
  var project: TeamProjectReference = js.native
  
  var supportsGit: Boolean = js.native
  
  var supportsTFVC: Boolean = js.native
}
object VersionControlProjectInfo {
  
  @scala.inline
  def apply(
    defaultSourceControlType: SourceControlTypes,
    project: TeamProjectReference,
    supportsGit: Boolean,
    supportsTFVC: Boolean
  ): VersionControlProjectInfo = {
    val __obj = js.Dynamic.literal(defaultSourceControlType = defaultSourceControlType.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], supportsGit = supportsGit.asInstanceOf[js.Any], supportsTFVC = supportsTFVC.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionControlProjectInfo]
  }
  
  @scala.inline
  implicit class VersionControlProjectInfoMutableBuilder[Self <: VersionControlProjectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSourceControlType(value: SourceControlTypes): Self = StObject.set(x, "defaultSourceControlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsGit(value: Boolean): Self = StObject.set(x, "supportsGit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTFVC(value: Boolean): Self = StObject.set(x, "supportsTFVC", value.asInstanceOf[js.Any])
  }
}

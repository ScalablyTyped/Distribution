package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import typings.vsoNodeApi.interfacesCoreInterfacesMod.SourceControlTypes
import typings.vsoNodeApi.interfacesCoreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionControlProjectInfo extends StObject {
  
  var defaultSourceControlType: SourceControlTypes
  
  var project: TeamProjectReference
  
  var supportsGit: Boolean
  
  var supportsTFVC: Boolean
}
object VersionControlProjectInfo {
  
  inline def apply(
    defaultSourceControlType: SourceControlTypes,
    project: TeamProjectReference,
    supportsGit: Boolean,
    supportsTFVC: Boolean
  ): VersionControlProjectInfo = {
    val __obj = js.Dynamic.literal(defaultSourceControlType = defaultSourceControlType.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], supportsGit = supportsGit.asInstanceOf[js.Any], supportsTFVC = supportsTFVC.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionControlProjectInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VersionControlProjectInfo] (val x: Self) extends AnyVal {
    
    inline def setDefaultSourceControlType(value: SourceControlTypes): Self = StObject.set(x, "defaultSourceControlType", value.asInstanceOf[js.Any])
    
    inline def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setSupportsGit(value: Boolean): Self = StObject.set(x, "supportsGit", value.asInstanceOf[js.Any])
    
    inline def setSupportsTFVC(value: Boolean): Self = StObject.set(x, "supportsTFVC", value.asInstanceOf[js.Any])
  }
}

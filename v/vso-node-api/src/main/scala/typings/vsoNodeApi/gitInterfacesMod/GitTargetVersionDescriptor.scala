package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitTargetVersionDescriptor extends GitVersionDescriptor {
  
  /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
  var targetVersion: String = js.native
  
  /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
  var targetVersionOptions: GitVersionOptions = js.native
  
  /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
  var targetVersionType: GitVersionType = js.native
}
object GitTargetVersionDescriptor {
  
  @scala.inline
  def apply(
    targetVersion: String,
    targetVersionOptions: GitVersionOptions,
    targetVersionType: GitVersionType,
    version: String,
    versionOptions: GitVersionOptions,
    versionType: GitVersionType
  ): GitTargetVersionDescriptor = {
    val __obj = js.Dynamic.literal(targetVersion = targetVersion.asInstanceOf[js.Any], targetVersionOptions = targetVersionOptions.asInstanceOf[js.Any], targetVersionType = targetVersionType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionOptions = versionOptions.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTargetVersionDescriptor]
  }
  
  @scala.inline
  implicit class GitTargetVersionDescriptorMutableBuilder[Self <: GitTargetVersionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersionOptions(value: GitVersionOptions): Self = StObject.set(x, "targetVersionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersionType(value: GitVersionType): Self = StObject.set(x, "targetVersionType", value.asInstanceOf[js.Any])
  }
}

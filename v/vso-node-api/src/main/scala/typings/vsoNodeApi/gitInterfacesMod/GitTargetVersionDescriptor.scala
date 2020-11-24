package typings.vsoNodeApi.gitInterfacesMod

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
  implicit class GitTargetVersionDescriptorOps[Self <: GitTargetVersionDescriptor] (val x: Self) extends AnyVal {
    
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
    def setTargetVersion(value: String): Self = this.set("targetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersionOptions(value: GitVersionOptions): Self = this.set("targetVersionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersionType(value: GitVersionType): Self = this.set("targetVersionType", value.asInstanceOf[js.Any])
  }
}

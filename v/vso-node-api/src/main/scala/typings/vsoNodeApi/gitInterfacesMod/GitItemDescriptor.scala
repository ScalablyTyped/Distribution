package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitItemDescriptor extends js.Object {
  
  /**
    * Path to item
    */
  var path: String = js.native
  
  /**
    * Specifies whether to include children (OneLevel), all descendants (Full), or None
    */
  var recursionLevel: VersionControlRecursionType = js.native
  
  /**
    * Version string (interpretation based on VersionType defined in subclass
    */
  var version: String = js.native
  
  /**
    * Version modifiers (e.g. previous)
    */
  var versionOptions: GitVersionOptions = js.native
  
  /**
    * How to interpret version (branch,tag,commit)
    */
  var versionType: GitVersionType = js.native
}
object GitItemDescriptor {
  
  @scala.inline
  def apply(
    path: String,
    recursionLevel: VersionControlRecursionType,
    version: String,
    versionOptions: GitVersionOptions,
    versionType: GitVersionType
  ): GitItemDescriptor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], recursionLevel = recursionLevel.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionOptions = versionOptions.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitItemDescriptor]
  }
  
  @scala.inline
  implicit class GitItemDescriptorOps[Self <: GitItemDescriptor] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursionLevel(value: VersionControlRecursionType): Self = this.set("recursionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionOptions(value: GitVersionOptions): Self = this.set("versionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionType(value: GitVersionType): Self = this.set("versionType", value.asInstanceOf[js.Any])
  }
}

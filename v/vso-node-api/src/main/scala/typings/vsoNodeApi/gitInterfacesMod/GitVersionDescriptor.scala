package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitVersionDescriptor extends StObject {
  
  /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
  var version: String = js.native
  
  /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
  var versionOptions: GitVersionOptions = js.native
  
  /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
  var versionType: GitVersionType = js.native
}
object GitVersionDescriptor {
  
  @scala.inline
  def apply(version: String, versionOptions: GitVersionOptions, versionType: GitVersionType): GitVersionDescriptor = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], versionOptions = versionOptions.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitVersionDescriptor]
  }
  
  @scala.inline
  implicit class GitVersionDescriptorMutableBuilder[Self <: GitVersionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionOptions(value: GitVersionOptions): Self = StObject.set(x, "versionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionType(value: GitVersionType): Self = StObject.set(x, "versionType", value.asInstanceOf[js.Any])
  }
}

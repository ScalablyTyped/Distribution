package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitItemDescriptor extends StObject {
  
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
  implicit class GitItemDescriptorMutableBuilder[Self <: GitItemDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursionLevel(value: VersionControlRecursionType): Self = StObject.set(x, "recursionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionOptions(value: GitVersionOptions): Self = StObject.set(x, "versionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionType(value: GitVersionType): Self = StObject.set(x, "versionType", value.asInstanceOf[js.Any])
  }
}

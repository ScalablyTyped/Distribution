package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitItemDescriptor extends StObject {
  
  /**
    * Path to item
    */
  var path: String
  
  /**
    * Specifies whether to include children (OneLevel), all descendants (Full), or None
    */
  var recursionLevel: VersionControlRecursionType
  
  /**
    * Version string (interpretation based on VersionType defined in subclass
    */
  var version: String
  
  /**
    * Version modifiers (e.g. previous)
    */
  var versionOptions: GitVersionOptions
  
  /**
    * How to interpret version (branch,tag,commit)
    */
  var versionType: GitVersionType
}
object GitItemDescriptor {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: GitItemDescriptor] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRecursionLevel(value: VersionControlRecursionType): Self = StObject.set(x, "recursionLevel", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionOptions(value: GitVersionOptions): Self = StObject.set(x, "versionOptions", value.asInstanceOf[js.Any])
    
    inline def setVersionType(value: GitVersionType): Self = StObject.set(x, "versionType", value.asInstanceOf[js.Any])
  }
}

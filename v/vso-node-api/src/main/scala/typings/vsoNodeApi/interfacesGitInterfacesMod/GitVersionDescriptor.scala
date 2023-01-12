package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitVersionDescriptor extends StObject {
  
  /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
  var version: String
  
  /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
  var versionOptions: GitVersionOptions
  
  /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
  var versionType: GitVersionType
}
object GitVersionDescriptor {
  
  inline def apply(version: String, versionOptions: GitVersionOptions, versionType: GitVersionType): GitVersionDescriptor = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], versionOptions = versionOptions.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitVersionDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitVersionDescriptor] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionOptions(value: GitVersionOptions): Self = StObject.set(x, "versionOptions", value.asInstanceOf[js.Any])
    
    inline def setVersionType(value: GitVersionType): Self = StObject.set(x, "versionType", value.asInstanceOf[js.Any])
  }
}

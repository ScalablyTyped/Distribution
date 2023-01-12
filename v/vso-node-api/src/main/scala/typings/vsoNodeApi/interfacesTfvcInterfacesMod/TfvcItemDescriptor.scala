package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcItemDescriptor extends StObject {
  
  var path: String
  
  var recursionLevel: VersionControlRecursionType
  
  var version: String
  
  var versionOption: TfvcVersionOption
  
  var versionType: TfvcVersionType
}
object TfvcItemDescriptor {
  
  inline def apply(
    path: String,
    recursionLevel: VersionControlRecursionType,
    version: String,
    versionOption: TfvcVersionOption,
    versionType: TfvcVersionType
  ): TfvcItemDescriptor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], recursionLevel = recursionLevel.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionOption = versionOption.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcItemDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TfvcItemDescriptor] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRecursionLevel(value: VersionControlRecursionType): Self = StObject.set(x, "recursionLevel", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionOption(value: TfvcVersionOption): Self = StObject.set(x, "versionOption", value.asInstanceOf[js.Any])
    
    inline def setVersionType(value: TfvcVersionType): Self = StObject.set(x, "versionType", value.asInstanceOf[js.Any])
  }
}

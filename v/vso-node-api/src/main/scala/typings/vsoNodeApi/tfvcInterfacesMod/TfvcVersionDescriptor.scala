package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcVersionDescriptor extends StObject {
  
  var version: String
  
  var versionOption: TfvcVersionOption
  
  var versionType: TfvcVersionType
}
object TfvcVersionDescriptor {
  
  inline def apply(version: String, versionOption: TfvcVersionOption, versionType: TfvcVersionType): TfvcVersionDescriptor = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], versionOption = versionOption.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcVersionDescriptor]
  }
  
  extension [Self <: TfvcVersionDescriptor](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionOption(value: TfvcVersionOption): Self = StObject.set(x, "versionOption", value.asInstanceOf[js.Any])
    
    inline def setVersionType(value: TfvcVersionType): Self = StObject.set(x, "versionType", value.asInstanceOf[js.Any])
  }
}

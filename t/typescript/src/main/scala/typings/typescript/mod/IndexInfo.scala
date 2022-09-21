package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexInfo extends StObject {
  
  var declaration: js.UndefOr[IndexSignatureDeclaration] = js.undefined
  
  var isReadonly: Boolean
  
  var keyType: Type
  
  var `type`: Type
}
object IndexInfo {
  
  inline def apply(isReadonly: Boolean, keyType: Type, `type`: Type): IndexInfo = {
    val __obj = js.Dynamic.literal(isReadonly = isReadonly.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexInfo]
  }
  
  extension [Self <: IndexInfo](x: Self) {
    
    inline def setDeclaration(value: IndexSignatureDeclaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    inline def setIsReadonly(value: Boolean): Self = StObject.set(x, "isReadonly", value.asInstanceOf[js.Any])
    
    inline def setKeyType(value: Type): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

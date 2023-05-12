package typings.vueCompilerSfc.mod

import typings.babelTypes.mod.TSType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDecl extends StObject {
  
  var identifier: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[TSType] = js.undefined
}
object ModelDecl {
  
  inline def apply(): ModelDecl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDecl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelDecl] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setType(value: TSType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

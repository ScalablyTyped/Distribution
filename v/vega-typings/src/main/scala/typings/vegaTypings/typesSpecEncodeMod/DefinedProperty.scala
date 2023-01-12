package typings.vegaTypings.typesSpecEncodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinedProperty extends StObject {
  
  var defined: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
}
object DefinedProperty {
  
  inline def apply(): DefinedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinedProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefinedProperty] (val x: Self) extends AnyVal {
    
    inline def setDefined(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "defined", value.asInstanceOf[js.Any])
    
    inline def setDefinedUndefined: Self = StObject.set(x, "defined", js.undefined)
    
    inline def setDefinedVarargs(value: (Test & BooleanValueRef)*): Self = StObject.set(x, "defined", js.Array(value*))
  }
}

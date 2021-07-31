package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinedProperty extends StObject {
  
  var defined: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
}
object DefinedProperty {
  
  @scala.inline
  def apply(): DefinedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinedProperty]
  }
  
  @scala.inline
  implicit class DefinedPropertyMutableBuilder[Self <: DefinedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefined(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "defined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinedUndefined: Self = StObject.set(x, "defined", js.undefined)
    
    @scala.inline
    def setDefinedVarargs(value: (Test & BooleanValueRef)*): Self = StObject.set(x, "defined", js.Array(value :_*))
  }
}

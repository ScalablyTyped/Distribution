package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.OpDef.IArgDef
import typings.tensorflowTfjsConverter.compiledApiMod.OpDef.IAttrDef
import typings.tensorflowTfjsConverter.compiledApiMod.OpDef.IOpDeprecation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOpDef extends StObject {
  
  /** OpDef allowsUninitializedInput */
  var allowsUninitializedInput: js.UndefOr[Boolean | Null] = js.undefined
  
  /** OpDef attr */
  var attr: js.UndefOr[js.Array[IAttrDef] | Null] = js.undefined
  
  /** OpDef deprecation */
  var deprecation: js.UndefOr[IOpDeprecation | Null] = js.undefined
  
  /** OpDef description */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /** OpDef inputArg */
  var inputArg: js.UndefOr[js.Array[IArgDef] | Null] = js.undefined
  
  /** OpDef isAggregate */
  var isAggregate: js.UndefOr[Boolean | Null] = js.undefined
  
  /** OpDef isCommutative */
  var isCommutative: js.UndefOr[Boolean | Null] = js.undefined
  
  /** OpDef isStateful */
  var isStateful: js.UndefOr[Boolean | Null] = js.undefined
  
  /** OpDef name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** OpDef outputArg */
  var outputArg: js.UndefOr[js.Array[IArgDef] | Null] = js.undefined
  
  /** OpDef summary */
  var summary: js.UndefOr[String | Null] = js.undefined
}
object IOpDef {
  
  inline def apply(): IOpDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpDef]
  }
  
  extension [Self <: IOpDef](x: Self) {
    
    inline def setAllowsUninitializedInput(value: Boolean): Self = StObject.set(x, "allowsUninitializedInput", value.asInstanceOf[js.Any])
    
    inline def setAllowsUninitializedInputNull: Self = StObject.set(x, "allowsUninitializedInput", null)
    
    inline def setAllowsUninitializedInputUndefined: Self = StObject.set(x, "allowsUninitializedInput", js.undefined)
    
    inline def setAttr(value: js.Array[IAttrDef]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrNull: Self = StObject.set(x, "attr", null)
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setAttrVarargs(value: IAttrDef*): Self = StObject.set(x, "attr", js.Array(value*))
    
    inline def setDeprecation(value: IOpDeprecation): Self = StObject.set(x, "deprecation", value.asInstanceOf[js.Any])
    
    inline def setDeprecationNull: Self = StObject.set(x, "deprecation", null)
    
    inline def setDeprecationUndefined: Self = StObject.set(x, "deprecation", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInputArg(value: js.Array[IArgDef]): Self = StObject.set(x, "inputArg", value.asInstanceOf[js.Any])
    
    inline def setInputArgNull: Self = StObject.set(x, "inputArg", null)
    
    inline def setInputArgUndefined: Self = StObject.set(x, "inputArg", js.undefined)
    
    inline def setInputArgVarargs(value: IArgDef*): Self = StObject.set(x, "inputArg", js.Array(value*))
    
    inline def setIsAggregate(value: Boolean): Self = StObject.set(x, "isAggregate", value.asInstanceOf[js.Any])
    
    inline def setIsAggregateNull: Self = StObject.set(x, "isAggregate", null)
    
    inline def setIsAggregateUndefined: Self = StObject.set(x, "isAggregate", js.undefined)
    
    inline def setIsCommutative(value: Boolean): Self = StObject.set(x, "isCommutative", value.asInstanceOf[js.Any])
    
    inline def setIsCommutativeNull: Self = StObject.set(x, "isCommutative", null)
    
    inline def setIsCommutativeUndefined: Self = StObject.set(x, "isCommutative", js.undefined)
    
    inline def setIsStateful(value: Boolean): Self = StObject.set(x, "isStateful", value.asInstanceOf[js.Any])
    
    inline def setIsStatefulNull: Self = StObject.set(x, "isStateful", null)
    
    inline def setIsStatefulUndefined: Self = StObject.set(x, "isStateful", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputArg(value: js.Array[IArgDef]): Self = StObject.set(x, "outputArg", value.asInstanceOf[js.Any])
    
    inline def setOutputArgNull: Self = StObject.set(x, "outputArg", null)
    
    inline def setOutputArgUndefined: Self = StObject.set(x, "outputArg", js.undefined)
    
    inline def setOutputArgVarargs(value: IArgDef*): Self = StObject.set(x, "outputArg", js.Array(value*))
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}

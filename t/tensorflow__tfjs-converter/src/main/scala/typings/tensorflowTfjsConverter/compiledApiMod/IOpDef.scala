package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.OpDef.IArgDef
import typings.tensorflowTfjsConverter.compiledApiMod.OpDef.IAttrDef
import typings.tensorflowTfjsConverter.compiledApiMod.OpDef.IOpDeprecation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOpDef extends StObject {
  
  /** OpDef allowsUninitializedInput */
  var allowsUninitializedInput: js.UndefOr[Boolean | Null] = js.native
  
  /** OpDef attr */
  var attr: js.UndefOr[js.Array[IAttrDef] | Null] = js.native
  
  /** OpDef deprecation */
  var deprecation: js.UndefOr[IOpDeprecation | Null] = js.native
  
  /** OpDef description */
  var description: js.UndefOr[String | Null] = js.native
  
  /** OpDef inputArg */
  var inputArg: js.UndefOr[js.Array[IArgDef] | Null] = js.native
  
  /** OpDef isAggregate */
  var isAggregate: js.UndefOr[Boolean | Null] = js.native
  
  /** OpDef isCommutative */
  var isCommutative: js.UndefOr[Boolean | Null] = js.native
  
  /** OpDef isStateful */
  var isStateful: js.UndefOr[Boolean | Null] = js.native
  
  /** OpDef name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** OpDef outputArg */
  var outputArg: js.UndefOr[js.Array[IArgDef] | Null] = js.native
  
  /** OpDef summary */
  var summary: js.UndefOr[String | Null] = js.native
}
object IOpDef {
  
  @scala.inline
  def apply(): IOpDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpDef]
  }
  
  @scala.inline
  implicit class IOpDefMutableBuilder[Self <: IOpDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowsUninitializedInput(value: Boolean): Self = StObject.set(x, "allowsUninitializedInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsUninitializedInputNull: Self = StObject.set(x, "allowsUninitializedInput", null)
    
    @scala.inline
    def setAllowsUninitializedInputUndefined: Self = StObject.set(x, "allowsUninitializedInput", js.undefined)
    
    @scala.inline
    def setAttr(value: js.Array[IAttrDef]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrNull: Self = StObject.set(x, "attr", null)
    
    @scala.inline
    def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    @scala.inline
    def setAttrVarargs(value: IAttrDef*): Self = StObject.set(x, "attr", js.Array(value :_*))
    
    @scala.inline
    def setDeprecation(value: IOpDeprecation): Self = StObject.set(x, "deprecation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationNull: Self = StObject.set(x, "deprecation", null)
    
    @scala.inline
    def setDeprecationUndefined: Self = StObject.set(x, "deprecation", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setInputArg(value: js.Array[IArgDef]): Self = StObject.set(x, "inputArg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputArgNull: Self = StObject.set(x, "inputArg", null)
    
    @scala.inline
    def setInputArgUndefined: Self = StObject.set(x, "inputArg", js.undefined)
    
    @scala.inline
    def setInputArgVarargs(value: IArgDef*): Self = StObject.set(x, "inputArg", js.Array(value :_*))
    
    @scala.inline
    def setIsAggregate(value: Boolean): Self = StObject.set(x, "isAggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAggregateNull: Self = StObject.set(x, "isAggregate", null)
    
    @scala.inline
    def setIsAggregateUndefined: Self = StObject.set(x, "isAggregate", js.undefined)
    
    @scala.inline
    def setIsCommutative(value: Boolean): Self = StObject.set(x, "isCommutative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCommutativeNull: Self = StObject.set(x, "isCommutative", null)
    
    @scala.inline
    def setIsCommutativeUndefined: Self = StObject.set(x, "isCommutative", js.undefined)
    
    @scala.inline
    def setIsStateful(value: Boolean): Self = StObject.set(x, "isStateful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatefulNull: Self = StObject.set(x, "isStateful", null)
    
    @scala.inline
    def setIsStatefulUndefined: Self = StObject.set(x, "isStateful", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutputArg(value: js.Array[IArgDef]): Self = StObject.set(x, "outputArg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArgNull: Self = StObject.set(x, "outputArg", null)
    
    @scala.inline
    def setOutputArgUndefined: Self = StObject.set(x, "outputArg", js.undefined)
    
    @scala.inline
    def setOutputArgVarargs(value: IArgDef*): Self = StObject.set(x, "outputArg", js.Array(value :_*))
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}

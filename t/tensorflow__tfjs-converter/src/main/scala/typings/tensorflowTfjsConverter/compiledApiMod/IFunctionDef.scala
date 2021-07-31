package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFunctionDef extends StObject {
  
  /** FunctionDef attr */
  var attr: js.UndefOr[StringDictionary[IAttrValue] | Null] = js.undefined
  
  /** FunctionDef nodeDef */
  var nodeDef: js.UndefOr[js.Array[INodeDef] | Null] = js.undefined
  
  /** FunctionDef ret */
  var ret: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** FunctionDef signature */
  var signature: js.UndefOr[IOpDef | Null] = js.undefined
}
object IFunctionDef {
  
  @scala.inline
  def apply(): IFunctionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFunctionDef]
  }
  
  @scala.inline
  implicit class IFunctionDefMutableBuilder[Self <: IFunctionDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr(value: StringDictionary[IAttrValue]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrNull: Self = StObject.set(x, "attr", null)
    
    @scala.inline
    def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    @scala.inline
    def setNodeDef(value: js.Array[INodeDef]): Self = StObject.set(x, "nodeDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDefNull: Self = StObject.set(x, "nodeDef", null)
    
    @scala.inline
    def setNodeDefUndefined: Self = StObject.set(x, "nodeDef", js.undefined)
    
    @scala.inline
    def setNodeDefVarargs(value: INodeDef*): Self = StObject.set(x, "nodeDef", js.Array(value :_*))
    
    @scala.inline
    def setRet(value: StringDictionary[String]): Self = StObject.set(x, "ret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetNull: Self = StObject.set(x, "ret", null)
    
    @scala.inline
    def setRetUndefined: Self = StObject.set(x, "ret", js.undefined)
    
    @scala.inline
    def setSignature(value: IOpDef): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}

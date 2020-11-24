package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFunctionDef extends js.Object {
  
  /** FunctionDef attr */
  var attr: js.UndefOr[StringDictionary[IAttrValue] | Null] = js.native
  
  /** FunctionDef nodeDef */
  var nodeDef: js.UndefOr[js.Array[INodeDef] | Null] = js.native
  
  /** FunctionDef ret */
  var ret: js.UndefOr[StringDictionary[String] | Null] = js.native
  
  /** FunctionDef signature */
  var signature: js.UndefOr[IOpDef | Null] = js.native
}
object IFunctionDef {
  
  @scala.inline
  def apply(): IFunctionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFunctionDef]
  }
  
  @scala.inline
  implicit class IFunctionDefOps[Self <: IFunctionDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttr(value: StringDictionary[IAttrValue]): Self = this.set("attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttr: Self = this.set("attr", js.undefined)
    
    @scala.inline
    def setAttrNull: Self = this.set("attr", null)
    
    @scala.inline
    def setNodeDefVarargs(value: INodeDef*): Self = this.set("nodeDef", js.Array(value :_*))
    
    @scala.inline
    def setNodeDef(value: js.Array[INodeDef]): Self = this.set("nodeDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeDef: Self = this.set("nodeDef", js.undefined)
    
    @scala.inline
    def setNodeDefNull: Self = this.set("nodeDef", null)
    
    @scala.inline
    def setRet(value: StringDictionary[String]): Self = this.set("ret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRet: Self = this.set("ret", js.undefined)
    
    @scala.inline
    def setRetNull: Self = this.set("ret", null)
    
    @scala.inline
    def setSignature(value: IOpDef): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setSignatureNull: Self = this.set("signature", null)
  }
}

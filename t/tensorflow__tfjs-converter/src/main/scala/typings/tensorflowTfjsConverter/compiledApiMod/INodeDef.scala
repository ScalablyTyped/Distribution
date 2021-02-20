package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INodeDef extends StObject {
  
  /** NodeDef attr */
  var attr: js.UndefOr[StringDictionary[IAttrValue] | Null] = js.native
  
  /** NodeDef device */
  var device: js.UndefOr[String | Null] = js.native
  
  /** NodeDef input */
  var input: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** NodeDef name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** NodeDef op */
  var op: js.UndefOr[String | Null] = js.native
}
object INodeDef {
  
  @scala.inline
  def apply(): INodeDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeDef]
  }
  
  @scala.inline
  implicit class INodeDefMutableBuilder[Self <: INodeDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr(value: StringDictionary[IAttrValue]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrNull: Self = StObject.set(x, "attr", null)
    
    @scala.inline
    def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNull: Self = StObject.set(x, "device", null)
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setInput(value: js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputNull: Self = StObject.set(x, "input", null)
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpNull: Self = StObject.set(x, "op", null)
    
    @scala.inline
    def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
  }
}

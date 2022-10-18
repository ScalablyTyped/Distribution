package typings.tensorflowTfjsConverter.distDataCompiledApiMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INodeDef extends StObject {
  
  /** NodeDef attr */
  var attr: js.UndefOr[StringDictionary[IAttrValue] | Null] = js.undefined
  
  /** NodeDef device */
  var device: js.UndefOr[String | Null] = js.undefined
  
  /** NodeDef input */
  var input: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** NodeDef name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** NodeDef op */
  var op: js.UndefOr[String | Null] = js.undefined
}
object INodeDef {
  
  inline def apply(): INodeDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeDef]
  }
  
  extension [Self <: INodeDef](x: Self) {
    
    inline def setAttr(value: StringDictionary[IAttrValue]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrNull: Self = StObject.set(x, "attr", null)
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceNull: Self = StObject.set(x, "device", null)
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setInput(value: js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputNull: Self = StObject.set(x, "input", null)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpNull: Self = StObject.set(x, "op", null)
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
  }
}

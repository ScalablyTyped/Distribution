package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INameAttrList extends StObject {
  
  /** NameAttrList attr */
  var attr: js.UndefOr[StringDictionary[IAttrValue] | Null] = js.undefined
  
  /** NameAttrList name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object INameAttrList {
  
  inline def apply(): INameAttrList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INameAttrList]
  }
  
  extension [Self <: INameAttrList](x: Self) {
    
    inline def setAttr(value: StringDictionary[IAttrValue]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrNull: Self = StObject.set(x, "attr", null)
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

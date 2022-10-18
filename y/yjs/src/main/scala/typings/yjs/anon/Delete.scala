package typings.yjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  var attributes: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var delete: js.UndefOr[Double] = js.undefined
  
  var insert: js.UndefOr[String | js.Object | js.Array[Any] | AbstractType[Any]] = js.undefined
  
  var retain: js.UndefOr[Double] = js.undefined
}
object Delete {
  
  inline def apply(): Delete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delete]
  }
  
  extension [Self <: Delete](x: Self) {
    
    inline def setAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setDelete(value: Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setInsert(value: String | js.Object | js.Array[Any] | AbstractType[Any]): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setInsertVarargs(value: Any*): Self = StObject.set(x, "insert", js.Array(value*))
    
    inline def setRetain(value: Double): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
  }
}

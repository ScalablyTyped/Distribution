package typings.vegaLite.buildSrcTransformMod

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupBase extends StObject {
  
  /**
    * Fields in foreign data or selection to lookup.
    * If not specified, the entire object is queried.
    */
  var fields: js.UndefOr[js.Array[FieldName]] = js.undefined
  
  /**
    * Key in data to lookup.
    */
  var key: FieldName
}
object LookupBase {
  
  inline def apply(key: FieldName): LookupBase = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupBase]
  }
  
  extension [Self <: LookupBase](x: Self) {
    
    inline def setFields(value: js.Array[FieldName]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldName*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setKey(value: FieldName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}

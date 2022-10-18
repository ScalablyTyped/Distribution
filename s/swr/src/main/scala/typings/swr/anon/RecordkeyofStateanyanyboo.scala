package typings.swr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<keyof swr.swr/dist/types.State<any, any>, boolean> */
trait RecordkeyofStateanyanyboo extends StObject {
  
  var data: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var isValidating: js.UndefOr[Boolean] = js.undefined
}
object RecordkeyofStateanyanyboo {
  
  inline def apply(): RecordkeyofStateanyanyboo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordkeyofStateanyanyboo]
  }
  
  extension [Self <: RecordkeyofStateanyanyboo](x: Self) {
    
    inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIsValidating(value: Boolean): Self = StObject.set(x, "isValidating", value.asInstanceOf[js.Any])
    
    inline def setIsValidatingUndefined: Self = StObject.set(x, "isValidating", js.undefined)
  }
}

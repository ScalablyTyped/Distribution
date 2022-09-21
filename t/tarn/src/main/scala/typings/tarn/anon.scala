package typings.tarn

import typings.tarn.promiseInspectionMod.PromiseInspectionArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error[T]
    extends StObject
       with PromiseInspectionArgs[T] {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var value: T
  }
  object Error {
    
    inline def apply[T](value: T): Error[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error[T]]
    }
    
    extension [Self <: Error[?], T](x: Self & Error[T]) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value[T]
    extends StObject
       with PromiseInspectionArgs[T] {
    
    var error: js.Error
    
    var value: js.UndefOr[T] = js.undefined
  }
  object Value {
    
    inline def apply[T](error: js.Error): Value[T] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    extension [Self <: Value[?], T](x: Self & Value[T]) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

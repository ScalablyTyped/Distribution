package typings.tarn

import typings.tarn.promiseInspectionMod.PromiseInspectionArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error[T]
    extends StObject
       with PromiseInspectionArgs[T] {
    
    var error: js.UndefOr[typings.std.Error] = js.undefined
    
    var value: T
  }
  object Error {
    
    @scala.inline
    def apply[T](value: T): Error[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error[T]]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error[?], T] (val x: Self & Error[T]) extends AnyVal {
      
      @scala.inline
      def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value[T]
    extends StObject
       with PromiseInspectionArgs[T] {
    
    var error: typings.std.Error
    
    var value: js.UndefOr[T] = js.undefined
  }
  object Value {
    
    @scala.inline
    def apply[T](error: typings.std.Error): Value[T] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value[?], T] (val x: Self & Value[T]) extends AnyVal {
      
      @scala.inline
      def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

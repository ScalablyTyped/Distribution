package typings.unpaginated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cursor[T] extends StObject {
    
    var cursor: Double
    
    var data: js.Array[T]
  }
  object Cursor {
    
    inline def apply[T](cursor: Double, data: js.Array[T]): Cursor[T] = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cursor[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cursor[?], T] (val x: Self & Cursor[T]) extends AnyVal {
      
      inline def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  trait CursorData[T] extends StObject {
    
    var cursor: String
    
    var data: js.Array[T]
  }
  object CursorData {
    
    inline def apply[T](cursor: String, data: js.Array[T]): CursorData[T] = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[CursorData[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CursorData[?], T] (val x: Self & CursorData[T]) extends AnyVal {
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  trait Data[T] extends StObject {
    
    var data: js.Array[T]
    
    var total: Double
  }
  object Data {
    
    inline def apply[T](data: js.Array[T], total: Double): Data[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data[?], T] (val x: Self & Data[T]) extends AnyVal {
      
      inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}

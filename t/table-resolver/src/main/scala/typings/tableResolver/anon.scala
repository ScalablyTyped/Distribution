package typings.tableResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column[T] extends StObject {
    
    var column: T
  }
  object Column {
    
    inline def apply[T](column: T): Column[T] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column[T]]
    }
    
    extension [Self <: Column[?], T](x: Self & Column[T]) {
      
      inline def setColumn(value: T): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    }
  }
  
  trait Columns[T] extends StObject {
    
    var columns: js.Array[T]
  }
  object Columns {
    
    inline def apply[T](columns: js.Array[T]): Columns[T] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns[T]]
    }
    
    extension [Self <: Columns[?], T](x: Self & Columns[T]) {
      
      inline def setColumns(value: js.Array[T]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: T*): Self = StObject.set(x, "columns", js.Array(value*))
    }
  }
  
  trait Method[T] extends StObject {
    
    var columns: js.Array[T]
    
    def method(args: Column[T]): T
  }
  object Method {
    
    inline def apply[T](columns: js.Array[T], method: Column[T] => T): Method[T] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], method = js.Any.fromFunction1(method))
      __obj.asInstanceOf[Method[T]]
    }
    
    extension [Self <: Method[?], T](x: Self & Method[T]) {
      
      inline def setColumns(value: js.Array[T]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: T*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setMethod(value: Column[T] => T): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
    }
  }
}

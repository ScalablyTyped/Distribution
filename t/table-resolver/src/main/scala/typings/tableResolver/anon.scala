package typings.tableResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column[T] extends StObject {
    
    var column: T
  }
  object Column {
    
    @scala.inline
    def apply[T](column: T): Column[T] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column[T]]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column[?], T] (val x: Self & Column[T]) extends AnyVal {
      
      @scala.inline
      def setColumn(value: T): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    }
  }
  
  trait Columns[T] extends StObject {
    
    var columns: js.Array[T]
  }
  object Columns {
    
    @scala.inline
    def apply[T](columns: js.Array[T]): Columns[T] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns[T]]
    }
    
    @scala.inline
    implicit class ColumnsMutableBuilder[Self <: Columns[?], T] (val x: Self & Columns[T]) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[T]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: T*): Self = StObject.set(x, "columns", js.Array(value :_*))
    }
  }
  
  trait Method[T] extends StObject {
    
    var columns: js.Array[T]
    
    def method(args: Column[T]): T
  }
  object Method {
    
    @scala.inline
    def apply[T](columns: js.Array[T], method: Column[T] => T): Method[T] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], method = js.Any.fromFunction1(method))
      __obj.asInstanceOf[Method[T]]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method[?], T] (val x: Self & Method[T]) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[T]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: T*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: Column[T] => T): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
    }
  }
}

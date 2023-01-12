package typings.textSegmentation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Done extends StObject {
    
    var done: Boolean
    
    var value: Null
  }
  object Done {
    
    inline def apply(done: Boolean, value: Null): Done = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Done] (val x: Self) extends AnyVal {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Next extends StObject {
    
    def next(): Done | Value
  }
  object Next {
    
    inline def apply(next: () => Done | Value): Next = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[Next]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
      
      inline def setNext(value: () => Done | Value): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  trait Value extends StObject {
    
    var done: Boolean
    
    var value: String
  }
  object Value {
    
    inline def apply(done: Boolean, value: String): Value = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

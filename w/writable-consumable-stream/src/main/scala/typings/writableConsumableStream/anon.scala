package typings.writableConsumableStream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Done[T] extends StObject {
    
    var done: Boolean
    
    var value: T
  }
  object Done {
    
    @scala.inline
    def apply[T](done: Boolean, value: T): Done[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[T]]
    }
    
    @scala.inline
    implicit class DoneMutableBuilder[Self <: Done[?], T] (val x: Self & Done[T]) extends AnyVal {
      
      @scala.inline
      def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

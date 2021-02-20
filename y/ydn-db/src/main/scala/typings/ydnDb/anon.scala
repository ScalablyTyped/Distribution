package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Push extends StObject {
    
    def push(value: js.Any): Unit = js.native
  }
  object Push {
    
    @scala.inline
    def apply(push: js.Any => Unit): Push = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[Push]
    }
    
    @scala.inline
    implicit class PushMutableBuilder[Self <: Push] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPush(value: js.Any => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
}

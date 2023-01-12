package typings.tusJsClient

import typings.std.ReadableStreamReadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object End {
    
    inline def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<std.ReadableStreamDefaultReader<any>, 'read'> */
  trait PickReadableStreamDefault extends StObject {
    
    def read(): js.Promise[ReadableStreamReadResult[Any]]
    @JSName("read")
    var read_Original: js.Function0[js.Promise[ReadableStreamReadResult[Any]]]
  }
  object PickReadableStreamDefault {
    
    inline def apply(read: () => js.Promise[ReadableStreamReadResult[Any]]): PickReadableStreamDefault = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
      __obj.asInstanceOf[PickReadableStreamDefault]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickReadableStreamDefault] (val x: Self) extends AnyVal {
      
      inline def setRead(value: () => js.Promise[ReadableStreamReadResult[Any]]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    }
  }
}

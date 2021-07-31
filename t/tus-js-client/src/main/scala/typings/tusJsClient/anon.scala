package typings.tusJsClient

import typings.std.ReadableStreamReadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<std.ReadableStreamDefaultReader<any>, 'read'> */
  trait PickReadableStreamDefault extends StObject {
    
    def read(): js.Promise[ReadableStreamReadResult[js.Any]]
    @JSName("read")
    var read_Original: js.Function0[js.Promise[ReadableStreamReadResult[js.Any]]]
  }
  object PickReadableStreamDefault {
    
    @scala.inline
    def apply(read: () => js.Promise[ReadableStreamReadResult[js.Any]]): PickReadableStreamDefault = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
      __obj.asInstanceOf[PickReadableStreamDefault]
    }
    
    @scala.inline
    implicit class PickReadableStreamDefaultMutableBuilder[Self <: PickReadableStreamDefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: () => js.Promise[ReadableStreamReadResult[js.Any]]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    }
  }
}

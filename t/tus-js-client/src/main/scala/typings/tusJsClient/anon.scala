package typings.tusJsClient

import typings.std.ReadableStreamReadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<std.ReadableStreamDefaultReader<any>, 'read'> */
  @js.native
  trait PickReadableStreamDefault extends StObject {
    
    def read(): js.Promise[ReadableStreamReadResult[_]] = js.native
    @JSName("read")
    var read_Original: js.Function0[js.Promise[ReadableStreamReadResult[_]]] = js.native
  }
}

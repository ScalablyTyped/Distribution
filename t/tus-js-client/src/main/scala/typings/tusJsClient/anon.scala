package typings.tusJsClient

import typings.std.ReadableStreamReadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  /* Inlined std.Pick<std.ReadableStreamDefaultReader<any>, 'read'> */
  @js.native
  trait PickReadableStreamDefault extends js.Object {
    
    def read(): js.Promise[ReadableStreamReadResult[_]] = js.native
    @JSName("read")
    var read_Original: js.Function0[js.Promise[ReadableStreamReadResult[_]]] = js.native
  }
}

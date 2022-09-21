package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webStreamsPolyfill.anon.Done[T]
  - typings.webStreamsPolyfill.anon.Value[T]
*/
trait ReadableStreamBYOBReadResult[T /* <: js.typedarray.ArrayBufferView */] extends StObject
object ReadableStreamBYOBReadResult {
  
  inline def Done[T /* <: js.typedarray.ArrayBufferView */](value: T): typings.webStreamsPolyfill.anon.Done[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webStreamsPolyfill.anon.Done[T]]
  }
  
  inline def Value[T /* <: js.typedarray.ArrayBufferView */](): typings.webStreamsPolyfill.anon.Value[T] = {
    val __obj = js.Dynamic.literal(done = true)
    __obj.asInstanceOf[typings.webStreamsPolyfill.anon.Value[T]]
  }
}

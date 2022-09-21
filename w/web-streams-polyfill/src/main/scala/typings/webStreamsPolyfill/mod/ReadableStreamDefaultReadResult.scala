package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webStreamsPolyfill.anon.DoneValue[T]
  - typings.webStreamsPolyfill.anon.ValueUndefined
*/
trait ReadableStreamDefaultReadResult[T] extends StObject
object ReadableStreamDefaultReadResult {
  
  inline def DoneValue[T](value: T): typings.webStreamsPolyfill.anon.DoneValue[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webStreamsPolyfill.anon.DoneValue[T]]
  }
  
  inline def ValueUndefined(value: Unit): typings.webStreamsPolyfill.anon.ValueUndefined = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.webStreamsPolyfill.anon.ValueUndefined]
  }
}

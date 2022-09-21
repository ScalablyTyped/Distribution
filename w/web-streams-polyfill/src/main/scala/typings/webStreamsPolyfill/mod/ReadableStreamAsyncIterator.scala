package typings.webStreamsPolyfill.mod

import typings.std.AsyncIterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamAsyncIterator[R]
  extends StObject
     with AsyncIterator[R, Any, Unit] {
  
  def next(): js.Promise[IteratorResult[R, Unit]] = js.native
  
  @JSName("return")
  def return_MReadableStreamAsyncIterator(): js.Promise[IteratorResult[Any, Any]] = js.native
  @JSName("return")
  def return_MReadableStreamAsyncIterator(value: Any): js.Promise[IteratorResult[Any, Any]] = js.native
}

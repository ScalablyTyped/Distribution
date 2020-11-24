package typings.transducersJs.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers-js", "mapcat")
@js.native
object mapcat extends js.Object {
  
  def apply[TResult, TInput, TOutput](f: js.Function1[/* arr */ TInput, Iterable[TOutput]]): Transducer[TInput, TOutput] = js.native
}

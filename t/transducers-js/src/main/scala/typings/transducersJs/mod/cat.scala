package typings.transducersJs.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers-js", "cat")
@js.native
object cat extends js.Object {
  
  def apply[TResult, TInput](xf: Transformer[TResult, TInput]): Transformer[TResult, Iterable[TInput]] = js.native
}

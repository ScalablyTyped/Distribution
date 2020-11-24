package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transducer[TInput, TOutput] extends js.Object {
  
  def apply[TResult](xf: Transformer[TResult, TOutput]): Transformer[TResult, TInput] = js.native
}

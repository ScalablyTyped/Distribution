package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers-js", "takeWhile")
@js.native
object takeWhile extends js.Object {
  
  def apply[TInput](pred: js.Function1[/* n */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
}

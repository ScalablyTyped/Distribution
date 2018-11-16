package typings
package transducersDashJsLib.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "TakeWhile")
@js.native
class TakeWhile[TResult, TInput] protected () extends Transformer[TResult, TInput] {
  def this(pred: js.Function1[/* n */ TInput, scala.Boolean], xf: Transformer[TResult, TInput]) = this()
}


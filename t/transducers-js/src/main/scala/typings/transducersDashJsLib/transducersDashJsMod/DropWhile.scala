package typings
package transducersDashJsLib.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "DropWhile")
@js.native
class DropWhile[TResult, TInput] protected () extends Transformer[TResult, TInput] {
  def this(pred: js.Function1[/* input */ TInput, scala.Boolean], xf: Transformer[TResult, TInput]) = this()
}


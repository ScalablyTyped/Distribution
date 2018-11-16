package typings
package transducersDashJsLib.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "Filter")
@js.native
class Filter[TResult, TInput] protected () extends Transformer[TResult, TInput] {
  def this(pred: js.Function1[/* x */ TInput, scala.Boolean], xf: Transformer[TResult, TInput]) = this()
}


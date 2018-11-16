package typings
package transducersDashJsLib.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "KeepIndexed")
@js.native
class KeepIndexed[TResult, TInput] protected () extends Transformer[TResult, TInput] {
  def this(f: js.Function2[/* i */ scala.Double, /* x */ TInput, _], xf: Transformer[TResult, TInput]) = this()
}


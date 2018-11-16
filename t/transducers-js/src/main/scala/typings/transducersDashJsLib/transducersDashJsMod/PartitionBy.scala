package typings
package transducersDashJsLib.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "PartitionBy")
@js.native
class PartitionBy[TResult, TInput] protected () extends Transformer[TResult, TInput] {
  def this(f: js.Function1[/* input */ TInput, _], xf: Transformer[TResult, js.Array[TInput]]) = this()
}


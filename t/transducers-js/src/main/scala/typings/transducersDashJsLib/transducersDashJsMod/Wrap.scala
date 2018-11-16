package typings
package transducersDashJsLib.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "Wrap")
@js.native
class Wrap[TResult, TInput] protected () extends Transformer[TResult, TInput] {
  def this(stepFn: Reducer[TResult, TInput]) = this()
}


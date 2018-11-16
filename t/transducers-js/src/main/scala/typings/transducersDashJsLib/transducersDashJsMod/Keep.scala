package typings
package transducersDashJsLib.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "Keep")
@js.native
class Keep[TResult, TInput] protected () extends Transformer[TResult, TInput] {
  def this(f: js.Function1[/* x */ TInput, _], xf: Transformer[TResult, TInput]) = this()
}


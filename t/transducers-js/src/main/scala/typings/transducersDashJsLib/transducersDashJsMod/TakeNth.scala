package typings
package transducersDashJsLib.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "TakeNth")
@js.native
class TakeNth[TResult, TInput] protected () extends Transformer[TResult, TInput] {
  def this(n: scala.Double, xf: Transformer[TResult, TInput]) = this()
}


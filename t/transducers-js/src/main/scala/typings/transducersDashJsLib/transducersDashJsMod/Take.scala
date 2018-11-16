package typings
package transducersDashJsLib.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "Take")
@js.native
class Take[TResult, TInput] protected () extends Transformer[TResult, TInput] {
  def this(n: scala.Double, xf: Transformer[TResult, TInput]) = this()
}


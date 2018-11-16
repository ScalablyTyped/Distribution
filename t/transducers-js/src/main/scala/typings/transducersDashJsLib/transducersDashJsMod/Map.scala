package typings
package transducersDashJsLib.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "Map")
@js.native
class Map[TResult, TInput, TOutput] protected () extends Transformer[TResult, TInput] {
  def this(f: js.Function1[/* x */ TInput, TOutput], xf: Transformer[TResult, TOutput]) = this()
}


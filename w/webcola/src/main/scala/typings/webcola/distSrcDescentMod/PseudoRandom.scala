package typings.webcola.distSrcDescentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/descent", "PseudoRandom")
@js.native
class PseudoRandom () extends js.Object {
  def this(seed: Double) = this()
  var a: js.Any = js.native
  var c: js.Any = js.native
  var m: js.Any = js.native
  var range: js.Any = js.native
  var seed: Double = js.native
  def getNext(): Double = js.native
  def getNextBetween(min: Double, max: Double): Double = js.native
}


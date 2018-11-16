package typings
package webcolaLib.distSrcDescentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/descent", "PseudoRandom")
@js.native
class PseudoRandom () extends js.Object {
  def this(seed: scala.Double) = this()
  var a: js.Any = js.native
  var c: js.Any = js.native
  var m: js.Any = js.native
  var range: js.Any = js.native
  var seed: scala.Double = js.native
  def getNext(): scala.Double = js.native
  def getNextBetween(min: scala.Double, max: scala.Double): scala.Double = js.native
}


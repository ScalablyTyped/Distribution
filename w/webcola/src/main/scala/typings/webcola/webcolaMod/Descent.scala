package typings.webcola.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Descent")
@js.native
class Descent protected ()
  extends typings.webcola.distSrcDescentMod.Descent {
  def this(x: js.Array[js.Array[Double]], D: js.Array[js.Array[Double]]) = this()
  def this(x: js.Array[js.Array[Double]], D: js.Array[js.Array[Double]], G: js.Array[js.Array[Double]]) = this()
}

/* static members */
@JSImport("webcola", "Descent")
@js.native
object Descent extends js.Object {
  var copy: js.Any = js.native
  var dotProd: js.Any = js.native
  var mApply: js.Any = js.native
  var mid: js.Any = js.native
  var rightMultiply: js.Any = js.native
  var zeroDistance: js.Any = js.native
  def createSquareMatrix(n: Double, f: js.Function2[/* i */ Double, /* j */ Double, Double]): js.Array[js.Array[Double]] = js.native
}


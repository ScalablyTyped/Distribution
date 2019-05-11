package typings
package webcolaLib.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Descent")
@js.native
class Descent protected ()
  extends webcolaLib.distSrcDescentMod.Descent {
  def this(x: js.Array[js.Array[scala.Double]], D: js.Array[js.Array[scala.Double]]) = this()
  def this(x: js.Array[js.Array[scala.Double]], D: js.Array[js.Array[scala.Double]], G: js.Array[js.Array[scala.Double]]) = this()
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
  def createSquareMatrix(n: scala.Double, f: js.Function2[/* i */ scala.Double, /* j */ scala.Double, scala.Double]): js.Array[js.Array[scala.Double]] = js.native
}


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

@JSImport("webcola", "Descent")
@js.native
object Descent extends js.Object {
  var zeroDistance: js.Any = js.native
  /* private */ def copy(a: js.Any, b: js.Any): js.Any = js.native
  def createSquareMatrix(n: scala.Double, f: js.Function2[/* i */ scala.Double, /* j */ scala.Double, scala.Double]): js.Array[js.Array[scala.Double]] = js.native
  /* private */ def dotProd(a: js.Any, b: js.Any): js.Any = js.native
  /* private */ def mApply(m: js.Any, n: js.Any, f: js.Any): js.Any = js.native
  /* private */ def mid(a: js.Any, b: js.Any, m: js.Any): js.Any = js.native
  /* private */ def rightMultiply(m: js.Any, v: js.Any, r: js.Any): js.Any = js.native
}


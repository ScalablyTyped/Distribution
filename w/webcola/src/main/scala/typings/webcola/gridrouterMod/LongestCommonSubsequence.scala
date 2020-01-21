package typings.webcola.gridrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/gridrouter", "LongestCommonSubsequence")
@js.native
class LongestCommonSubsequence[T] protected () extends js.Object {
  def this(s: js.Array[T], t: js.Array[T]) = this()
  var length: Double = js.native
  var reversed: Boolean = js.native
  var s: js.Array[T] = js.native
  var si: Double = js.native
  var t: js.Array[T] = js.native
  var ti: Double = js.native
  def getSequence(): js.Array[T] = js.native
}

/* static members */
@JSImport("webcola/dist/src/gridrouter", "LongestCommonSubsequence")
@js.native
object LongestCommonSubsequence extends js.Object {
  var findMatch: js.Any = js.native
}


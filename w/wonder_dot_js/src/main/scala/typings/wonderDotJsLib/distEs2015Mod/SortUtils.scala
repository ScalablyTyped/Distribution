package typings
package wonderDotJsLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "SortUtils")
@js.native
class SortUtils ()
  extends wonderDotJsLib.distEs2015UtilsSortUtilsMod.SortUtils

@JSImport("wonder.js/dist/es2015", "SortUtils")
@js.native
object SortUtils extends js.Object {
  def insertSort(targetArr: js.Array[_], compareFunc: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]): js.Array[_] = js.native
  def insertSort(
    targetArr: js.Array[_],
    compareFunc: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean],
    isChangeSelf: scala.Boolean
  ): js.Array[_] = js.native
  def quickSort(targetArr: js.Array[_], compareFunc: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]): js.Array[_] = js.native
  def quickSort(
    targetArr: js.Array[_],
    compareFunc: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean],
    isChangeSelf: scala.Boolean
  ): js.Array[_] = js.native
}


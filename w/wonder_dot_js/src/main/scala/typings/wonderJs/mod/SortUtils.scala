package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "SortUtils")
@js.native
class SortUtils ()
  extends typings.wonderJs.sortUtilsMod.SortUtils

/* static members */
@JSImport("wonder.js/dist/es2015", "SortUtils")
@js.native
object SortUtils extends js.Object {
  def insertSort(targetArr: js.Array[_], compareFunc: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): js.Array[_] = js.native
  def insertSort(
    targetArr: js.Array[_],
    compareFunc: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean],
    isChangeSelf: Boolean
  ): js.Array[_] = js.native
  def quickSort(targetArr: js.Array[_], compareFunc: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): js.Array[_] = js.native
  def quickSort(
    targetArr: js.Array[_],
    compareFunc: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean],
    isChangeSelf: Boolean
  ): js.Array[_] = js.native
}


package typings
package webcolaLib.distSrcRbtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/rbtree", "TreeBase")
@js.native
class TreeBase () extends js.Object {
  var _comparator: js.Any = js.native
  var _root: js.Any = js.native
  var size: js.Any = js.native
  def _bound(data: js.Any, cmp: js.Any): Iterator = js.native
  def clear(): scala.Unit = js.native
  def each(cb: js.Any): scala.Unit = js.native
  def find(data: js.Any): js.Any = js.native
  def findIter(data: js.Any): js.Any = js.native
  def iterator(): Iterator = js.native
  def lowerBound(data: js.Any): Iterator = js.native
  def max(): js.Any = js.native
  def min(): js.Any = js.native
  def reach(cb: js.Any): scala.Unit = js.native
  def upperBound(data: js.Any): Iterator = js.native
}


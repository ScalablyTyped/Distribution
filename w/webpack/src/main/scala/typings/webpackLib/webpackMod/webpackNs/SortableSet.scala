package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableSet[T]
  extends stdLib.Set[T] {
  def getFromCache(fn: js.Function1[/* set */ SortableSet[T], js.Array[T]]): js.Array[T] = js.native
  def getFromUnorderedCache(fn: js.Function1[/* set */ SortableSet[T], java.lang.String | scala.Double | js.Array[T]]): js.Any = js.native
  def sort(): scala.Unit = js.native
  def sortWith(sortFn: js.Function2[/* a */ T, /* b */ T, scala.Double]): scala.Unit = js.native
}


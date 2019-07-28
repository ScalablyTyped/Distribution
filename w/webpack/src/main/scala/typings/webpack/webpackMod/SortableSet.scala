package typings.webpack.webpackMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableSet[T] extends Set[T] {
  def getFromCache(fn: js.Function1[/* set */ SortableSet[T], js.Array[T]]): js.Array[T] = js.native
  def getFromUnorderedCache(fn: js.Function1[/* set */ SortableSet[T], String | Double | js.Array[T]]): js.Any = js.native
  def sort(): Unit = js.native
  def sortWith(sortFn: js.Function2[/* a */ T, /* b */ T, Double]): Unit = js.native
}


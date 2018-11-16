package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SortableSet[T]
  extends nodeLib.Set[T] {
  def getFromCache(fn: js.Function1[/* set */ SortableSet[T], js.Array[T]]): js.Array[T]
  def getFromUnorderedCache(fn: js.Function1[/* set */ SortableSet[T], java.lang.String | scala.Double | js.Array[T]]): js.Any
  def sort(): scala.Unit
  def sortWith(sortFn: js.Function2[/* a */ T, /* b */ T, scala.Double]): scala.Unit
}


package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor1[T] extends js.Object {
  def beforeLast(): js.Array[T]
  def byCallIndex(index: scala.Double): js.Array[T]
  def first(): js.Array[T]
  def last(): js.Array[T]
  def second(): js.Array[T]
  def third(): js.Array[T]
}

object ArgCaptor1 {
  @scala.inline
  def apply[T](
    beforeLast: js.Function0[js.Array[T]],
    byCallIndex: js.Function1[scala.Double, js.Array[T]],
    first: js.Function0[js.Array[T]],
    last: js.Function0[js.Array[T]],
    second: js.Function0[js.Array[T]],
    third: js.Function0[js.Array[T]]
  ): ArgCaptor1[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeLast")(beforeLast)
    __obj.updateDynamic("byCallIndex")(byCallIndex)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("last")(last)
    __obj.updateDynamic("second")(second)
    __obj.updateDynamic("third")(third)
    __obj.asInstanceOf[ArgCaptor1[T]]
  }
}


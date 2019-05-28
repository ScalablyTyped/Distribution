package typings
package underscoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Context extends js.Object {
  def apply[T](
    list: underscoreLib.underscoreMod.List[T],
    iterator: underscoreLib.underscoreMod.IterateeMatcherShorthand[_]
  ): js.Array[scala.Boolean] = js.native
  def apply[T](
    list: underscoreLib.underscoreMod.List[T],
    iterator: underscoreLib.underscoreMod.IterateeMatcherShorthand[_],
    context: js.Any
  ): js.Array[scala.Boolean] = js.native
  def apply[T](
    list: underscoreLib.underscoreMod.List[T],
    iterator: underscoreLib.underscoreMod.IterateePropertyShorthand
  ): js.Array[_] = js.native
  def apply[T](
    list: underscoreLib.underscoreMod.List[T],
    iterator: underscoreLib.underscoreMod.IterateePropertyShorthand,
    context: js.Any
  ): js.Array[_] = js.native
  def apply[T, TResult](
    list: underscoreLib.underscoreMod.List[T],
    iterator: underscoreLib.underscoreMod.ListIterator[T, TResult]
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    list: underscoreLib.underscoreMod.List[T],
    iterator: underscoreLib.underscoreMod.ListIterator[T, TResult],
    context: js.Any
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    `object`: underscoreLib.underscoreMod.Dictionary[T],
    iterator: underscoreLib.underscoreMod.ObjectIterator[T, TResult]
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    `object`: underscoreLib.underscoreMod.Dictionary[T],
    iterator: underscoreLib.underscoreMod.ObjectIterator[T, TResult],
    context: js.Any
  ): js.Array[TResult] = js.native
}


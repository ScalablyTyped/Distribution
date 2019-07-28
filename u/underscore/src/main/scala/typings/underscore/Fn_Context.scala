package typings.underscore

import typings.underscore.underscoreMod.Dictionary
import typings.underscore.underscoreMod.IterateeMatcherShorthand
import typings.underscore.underscoreMod.IterateePropertyShorthand
import typings.underscore.underscoreMod.List
import typings.underscore.underscoreMod.ListIterator
import typings.underscore.underscoreMod.ObjectIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Context extends js.Object {
  def apply[T](list: List[T], iterator: IterateeMatcherShorthand[_]): js.Array[Boolean] = js.native
  def apply[T](list: List[T], iterator: IterateeMatcherShorthand[_], context: js.Any): js.Array[Boolean] = js.native
  def apply[T](list: List[T], iterator: IterateePropertyShorthand): js.Array[_] = js.native
  def apply[T](list: List[T], iterator: IterateePropertyShorthand, context: js.Any): js.Array[_] = js.native
  def apply[T, TResult](list: List[T], iterator: ListIterator[T, TResult]): js.Array[TResult] = js.native
  def apply[T, TResult](list: List[T], iterator: ListIterator[T, TResult], context: js.Any): js.Array[TResult] = js.native
  def apply[T, TResult](`object`: Dictionary[T], iterator: ObjectIterator[T, TResult]): js.Array[TResult] = js.native
  def apply[T, TResult](`object`: Dictionary[T], iterator: ObjectIterator[T, TResult], context: js.Any): js.Array[TResult] = js.native
}


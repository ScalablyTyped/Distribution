package typings.when.When

import typings.when.When._underscore.Fn0
import typings.when.When._underscore.Fn1
import typings.when.When._underscore.Fn2
import typings.when.When._underscore.Fn3
import typings.when.When._underscore.Fn4
import typings.when.When._underscore.Fn5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T] extends js.Object {
  def `catch`[U](): Promise[U] = js.native
  // Make sure you test any usage of these overloads, exceptionType must
  // be a constructor with prototype set to an instance of Error.
  def `catch`[U](exceptionType: js.Any): Promise[U] = js.native
  def `catch`[U](exceptionType: js.Any, onRejected: js.Function1[/* reason */ js.Any, U | Promise[U]]): Promise[U] = js.native
  def `catch`[U](
    filter: js.Function1[/* reason */ js.Any, Boolean],
    onRejected: js.Function1[/* reason */ js.Any, U | Promise[U]]
  ): Promise[U] = js.native
  def `catch`[U](onRejected: js.Function1[/* reason */ js.Any, Boolean | Promise[U] | U]): Promise[U] = js.native
  def delay(milliseconds: Double): Promise[T] = js.native
  def done[U](): Unit = js.native
  def done[U](onFulfilled: js.Function1[/* value */ T, Unit]): Unit = js.native
  def done[U](
    onFulfilled: js.Function1[/* value */ T, Unit],
    onRejected: js.Function1[/* reason */ js.Any, Unit]
  ): Unit = js.native
  def `else`(value: T): Promise[T] = js.native
  def ensure(onFulfilledOrRejected: js.Function): Promise[T] = js.native
  def `finally`(onFulfilledOrRejected: js.Function): Promise[T] = js.native
  def fold[U, V](combine: js.Function2[/* value1 */ T, /* value2 */ V, U | Promise[U]], value2: V): Promise[U] = js.native
  def fold[U, V](combine: js.Function2[/* value1 */ T, /* value2 */ V, U | Promise[U]], value2: Promise[V]): Promise[U] = js.native
  def inspect(): Snapshot[T] = js.native
  def orElse(value: T): Promise[T] = js.native
  def otherwise[U](): Promise[U] = js.native
  // Make sure you test any usage of these overloads, exceptionType must
  // be a constructor with prototype set to an instance of Error.
  def otherwise[U](exceptionType: js.Any): Promise[U] = js.native
  def otherwise[U](exceptionType: js.Any, onRejected: js.Function1[/* reason */ js.Any, U | Promise[U]]): Promise[U] = js.native
  def otherwise[U](onRejected: js.Function1[/* reason */ js.Any, Boolean | Promise[U] | U]): Promise[U] = js.native
  def otherwise[U](
    predicate: js.Function1[/* reason */ js.Any, Boolean],
    onRejected: js.Function1[/* reason */ js.Any, U | Promise[U]]
  ): Promise[U] = js.native
  def spread[T](onFulfilled: Fn0[Promise[T] | T]): Promise[T] = js.native
  def spread[A1, T](onFulfilled: Fn1[A1, Promise[T] | T]): Promise[T] = js.native
  def spread[A1, A2, T](onFulfilled: Fn2[A1, A2, Promise[T] | T]): Promise[T] = js.native
  def spread[A1, A2, A3, T](onFulfilled: Fn3[A1, A2, A3, Promise[T] | T]): Promise[T] = js.native
  def spread[A1, A2, A3, A4, T](onFulfilled: Fn4[A1, A2, A3, A4, Promise[T] | T]): Promise[T] = js.native
  def spread[A1, A2, A3, A4, A5, T](onFulfilled: Fn5[A1, A2, A3, A4, A5, Promise[T] | T]): Promise[T] = js.native
  def tap(onFulfilledSideEffect: js.Function1[/* value */ T, Unit]): Promise[T] = js.native
  def `then`(): Promise[T] = js.native
  def `then`(
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[T] = js.native
  def `then`(
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.Function1[/* reason */ js.Any, T | Thenable[T]]
  ): Promise[T] = js.native
  def `then`(
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.Function1[/* reason */ js.Any, T | Thenable[T]],
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[T] = js.native
  def `then`(
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: Null,
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[T] = js.native
  def `then`(onFulfilled: js.Function1[/* value */ T, T | Thenable[T]]): Promise[T] = js.native
  def `then`(
    onFulfilled: js.Function1[/* value */ T, T | Thenable[T]],
    onRejected: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[T] = js.native
  def `then`(
    onFulfilled: js.Function1[/* value */ T, T | Thenable[T]],
    onRejected: js.Function1[/* reason */ js.Any, T | Thenable[T]]
  ): Promise[T] = js.native
  def `then`(
    onFulfilled: js.Function1[/* value */ T, T | Thenable[T]],
    onRejected: js.Function1[/* reason */ js.Any, T | Thenable[T]],
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[T] = js.native
  def `then`(
    onFulfilled: js.Function1[/* value */ T, T | Thenable[T]],
    onRejected: Null,
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[T] = js.native
  def `then`(
    onFulfilled: Null,
    onRejected: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[T] = js.native
  def `then`(onFulfilled: Null, onRejected: js.Function1[/* reason */ js.Any, T | Thenable[T]]): Promise[T] = js.native
  def `then`(
    onFulfilled: Null,
    onRejected: js.Function1[/* reason */ js.Any, T | Thenable[T]],
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[T] = js.native
  def `then`(onFulfilled: Null, onRejected: Null, onProgress: js.Function1[/* update */ js.Any, Unit]): Promise[T] = js.native
  @JSName("then")
  def then_TResult[TResult](
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.Function1[/* reason */ js.Any, TResult | Thenable[TResult]]
  ): Promise[T | TResult] = js.native
  @JSName("then")
  def then_TResult[TResult](
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.Function1[/* reason */ js.Any, TResult | Thenable[TResult]],
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[T | TResult] = js.native
  @JSName("then")
  def then_TResult[TResult](onFulfilled: js.Function1[/* value */ T, TResult | Thenable[TResult]]): Promise[TResult] = js.native
  @JSName("then")
  def then_TResult[TResult](
    onFulfilled: js.Function1[/* value */ T, TResult | Thenable[TResult]],
    onRejected: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[TResult] = js.native
  @JSName("then")
  def then_TResult[TResult](
    onFulfilled: js.Function1[/* value */ T, T | TResult | (Thenable[T | TResult])],
    onRejected: js.Function1[/* reason */ js.Any, TResult | Thenable[TResult]]
  ): Promise[TResult] = js.native
  @JSName("then")
  def then_TResult[TResult](
    onFulfilled: js.Function1[/* value */ T, T | TResult | (Thenable[T | TResult])],
    onRejected: js.Function1[/* reason */ js.Any, TResult | Thenable[TResult]],
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[TResult] = js.native
  @JSName("then")
  def then_TResult[TResult](
    onFulfilled: js.Function1[/* value */ T, TResult | Thenable[TResult]],
    onRejected: Null,
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[TResult] = js.native
  @JSName("then")
  def then_TResult[TResult](onFulfilled: Null, onRejected: js.Function1[/* reason */ js.Any, TResult | Thenable[TResult]]): Promise[T | TResult] = js.native
  @JSName("then")
  def then_TResult[TResult](
    onFulfilled: Null,
    onRejected: js.Function1[/* reason */ js.Any, TResult | Thenable[TResult]],
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[T | TResult] = js.native
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](
    onFulfilled: js.Function1[/* value */ T, TResult1 | Thenable[TResult1]],
    onRejected: js.Function1[/* reason */ js.Any, TResult2 | Thenable[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](
    onFulfilled: js.Function1[/* value */ T, TResult1 | Thenable[TResult1]],
    onRejected: js.Function1[/* reason */ js.Any, TResult2 | Thenable[TResult2]],
    onProgress: js.Function1[/* update */ js.Any, Unit]
  ): Promise[TResult1 | TResult2] = js.native
  def timeout(milliseconds: Double): Promise[T] = js.native
  def timeout(milliseconds: Double, reason: js.Any): Promise[T] = js.native
  def `with`(thisArg: js.Any): Promise[T] = js.native
  def withThis(thisArg: js.Any): Promise[T] = js.native
  def `yield`[U](value: U): Promise[U] = js.native
  def `yield`[U](value: Promise[U]): Promise[U] = js.native
}

@JSGlobal("When.promise")
@js.native
object promise extends js.Object {
  def apply[T](
    resolver: js.Function2[
      /* resolve */ js.Function1[/* value */ T, Unit], 
      /* reject */ js.Function1[/* reason */ js.Any, Unit], 
      Unit
    ]
  ): Promise[T] = js.native
}


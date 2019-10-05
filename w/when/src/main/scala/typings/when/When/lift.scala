package typings.when.When

import typings.when.When.`_`.Fn0
import typings.when.When.`_`.Fn1
import typings.when.When.`_`.Fn2
import typings.when.When.`_`.Fn3
import typings.when.When.`_`.Fn4
import typings.when.When.`_`.Fn5
import typings.when.When.`_`.LiftedFn0
import typings.when.When.`_`.LiftedFn1
import typings.when.When.`_`.LiftedFn2
import typings.when.When.`_`.LiftedFn3
import typings.when.When.`_`.LiftedFn4
import typings.when.When.`_`.LiftedFn5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("When.lift")
@js.native
object lift extends js.Object {
  def apply[T](f: Fn0[T]): LiftedFn0[T] = js.native
  def apply[A1, T](f: Fn1[A1, T]): LiftedFn1[A1, T] = js.native
  def apply[A1, A2, T](f: Fn2[A1, A2, T]): LiftedFn2[A1, A2, T] = js.native
  def apply[A1, A2, A3, T](f: Fn3[A1, A2, A3, T]): LiftedFn3[A1, A2, A3, T] = js.native
  def apply[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T]): LiftedFn4[A1, A2, A3, A4, T] = js.native
  def apply[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T]): LiftedFn5[A1, A2, A3, A4, A5, T] = js.native
}


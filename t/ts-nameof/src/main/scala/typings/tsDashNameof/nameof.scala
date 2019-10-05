package typings.tsDashNameof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nameof")
@js.native
object nameof extends js.Object {
  def apply(obj: js.Any): String = js.native
  def apply[T](): String = js.native
  def apply[T](func: js.Function1[/* obj */ T, Unit]): String = js.native
  def full(obj: js.Any): String = js.native
  def full(obj: js.Any, periodIndex: Double): String = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def full[T](): String = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def full[T](func: js.Function1[/* obj */ T, Unit]): String = js.native
  def full[T](func: js.Function1[/* obj */ T, Unit], periodIndex: Double): String = js.native
  def full[T](periodIndex: Double): String = js.native
  def interpolate[T](value: T): T = js.native
  def toArray(args: js.Any*): js.Array[String] = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def toArray[T](func: js.Function1[/* obj */ T, js.Array[_]]): js.Array[String] = js.native
}


package typings.tspromise.mod

import typings.std.Error
import typings.tspromise.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tspromise", JSImport.Namespace)
@js.native
class ^[T] protected () extends Thenable[T] {
  def this(callback: js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[T], Unit], 
        /* reject */ js.UndefOr[js.Function1[/* error */ Error, Unit]], 
        Unit
      ]) = this()
}

@JSImport("tspromise", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def all(promises: js.Array[Thenable[_]]): Thenable[js.Array[_]] = js.native
  def async[TR](callback: js.Function0[TR]): js.Function0[Thenable[TR]] = js.native
  def async[T1, TR](callback: js.Function1[/* p1 */ T1, TR]): js.Function1[/* p1 */ T1, Thenable[TR]] = js.native
  def async[T1, T2, TR](callback: js.Function2[/* p1 */ T1, /* p2 */ T2, TR]): js.Function2[/* p1 */ T1, /* p2 */ T2, Thenable[TR]] = js.native
  def async[T1, T2, T3, TR](callback: js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, TR]): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, Thenable[TR]] = js.native
  def async[T1, T2, T3, T4, TR](callback: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, TR]): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, Thenable[TR]] = js.native
  def nfcall[T](obj: js.Any, methodName: String, args: js.Any*): Thenable[T] = js.native
  def reject[T](error: Error): Thenable[T] = js.native
  def resolve[T](): Thenable[T] = js.native
  def resolve[T](promise: Thenable[T]): Thenable[T] = js.native
  def resolve[T](value: T): Thenable[T] = js.native
  def rewriteFolderSync(path: String): Unit = js.native
  def spawn[TR](generatorFunction: js.Function0[TR]): Thenable[TR] = js.native
  def waitAsync(time: Double): Thenable[js.Object] = js.native
}


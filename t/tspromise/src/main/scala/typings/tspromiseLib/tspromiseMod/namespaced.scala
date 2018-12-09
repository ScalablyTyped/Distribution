package typings
package tspromiseLib.tspromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tspromise", JSImport.Namespace)
@js.native
class namespaced[T] protected () extends Promise[T] {
  def this(callback: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T], scala.Unit], 
      /* reject */ js.UndefOr[js.Function1[/* error */ nodeLib.Error, scala.Unit]], 
      scala.Unit
    ]) = this()
}

@JSImport("tspromise", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def all(promises: js.Array[tspromiseLib.Thenable[_]]): tspromiseLib.Thenable[js.Array[_]] = js.native
  def async[TR](callback: js.Function0[TR]): js.Function0[tspromiseLib.Thenable[TR]] = js.native
  def async[T1, TR](callback: js.Function1[/* p1 */ T1, TR]): js.Function1[/* p1 */ T1, tspromiseLib.Thenable[TR]] = js.native
  def async[T1, T2, TR](callback: js.Function2[/* p1 */ T1, /* p2 */ T2, TR]): js.Function2[/* p1 */ T1, /* p2 */ T2, tspromiseLib.Thenable[TR]] = js.native
  def async[T1, T2, T3, TR](callback: js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, TR]): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, tspromiseLib.Thenable[TR]] = js.native
  def async[T1, T2, T3, T4, TR](callback: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, TR]): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, tspromiseLib.Thenable[TR]] = js.native
  def nfcall[T](obj: js.Any, methodName: nodeLib.String, args: js.Any*): tspromiseLib.Thenable[T] = js.native
  def reject[T](error: nodeLib.Error): tspromiseLib.Thenable[T] = js.native
  def resolve[T](): tspromiseLib.Thenable[T] = js.native
  def resolve[T](promise: tspromiseLib.Thenable[T]): tspromiseLib.Thenable[T] = js.native
  def resolve[T](value: T): tspromiseLib.Thenable[T] = js.native
  def rewriteFolderSync(path: java.lang.String): scala.Unit = js.native
  def spawn[TR](generatorFunction: js.Function0[TR]): tspromiseLib.Thenable[TR] = js.native
  def waitAsync(time: scala.Double): tspromiseLib.Thenable[js.Object] = js.native
}


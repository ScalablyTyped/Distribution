package typings.uirouterCore

import org.scalablytyped.runtime.Instantiable1
import typings.uirouterCore.commonCommonMod.Predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/hof", JSImport.Namespace)
@js.native
object hofMod extends js.Object {
  val propEq: js.Function = js.native
  def all(fn1: Predicate[_]): js.Function1[/* arr */ js.Array[_], Boolean] = js.native
  def and(fn1: Predicate[_], fn2: Predicate[_]): Predicate[_] = js.native
  def any(fn1: Predicate[_]): js.Function1[/* arr */ js.Array[_], Boolean] = js.native
  def compose(): js.Function0[_] = js.native
  def curry(fn: js.Function): js.Function = js.native
  def eq(comp: js.Any): Predicate[_] = js.native
  def invoke(fnName: String): js.Function = js.native
  def invoke(fnName: String, args: js.Array[_]): js.Function = js.native
  def is[T](ctor: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* obj */ js.Any, /* is T */ Boolean] = js.native
  def not(fn: Predicate[_]): Predicate[_] = js.native
  def or(fn1: Predicate[_], fn2: Predicate[_]): Predicate[_] = js.native
  def parse(name: String): js.Any = js.native
  def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = js.native
  def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, _] = js.native
  def prop(name: String): js.Function1[/* obj */ js.Any, _] = js.native
  def `val`[T](v: T): js.Function0[T] = js.native
}


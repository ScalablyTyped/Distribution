package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/hof", JSImport.Namespace)
@js.native
object libCommonHofMod extends js.Object {
  val propEq: js.Function = js.native
  def all(fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_]): js.Function1[/* arr */ js.Array[_], scala.Boolean] = js.native
  def and(
    fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_],
    fn2: atUirouterCoreLib.libCommonCommonMod.Predicate[_]
  ): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def any(fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_]): js.Function1[/* arr */ js.Array[_], scala.Boolean] = js.native
  def compose(): js.Function0[_] = js.native
  def curry(fn: js.Function): js.Function = js.native
  def eq(comp: js.Any): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def invoke(fnName: java.lang.String): js.Function = js.native
  def invoke(fnName: java.lang.String, args: js.Array[_]): js.Function = js.native
  def is[T](ctor: ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* obj */ js.Any, /* is T */scala.Boolean] = js.native
  def not(fn: atUirouterCoreLib.libCommonCommonMod.Predicate[_]): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def or(
    fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_],
    fn2: atUirouterCoreLib.libCommonCommonMod.Predicate[_]
  ): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def parse(name: java.lang.String): js.Any = js.native
  def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = js.native
  def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, _] = js.native
  def prop(name: java.lang.String): js.Function1[/* obj */ js.Any, _] = js.native
  def `val`[T](v: T): js.Function0[T] = js.native
}


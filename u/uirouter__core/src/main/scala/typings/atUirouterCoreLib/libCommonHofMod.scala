package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/hof", JSImport.Namespace)
@js.native
object libCommonHofMod extends js.Object {
  val all: js.Function1[
    /* fn1 */ atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any], 
    js.Function1[/* arr */ js.Array[js.Any], scala.Boolean]
  ] = js.native
  val any: js.Function1[
    /* fn1 */ atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any], 
    js.Function1[/* arr */ js.Array[js.Any], scala.Boolean]
  ] = js.native
  @JSName("eq")
  val eq_FlibCommonHofMod: js.Function1[/* comp */ js.Any, atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any]] = js.native
  val is: js.Function1[
    /* ctor */ ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any], 
    js.Function1[/* obj */ js.Any, /* is any */scala.Boolean]
  ] = js.native
  val not: js.Function1[
    /* fn */ atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any], 
    atUirouterCoreLib.libCommonCommonMod.Predicate[js.Any]
  ] = js.native
  val parse: js.Function1[/* name */ java.lang.String, js.Any] = js.native
  val prop: js.Function1[/* name */ java.lang.String, js.Function1[/* obj */ js.Any, js.Any]] = js.native
  val propEq: js.Function = js.native
  val `val`: js.Function1[/* v */ js.Any, js.Function0[js.Any]] = js.native
  def and(
    fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_],
    fn2: atUirouterCoreLib.libCommonCommonMod.Predicate[_]
  ): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def compose(): js.Function0[_] = js.native
  def curry(fn: js.Function): js.Function = js.native
  def invoke(fnName: java.lang.String): js.Function = js.native
  def invoke(fnName: java.lang.String, args: js.Array[_]): js.Function = js.native
  def or(
    fn1: atUirouterCoreLib.libCommonCommonMod.Predicate[_],
    fn2: atUirouterCoreLib.libCommonCommonMod.Predicate[_]
  ): atUirouterCoreLib.libCommonCommonMod.Predicate[_] = js.native
  def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = js.native
  def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, _] = js.native
}


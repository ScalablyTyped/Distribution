package typings.uirouterCore

import org.scalablytyped.runtime.Instantiable1
import typings.uirouterCore.commonCommonMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hofMod {
  
  @JSImport("@uirouter/core/lib/common/hof", "all")
  @js.native
  def all(fn1: Predicate[_]): js.Function1[/* arr */ js.Array[_], Boolean] = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "and")
  @js.native
  def and(fn1: Predicate[_], fn2: Predicate[_]): Predicate[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "any")
  @js.native
  def any(fn1: Predicate[_]): js.Function1[/* arr */ js.Array[_], Boolean] = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "compose")
  @js.native
  def compose(): js.Function0[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "curry")
  @js.native
  def curry(fn: js.Function): js.Function = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "eq")
  @js.native
  def eq_(comp: js.Any): Predicate[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "invoke")
  @js.native
  def invoke(fnName: String): js.Function = js.native
  @JSImport("@uirouter/core/lib/common/hof", "invoke")
  @js.native
  def invoke(fnName: String, args: js.Array[_]): js.Function = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "is")
  @js.native
  def is[T](ctor: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* obj */ js.Any, /* is T */ Boolean] = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "not")
  @js.native
  def not(fn: Predicate[_]): Predicate[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "or")
  @js.native
  def or(fn1: Predicate[_], fn2: Predicate[_]): Predicate[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "parse")
  @js.native
  def parse(name: String): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "pattern")
  @js.native
  def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "pipe")
  @js.native
  def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, _] = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "prop")
  @js.native
  def prop(name: String): js.Function1[/* obj */ js.Any, _] = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "propEq")
  @js.native
  val propEq: js.Function = js.native
  
  @JSImport("@uirouter/core/lib/common/hof", "val")
  @js.native
  def `val`[T](v: T): js.Function0[T] = js.native
}

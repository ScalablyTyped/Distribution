package typings.uirouterCore

import org.scalablytyped.runtime.Instantiable1
import typings.uirouterCore.commonCommonMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hofMod {
  
  @JSImport("@uirouter/core/lib/common/hof", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def all(fn1: Predicate[js.Any]): js.Function1[/* arr */ js.Array[js.Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[js.Any], Boolean]]
  
  @scala.inline
  def and(fn1: Predicate[js.Any], fn2: Predicate[js.Any]): Predicate[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[Predicate[js.Any]]
  
  @scala.inline
  def any(fn1: Predicate[js.Any]): js.Function1[/* arr */ js.Array[js.Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[js.Any], Boolean]]
  
  @scala.inline
  def compose(): js.Function0[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")().asInstanceOf[js.Function0[js.Any]]
  
  @scala.inline
  def curry(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("curry")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def eq_(comp: js.Any): Predicate[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("eq")(comp.asInstanceOf[js.Any]).asInstanceOf[Predicate[js.Any]]
  
  @scala.inline
  def invoke(fnName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(fnName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def invoke(fnName: String, args: js.Array[js.Any]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(fnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @scala.inline
  def is[T](ctor: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* obj */ js.Any, /* is T */ Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(ctor.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, /* is T */ Boolean]]
  
  @scala.inline
  def not(fn: Predicate[js.Any]): Predicate[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(fn.asInstanceOf[js.Any]).asInstanceOf[Predicate[js.Any]]
  
  @scala.inline
  def or(fn1: Predicate[js.Any], fn2: Predicate[js.Any]): Predicate[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[Predicate[js.Any]]
  
  @scala.inline
  def parse(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(struct.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(funcs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, js.Any]]
  
  @scala.inline
  def prop(name: String): js.Function1[/* obj */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, js.Any]]
  
  @JSImport("@uirouter/core/lib/common/hof", "propEq")
  @js.native
  val propEq: js.Function = js.native
  
  @scala.inline
  def `val`[T](v: T): js.Function0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("val")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]
}

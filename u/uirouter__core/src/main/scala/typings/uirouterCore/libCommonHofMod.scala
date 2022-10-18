package typings.uirouterCore

import org.scalablytyped.runtime.Instantiable1
import typings.uirouterCore.libCommonCommonMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonHofMod {
  
  @JSImport("@uirouter/core/lib/common/hof", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(fn1: Predicate[Any]): js.Function1[/* arr */ js.Array[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[Any], Boolean]]
  
  inline def and(fn1: Predicate[Any], fn2: Predicate[Any]): Predicate[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[Predicate[Any]]
  
  inline def any(fn1: Predicate[Any]): js.Function1[/* arr */ js.Array[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[Any], Boolean]]
  
  inline def compose(): js.Function0[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")().asInstanceOf[js.Function0[Any]]
  
  inline def curry(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("curry")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def eq_(comp: Any): Predicate[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("eq")(comp.asInstanceOf[js.Any]).asInstanceOf[Predicate[Any]]
  
  inline def invoke(fnName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(fnName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def invoke(fnName: String, args: js.Array[Any]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(fnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def is[T](ctor: Instantiable1[/* args (repeated) */ Any, T]): js.Function1[/* obj */ Any, /* is T */ Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(ctor.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Any, /* is T */ Boolean]]
  
  inline def not(fn: Predicate[Any]): Predicate[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(fn.asInstanceOf[js.Any]).asInstanceOf[Predicate[Any]]
  
  inline def or(fn1: Predicate[Any], fn2: Predicate[Any]): Predicate[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[Predicate[Any]]
  
  inline def parse(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(struct.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def pipe(funcs: js.Function*): js.Function1[/* obj */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* obj */ Any, Any]]
  
  inline def prop(name: String): js.Function1[/* obj */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Any, Any]]
  
  @JSImport("@uirouter/core/lib/common/hof", "propEq")
  @js.native
  val propEq: js.Function = js.native
  
  inline def `val`[T](v: T): js.Function0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("val")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]
}

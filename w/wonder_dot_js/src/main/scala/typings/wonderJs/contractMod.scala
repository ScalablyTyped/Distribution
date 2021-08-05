package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contractMod {
  
  @JSImport("wonder.js/dist/es2015/definition/typescript/decorator/contract", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assert(cond: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(cond.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def assert(cond: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(cond.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def describe(message: String, func: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def describe(message: String, func: js.Function, preCondition: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any], preCondition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def describe(message: String, func: js.Function, preCondition: js.Function, context: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any], preCondition.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def describe(message: String, func: js.Function, preCondition: Unit, context: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any], preCondition.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensure(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(outFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  inline def ensureGetter(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureGetter")(outFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  inline def ensureGetterAndSetter(outGetterFunc: js.Any, outSetterFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureGetterAndSetter")(outGetterFunc.asInstanceOf[js.Any], outSetterFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  inline def ensureSetter(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureSetter")(outFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  inline def invariant(func: js.Any): js.Function1[/* target */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
  
  inline def it(message: String, func: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(message: String, func: js.Function, context: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def requireCheck(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireCheck")(inFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  inline def requireGetter(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireGetter")(inFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  inline def requireGetterAndSetter(inGetterFunc: js.Any, inSetterFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("requireGetterAndSetter")(inGetterFunc.asInstanceOf[js.Any], inSetterFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  inline def requireSetter(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireSetter")(inFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
}

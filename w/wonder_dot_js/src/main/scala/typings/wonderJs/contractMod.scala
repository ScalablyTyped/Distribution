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
  inline def describe(message: String, func: js.Function, preCondition: js.Function, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any], preCondition.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def describe(message: String, func: js.Function, preCondition: Unit, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any], preCondition.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensure(outFunc: Any): js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(outFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any]]
  
  inline def ensureGetter(outFunc: Any): js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureGetter")(outFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any]]
  
  inline def ensureGetterAndSetter(outGetterFunc: Any, outSetterFunc: Any): js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureGetterAndSetter")(outGetterFunc.asInstanceOf[js.Any], outSetterFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any]]
  
  inline def ensureSetter(outFunc: Any): js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureSetter")(outFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any]]
  
  inline def invariant(func: Any): js.Function1[/* target */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ Any, Unit]]
  
  inline def it(message: String, func: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(message: String, func: js.Function, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(message.asInstanceOf[js.Any], func.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def requireCheck(inFunc: Any): js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireCheck")(inFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any]]
  
  inline def requireGetter(inFunc: Any): js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireGetter")(inFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any]]
  
  inline def requireGetterAndSetter(inGetterFunc: Any, inSetterFunc: Any): js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("requireGetterAndSetter")(inGetterFunc.asInstanceOf[js.Any], inSetterFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any]]
  
  inline def requireSetter(inFunc: Any): js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireSetter")(inFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any]]
}

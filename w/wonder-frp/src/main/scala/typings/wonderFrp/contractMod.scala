package typings.wonderFrp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contractMod {
  
  @JSImport("wonder-frp/dist/commonjs/definition/typescript/decorator/contract", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assert(cond: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(cond.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def assert(cond: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(cond.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ensure(OutFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(OutFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  @scala.inline
  def ensureGetter(OutFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureGetter")(OutFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  @scala.inline
  def ensureSetter(OutFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureSetter")(OutFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  @scala.inline
  def invariant(func: js.Any): js.Function1[/* target */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
  
  @scala.inline
  def requireCheck(InFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireCheck")(InFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  @scala.inline
  def requireGetter(InFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireGetter")(InFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  @scala.inline
  def requireSetter(InFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireSetter")(InFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
}

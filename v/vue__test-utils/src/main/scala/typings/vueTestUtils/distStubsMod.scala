package typings.vueTestUtils

import typings.vueRuntimeCore.mod.Component
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueTestUtils.anon.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStubsMod {
  
  @JSImport("@vue/test-utils/dist/stubs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOriginalComponentFromStub(stub: Component[Any, Any, Any, ComputedOptions, MethodOptions]): js.UndefOr[Component[Any, Any, Any, ComputedOptions, MethodOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalComponentFromStub")(stub.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Component[Any, Any, Any, ComputedOptions, MethodOptions]]]
  
  inline def registerStub(param0: Source): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerStub")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

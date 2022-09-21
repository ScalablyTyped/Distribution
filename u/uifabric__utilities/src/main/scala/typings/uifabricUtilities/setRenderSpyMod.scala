package typings.uifabricUtilities

import typings.enzyme.mod.ReactWrapper
import typings.react.mod.Component
import typings.sinon.mod.SinonSpy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setRenderSpyMod {
  
  @JSImport("@uifabric/utilities/lib/test/setRenderSpy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setRenderSpy(wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, Any]]): SinonSpy[js.Array[Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setRenderSpy")(wrapper.asInstanceOf[js.Any]).asInstanceOf[SinonSpy[js.Array[Any], Any]]
}

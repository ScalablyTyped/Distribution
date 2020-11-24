package typings.uifabricUtilities

import typings.enzyme.mod.ReactWrapper
import typings.react.mod.Component
import typings.sinon.mod.SinonSpy
import typings.std.Parameters
import typings.std.ReturnType
import typings.uifabricUtilities.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/test", JSImport.Namespace)
@js.native
object testMod extends js.Object {
  
  def create(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof defaultCreate> is not an array type */ args: Parameters[FnCall]
  ): ReturnType[FnCall] = js.native
  
  def injectWrapperMethod(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    methodName: String,
    fn: js.Function0[Unit]
  ): Unit = js.native
  
  def setRenderSpy(wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]]): SinonSpy[js.Array[_], _] = js.native
}

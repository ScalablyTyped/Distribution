package typings.atUifabricUtilities

import typings.enzyme.enzymeMod.ReactWrapper
import typings.react.reactMod.Component
import typings.sinon.sinonMod.SinonSpy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/test", JSImport.Namespace)
@js.native
object libTestMod extends js.Object {
  def injectWrapperMethod(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    methodName: String,
    fn: js.Function0[Unit]
  ): Unit = js.native
  def setRenderSpy(wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]]): SinonSpy = js.native
}


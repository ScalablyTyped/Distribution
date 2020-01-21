package typings.uifabricUtilities

import typings.enzyme.mod.ReactWrapper
import typings.react.mod.Component
import typings.sinon.mod.SinonSpy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/test", JSImport.Namespace)
@js.native
object testMod extends js.Object {
  def injectWrapperMethod(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]],
    methodName: String,
    fn: js.Function0[Unit]
  ): Unit = js.native
  def setRenderSpy(wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, _]]): SinonSpy = js.native
}


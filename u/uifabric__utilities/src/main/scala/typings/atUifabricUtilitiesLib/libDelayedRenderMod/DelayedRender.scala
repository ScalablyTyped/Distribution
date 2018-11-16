package typings
package atUifabricUtilitiesLib.libDelayedRenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/DelayedRender", "DelayedRender")
@js.native
class DelayedRender protected ()
  extends reactLib.reactMod.Component[IDelayedRenderProps, IDelayedRenderState, js.Any] {
  def this(props: IDelayedRenderProps) = this()
  var _timeoutId: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDelayedRender(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDelayedRender(): scala.Unit = js.native
}

@JSImport("@uifabric/utilities/lib/DelayedRender", "DelayedRender")
@js.native
object DelayedRender extends js.Object {
  var defaultProps: atUifabricUtilitiesLib.Anon_Delay = js.native
}


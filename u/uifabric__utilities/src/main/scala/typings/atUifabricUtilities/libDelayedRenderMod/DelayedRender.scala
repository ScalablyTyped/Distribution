package typings.atUifabricUtilities.libDelayedRenderMod

import typings.atUifabricUtilities.Anon_Delay
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/DelayedRender", "DelayedRender")
@js.native
class DelayedRender protected ()
  extends Component[IDelayedRenderProps, IDelayedRenderState, js.Any] {
  def this(props: IDelayedRenderProps) = this()
  var _timeoutId: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDelayedRender(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDelayedRender(): Unit = js.native
}

/* static members */
@JSImport("@uifabric/utilities/lib/DelayedRender", "DelayedRender")
@js.native
object DelayedRender extends js.Object {
  var defaultProps: Anon_Delay = js.native
}


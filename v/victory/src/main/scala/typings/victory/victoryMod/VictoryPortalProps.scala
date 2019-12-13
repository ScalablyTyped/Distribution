package typings.victory.victoryMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryPortalProps extends js.Object {
  /**
    * The children of this component define the content of the label.
    * This makes using the component similar to normal HTML spans or labels. strings, numbers, and functions of data / value are supported.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  /**
    * The groupComponent prop takes a component instance which will be used to create a group element for VictoryPortal to render its child component into. This prop defaults to a <g> tag.
    */
  var groupComponent: js.UndefOr[ReactElement] = js.undefined
}

object VictoryPortalProps {
  @scala.inline
  def apply(children: ReactElement = null, groupComponent: ReactElement = null): VictoryPortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryPortalProps]
  }
}


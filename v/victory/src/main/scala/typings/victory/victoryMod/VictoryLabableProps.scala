package typings.victory.victoryMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Common labable interface
trait VictoryLabableProps extends js.Object {
  /**
    * The labelComponent prop takes in an entire label component which will be used
    * to create a label for the area. The new element created from the passed labelComponent
    * will be supplied with the following properties: x, y, index, data, verticalAnchor,
    * textAnchor, angle, style, text, and events. any of these props may be overridden
    * by passing in props to the supplied component, or modified or ignored within
    * the custom component itself. If labelComponent is omitted, a new VictoryLabel
    * will be created with props described above. This labelComponent prop should be used to
    * provide a series label for VictoryArea. If individual labels are required for each
    * data point, they should be created by composing VictoryArea with VictoryScatter
    * @default <VictoryLabel/>
    */
  var labelComponent: js.UndefOr[ReactElement] = js.undefined
}

object VictoryLabableProps {
  @scala.inline
  def apply(labelComponent: ReactElement = null): VictoryLabableProps = {
    val __obj = js.Dynamic.literal()
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryLabableProps]
  }
}


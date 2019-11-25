package typings.victory.victoryMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictorySingleLabableProps extends VictoryLabableProps {
  /**
    * The label prop defines the label that will appear at the edge of the area.
    * This prop should be given a string or as a function of data. If individual
    * labels are required for each data point, they should be created by composing
    * VictoryArea with VictoryScatter
    * @example: "Series 1", (data) => `${data.length} points`
    */
  var label: js.UndefOr[String | (js.Function1[/* data */ js.Any, String])] = js.undefined
}

object VictorySingleLabableProps {
  @scala.inline
  def apply(
    label: String | (js.Function1[/* data */ js.Any, String]) = null,
    labelComponent: ReactElement = null
  ): VictorySingleLabableProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictorySingleLabableProps]
  }
}


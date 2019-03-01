package typings
package victoryLib.victoryMod

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
  var label: js.UndefOr[java.lang.String | victoryLib.Anon_DataAnyString] = js.undefined
}

object VictorySingleLabableProps {
  @scala.inline
  def apply(
    label: java.lang.String | victoryLib.Anon_DataAnyString = null,
    labelComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null
  ): VictorySingleLabableProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent)
    __obj.asInstanceOf[VictorySingleLabableProps]
  }
}


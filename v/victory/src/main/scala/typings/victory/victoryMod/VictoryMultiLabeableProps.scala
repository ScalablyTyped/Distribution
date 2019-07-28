package typings.victory.victoryMod

import typings.react.reactMod.ReactElement
import typings.victory.Fn_DataAnyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryMultiLabeableProps extends VictoryLabableProps {
  /**
    * The labels prop defines labels that will appear above each bar in your chart.
    * This prop should be given as an array of values or as a function of data.
    * If given as an array, the number of elements in the array should be equal to
    * the length of the data array. Labels may also be added directly to the data object
    * like data={[{x: 1, y: 1, label: "first"}]}.
    * @example ["spring", "summer", "fall", "winter"], (datum) => datum.title
    */
  var labels: js.UndefOr[js.Array[String] | Fn_DataAnyString] = js.undefined
}

object VictoryMultiLabeableProps {
  @scala.inline
  def apply(labelComponent: ReactElement = null, labels: js.Array[String] | Fn_DataAnyString = null): VictoryMultiLabeableProps = {
    val __obj = js.Dynamic.literal()
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent)
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryMultiLabeableProps]
  }
}


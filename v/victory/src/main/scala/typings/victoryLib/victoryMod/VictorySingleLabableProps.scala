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


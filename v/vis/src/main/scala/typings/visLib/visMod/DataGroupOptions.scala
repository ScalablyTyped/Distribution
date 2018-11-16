package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataGroupOptions extends js.Object {
  var drawPoints: js.UndefOr[Graph2dDrawPointsOption | js.Function0[scala.Unit]] = js.undefined
   // TODO
  var excludeFromLegend: js.UndefOr[scala.Boolean] = js.undefined
  var interpolation: js.UndefOr[scala.Boolean | InterpolationOptions] = js.undefined
  var shaded: js.UndefOr[Graph2dShadedOption] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var yAxisOrientation: js.UndefOr[RightLeftEnumType] = js.undefined
}


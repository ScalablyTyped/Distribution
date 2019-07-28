package typings.vegaDashLite.buildSrcScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemeParams extends js.Object {
  /**
    * The number of colors to use in the scheme. This can be useful for scale types such as `"quantize"`, which use the length of the scale range to determine the number of discrete bins for the scale domain.
    *
    * @hide
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * For sequential and diverging schemes only, determines the extent of the color range to use. For example `[0.2, 1]` will rescale the color scheme such that color values in the range _[0, 0.2)_ are excluded from the scheme.
    */
  var extent: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * A color scheme name for sequential/ordinal scales (e.g., `"category10"` or `"viridis"`).
    *
    * For the full list of supported schemes, please refer to the [Vega Scheme](https://vega.github.io/vega/docs/schemes/#reference) reference.
    */
  var name: String
}

object SchemeParams {
  @scala.inline
  def apply(name: String, count: Int | Double = null, extent: js.Array[Double] = null): SchemeParams = {
    val __obj = js.Dynamic.literal(name = name)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    __obj.asInstanceOf[SchemeParams]
  }
}


package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImage extends js.Object {
  var chart: IChart
  var url: java.lang.String
  var visible: scala.Boolean
}

object IImage {
  @scala.inline
  def apply(chart: IChart, url: java.lang.String, visible: scala.Boolean): IImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IImage]
  }
}


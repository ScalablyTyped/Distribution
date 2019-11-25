package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImage extends js.Object {
  var chart: IChart
  var url: String
  var visible: Boolean
}

object IImage {
  @scala.inline
  def apply(chart: IChart, url: String, visible: Boolean): IImage = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IImage]
  }
}


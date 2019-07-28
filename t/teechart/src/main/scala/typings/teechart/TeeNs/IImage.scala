package typings.teechart.TeeNs

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
    val __obj = js.Dynamic.literal(chart = chart, url = url, visible = visible)
  
    __obj.asInstanceOf[IImage]
  }
}


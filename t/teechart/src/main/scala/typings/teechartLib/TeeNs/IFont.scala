package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFont extends js.Object {
  var baseLine: java.lang.String
  var chart: IChart
  var fill: java.lang.String
  var gradient: IGradient
  var shadow: IShadow
  var stroke: IStroke
  var style: java.lang.String
  var textAlign: java.lang.String
  def getSize(): scala.Double
  def setSize(size: scala.Double): scala.Unit
}

object IFont {
  @scala.inline
  def apply(
    baseLine: java.lang.String,
    chart: IChart,
    fill: java.lang.String,
    getSize: js.Function0[scala.Double],
    gradient: IGradient,
    setSize: js.Function1[scala.Double, scala.Unit],
    shadow: IShadow,
    stroke: IStroke,
    style: java.lang.String,
    textAlign: java.lang.String
  ): IFont = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseLine")(baseLine)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("fill")(fill)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("gradient")(gradient)
    __obj.updateDynamic("setSize")(setSize)
    __obj.updateDynamic("shadow")(shadow)
    __obj.updateDynamic("stroke")(stroke)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("textAlign")(textAlign)
    __obj.asInstanceOf[IFont]
  }
}


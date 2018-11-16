package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAxisLabels extends js.Object {
  var alternate: scala.Boolean
  var chart: IChart
  var dateFormat: java.lang.String
  var decimals: scala.Double
  var format: IFormat
  var labelStyle: java.lang.String
  var maxWidth: scala.Double
  var padding: scala.Double
  var rotation: scala.Double
  var separation: scala.Double
   // %
  var visible: scala.Boolean
  def getLabel(value: scala.Double): java.lang.String
  def width(value: scala.Double): scala.Double
}


package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IZoom extends js.Object {
  var active: scala.Boolean
  var chart: IChart
  var direction: java.lang.String
  var enabled: scala.Boolean
  var format: IFormat
  var mouseButton: scala.Double
  def reset(): scala.Unit
}


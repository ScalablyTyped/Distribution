package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolTip extends IAnnotation {
  var animated: scala.Double
  var autoHide: scala.Boolean
  var autoRedraw: scala.Boolean
  var currentIndex: scala.Double
  var currentSeries: ISeries
  var delay: scala.Double
  def hide(): scala.Unit
  def refresh(series: ISeries, index: scala.Double): scala.Unit
}


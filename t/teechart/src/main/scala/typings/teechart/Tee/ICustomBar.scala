package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// SERIES
@js.native
trait ICustomBar extends ISeries {
  var barSize: Double = js.native
  var barStyle: String = js.native
  var offset: Double = js.native
  var origin: Double = js.native
  var sideMargins: Double = js.native
  var stacked: String = js.native
  var useOrigin: Boolean = js.native
}


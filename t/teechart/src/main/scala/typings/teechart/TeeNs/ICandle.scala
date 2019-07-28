package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICandle extends ICustomSeries {
  @JSName("data")
  var data_ICandle: ICandleData = js.native
  var higher: IFormat = js.native
  var lower: IFormat = js.native
  var style: String = js.native
}


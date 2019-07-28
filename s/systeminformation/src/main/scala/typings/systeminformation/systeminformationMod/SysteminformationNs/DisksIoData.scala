package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisksIoData extends js.Object {
  var ms: Double
  var rIO: Double
  var rIO_sec: Double
  var tIO: Double
  var tIO_sec: Double
  var wIO: Double
  var wIO_sec: Double
}

object DisksIoData {
  @scala.inline
  def apply(
    ms: Double,
    rIO: Double,
    rIO_sec: Double,
    tIO: Double,
    tIO_sec: Double,
    wIO: Double,
    wIO_sec: Double
  ): DisksIoData = {
    val __obj = js.Dynamic.literal(ms = ms, rIO = rIO, rIO_sec = rIO_sec, tIO = tIO, tIO_sec = tIO_sec, wIO = wIO, wIO_sec = wIO_sec)
  
    __obj.asInstanceOf[DisksIoData]
  }
}


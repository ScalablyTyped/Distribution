package typings.systeminformation.mod.Systeminformation

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
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any], rIO = rIO.asInstanceOf[js.Any], rIO_sec = rIO_sec.asInstanceOf[js.Any], tIO = tIO.asInstanceOf[js.Any], tIO_sec = tIO_sec.asInstanceOf[js.Any], wIO = wIO.asInstanceOf[js.Any], wIO_sec = wIO_sec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisksIoData]
  }
}


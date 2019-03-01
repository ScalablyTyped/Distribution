package typings
package uaDashParserDashJsLib.IUAParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResult extends js.Object {
  var browser: IBrowser
  var cpu: ICPU
  var device: IDevice
  var engine: IEngine
  var os: IOS
  var ua: java.lang.String
}

object IResult {
  @scala.inline
  def apply(browser: IBrowser, cpu: ICPU, device: IDevice, engine: IEngine, os: IOS, ua: java.lang.String): IResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("browser")(browser)
    __obj.updateDynamic("cpu")(cpu)
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("engine")(engine)
    __obj.updateDynamic("os")(os)
    __obj.updateDynamic("ua")(ua)
    __obj.asInstanceOf[IResult]
  }
}


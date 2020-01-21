package typings.uaParserJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResult extends js.Object {
  var browser: IBrowser
  var cpu: ICPU
  var device: IDevice
  var engine: IEngine
  var os: IOS
  var ua: String
}

object IResult {
  @scala.inline
  def apply(browser: IBrowser, cpu: ICPU, device: IDevice, engine: IEngine, os: IOS, ua: String): IResult = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], ua = ua.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IResult]
  }
}


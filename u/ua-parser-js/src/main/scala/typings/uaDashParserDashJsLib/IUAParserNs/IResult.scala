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
    val __obj = js.Dynamic.literal(browser = browser, cpu = cpu, device = device, engine = engine, os = os, ua = ua)
  
    __obj.asInstanceOf[IResult]
  }
}


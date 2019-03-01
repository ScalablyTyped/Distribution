package typings
package winstonDashMailLib.winstonDashMailMod.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transports extends js.Object {
  var Mail: winstonDashMailLib.winstonDashMailMod.Mail
}

object Transports {
  @scala.inline
  def apply(Mail: winstonDashMailLib.winstonDashMailMod.Mail): Transports = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Mail")(Mail)
    __obj.asInstanceOf[Transports]
  }
}


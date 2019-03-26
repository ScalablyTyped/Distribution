package typings
package winstonDashMailLib.winstonDashMailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped 'usb' | 'nfc' | 'ble'
- Dropped any */ @JSImport("winston-mail", "Mail")
@js.native
class Mail protected () extends js.Object {
  def this(options: MailTransportOptions) = this()
  var from: java.lang.String = js.native
  var html: scala.Boolean = js.native
  var level: java.lang.String = js.native
  var name: java.lang.String = js.native
  var silent: scala.Boolean = js.native
  var subject: java.lang.String = js.native
  var to: java.lang.String = js.native
  var unique: scala.Boolean = js.native
  def filter(obj: winstonDashMailLib.Anon_Level): scala.Boolean = js.native
  def log(level: js.Any, msg: js.Any, meta: js.Any, callback: js.Any): js.Any = js.native
}


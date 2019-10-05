package typings.webgme.GmePanel

import typings.webgme.GmeConfig.LogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel.Logger")
@js.native
class Logger () extends js.Object {
  def createLogger(name: String, options: LogOptions): Logger = js.native
  def createWithGmeConfig(name: String, gmeConfig: typings.webgme.GmeConfig.GmeConfig): Logger = js.native
}


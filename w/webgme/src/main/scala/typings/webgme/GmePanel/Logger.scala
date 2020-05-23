package typings.webgme.GmePanel

import typings.webgme.GmeConfig.GmeConfig
import typings.webgme.GmeConfig.LogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def createLogger(name: String, options: LogOptions): Logger
  def createWithGmeConfig(name: String, gmeConfig: GmeConfig): Logger
}

object Logger {
  @scala.inline
  def apply(createLogger: (String, LogOptions) => Logger, createWithGmeConfig: (String, GmeConfig) => Logger): Logger = {
    val __obj = js.Dynamic.literal(createLogger = js.Any.fromFunction2(createLogger), createWithGmeConfig = js.Any.fromFunction2(createWithGmeConfig))
    __obj.asInstanceOf[Logger]
  }
}


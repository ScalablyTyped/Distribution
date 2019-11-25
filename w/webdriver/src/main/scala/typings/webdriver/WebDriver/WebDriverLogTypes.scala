package typings.webdriver.WebDriver

import typings.webdriver.webdriverStrings.info_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webdriver.webdriverStrings.trace
  - typings.webdriver.webdriverStrings.debug
  - typings.webdriver.webdriverStrings.info_
  - typings.webdriver.webdriverStrings.warn
  - typings.webdriver.webdriverStrings.error
  - typings.webdriver.webdriverStrings.silent
*/
trait WebDriverLogTypes extends js.Object

object WebDriverLogTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.webdriver.webdriverStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.webdriver.webdriverStrings.error = this.cast("error")
  @scala.inline
  def info: info_ = this.cast("info")
  @scala.inline
  def silent: typings.webdriver.webdriverStrings.silent = this.cast("silent")
  @scala.inline
  def trace: typings.webdriver.webdriverStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typings.webdriver.webdriverStrings.warn = this.cast("warn")
}


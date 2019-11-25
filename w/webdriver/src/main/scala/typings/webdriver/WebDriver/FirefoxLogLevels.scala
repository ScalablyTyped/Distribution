package typings.webdriver.WebDriver

import typings.webdriver.webdriverStrings.config_
import typings.webdriver.webdriverStrings.info_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webdriver.webdriverStrings.trace
  - typings.webdriver.webdriverStrings.debug
  - typings.webdriver.webdriverStrings.config_
  - typings.webdriver.webdriverStrings.info_
  - typings.webdriver.webdriverStrings.warn
  - typings.webdriver.webdriverStrings.error
  - typings.webdriver.webdriverStrings.fatal
*/
trait FirefoxLogLevels extends js.Object

object FirefoxLogLevels {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def config: config_ = this.cast("config")
  @scala.inline
  def debug: typings.webdriver.webdriverStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.webdriver.webdriverStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.webdriver.webdriverStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: info_ = this.cast("info")
  @scala.inline
  def trace: typings.webdriver.webdriverStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typings.webdriver.webdriverStrings.warn = this.cast("warn")
}


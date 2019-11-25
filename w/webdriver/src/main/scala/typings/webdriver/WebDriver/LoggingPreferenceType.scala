package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webdriver.webdriverStrings.OFF
  - typings.webdriver.webdriverStrings.SEVERE
  - typings.webdriver.webdriverStrings.WARNING
  - typings.webdriver.webdriverStrings.INFO
  - typings.webdriver.webdriverStrings.CONFIG
  - typings.webdriver.webdriverStrings.FINE
  - typings.webdriver.webdriverStrings.FINER
  - typings.webdriver.webdriverStrings.FINEST
  - typings.webdriver.webdriverStrings.ALL
*/
trait LoggingPreferenceType extends js.Object

object LoggingPreferenceType {
  @scala.inline
  def ALL: typings.webdriver.webdriverStrings.ALL = this.cast("ALL")
  @scala.inline
  def CONFIG: typings.webdriver.webdriverStrings.CONFIG = this.cast("CONFIG")
  @scala.inline
  def FINE: typings.webdriver.webdriverStrings.FINE = this.cast("FINE")
  @scala.inline
  def FINER: typings.webdriver.webdriverStrings.FINER = this.cast("FINER")
  @scala.inline
  def FINEST: typings.webdriver.webdriverStrings.FINEST = this.cast("FINEST")
  @scala.inline
  def INFO: typings.webdriver.webdriverStrings.INFO = this.cast("INFO")
  @scala.inline
  def OFF: typings.webdriver.webdriverStrings.OFF = this.cast("OFF")
  @scala.inline
  def SEVERE: typings.webdriver.webdriverStrings.SEVERE = this.cast("SEVERE")
  @scala.inline
  def WARNING: typings.webdriver.webdriverStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


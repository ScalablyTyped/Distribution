package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webdriver.webdriverStrings.pac
  - typings.webdriver.webdriverStrings.noproxy
  - typings.webdriver.webdriverStrings.autodetect
  - typings.webdriver.webdriverStrings.system
  - typings.webdriver.webdriverStrings.manual
*/
trait ProxyTypes extends js.Object

object ProxyTypes {
  @scala.inline
  def autodetect: typings.webdriver.webdriverStrings.autodetect = this.cast("autodetect")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manual: typings.webdriver.webdriverStrings.manual = this.cast("manual")
  @scala.inline
  def noproxy: typings.webdriver.webdriverStrings.noproxy = this.cast("noproxy")
  @scala.inline
  def pac: typings.webdriver.webdriverStrings.pac = this.cast("pac")
  @scala.inline
  def system: typings.webdriver.webdriverStrings.system = this.cast("system")
}


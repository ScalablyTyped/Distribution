package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webdriver.webdriverStrings.script
  - typings.webdriver.webdriverStrings.pageLoad
  - typings.webdriver.webdriverStrings.`implicit`
*/
trait Timeouts extends js.Object

object Timeouts {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `implicit`: typings.webdriver.webdriverStrings.`implicit` = this.cast("implicit")
  @scala.inline
  def pageLoad: typings.webdriver.webdriverStrings.pageLoad = this.cast("pageLoad")
  @scala.inline
  def script: typings.webdriver.webdriverStrings.script = this.cast("script")
}


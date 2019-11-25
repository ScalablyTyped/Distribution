package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webdriver.webdriverStrings.none
  - typings.webdriver.webdriverStrings.eager
  - typings.webdriver.webdriverStrings.normal
*/
trait PageLoadingStrategy extends js.Object

object PageLoadingStrategy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eager: typings.webdriver.webdriverStrings.eager = this.cast("eager")
  @scala.inline
  def none: typings.webdriver.webdriverStrings.none = this.cast("none")
  @scala.inline
  def normal: typings.webdriver.webdriverStrings.normal = this.cast("normal")
}


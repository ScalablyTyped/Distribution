package typings.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.testingbotApi.testingbotApiStrings.webdriver
  - typings.testingbotApi.testingbotApiStrings.rc
*/
trait BrowserType extends js.Object

object BrowserType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rc: typings.testingbotApi.testingbotApiStrings.rc = this.cast("rc")
  @scala.inline
  def webdriver: typings.testingbotApi.testingbotApiStrings.webdriver = this.cast("webdriver")
}


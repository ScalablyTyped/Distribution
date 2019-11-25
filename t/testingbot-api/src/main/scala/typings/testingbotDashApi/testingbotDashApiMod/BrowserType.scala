package typings.testingbotDashApi.testingbotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.testingbotDashApi.testingbotDashApiStrings.webdriver
  - typings.testingbotDashApi.testingbotDashApiStrings.rc
*/
trait BrowserType extends js.Object

object BrowserType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rc: typings.testingbotDashApi.testingbotDashApiStrings.rc = this.cast("rc")
  @scala.inline
  def webdriver: typings.testingbotDashApi.testingbotDashApiStrings.webdriver = this.cast("webdriver")
}


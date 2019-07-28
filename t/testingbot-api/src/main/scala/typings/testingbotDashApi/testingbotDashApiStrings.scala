package typings.testingbotDashApi

import typings.testingbotDashApi.testingbotDashApiMod.BrowserType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object testingbotDashApiStrings {
  @js.native
  sealed trait rc extends BrowserType
  
  @js.native
  sealed trait webdriver extends BrowserType
  
  @scala.inline
  def rc: rc = "rc".asInstanceOf[rc]
  @scala.inline
  def webdriver: webdriver = "webdriver".asInstanceOf[webdriver]
}


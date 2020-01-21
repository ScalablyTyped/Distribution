package typings.testingbotApi

import typings.testingbotApi.mod.BrowserType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object testingbotApiStrings {
  @js.native
  sealed trait rc extends BrowserType
  
  @js.native
  sealed trait webdriver extends BrowserType
  
  @scala.inline
  def rc: rc = "rc".asInstanceOf[rc]
  @scala.inline
  def webdriver: webdriver = "webdriver".asInstanceOf[webdriver]
}


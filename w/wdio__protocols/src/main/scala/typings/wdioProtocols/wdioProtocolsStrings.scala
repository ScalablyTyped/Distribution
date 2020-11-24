package typings.wdioProtocols

import typings.wdioProtocols.WDIOProtocols.CommandMethod
import typings.wdioProtocols.WDIOProtocols.Environments
import typings.wdioProtocols.WDIOProtocols.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wdioProtocolsStrings {
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @scala.inline
  def UIAutomation: UIAutomation = "UIAutomation".asInstanceOf[UIAutomation]
  
  @scala.inline
  def UiAutomator: UiAutomator = "UiAutomator".asInstanceOf[UiAutomator]
  
  @scala.inline
  def XCUITest: XCUITest = "XCUITest".asInstanceOf[XCUITest]
  
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait DELETE extends CommandMethod
  
  @js.native
  sealed trait GET extends CommandMethod
  
  @js.native
  sealed trait POST extends CommandMethod
  
  @js.native
  sealed trait UIAutomation extends Environments
  
  @js.native
  sealed trait UiAutomator extends Environments
  
  @js.native
  sealed trait XCUITest extends Environments
  
  @js.native
  sealed trait android extends Platform
  
  @js.native
  sealed trait ios extends Platform
  
  @js.native
  sealed trait string extends js.Object
}

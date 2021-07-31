package typings.wdioProtocols

import typings.wdioProtocols.WDIOProtocols.CommandMethod
import typings.wdioProtocols.WDIOProtocols.Environments
import typings.wdioProtocols.WDIOProtocols.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wdioProtocolsStrings {
  
  @js.native
  sealed trait DELETE
    extends StObject
       with CommandMethod
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with CommandMethod
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait POST
    extends StObject
       with CommandMethod
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait UIAutomation
    extends StObject
       with Environments
  @scala.inline
  def UIAutomation: UIAutomation = "UIAutomation".asInstanceOf[UIAutomation]
  
  @js.native
  sealed trait UiAutomator
    extends StObject
       with Environments
  @scala.inline
  def UiAutomator: UiAutomator = "UiAutomator".asInstanceOf[UiAutomator]
  
  @js.native
  sealed trait XCUITest
    extends StObject
       with Environments
  @scala.inline
  def XCUITest: XCUITest = "XCUITest".asInstanceOf[XCUITest]
  
  @js.native
  sealed trait android
    extends StObject
       with Platform
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait ios
    extends StObject
       with Platform
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait string extends StObject
  @scala.inline
  def string: string = "string".asInstanceOf[string]
}

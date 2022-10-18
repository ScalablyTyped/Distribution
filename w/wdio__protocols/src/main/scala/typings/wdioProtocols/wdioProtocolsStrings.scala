package typings.wdioProtocols

import typings.wdioProtocols.buildTypesMod.CommandMethod
import typings.wdioProtocols.buildTypesMod.Environments
import typings.wdioProtocols.buildTypesMod.Platform
import typings.wdioProtocols.buildTypesMod.SameSiteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wdioProtocolsStrings {
  
  @js.native
  sealed trait DELETE
    extends StObject
       with CommandMethod
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with CommandMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait Lax
    extends StObject
       with SameSiteOptions
  inline def Lax: Lax = "Lax".asInstanceOf[Lax]
  
  @js.native
  sealed trait None
    extends StObject
       with SameSiteOptions
  inline def None: None = "None".asInstanceOf[None]
  
  @js.native
  sealed trait POST
    extends StObject
       with CommandMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait Strict
    extends StObject
       with SameSiteOptions
  inline def Strict: Strict = "Strict".asInstanceOf[Strict]
  
  @js.native
  sealed trait UIAutomation
    extends StObject
       with Environments
  inline def UIAutomation: UIAutomation = "UIAutomation".asInstanceOf[UIAutomation]
  
  @js.native
  sealed trait UiAutomator
    extends StObject
       with Environments
  inline def UiAutomator: UiAutomator = "UiAutomator".asInstanceOf[UiAutomator]
  
  @js.native
  sealed trait XCUITest
    extends StObject
       with Environments
  inline def XCUITest: XCUITest = "XCUITest".asInstanceOf[XCUITest]
  
  @js.native
  sealed trait android
    extends StObject
       with Platform
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait `element-6066-11e4-a52e-4f735466cecf` extends StObject
  inline def `element-6066-11e4-a52e-4f735466cecf`: `element-6066-11e4-a52e-4f735466cecf` = "element-6066-11e4-a52e-4f735466cecf".asInstanceOf[`element-6066-11e4-a52e-4f735466cecf`]
  
  @js.native
  sealed trait ios
    extends StObject
       with Platform
  inline def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait string extends StObject
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait tab extends StObject
  inline def tab: tab = "tab".asInstanceOf[tab]
  
  @js.native
  sealed trait window extends StObject
  inline def window: window = "window".asInstanceOf[window]
}

package typings.wdioProtocols

import typings.wdioProtocols.buildTypesMod.CommandMethod
import typings.wdioProtocols.buildTypesMod.Environments
import typings.wdioProtocols.buildTypesMod.Platform
import typings.wdioProtocols.buildTypesMod.SameSiteOptions
import typings.wdioProtocols.buildTypesMod.SupportedMethods
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
  sealed trait browsingContextDotcaptureScreenshot
    extends StObject
       with SupportedMethods
  inline def browsingContextDotcaptureScreenshot: browsingContextDotcaptureScreenshot = "browsingContext.captureScreenshot".asInstanceOf[browsingContextDotcaptureScreenshot]
  
  @js.native
  sealed trait browsingContextDotclose
    extends StObject
       with SupportedMethods
  inline def browsingContextDotclose: browsingContextDotclose = "browsingContext.close".asInstanceOf[browsingContextDotclose]
  
  @js.native
  sealed trait browsingContextDotcontextCreated
    extends StObject
       with SupportedMethods
  inline def browsingContextDotcontextCreated: browsingContextDotcontextCreated = "browsingContext.contextCreated".asInstanceOf[browsingContextDotcontextCreated]
  
  @js.native
  sealed trait browsingContextDotcontextDestroyed
    extends StObject
       with SupportedMethods
  inline def browsingContextDotcontextDestroyed: browsingContextDotcontextDestroyed = "browsingContext.contextDestroyed".asInstanceOf[browsingContextDotcontextDestroyed]
  
  @js.native
  sealed trait browsingContextDotcreate
    extends StObject
       with SupportedMethods
  inline def browsingContextDotcreate: browsingContextDotcreate = "browsingContext.create".asInstanceOf[browsingContextDotcreate]
  
  @js.native
  sealed trait browsingContextDotdomContentLoaded
    extends StObject
       with SupportedMethods
  inline def browsingContextDotdomContentLoaded: browsingContextDotdomContentLoaded = "browsingContext.domContentLoaded".asInstanceOf[browsingContextDotdomContentLoaded]
  
  @js.native
  sealed trait browsingContextDotdownloadWillBegin
    extends StObject
       with SupportedMethods
  inline def browsingContextDotdownloadWillBegin: browsingContextDotdownloadWillBegin = "browsingContext.downloadWillBegin".asInstanceOf[browsingContextDotdownloadWillBegin]
  
  @js.native
  sealed trait browsingContextDotfragmentNavigated
    extends StObject
       with SupportedMethods
  inline def browsingContextDotfragmentNavigated: browsingContextDotfragmentNavigated = "browsingContext.fragmentNavigated".asInstanceOf[browsingContextDotfragmentNavigated]
  
  @js.native
  sealed trait browsingContextDotgetTree
    extends StObject
       with SupportedMethods
  inline def browsingContextDotgetTree: browsingContextDotgetTree = "browsingContext.getTree".asInstanceOf[browsingContextDotgetTree]
  
  @js.native
  sealed trait browsingContextDothandleUserPrompt
    extends StObject
       with SupportedMethods
  inline def browsingContextDothandleUserPrompt: browsingContextDothandleUserPrompt = "browsingContext.handleUserPrompt".asInstanceOf[browsingContextDothandleUserPrompt]
  
  @js.native
  sealed trait browsingContextDotload
    extends StObject
       with SupportedMethods
  inline def browsingContextDotload: browsingContextDotload = "browsingContext.load".asInstanceOf[browsingContextDotload]
  
  @js.native
  sealed trait browsingContextDotnavigate
    extends StObject
       with SupportedMethods
  inline def browsingContextDotnavigate: browsingContextDotnavigate = "browsingContext.navigate".asInstanceOf[browsingContextDotnavigate]
  
  @js.native
  sealed trait browsingContextDotnavigationAborted
    extends StObject
       with SupportedMethods
  inline def browsingContextDotnavigationAborted: browsingContextDotnavigationAborted = "browsingContext.navigationAborted".asInstanceOf[browsingContextDotnavigationAborted]
  
  @js.native
  sealed trait browsingContextDotnavigationFailed
    extends StObject
       with SupportedMethods
  inline def browsingContextDotnavigationFailed: browsingContextDotnavigationFailed = "browsingContext.navigationFailed".asInstanceOf[browsingContextDotnavigationFailed]
  
  @js.native
  sealed trait browsingContextDotnavigationStarted
    extends StObject
       with SupportedMethods
  inline def browsingContextDotnavigationStarted: browsingContextDotnavigationStarted = "browsingContext.navigationStarted".asInstanceOf[browsingContextDotnavigationStarted]
  
  @js.native
  sealed trait browsingContextDotreload
    extends StObject
       with SupportedMethods
  inline def browsingContextDotreload: browsingContextDotreload = "browsingContext.reload".asInstanceOf[browsingContextDotreload]
  
  @js.native
  sealed trait browsingContextDotuserPromptClosed
    extends StObject
       with SupportedMethods
  inline def browsingContextDotuserPromptClosed: browsingContextDotuserPromptClosed = "browsingContext.userPromptClosed".asInstanceOf[browsingContextDotuserPromptClosed]
  
  @js.native
  sealed trait browsingContextDotuserPromptOpened
    extends StObject
       with SupportedMethods
  inline def browsingContextDotuserPromptOpened: browsingContextDotuserPromptOpened = "browsingContext.userPromptOpened".asInstanceOf[browsingContextDotuserPromptOpened]
  
  @js.native
  sealed trait `element-6066-11e4-a52e-4f735466cecf` extends StObject
  inline def `element-6066-11e4-a52e-4f735466cecf`: `element-6066-11e4-a52e-4f735466cecf` = "element-6066-11e4-a52e-4f735466cecf".asInstanceOf[`element-6066-11e4-a52e-4f735466cecf`]
  
  @js.native
  sealed trait ios
    extends StObject
       with Platform
  inline def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait logDotentryAdded
    extends StObject
       with SupportedMethods
  inline def logDotentryAdded: logDotentryAdded = "log.entryAdded".asInstanceOf[logDotentryAdded]
  
  @js.native
  sealed trait scriptDotcallFunction
    extends StObject
       with SupportedMethods
  inline def scriptDotcallFunction: scriptDotcallFunction = "script.callFunction".asInstanceOf[scriptDotcallFunction]
  
  @js.native
  sealed trait scriptDotdisown
    extends StObject
       with SupportedMethods
  inline def scriptDotdisown: scriptDotdisown = "script.disown".asInstanceOf[scriptDotdisown]
  
  @js.native
  sealed trait scriptDotevaluate
    extends StObject
       with SupportedMethods
  inline def scriptDotevaluate: scriptDotevaluate = "script.evaluate".asInstanceOf[scriptDotevaluate]
  
  @js.native
  sealed trait scriptDotgetRealms
    extends StObject
       with SupportedMethods
  inline def scriptDotgetRealms: scriptDotgetRealms = "script.getRealms".asInstanceOf[scriptDotgetRealms]
  
  @js.native
  sealed trait scriptDotrealmCreated
    extends StObject
       with SupportedMethods
  inline def scriptDotrealmCreated: scriptDotrealmCreated = "script.realmCreated".asInstanceOf[scriptDotrealmCreated]
  
  @js.native
  sealed trait scriptDotrealmDestoyed
    extends StObject
       with SupportedMethods
  inline def scriptDotrealmDestoyed: scriptDotrealmDestoyed = "script.realmDestoyed".asInstanceOf[scriptDotrealmDestoyed]
  
  @js.native
  sealed trait sessionDotnew
    extends StObject
       with SupportedMethods
  inline def sessionDotnew: sessionDotnew = "session.new".asInstanceOf[sessionDotnew]
  
  @js.native
  sealed trait sessionDotstatus
    extends StObject
       with SupportedMethods
  inline def sessionDotstatus: sessionDotstatus = "session.status".asInstanceOf[sessionDotstatus]
  
  @js.native
  sealed trait sessionDotsubscribe
    extends StObject
       with SupportedMethods
  inline def sessionDotsubscribe: sessionDotsubscribe = "session.subscribe".asInstanceOf[sessionDotsubscribe]
  
  @js.native
  sealed trait sessionDotunsubscribe
    extends StObject
       with SupportedMethods
  inline def sessionDotunsubscribe: sessionDotunsubscribe = "session.unsubscribe".asInstanceOf[sessionDotunsubscribe]
  
  @js.native
  sealed trait `shadow-6066-11e4-a52e-4f735466cecf` extends StObject
  inline def `shadow-6066-11e4-a52e-4f735466cecf`: `shadow-6066-11e4-a52e-4f735466cecf` = "shadow-6066-11e4-a52e-4f735466cecf".asInstanceOf[`shadow-6066-11e4-a52e-4f735466cecf`]
  
  @js.native
  sealed trait socket
    extends StObject
       with CommandMethod
  inline def socket: socket = "socket".asInstanceOf[socket]
  
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

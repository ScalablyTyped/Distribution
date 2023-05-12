package typings.wdioProtocols

import typings.wdioProtocols.anon.DELETECommandDescriptionParametersRefVariablesGETParametersRefReturns
import typings.wdioProtocols.anon.DELETEParameters
import typings.wdioProtocols.anon.DELETEParametersGETDescriptionParameters
import typings.wdioProtocols.anon.DELETEParametersPOSTCommandDescriptionParameters
import typings.wdioProtocols.anon.GETDescriptionParameters
import typings.wdioProtocols.anon.GETDescriptionParametersPOSTCommandDescriptionParameters
import typings.wdioProtocols.anon.GETParametersRefReturns
import typings.wdioProtocols.anon.POST
import typings.wdioProtocols.anon.POSTCommand
import typings.wdioProtocols.anon.POSTCommandDescriptionParametersRefVariables
import typings.wdioProtocols.anon.POSTDescriptionParameters
import typings.wdioProtocols.anon.POSTDescriptionParametersRef
import typings.wdioProtocols.anon.POSTDescriptionParametersRefReturns
import typings.wdioProtocols.anon.POSTDescriptionString
import typings.wdioProtocols.anon.POSTParameters
import typings.wdioProtocols.anon.`0`
import typings.wdioProtocols.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildProtocolsJsonwpMod {
  
  object default {
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session")
    @js.native
    def session: POSTDescriptionParametersRefReturns = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId")
    @js.native
    def sessionSessionId: DELETEParameters = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/accept_alert")
    @js.native
    def sessionSessionIdAcceptAlert: POSTParameters = js.native
    
    inline def sessionSessionIdAcceptAlert_=(x: POSTParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/accept_alert")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/alert_text")
    @js.native
    def sessionSessionIdAlertText: GETDescriptionParametersPOSTCommandDescriptionParameters = js.native
    
    inline def sessionSessionIdAlertText_=(x: GETDescriptionParametersPOSTCommandDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/alert_text")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/application_cache/status")
    @js.native
    def sessionSessionIdApplicationCacheStatus: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdApplicationCacheStatus_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/application_cache/status")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/back")
    @js.native
    def sessionSessionIdBack: POSTParameters = js.native
    
    inline def sessionSessionIdBack_=(x: POSTParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/back")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/buttondown")
    @js.native
    def sessionSessionIdButtondown: `0` = js.native
    
    inline def sessionSessionIdButtondown_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/buttondown")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/buttonup")
    @js.native
    def sessionSessionIdButtonup: `0` = js.native
    
    inline def sessionSessionIdButtonup_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/buttonup")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/click")
    @js.native
    def sessionSessionIdClick: `0` = js.native
    
    inline def sessionSessionIdClick_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/click")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/cookie")
    @js.native
    def sessionSessionIdCookie: DELETEParametersGETDescriptionParameters = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/cookie/:name")
    @js.native
    def sessionSessionIdCookieName: `1` = js.native
    
    inline def sessionSessionIdCookieName_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/cookie/:name")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdCookie_=(x: DELETEParametersGETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/cookie")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/dismiss_alert")
    @js.native
    def sessionSessionIdDismissAlert: POSTParameters = js.native
    
    inline def sessionSessionIdDismissAlert_=(x: POSTParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/dismiss_alert")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/doubleclick")
    @js.native
    def sessionSessionIdDoubleclick: POSTParameters = js.native
    
    inline def sessionSessionIdDoubleclick_=(x: POSTParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/doubleclick")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element")
    @js.native
    def sessionSessionIdElement: POST = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/active")
    @js.native
    def sessionSessionIdElementActive: POSTDescriptionParameters = js.native
    
    inline def sessionSessionIdElementActive_=(x: POSTDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/active")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/attribute/:name")
    @js.native
    def sessionSessionIdElementElementIdAttributeName: GETParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdAttributeName_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/attribute/:name")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/clear")
    @js.native
    def sessionSessionIdElementElementIdClear: POSTCommandDescriptionParametersRefVariables = js.native
    
    inline def sessionSessionIdElementElementIdClear_=(x: POSTCommandDescriptionParametersRefVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/clear")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/click")
    @js.native
    def sessionSessionIdElementElementIdClick: POSTCommandDescriptionParametersRefVariables = js.native
    
    inline def sessionSessionIdElementElementIdClick_=(x: POSTCommandDescriptionParametersRefVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/click")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/css/:propertyName")
    @js.native
    def sessionSessionIdElementElementIdCssPropertyName: GETParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdCssPropertyName_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/css/:propertyName")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/displayed")
    @js.native
    def sessionSessionIdElementElementIdDisplayed: GETParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdDisplayed_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/displayed")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/element")
    @js.native
    def sessionSessionIdElementElementIdElement: POSTDescriptionParametersRef = js.native
    
    inline def sessionSessionIdElementElementIdElement_=(x: POSTDescriptionParametersRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/element")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/elements")
    @js.native
    def sessionSessionIdElementElementIdElements: POSTDescriptionParametersRef = js.native
    
    inline def sessionSessionIdElementElementIdElements_=(x: POSTDescriptionParametersRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/elements")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/enabled")
    @js.native
    def sessionSessionIdElementElementIdEnabled: GETParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdEnabled_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/enabled")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/equals/:otherId")
    @js.native
    def sessionSessionIdElementElementIdEqualsOtherId: GETParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdEqualsOtherId_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/equals/:otherId")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/location")
    @js.native
    def sessionSessionIdElementElementIdLocation: GETParametersRefReturns = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/location_in_view")
    @js.native
    def sessionSessionIdElementElementIdLocationInView: GETParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdLocationInView_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/location_in_view")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdElementElementIdLocation_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/location")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/name")
    @js.native
    def sessionSessionIdElementElementIdName: GETParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdName_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/name")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/selected")
    @js.native
    def sessionSessionIdElementElementIdSelected: GETParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdSelected_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/selected")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/size")
    @js.native
    def sessionSessionIdElementElementIdSize: GETParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdSize_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/size")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/submit")
    @js.native
    def sessionSessionIdElementElementIdSubmit: POSTCommandDescriptionParametersRefVariables = js.native
    
    inline def sessionSessionIdElementElementIdSubmit_=(x: POSTCommandDescriptionParametersRefVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/submit")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/text")
    @js.native
    def sessionSessionIdElementElementIdText: GETParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdText_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/text")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/element/:elementId/value")
    @js.native
    def sessionSessionIdElementElementIdValue: POSTDescriptionString = js.native
    
    inline def sessionSessionIdElementElementIdValue_=(x: POSTDescriptionString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/value")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdElement_=(x: POST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/elements")
    @js.native
    def sessionSessionIdElements: POST = js.native
    
    inline def sessionSessionIdElements_=(x: POST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/elements")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/execute")
    @js.native
    def sessionSessionIdExecute: POST = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/execute_async")
    @js.native
    def sessionSessionIdExecuteAsync: POST = js.native
    
    inline def sessionSessionIdExecuteAsync_=(x: POST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/execute_async")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdExecute_=(x: POST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/execute")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/forward")
    @js.native
    def sessionSessionIdForward: POSTParameters = js.native
    
    inline def sessionSessionIdForward_=(x: POSTParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/forward")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/frame")
    @js.native
    def sessionSessionIdFrame: `0` = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/frame/parent")
    @js.native
    def sessionSessionIdFrameParent: POSTParameters = js.native
    
    inline def sessionSessionIdFrameParent_=(x: POSTParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/frame/parent")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdFrame_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/frame")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/ime/activate")
    @js.native
    def sessionSessionIdImeActivate: `0` = js.native
    
    inline def sessionSessionIdImeActivate_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/ime/activate")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/ime/activated")
    @js.native
    def sessionSessionIdImeActivated: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdImeActivated_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/ime/activated")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/ime/active_engine")
    @js.native
    def sessionSessionIdImeActiveEngine: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdImeActiveEngine_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/ime/active_engine")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/ime/available_engines")
    @js.native
    def sessionSessionIdImeAvailableEngines: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdImeAvailableEngines_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/ime/available_engines")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/ime/deactivate")
    @js.native
    def sessionSessionIdImeDeactivate: POSTParameters = js.native
    
    inline def sessionSessionIdImeDeactivate_=(x: POSTParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/ime/deactivate")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/keys")
    @js.native
    def sessionSessionIdKeys: `0` = js.native
    
    inline def sessionSessionIdKeys_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/keys")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/local_storage")
    @js.native
    def sessionSessionIdLocalStorage: DELETEParametersGETDescriptionParameters = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/local_storage/key/:key")
    @js.native
    def sessionSessionIdLocalStorageKeyKey: DELETECommandDescriptionParametersRefVariablesGETParametersRefReturns = js.native
    
    inline def sessionSessionIdLocalStorageKeyKey_=(x: DELETECommandDescriptionParametersRefVariablesGETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/local_storage/key/:key")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/local_storage/size")
    @js.native
    def sessionSessionIdLocalStorageSize: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdLocalStorageSize_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/local_storage/size")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdLocalStorage_=(x: DELETEParametersGETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/local_storage")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/location")
    @js.native
    def sessionSessionIdLocation: GETDescriptionParametersPOSTCommandDescriptionParameters = js.native
    
    inline def sessionSessionIdLocation_=(x: GETDescriptionParametersPOSTCommandDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/location")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/log")
    @js.native
    def sessionSessionIdLog: POST = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/log/types")
    @js.native
    def sessionSessionIdLogTypes: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdLogTypes_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/log/types")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdLog_=(x: POST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/log")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/moveto")
    @js.native
    def sessionSessionIdMoveto: `0` = js.native
    
    inline def sessionSessionIdMoveto_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/moveto")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/orientation")
    @js.native
    def sessionSessionIdOrientation: GETDescriptionParametersPOSTCommandDescriptionParameters = js.native
    
    inline def sessionSessionIdOrientation_=(x: GETDescriptionParametersPOSTCommandDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/orientation")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/refresh")
    @js.native
    def sessionSessionIdRefresh: POSTParameters = js.native
    
    inline def sessionSessionIdRefresh_=(x: POSTParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/refresh")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/screenshot")
    @js.native
    def sessionSessionIdScreenshot: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdScreenshot_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/screenshot")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/session_storage")
    @js.native
    def sessionSessionIdSessionStorage: DELETEParametersGETDescriptionParameters = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/session_storage/key/:key")
    @js.native
    def sessionSessionIdSessionStorageKeyKey: DELETECommandDescriptionParametersRefVariablesGETParametersRefReturns = js.native
    
    inline def sessionSessionIdSessionStorageKeyKey_=(x: DELETECommandDescriptionParametersRefVariablesGETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/session_storage/key/:key")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/session_storage/size")
    @js.native
    def sessionSessionIdSessionStorageSize: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdSessionStorageSize_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/session_storage/size")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdSessionStorage_=(x: DELETEParametersGETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/session_storage")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/source")
    @js.native
    def sessionSessionIdSource: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdSource_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/source")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/timeouts")
    @js.native
    def sessionSessionIdTimeouts: `0` = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/timeouts/async_script")
    @js.native
    def sessionSessionIdTimeoutsAsyncScript: `0` = js.native
    
    inline def sessionSessionIdTimeoutsAsyncScript_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/timeouts/async_script")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/timeouts/implicit_wait")
    @js.native
    def sessionSessionIdTimeoutsImplicitWait: `0` = js.native
    
    inline def sessionSessionIdTimeoutsImplicitWait_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/timeouts/implicit_wait")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdTimeouts_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/timeouts")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/title")
    @js.native
    def sessionSessionIdTitle: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdTitle_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/title")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/touch/click")
    @js.native
    def sessionSessionIdTouchClick: `0` = js.native
    
    inline def sessionSessionIdTouchClick_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/touch/click")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/touch/doubleclick")
    @js.native
    def sessionSessionIdTouchDoubleclick: `0` = js.native
    
    inline def sessionSessionIdTouchDoubleclick_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/touch/doubleclick")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/touch/down")
    @js.native
    def sessionSessionIdTouchDown: `0` = js.native
    
    inline def sessionSessionIdTouchDown_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/touch/down")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/touch/flick")
    @js.native
    def sessionSessionIdTouchFlick: `0` = js.native
    
    inline def sessionSessionIdTouchFlick_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/touch/flick")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/touch/longclick")
    @js.native
    def sessionSessionIdTouchLongclick: `0` = js.native
    
    inline def sessionSessionIdTouchLongclick_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/touch/longclick")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/touch/move")
    @js.native
    def sessionSessionIdTouchMove: `0` = js.native
    
    inline def sessionSessionIdTouchMove_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/touch/move")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/touch/scroll")
    @js.native
    def sessionSessionIdTouchScroll: `0` = js.native
    
    inline def sessionSessionIdTouchScroll_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/touch/scroll")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/touch/up")
    @js.native
    def sessionSessionIdTouchUp: `0` = js.native
    
    inline def sessionSessionIdTouchUp_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/touch/up")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/url")
    @js.native
    def sessionSessionIdUrl: GETDescriptionParametersPOSTCommandDescriptionParameters = js.native
    
    inline def sessionSessionIdUrl_=(x: GETDescriptionParametersPOSTCommandDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/url")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/window")
    @js.native
    def sessionSessionIdWindow: DELETEParametersPOSTCommandDescriptionParameters = js.native
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/window/current/maximize")
    @js.native
    def sessionSessionIdWindowCurrentMaximize: POSTParameters = js.native
    
    inline def sessionSessionIdWindowCurrentMaximize_=(x: POSTParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window/current/maximize")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/window/current/position")
    @js.native
    def sessionSessionIdWindowCurrentPosition: POSTCommand = js.native
    
    inline def sessionSessionIdWindowCurrentPosition_=(x: POSTCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window/current/position")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/window/current/size")
    @js.native
    def sessionSessionIdWindowCurrentSize: GETDescriptionParametersPOSTCommandDescriptionParameters = js.native
    
    inline def sessionSessionIdWindowCurrentSize_=(x: GETDescriptionParametersPOSTCommandDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window/current/size")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/window_handle")
    @js.native
    def sessionSessionIdWindowHandle: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdWindowHandle_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window_handle")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./session/:sessionId/window_handles")
    @js.native
    def sessionSessionIdWindowHandles: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdWindowHandles_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window_handles")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdWindow_=(x: DELETEParametersPOSTCommandDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionId_=(x: DELETEParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId")(x.asInstanceOf[js.Any])
    
    inline def session_=(x: POSTDescriptionParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./sessions")
    @js.native
    def sessions: GETDescriptionParameters = js.native
    
    inline def sessions_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/sessions")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/jsonwp", "default./status")
    @js.native
    def status: GETDescriptionParameters = js.native
    
    inline def status_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/status")(x.asInstanceOf[js.Any])
  }
}

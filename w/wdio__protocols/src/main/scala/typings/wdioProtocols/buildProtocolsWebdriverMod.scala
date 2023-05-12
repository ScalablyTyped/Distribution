package typings.wdioProtocols

import typings.wdioProtocols.anon.DELETE
import typings.wdioProtocols.anon.DELETECommandDescriptionParametersRefVariables
import typings.wdioProtocols.anon.DELETEGET
import typings.wdioProtocols.anon.DELETEGETPOST
import typings.wdioProtocols.anon.DELETEPOST
import typings.wdioProtocols.anon.DELETEParametersRefVariables
import typings.wdioProtocols.anon.GET
import typings.wdioProtocols.anon.GETAlternativeCommandsCommandDescription
import typings.wdioProtocols.anon.GETCommandDescriptionExampleReferences
import typings.wdioProtocols.anon.GETCommandDescriptionParametersRefVariables
import typings.wdioProtocols.anon.GETDescriptionExampleReferencesParameters
import typings.wdioProtocols.anon.GETDescriptionParameters
import typings.wdioProtocols.anon.GETDescriptionParametersRef
import typings.wdioProtocols.anon.GETExampleReferences
import typings.wdioProtocols.anon.GETExampleReferencesParameters
import typings.wdioProtocols.anon.GETPOST
import typings.wdioProtocols.anon.GETParametersRefReturns
import typings.wdioProtocols.anon.GETReturns
import typings.wdioProtocols.anon.POST
import typings.wdioProtocols.anon.POSTCommandDescription
import typings.wdioProtocols.anon.POSTCommandDescriptionParameters
import typings.wdioProtocols.anon.POSTCommandDescriptionParametersRef
import typings.wdioProtocols.anon.POSTCommandDescriptionParametersRefVariables
import typings.wdioProtocols.anon.POSTDescriptionExampleReferences
import typings.wdioProtocols.anon.POSTDescriptionParameters
import typings.wdioProtocols.anon.POSTExampleReferencesParametersRef
import typings.wdioProtocols.anon.POSTExamples
import typings.wdioProtocols.anon.POSTParameters
import typings.wdioProtocols.anon.POSTParametersRef
import typings.wdioProtocols.anon.POSTRef
import typings.wdioProtocols.anon.POSTRefReturns
import typings.wdioProtocols.anon.POSTRefVariables
import typings.wdioProtocols.anon.POSTReturns
import typings.wdioProtocols.anon.POSTReturnsVariables
import typings.wdioProtocols.anon.POSTVariables
import typings.wdioProtocols.anon.`0`
import typings.wdioProtocols.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildProtocolsWebdriverMod {
  
  object default {
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session")
    @js.native
    def session: POST = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId")
    @js.native
    def sessionSessionId: DELETE = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/actions")
    @js.native
    def sessionSessionIdActions: DELETEPOST = js.native
    
    inline def sessionSessionIdActions_=(x: DELETEPOST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/actions")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/alert/accept")
    @js.native
    def sessionSessionIdAlertAccept: POSTParameters = js.native
    
    inline def sessionSessionIdAlertAccept_=(x: POSTParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/alert/accept")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/alert/dismiss")
    @js.native
    def sessionSessionIdAlertDismiss: POSTCommandDescription = js.native
    
    inline def sessionSessionIdAlertDismiss_=(x: POSTCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/alert/dismiss")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/alert/text")
    @js.native
    def sessionSessionIdAlertText: POSTCommandDescriptionParameters = js.native
    
    inline def sessionSessionIdAlertText_=(x: POSTCommandDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/alert/text")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/back")
    @js.native
    def sessionSessionIdBack: POSTCommandDescription = js.native
    
    inline def sessionSessionIdBack_=(x: POSTCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/back")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/cookie")
    @js.native
    def sessionSessionIdCookie: DELETEGETPOST = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/cookie/:name")
    @js.native
    def sessionSessionIdCookieName: DELETEParametersRefVariables = js.native
    
    inline def sessionSessionIdCookieName_=(x: DELETEParametersRefVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/cookie/:name")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdCookie_=(x: DELETEGETPOST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/cookie")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element")
    @js.native
    def sessionSessionIdElement: POSTRefReturns = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/active")
    @js.native
    def sessionSessionIdElementActive: GETReturns = js.native
    
    inline def sessionSessionIdElementActive_=(x: GETReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/active")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/attribute/:name")
    @js.native
    def sessionSessionIdElementElementIdAttributeName: GETAlternativeCommandsCommandDescription = js.native
    
    inline def sessionSessionIdElementElementIdAttributeName_=(x: GETAlternativeCommandsCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/attribute/:name")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/clear")
    @js.native
    def sessionSessionIdElementElementIdClear: POSTRefVariables = js.native
    
    inline def sessionSessionIdElementElementIdClear_=(x: POSTRefVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/clear")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/click")
    @js.native
    def sessionSessionIdElementElementIdClick: POSTRefVariables = js.native
    
    inline def sessionSessionIdElementElementIdClick_=(x: POSTRefVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/click")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/computedlabel")
    @js.native
    def sessionSessionIdElementElementIdComputedlabel: GETParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdComputedlabel_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/computedlabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/computedrole")
    @js.native
    def sessionSessionIdElementElementIdComputedrole: GETParametersRefReturns = js.native
    
    inline def sessionSessionIdElementElementIdComputedrole_=(x: GETParametersRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/computedrole")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/css/:propertyName")
    @js.native
    def sessionSessionIdElementElementIdCssPropertyName: GETCommandDescriptionExampleReferences = js.native
    
    inline def sessionSessionIdElementElementIdCssPropertyName_=(x: GETCommandDescriptionExampleReferences): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/css/:propertyName")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/displayed")
    @js.native
    def sessionSessionIdElementElementIdDisplayed: GETAlternativeCommandsCommandDescription = js.native
    
    inline def sessionSessionIdElementElementIdDisplayed_=(x: GETAlternativeCommandsCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/displayed")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/element")
    @js.native
    def sessionSessionIdElementElementIdElement: POSTVariables = js.native
    
    inline def sessionSessionIdElementElementIdElement_=(x: POSTVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/element")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/elements")
    @js.native
    def sessionSessionIdElementElementIdElements: POSTVariables = js.native
    
    inline def sessionSessionIdElementElementIdElements_=(x: POSTVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/elements")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/enabled")
    @js.native
    def sessionSessionIdElementElementIdEnabled: GETAlternativeCommandsCommandDescription = js.native
    
    inline def sessionSessionIdElementElementIdEnabled_=(x: GETAlternativeCommandsCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/enabled")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/name")
    @js.native
    def sessionSessionIdElementElementIdName: GETAlternativeCommandsCommandDescription = js.native
    
    inline def sessionSessionIdElementElementIdName_=(x: GETAlternativeCommandsCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/name")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/property/:name")
    @js.native
    def sessionSessionIdElementElementIdPropertyName: GETAlternativeCommandsCommandDescription = js.native
    
    inline def sessionSessionIdElementElementIdPropertyName_=(x: GETAlternativeCommandsCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/property/:name")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/rect")
    @js.native
    def sessionSessionIdElementElementIdRect: GETAlternativeCommandsCommandDescription = js.native
    
    inline def sessionSessionIdElementElementIdRect_=(x: GETAlternativeCommandsCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/rect")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/screenshot")
    @js.native
    def sessionSessionIdElementElementIdScreenshot: GETDescriptionParametersRef = js.native
    
    inline def sessionSessionIdElementElementIdScreenshot_=(x: GETDescriptionParametersRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/screenshot")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/selected")
    @js.native
    def sessionSessionIdElementElementIdSelected: GETAlternativeCommandsCommandDescription = js.native
    
    inline def sessionSessionIdElementElementIdSelected_=(x: GETAlternativeCommandsCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/selected")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/shadow")
    @js.native
    def sessionSessionIdElementElementIdShadow: GETAlternativeCommandsCommandDescription = js.native
    
    inline def sessionSessionIdElementElementIdShadow_=(x: GETAlternativeCommandsCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/shadow")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/text")
    @js.native
    def sessionSessionIdElementElementIdText: GETDescriptionExampleReferencesParameters = js.native
    
    inline def sessionSessionIdElementElementIdText_=(x: GETDescriptionExampleReferencesParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/text")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/element/:elementId/value")
    @js.native
    def sessionSessionIdElementElementIdValue: POSTExampleReferencesParametersRef = js.native
    
    inline def sessionSessionIdElementElementIdValue_=(x: POSTExampleReferencesParametersRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element/:elementId/value")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdElement_=(x: POSTRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/element")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/elements")
    @js.native
    def sessionSessionIdElements: POSTParametersRef = js.native
    
    inline def sessionSessionIdElements_=(x: POSTParametersRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/elements")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/execute/async")
    @js.native
    def sessionSessionIdExecuteAsync: POSTRefReturns = js.native
    
    inline def sessionSessionIdExecuteAsync_=(x: POSTRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/execute/async")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/execute/sync")
    @js.native
    def sessionSessionIdExecuteSync: POSTRefReturns = js.native
    
    inline def sessionSessionIdExecuteSync_=(x: POSTRefReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/execute/sync")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/forward")
    @js.native
    def sessionSessionIdForward: POSTCommandDescription = js.native
    
    inline def sessionSessionIdForward_=(x: POSTCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/forward")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/frame")
    @js.native
    def sessionSessionIdFrame: POSTRef = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/frame/parent")
    @js.native
    def sessionSessionIdFrameParent: POSTCommandDescription = js.native
    
    inline def sessionSessionIdFrameParent_=(x: POSTCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/frame/parent")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdFrame_=(x: POSTRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/frame")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/permissions")
    @js.native
    def sessionSessionIdPermissions: POSTExamples = js.native
    
    inline def sessionSessionIdPermissions_=(x: POSTExamples): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/permissions")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/print")
    @js.native
    def sessionSessionIdPrint: POSTDescriptionExampleReferences = js.native
    
    inline def sessionSessionIdPrint_=(x: POSTDescriptionExampleReferences): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/print")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/refresh")
    @js.native
    def sessionSessionIdRefresh: POSTCommandDescription = js.native
    
    inline def sessionSessionIdRefresh_=(x: POSTCommandDescription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/refresh")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/reporting/generate_test_report")
    @js.native
    def sessionSessionIdReportingGenerateTestReport: POSTCommandDescriptionParametersRef = js.native
    
    inline def sessionSessionIdReportingGenerateTestReport_=(x: POSTCommandDescriptionParametersRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/reporting/generate_test_report")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/screenshot")
    @js.native
    def sessionSessionIdScreenshot: GETDescriptionParameters = js.native
    
    inline def sessionSessionIdScreenshot_=(x: GETDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/screenshot")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/sensor")
    @js.native
    def sessionSessionIdSensor: POSTCommandDescriptionParametersRef = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/sensor/:type")
    @js.native
    def sessionSessionIdSensorType: DELETECommandDescriptionParametersRefVariables = js.native
    
    inline def sessionSessionIdSensorType_=(x: DELETECommandDescriptionParametersRefVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/sensor/:type")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdSensor_=(x: POSTCommandDescriptionParametersRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/sensor")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/shadow/:shadowId/element")
    @js.native
    def sessionSessionIdShadowShadowIdElement: POSTVariables = js.native
    
    inline def sessionSessionIdShadowShadowIdElement_=(x: POSTVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/shadow/:shadowId/element")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/shadow/:shadowId/elements")
    @js.native
    def sessionSessionIdShadowShadowIdElements: POSTReturnsVariables = js.native
    
    inline def sessionSessionIdShadowShadowIdElements_=(x: POSTReturnsVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/shadow/:shadowId/elements")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/source")
    @js.native
    def sessionSessionIdSource: GETReturns = js.native
    
    inline def sessionSessionIdSource_=(x: GETReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/source")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/time_zone")
    @js.native
    def sessionSessionIdTimeZone: `0` = js.native
    
    inline def sessionSessionIdTimeZone_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/time_zone")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/timeouts")
    @js.native
    def sessionSessionIdTimeouts: GETPOST = js.native
    
    inline def sessionSessionIdTimeouts_=(x: GETPOST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/timeouts")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/title")
    @js.native
    def sessionSessionIdTitle: GETReturns = js.native
    
    inline def sessionSessionIdTitle_=(x: GETReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/title")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/url")
    @js.native
    def sessionSessionIdUrl: GETExampleReferences = js.native
    
    inline def sessionSessionIdUrl_=(x: GETExampleReferences): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/url")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/webauthn/authenticator")
    @js.native
    def sessionSessionIdWebauthnAuthenticator: `0` = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/webauthn/authenticator/:authenticatorId")
    @js.native
    def sessionSessionIdWebauthnAuthenticatorAuthenticatorId: `1` = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/webauthn/authenticator/:authenticatorId/credential")
    @js.native
    def sessionSessionIdWebauthnAuthenticatorAuthenticatorIdCredential: `0` = js.native
    
    inline def sessionSessionIdWebauthnAuthenticatorAuthenticatorIdCredential_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/webauthn/authenticator/:authenticatorId/credential")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/webauthn/authenticator/:authenticatorId/credentials")
    @js.native
    def sessionSessionIdWebauthnAuthenticatorAuthenticatorIdCredentials: GETCommandDescriptionParametersRefVariables = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/webauthn/authenticator/:authenticatorId/credentials/:credentialId")
    @js.native
    def sessionSessionIdWebauthnAuthenticatorAuthenticatorIdCredentialsCredentialId: `1` = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/webauthn/authenticator/:authenticatorId/credentials/:credentialId/uv")
    @js.native
    def sessionSessionIdWebauthnAuthenticatorAuthenticatorIdCredentialsCredentialIdUv: POSTCommandDescriptionParametersRefVariables = js.native
    
    inline def sessionSessionIdWebauthnAuthenticatorAuthenticatorIdCredentialsCredentialIdUv_=(x: POSTCommandDescriptionParametersRefVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/webauthn/authenticator/:authenticatorId/credentials/:credentialId/uv")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdWebauthnAuthenticatorAuthenticatorIdCredentialsCredentialId_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/webauthn/authenticator/:authenticatorId/credentials/:credentialId")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdWebauthnAuthenticatorAuthenticatorIdCredentials_=(x: GETCommandDescriptionParametersRefVariables): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/webauthn/authenticator/:authenticatorId/credentials")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdWebauthnAuthenticatorAuthenticatorId_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/webauthn/authenticator/:authenticatorId")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdWebauthnAuthenticator_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/webauthn/authenticator")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/window")
    @js.native
    def sessionSessionIdWindow: DELETEGET = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/window/fullscreen")
    @js.native
    def sessionSessionIdWindowFullscreen: POSTDescriptionParameters = js.native
    
    inline def sessionSessionIdWindowFullscreen_=(x: POSTDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window/fullscreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/window/handles")
    @js.native
    def sessionSessionIdWindowHandles: GETReturns = js.native
    
    inline def sessionSessionIdWindowHandles_=(x: GETReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window/handles")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/window/maximize")
    @js.native
    def sessionSessionIdWindowMaximize: POSTReturns = js.native
    
    inline def sessionSessionIdWindowMaximize_=(x: POSTReturns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window/maximize")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/window/minimize")
    @js.native
    def sessionSessionIdWindowMinimize: POSTDescriptionParameters = js.native
    
    inline def sessionSessionIdWindowMinimize_=(x: POSTDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window/minimize")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/window/new")
    @js.native
    def sessionSessionIdWindowNew: POSTDescriptionExampleReferences = js.native
    
    inline def sessionSessionIdWindowNew_=(x: POSTDescriptionExampleReferences): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window/new")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./session/:sessionId/window/rect")
    @js.native
    def sessionSessionIdWindowRect: GETExampleReferencesParameters = js.native
    
    inline def sessionSessionIdWindowRect_=(x: GETExampleReferencesParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window/rect")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionIdWindow_=(x: DELETEGET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId/window")(x.asInstanceOf[js.Any])
    
    inline def sessionSessionId_=(x: DELETE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session/:sessionId")(x.asInstanceOf[js.Any])
    
    inline def session_=(x: POST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/session")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriver", "default./status")
    @js.native
    def status: GET = js.native
    
    inline def status_=(x: GET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/status")(x.asInstanceOf[js.Any])
  }
}

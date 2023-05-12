package typings.thunderbirdWebextBrowser

import typings.thunderbirdWebextBrowser.browser.`extension`.ViewType
import typings.thunderbirdWebextBrowser.browser.addressBooks.NodeType
import typings.thunderbirdWebextBrowser.browser.browserSettings.ColorManagementMode
import typings.thunderbirdWebextBrowser.browser.browserSettings.ContextMenuMouseEvent
import typings.thunderbirdWebextBrowser.browser.browserSettings.ImageAnimationBehavior
import typings.thunderbirdWebextBrowser.browser.clipboard.SetImageDataImageType
import typings.thunderbirdWebextBrowser.browser.compose.BeginForwardForwardType
import typings.thunderbirdWebextBrowser.browser.compose.BeginReplyReplyType
import typings.thunderbirdWebextBrowser.browser.compose.ComposeDetailsDeliveryFormat
import typings.thunderbirdWebextBrowser.browser.compose.ComposeDetailsPriority
import typings.thunderbirdWebextBrowser.browser.compose.ComposeDetailsType
import typings.thunderbirdWebextBrowser.browser.compose.OnAfterSaveSaveInfoMode
import typings.thunderbirdWebextBrowser.browser.compose.OnAfterSendSendInfoMode
import typings.thunderbirdWebextBrowser.browser.compose.SaveMessageOptionsMode
import typings.thunderbirdWebextBrowser.browser.compose.SaveMessageReturnReturnMode
import typings.thunderbirdWebextBrowser.browser.compose.SendMessageOptionsMode
import typings.thunderbirdWebextBrowser.browser.compose.SendMessageReturnReturnMode
import typings.thunderbirdWebextBrowser.browser.compose.UndefinedType
import typings.thunderbirdWebextBrowser.browser.cookies.OnChangedCause
import typings.thunderbirdWebextBrowser.browser.cookies.SameSiteStatus
import typings.thunderbirdWebextBrowser.browser.dns._ResolveFlags
import typings.thunderbirdWebextBrowser.browser.downloads.DangerType
import typings.thunderbirdWebextBrowser.browser.downloads.DownloadOptionsMethod
import typings.thunderbirdWebextBrowser.browser.downloads.FilenameConflictAction
import typings.thunderbirdWebextBrowser.browser.downloads.InterruptReason
import typings.thunderbirdWebextBrowser.browser.downloads.State
import typings.thunderbirdWebextBrowser.browser.experiments.APIChildScope
import typings.thunderbirdWebextBrowser.browser.experiments.APIParentScope
import typings.thunderbirdWebextBrowser.browser.extensionTypes.CSSOrigin
import typings.thunderbirdWebextBrowser.browser.extensionTypes.ImageFormat
import typings.thunderbirdWebextBrowser.browser.extensionTypes.RunAt
import typings.thunderbirdWebextBrowser.browser.folders.MailFolderType
import typings.thunderbirdWebextBrowser.browser.idle.IdleState
import typings.thunderbirdWebextBrowser.browser.mailTabs.MailTabLayout
import typings.thunderbirdWebextBrowser.browser.mailTabs.MailTabSortOrder
import typings.thunderbirdWebextBrowser.browser.mailTabs.MailTabSortType
import typings.thunderbirdWebextBrowser.browser.mailTabs.MailTabViewType
import typings.thunderbirdWebextBrowser.browser.mailTabs.UpdateUpdatePropertiesLayout
import typings.thunderbirdWebextBrowser.browser.mailTabs.UpdateUpdatePropertiesSortOrder
import typings.thunderbirdWebextBrowser.browser.mailTabs.UpdateUpdatePropertiesSortType
import typings.thunderbirdWebextBrowser.browser.mailTabs.UpdateUpdatePropertiesViewType
import typings.thunderbirdWebextBrowser.browser.management.ExtensionDisabledReason
import typings.thunderbirdWebextBrowser.browser.management.ExtensionInstallType
import typings.thunderbirdWebextBrowser.browser.management.ExtensionType
import typings.thunderbirdWebextBrowser.browser.manifest.ActionManifestDefaultArea
import typings.thunderbirdWebextBrowser.browser.manifest.ActionManifestDefaultWindows
import typings.thunderbirdWebextBrowser.browser.manifest.ProtocolHandlerProtocol
import typings.thunderbirdWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsAlignment
import typings.thunderbirdWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsTiling
import typings.thunderbirdWebextBrowser.browser.manifest.ThemeTypeColorScheme
import typings.thunderbirdWebextBrowser.browser.manifest.ThemeTypeContentColorScheme
import typings.thunderbirdWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
import typings.thunderbirdWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
import typings.thunderbirdWebextBrowser.browser.manifest.WebExtensionManifestComposeActionDefaultArea
import typings.thunderbirdWebextBrowser.browser.manifest.WebExtensionManifestIncognito
import typings.thunderbirdWebextBrowser.browser.manifest._OptionalPermission
import typings.thunderbirdWebextBrowser.browser.manifest._OptionalPermissionNoPrompt
import typings.thunderbirdWebextBrowser.browser.manifest._PermissionNoPrompt
import typings.thunderbirdWebextBrowser.browser.manifest._PermissionPrivileged
import typings.thunderbirdWebextBrowser.browser.manifest._SitePermission
import typings.thunderbirdWebextBrowser.browser.menus.ContextType
import typings.thunderbirdWebextBrowser.browser.menus.ItemType
import typings.thunderbirdWebextBrowser.browser.menus.OnClickDataFieldId
import typings.thunderbirdWebextBrowser.browser.menus.OnShowDataFieldId
import typings.thunderbirdWebextBrowser.browser.messageDisplay.OpenOpenPropertiesLocation
import typings.thunderbirdWebextBrowser.browser.messageDisplayAction.OnClickDataModifiers
import typings.thunderbirdWebextBrowser.browser.messages.TagsDetailMode
import typings.thunderbirdWebextBrowser.browser.notifications.PermissionLevel
import typings.thunderbirdWebextBrowser.browser.notifications.TemplateType
import typings.thunderbirdWebextBrowser.browser.privacy.network.HTTPSOnlyModeOption
import typings.thunderbirdWebextBrowser.browser.privacy.network.IPHandlingPolicy
import typings.thunderbirdWebextBrowser.browser.privacy.network.TlsVersionRestrictionConfigMaximum
import typings.thunderbirdWebextBrowser.browser.privacy.network.TlsVersionRestrictionConfigMinimum
import typings.thunderbirdWebextBrowser.browser.privacy.websites.CookieConfigBehavior
import typings.thunderbirdWebextBrowser.browser.privacy.websites.TrackingProtectionModeOption
import typings.thunderbirdWebextBrowser.browser.proxy.ProxyConfigProxyType
import typings.thunderbirdWebextBrowser.browser.runtime.OnInstalledReason
import typings.thunderbirdWebextBrowser.browser.runtime.OnRestartRequiredReason
import typings.thunderbirdWebextBrowser.browser.runtime.PlatformArch
import typings.thunderbirdWebextBrowser.browser.runtime.PlatformNaclArch
import typings.thunderbirdWebextBrowser.browser.runtime.PlatformOs
import typings.thunderbirdWebextBrowser.browser.runtime.RequestUpdateCheckStatus
import typings.thunderbirdWebextBrowser.browser.tabs.TabStatus
import typings.thunderbirdWebextBrowser.browser.tabs.TabType
import typings.thunderbirdWebextBrowser.browser.tabs.UpdatePropertyName
import typings.thunderbirdWebextBrowser.browser.types.LevelOfControl
import typings.thunderbirdWebextBrowser.browser.types.SettingScope
import typings.thunderbirdWebextBrowser.browser.webNavigation.TransitionQualifier
import typings.thunderbirdWebextBrowser.browser.webNavigation.TransitionType
import typings.thunderbirdWebextBrowser.browser.webRequest.CertificateTransparencyStatus
import typings.thunderbirdWebextBrowser.browser.webRequest.OnAuthRequiredOptions
import typings.thunderbirdWebextBrowser.browser.webRequest.OnBeforeRequestOptions
import typings.thunderbirdWebextBrowser.browser.webRequest.OnBeforeSendHeadersOptions
import typings.thunderbirdWebextBrowser.browser.webRequest.OnHeadersReceivedOptions
import typings.thunderbirdWebextBrowser.browser.webRequest.ResourceType
import typings.thunderbirdWebextBrowser.browser.webRequest.SecurityInfoOverridableErrorCategory
import typings.thunderbirdWebextBrowser.browser.webRequest.SecurityInfoProtocolVersion
import typings.thunderbirdWebextBrowser.browser.webRequest.SecurityInfoState
import typings.thunderbirdWebextBrowser.browser.webRequest.StreamFilterStatus
import typings.thunderbirdWebextBrowser.browser.webRequest.UrlClassificationFlags
import typings.thunderbirdWebextBrowser.browser.windows.CreateType
import typings.thunderbirdWebextBrowser.browser.windows.WindowState
import typings.thunderbirdWebextBrowser.browser.windows.WindowType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thunderbirdWebextBrowserStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with IPHandlingPolicy
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.IPHandlingPolicy
       with SendMessageOptionsMode
       with typings.thunderbirdWebextBrowser.messenger.compose.SendMessageOptionsMode
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait Alt
    extends StObject
       with OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.composeAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.menus.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.action.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.browserAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.messageDisplayAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.composeAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.menus.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.action.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.browserAction.OnClickDataModifiers
  inline def Alt: Alt = "Alt".asInstanceOf[Alt]
  
  @js.native
  sealed trait Asterisk extends StObject
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait CRASH
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def CRASH: CRASH = "CRASH".asInstanceOf[CRASH]
  
  @js.native
  sealed trait Command
    extends StObject
       with OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.composeAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.menus.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.action.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.browserAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.messageDisplayAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.composeAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.menus.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.action.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.browserAction.OnClickDataModifiers
  inline def Command: Command = "Command".asInstanceOf[Command]
  
  @js.native
  sealed trait Ctrl
    extends StObject
       with OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.composeAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.menus.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.action.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.browserAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.messageDisplayAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.composeAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.menus.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.action.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.browserAction.OnClickDataModifiers
  inline def Ctrl: Ctrl = "Ctrl".asInstanceOf[Ctrl]
  
  @js.native
  sealed trait FILE_ACCESS_DENIED
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def FILE_ACCESS_DENIED: FILE_ACCESS_DENIED = "FILE_ACCESS_DENIED".asInstanceOf[FILE_ACCESS_DENIED]
  
  @js.native
  sealed trait FILE_BLOCKED
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def FILE_BLOCKED: FILE_BLOCKED = "FILE_BLOCKED".asInstanceOf[FILE_BLOCKED]
  
  @js.native
  sealed trait FILE_FAILED
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def FILE_FAILED: FILE_FAILED = "FILE_FAILED".asInstanceOf[FILE_FAILED]
  
  @js.native
  sealed trait FILE_NAME_TOO_LONG
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def FILE_NAME_TOO_LONG: FILE_NAME_TOO_LONG = "FILE_NAME_TOO_LONG".asInstanceOf[FILE_NAME_TOO_LONG]
  
  @js.native
  sealed trait FILE_NO_SPACE
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def FILE_NO_SPACE: FILE_NO_SPACE = "FILE_NO_SPACE".asInstanceOf[FILE_NO_SPACE]
  
  @js.native
  sealed trait FILE_SECURITY_CHECK_FAILED
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def FILE_SECURITY_CHECK_FAILED: FILE_SECURITY_CHECK_FAILED = "FILE_SECURITY_CHECK_FAILED".asInstanceOf[FILE_SECURITY_CHECK_FAILED]
  
  @js.native
  sealed trait FILE_TOO_LARGE
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def FILE_TOO_LARGE: FILE_TOO_LARGE = "FILE_TOO_LARGE".asInstanceOf[FILE_TOO_LARGE]
  
  @js.native
  sealed trait FILE_TOO_SHORT
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def FILE_TOO_SHORT: FILE_TOO_SHORT = "FILE_TOO_SHORT".asInstanceOf[FILE_TOO_SHORT]
  
  @js.native
  sealed trait FILE_TRANSIENT_ERROR
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def FILE_TRANSIENT_ERROR: FILE_TRANSIENT_ERROR = "FILE_TRANSIENT_ERROR".asInstanceOf[FILE_TRANSIENT_ERROR]
  
  @js.native
  sealed trait FILE_VIRUS_INFECTED
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def FILE_VIRUS_INFECTED: FILE_VIRUS_INFECTED = "FILE_VIRUS_INFECTED".asInstanceOf[FILE_VIRUS_INFECTED]
  
  @js.native
  sealed trait GET
    extends StObject
       with DownloadOptionsMethod
       with typings.thunderbirdWebextBrowser.messenger.downloads.DownloadOptionsMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait Lessthansignall_urlsGreaterthansign extends StObject
  inline def Lessthansignall_urlsGreaterthansign: Lessthansignall_urlsGreaterthansign = "<all_urls>".asInstanceOf[Lessthansignall_urlsGreaterthansign]
  
  @js.native
  sealed trait MacCtrl
    extends StObject
       with OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.composeAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.menus.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.action.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.browserAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.messageDisplayAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.composeAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.menus.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.action.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.browserAction.OnClickDataModifiers
  inline def MacCtrl: MacCtrl = "MacCtrl".asInstanceOf[MacCtrl]
  
  @js.native
  sealed trait NETWORK_DISCONNECTED
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def NETWORK_DISCONNECTED: NETWORK_DISCONNECTED = "NETWORK_DISCONNECTED".asInstanceOf[NETWORK_DISCONNECTED]
  
  @js.native
  sealed trait NETWORK_FAILED
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def NETWORK_FAILED: NETWORK_FAILED = "NETWORK_FAILED".asInstanceOf[NETWORK_FAILED]
  
  @js.native
  sealed trait NETWORK_INVALID_REQUEST
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def NETWORK_INVALID_REQUEST: NETWORK_INVALID_REQUEST = "NETWORK_INVALID_REQUEST".asInstanceOf[NETWORK_INVALID_REQUEST]
  
  @js.native
  sealed trait NETWORK_SERVER_DOWN
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def NETWORK_SERVER_DOWN: NETWORK_SERVER_DOWN = "NETWORK_SERVER_DOWN".asInstanceOf[NETWORK_SERVER_DOWN]
  
  @js.native
  sealed trait NETWORK_TIMEOUT
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def NETWORK_TIMEOUT: NETWORK_TIMEOUT = "NETWORK_TIMEOUT".asInstanceOf[NETWORK_TIMEOUT]
  
  @js.native
  sealed trait POST
    extends StObject
       with DownloadOptionsMethod
       with typings.thunderbirdWebextBrowser.messenger.downloads.DownloadOptionsMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait SERVER_BAD_CONTENT
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def SERVER_BAD_CONTENT: SERVER_BAD_CONTENT = "SERVER_BAD_CONTENT".asInstanceOf[SERVER_BAD_CONTENT]
  
  @js.native
  sealed trait SERVER_CERT_PROBLEM
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def SERVER_CERT_PROBLEM: SERVER_CERT_PROBLEM = "SERVER_CERT_PROBLEM".asInstanceOf[SERVER_CERT_PROBLEM]
  
  @js.native
  sealed trait SERVER_FAILED
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def SERVER_FAILED: SERVER_FAILED = "SERVER_FAILED".asInstanceOf[SERVER_FAILED]
  
  @js.native
  sealed trait SERVER_FORBIDDEN
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def SERVER_FORBIDDEN: SERVER_FORBIDDEN = "SERVER_FORBIDDEN".asInstanceOf[SERVER_FORBIDDEN]
  
  @js.native
  sealed trait SERVER_NO_RANGE
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def SERVER_NO_RANGE: SERVER_NO_RANGE = "SERVER_NO_RANGE".asInstanceOf[SERVER_NO_RANGE]
  
  @js.native
  sealed trait SERVER_UNAUTHORIZED
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def SERVER_UNAUTHORIZED: SERVER_UNAUTHORIZED = "SERVER_UNAUTHORIZED".asInstanceOf[SERVER_UNAUTHORIZED]
  
  @js.native
  sealed trait Shift
    extends StObject
       with OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.composeAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.menus.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.action.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.browser.browserAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.messageDisplayAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.composeAction.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.menus.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.action.OnClickDataModifiers
       with typings.thunderbirdWebextBrowser.messenger.browserAction.OnClickDataModifiers
  inline def Shift: Shift = "Shift".asInstanceOf[Shift]
  
  @js.native
  sealed trait TLSv1
    extends StObject
       with SecurityInfoProtocolVersion
       with typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.TlsVersionRestrictionConfigMinimum
  inline def TLSv1: TLSv1 = "TLSv1".asInstanceOf[TLSv1]
  
  @js.native
  sealed trait TLSv1Dot1
    extends StObject
       with SecurityInfoProtocolVersion
       with typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.TlsVersionRestrictionConfigMinimum
  inline def TLSv1Dot1: TLSv1Dot1 = "TLSv1.1".asInstanceOf[TLSv1Dot1]
  
  @js.native
  sealed trait TLSv1Dot2
    extends StObject
       with SecurityInfoProtocolVersion
       with typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.TlsVersionRestrictionConfigMinimum
  inline def TLSv1Dot2: TLSv1Dot2 = "TLSv1.2".asInstanceOf[TLSv1Dot2]
  
  @js.native
  sealed trait TLSv1Dot3
    extends StObject
       with SecurityInfoProtocolVersion
       with typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.TlsVersionRestrictionConfigMinimum
  inline def TLSv1Dot3: TLSv1Dot3 = "TLSv1.3".asInstanceOf[TLSv1Dot3]
  
  @js.native
  sealed trait USER_CANCELED
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def USER_CANCELED: USER_CANCELED = "USER_CANCELED".asInstanceOf[USER_CANCELED]
  
  @js.native
  sealed trait USER_SHUTDOWN
    extends StObject
       with InterruptReason
       with typings.thunderbirdWebextBrowser.messenger.downloads.InterruptReason
  inline def USER_SHUTDOWN: USER_SHUTDOWN = "USER_SHUTDOWN".asInstanceOf[USER_SHUTDOWN]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait aarch64
    extends StObject
       with PlatformArch
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformArch
  inline def aarch64: aarch64 = "aarch64".asInstanceOf[aarch64]
  
  @js.native
  sealed trait accepted
    extends StObject
       with DangerType
       with typings.thunderbirdWebextBrowser.messenger.downloads.DangerType
  inline def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait account
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def account: account = "account".asInstanceOf[account]
  
  @js.native
  sealed trait accountsFolders
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def accountsFolders: accountsFolders = "accountsFolders".asInstanceOf[accountsFolders]
  
  @js.native
  sealed trait accountsIdentities
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def accountsIdentities: accountsIdentities = "accountsIdentities".asInstanceOf[accountsIdentities]
  
  @js.native
  sealed trait accountsRead
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def accountsRead: accountsRead = "accountsRead".asInstanceOf[accountsRead]
  
  @js.native
  sealed trait active
    extends StObject
       with IdleState
       with typings.thunderbirdWebextBrowser.messenger.idle.IdleState
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait activeTab
    extends StObject
       with _OptionalPermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermissionNoPrompt
  inline def activeTab: activeTab = "activeTab".asInstanceOf[activeTab]
  
  @js.native
  sealed trait activityLog
    extends StObject
       with _PermissionPrivileged
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionPrivileged
  inline def activityLog: activityLog = "activityLog".asInstanceOf[activityLog]
  
  @js.native
  sealed trait addon_child
    extends StObject
       with APIChildScope
       with typings.thunderbirdWebextBrowser.messenger.experiments.APIChildScope
  inline def addon_child: addon_child = "addon_child".asInstanceOf[addon_child]
  
  @js.native
  sealed trait addon_parent
    extends StObject
       with APIParentScope
       with typings.thunderbirdWebextBrowser.messenger.experiments.APIParentScope
  inline def addon_parent: addon_parent = "addon_parent".asInstanceOf[addon_parent]
  
  @js.native
  sealed trait addressBook
    extends StObject
       with NodeType
       with typings.thunderbirdWebextBrowser.messenger.addressBooks.NodeType
       with TabType
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabType
  inline def addressBook: addressBook = "addressBook".asInstanceOf[addressBook]
  
  @js.native
  sealed trait addressBooks
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def addressBooks: addressBooks = "addressBooks".asInstanceOf[addressBooks]
  
  @js.native
  sealed trait alarms
    extends StObject
       with _PermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionNoPrompt
  inline def alarms: alarms = "alarms".asInstanceOf[alarms]
  
  @js.native
  sealed trait all
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
       with TagsDetailMode
       with typings.thunderbirdWebextBrowser.messenger.messages.TagsDetailMode
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait all_message_attachments
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def all_message_attachments: all_message_attachments = "all_message_attachments".asInstanceOf[all_message_attachments]
  
  @js.native
  sealed trait allow_all
    extends StObject
       with CookieConfigBehavior
       with typings.thunderbirdWebextBrowser.messenger.privacy.websites.CookieConfigBehavior
  inline def allow_all: allow_all = "allow_all".asInstanceOf[allow_all]
  
  @js.native
  sealed trait allow_name_collisions
    extends StObject
       with _ResolveFlags
       with typings.thunderbirdWebextBrowser.messenger.dns._ResolveFlags
  inline def allow_name_collisions: allow_name_collisions = "allow_name_collisions".asInstanceOf[allow_name_collisions]
  
  @js.native
  sealed trait allow_visited
    extends StObject
       with CookieConfigBehavior
       with typings.thunderbirdWebextBrowser.messenger.privacy.websites.CookieConfigBehavior
  inline def allow_visited: allow_visited = "allow_visited".asInstanceOf[allow_visited]
  
  @js.native
  sealed trait always
    extends StObject
       with HTTPSOnlyModeOption
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.HTTPSOnlyModeOption
       with TrackingProtectionModeOption
       with typings.thunderbirdWebextBrowser.messenger.privacy.websites.TrackingProtectionModeOption
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait android
    extends StObject
       with PlatformOs
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformOs
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait any
    extends StObject
       with TagsDetailMode
       with typings.thunderbirdWebextBrowser.messenger.messages.TagsDetailMode
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait any_basic_tracking
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def any_basic_tracking: any_basic_tracking = "any_basic_tracking".asInstanceOf[any_basic_tracking]
  
  @js.native
  sealed trait any_social_tracking
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def any_social_tracking: any_social_tracking = "any_social_tracking".asInstanceOf[any_social_tracking]
  
  @js.native
  sealed trait any_strict_tracking
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def any_strict_tracking: any_strict_tracking = "any_strict_tracking".asInstanceOf[any_strict_tracking]
  
  @js.native
  sealed trait app
    extends StObject
       with WindowType
       with typings.thunderbirdWebextBrowser.browser.tabs.WindowType
       with typings.thunderbirdWebextBrowser.messenger.windows.WindowType
       with typings.thunderbirdWebextBrowser.messenger.tabs.WindowType
  inline def app: app = "app".asInstanceOf[app]
  
  @js.native
  sealed trait app_update
    extends StObject
       with OnRestartRequiredReason
       with typings.thunderbirdWebextBrowser.messenger.runtime.OnRestartRequiredReason
  inline def app_update: app_update = "app_update".asInstanceOf[app_update]
  
  @js.native
  sealed trait archives
    extends StObject
       with MailFolderType
       with typings.thunderbirdWebextBrowser.messenger.folders.MailFolderType
  inline def archives: archives = "archives".asInstanceOf[archives]
  
  @js.native
  sealed trait arm
    extends StObject
       with PlatformArch
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformArch
       with PlatformNaclArch
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformNaclArch
  inline def arm: arm = "arm".asInstanceOf[arm]
  
  @js.native
  sealed trait ascending
    extends StObject
       with MailTabSortOrder
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortOrder
       with UpdateUpdatePropertiesSortOrder
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortOrder
  inline def ascending: ascending = "ascending".asInstanceOf[ascending]
  
  @js.native
  sealed trait asyncBlocking
    extends StObject
       with OnAuthRequiredOptions
       with typings.thunderbirdWebextBrowser.messenger.webRequest.OnAuthRequiredOptions
  inline def asyncBlocking: asyncBlocking = "asyncBlocking".asInstanceOf[asyncBlocking]
  
  @js.native
  sealed trait attachments
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def attachments: attachments = "attachments".asInstanceOf[attachments]
  
  @js.native
  sealed trait audio
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait author
    extends StObject
       with CSSOrigin
       with typings.thunderbirdWebextBrowser.messenger.extensionTypes.CSSOrigin
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def author: author = "author".asInstanceOf[author]
  
  @js.native
  sealed trait auto
    extends StObject
       with ComposeDetailsDeliveryFormat
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsDeliveryFormat
       with ThemeTypeColorScheme
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeColorScheme
       with ThemeTypeContentColorScheme
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeContentColorScheme
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait autoConfig
    extends StObject
       with ProxyConfigProxyType
       with typings.thunderbirdWebextBrowser.messenger.proxy.ProxyConfigProxyType
  inline def autoConfig: autoConfig = "autoConfig".asInstanceOf[autoConfig]
  
  @js.native
  sealed trait autoDetect
    extends StObject
       with ProxyConfigProxyType
       with typings.thunderbirdWebextBrowser.messenger.proxy.ProxyConfigProxyType
  inline def autoDetect: autoDetect = "autoDetect".asInstanceOf[autoDetect]
  
  @js.native
  sealed trait auto_bookmark
    extends StObject
       with TransitionType
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionType
  inline def auto_bookmark: auto_bookmark = "auto_bookmark".asInstanceOf[auto_bookmark]
  
  @js.native
  sealed trait auto_subframe
    extends StObject
       with TransitionType
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionType
  inline def auto_subframe: auto_subframe = "auto_subframe".asInstanceOf[auto_subframe]
  
  @js.native
  sealed trait basic
    extends StObject
       with TemplateType
       with typings.thunderbirdWebextBrowser.messenger.notifications.TemplateType
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait beacon
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def beacon: beacon = "beacon".asInstanceOf[beacon]
  
  @js.native
  sealed trait bitcoin
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def bitcoin: bitcoin = "bitcoin".asInstanceOf[bitcoin]
  
  @js.native
  sealed trait blocking
    extends StObject
       with OnAuthRequiredOptions
       with typings.thunderbirdWebextBrowser.messenger.webRequest.OnAuthRequiredOptions
       with OnBeforeRequestOptions
       with typings.thunderbirdWebextBrowser.messenger.webRequest.OnBeforeRequestOptions
       with OnBeforeSendHeadersOptions
       with typings.thunderbirdWebextBrowser.messenger.webRequest.OnBeforeSendHeadersOptions
       with OnHeadersReceivedOptions
       with typings.thunderbirdWebextBrowser.messenger.webRequest.OnHeadersReceivedOptions
  inline def blocking: blocking = "blocking".asInstanceOf[blocking]
  
  @js.native
  sealed trait both
    extends StObject
       with ComposeDetailsDeliveryFormat
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsDeliveryFormat
  inline def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait bottom
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait broken
    extends StObject
       with SecurityInfoState
       with typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfoState
  inline def broken: broken = "broken".asInstanceOf[broken]
  
  @js.native
  sealed trait browserSettings
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def browserSettings: browserSettings = "browserSettings".asInstanceOf[browserSettings]
  
  @js.native
  sealed trait browser_action
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def browser_action: browser_action = "browser_action".asInstanceOf[browser_action]
  
  @js.native
  sealed trait browser_update
    extends StObject
       with OnInstalledReason
       with typings.thunderbirdWebextBrowser.messenger.runtime.OnInstalledReason
  inline def browser_update: browser_update = "browser_update".asInstanceOf[browser_update]
  
  @js.native
  sealed trait browsingData
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def browsingData: browsingData = "browsingData".asInstanceOf[browsingData]
  
  @js.native
  sealed trait bypass_cache
    extends StObject
       with _ResolveFlags
       with typings.thunderbirdWebextBrowser.messenger.dns._ResolveFlags
  inline def bypass_cache: bypass_cache = "bypass_cache".asInstanceOf[bypass_cache]
  
  @js.native
  sealed trait calendar
    extends StObject
       with TabType
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabType
  inline def calendar: calendar = "calendar".asInstanceOf[calendar]
  
  @js.native
  sealed trait calendarEvent
    extends StObject
       with TabType
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabType
  inline def calendarEvent: calendarEvent = "calendarEvent".asInstanceOf[calendarEvent]
  
  @js.native
  sealed trait calendarTask
    extends StObject
       with TabType
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabType
  inline def calendarTask: calendarTask = "calendarTask".asInstanceOf[calendarTask]
  
  @js.native
  sealed trait canonical_name
    extends StObject
       with _ResolveFlags
       with typings.thunderbirdWebextBrowser.messenger.dns._ResolveFlags
  inline def canonical_name: canonical_name = "canonical_name".asInstanceOf[canonical_name]
  
  @js.native
  sealed trait captivePortal
    extends StObject
       with _PermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionNoPrompt
  inline def captivePortal: captivePortal = "captivePortal".asInstanceOf[captivePortal]
  
  @js.native
  sealed trait center
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait `center bottom`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def `center bottom`: `center bottom` = ("center bottom").asInstanceOf[`center bottom`]
  
  @js.native
  sealed trait `center center`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def `center center`: `center center` = ("center center").asInstanceOf[`center center`]
  
  @js.native
  sealed trait `center top`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def `center top`: `center top` = ("center top").asInstanceOf[`center top`]
  
  @js.native
  sealed trait chat
    extends StObject
       with TabType
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabType
  inline def chat: chat = "chat".asInstanceOf[chat]
  
  @js.native
  sealed trait checkbox
    extends StObject
       with ItemType
       with typings.thunderbirdWebextBrowser.messenger.menus.ItemType
  inline def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait cipher extends StObject
  inline def cipher: cipher = "cipher".asInstanceOf[cipher]
  
  @js.native
  sealed trait client_redirect
    extends StObject
       with TransitionQualifier
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionQualifier
  inline def client_redirect: client_redirect = "client_redirect".asInstanceOf[client_redirect]
  
  @js.native
  sealed trait clipboardRead
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def clipboardRead: clipboardRead = "clipboardRead".asInstanceOf[clipboardRead]
  
  @js.native
  sealed trait clipboardWrite
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def clipboardWrite: clipboardWrite = "clipboardWrite".asInstanceOf[clipboardWrite]
  
  @js.native
  sealed trait closed
    extends StObject
       with StreamFilterStatus
       with typings.thunderbirdWebextBrowser.messenger.webRequest.StreamFilterStatus
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait complete
    extends StObject
       with State
       with typings.thunderbirdWebextBrowser.messenger.downloads.State
       with TabStatus
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabStatus
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait compose
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def compose: compose = "compose".asInstanceOf[compose]
  
  @js.native
  sealed trait composeBcc
    extends StObject
       with OnClickDataFieldId
       with typings.thunderbirdWebextBrowser.messenger.menus.OnClickDataFieldId
       with OnShowDataFieldId
       with typings.thunderbirdWebextBrowser.messenger.menus.OnShowDataFieldId
  inline def composeBcc: composeBcc = "composeBcc".asInstanceOf[composeBcc]
  
  @js.native
  sealed trait composeCc
    extends StObject
       with OnClickDataFieldId
       with typings.thunderbirdWebextBrowser.messenger.menus.OnClickDataFieldId
       with OnShowDataFieldId
       with typings.thunderbirdWebextBrowser.messenger.menus.OnShowDataFieldId
  inline def composeCc: composeCc = "composeCc".asInstanceOf[composeCc]
  
  @js.native
  sealed trait composeDotsave
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def composeDotsave: composeDotsave = "compose.save".asInstanceOf[composeDotsave]
  
  @js.native
  sealed trait composeDotsend
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def composeDotsend: composeDotsend = "compose.send".asInstanceOf[composeDotsend]
  
  @js.native
  sealed trait composeNewsgroupTo
    extends StObject
       with OnClickDataFieldId
       with typings.thunderbirdWebextBrowser.messenger.menus.OnClickDataFieldId
       with OnShowDataFieldId
       with typings.thunderbirdWebextBrowser.messenger.menus.OnShowDataFieldId
  inline def composeNewsgroupTo: composeNewsgroupTo = "composeNewsgroupTo".asInstanceOf[composeNewsgroupTo]
  
  @js.native
  sealed trait composeReplyTo
    extends StObject
       with OnClickDataFieldId
       with typings.thunderbirdWebextBrowser.messenger.menus.OnClickDataFieldId
       with OnShowDataFieldId
       with typings.thunderbirdWebextBrowser.messenger.menus.OnShowDataFieldId
  inline def composeReplyTo: composeReplyTo = "composeReplyTo".asInstanceOf[composeReplyTo]
  
  @js.native
  sealed trait composeSubject
    extends StObject
       with OnClickDataFieldId
       with typings.thunderbirdWebextBrowser.messenger.menus.OnClickDataFieldId
       with OnShowDataFieldId
       with typings.thunderbirdWebextBrowser.messenger.menus.OnShowDataFieldId
  inline def composeSubject: composeSubject = "composeSubject".asInstanceOf[composeSubject]
  
  @js.native
  sealed trait composeTo
    extends StObject
       with OnClickDataFieldId
       with typings.thunderbirdWebextBrowser.messenger.menus.OnClickDataFieldId
       with OnShowDataFieldId
       with typings.thunderbirdWebextBrowser.messenger.menus.OnShowDataFieldId
  inline def composeTo: composeTo = "composeTo".asInstanceOf[composeTo]
  
  @js.native
  sealed trait compose_action
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def compose_action: compose_action = "compose_action".asInstanceOf[compose_action]
  
  @js.native
  sealed trait compose_attachments
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def compose_attachments: compose_attachments = "compose_attachments".asInstanceOf[compose_attachments]
  
  @js.native
  sealed trait contact
    extends StObject
       with NodeType
       with typings.thunderbirdWebextBrowser.messenger.addressBooks.NodeType
       with UndefinedType
       with typings.thunderbirdWebextBrowser.messenger.compose.UndefinedType
  inline def contact: contact = "contact".asInstanceOf[contact]
  
  @js.native
  sealed trait content
    extends StObject
       with DangerType
       with typings.thunderbirdWebextBrowser.messenger.downloads.DangerType
       with TabType
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabType
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait content_child
    extends StObject
       with APIChildScope
       with typings.thunderbirdWebextBrowser.messenger.experiments.APIChildScope
  inline def content_child: content_child = "content_child".asInstanceOf[content_child]
  
  @js.native
  sealed trait content_parent
    extends StObject
       with APIParentScope
       with typings.thunderbirdWebextBrowser.messenger.experiments.APIParentScope
  inline def content_parent: content_parent = "content_parent".asInstanceOf[content_parent]
  
  @js.native
  sealed trait contextmenu
    extends StObject
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
       with typings.thunderbirdWebextBrowser.messenger.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  inline def contextmenu: contextmenu = "contextmenu".asInstanceOf[contextmenu]
  
  @js.native
  sealed trait contextualIdentities
    extends StObject
       with _PermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionNoPrompt
  inline def contextualIdentities: contextualIdentities = "contextualIdentities".asInstanceOf[contextualIdentities]
  
  @js.native
  sealed trait controllable_by_this_extension
    extends StObject
       with LevelOfControl
       with typings.thunderbirdWebextBrowser.messenger.types.LevelOfControl
  inline def controllable_by_this_extension: controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[controllable_by_this_extension]
  
  @js.native
  sealed trait controlled_by_other_extensions
    extends StObject
       with LevelOfControl
       with typings.thunderbirdWebextBrowser.messenger.types.LevelOfControl
  inline def controlled_by_other_extensions: controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[controlled_by_other_extensions]
  
  @js.native
  sealed trait controlled_by_this_extension
    extends StObject
       with LevelOfControl
       with typings.thunderbirdWebextBrowser.messenger.types.LevelOfControl
  inline def controlled_by_this_extension: controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[controlled_by_this_extension]
  
  @js.native
  sealed trait cookies
    extends StObject
       with _OptionalPermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermissionNoPrompt
  inline def cookies: cookies = "cookies".asInstanceOf[cookies]
  
  @js.native
  sealed trait correspondent
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def correspondent: correspondent = "correspondent".asInstanceOf[correspondent]
  
  @js.native
  sealed trait cros
    extends StObject
       with PlatformOs
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformOs
  inline def cros: cros = "cros".asInstanceOf[cros]
  
  @js.native
  sealed trait cryptomining
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def cryptomining: cryptomining = "cryptomining".asInstanceOf[cryptomining]
  
  @js.native
  sealed trait cryptomining_content
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def cryptomining_content: cryptomining_content = "cryptomining_content".asInstanceOf[cryptomining_content]
  
  @js.native
  sealed trait csp_report
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  
  @js.native
  sealed trait custom
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait dark
    extends StObject
       with ThemeTypeColorScheme
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeColorScheme
       with ThemeTypeContentColorScheme
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeContentColorScheme
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait dat
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def dat: dat = "dat".asInstanceOf[dat]
  
  @js.native
  sealed trait date
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait declarativeNetRequest extends StObject
  inline def declarativeNetRequest: declarativeNetRequest = "declarativeNetRequest".asInstanceOf[declarativeNetRequest]
  
  @js.native
  sealed trait declarativeNetRequestFeedback
    extends StObject
       with _PermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionNoPrompt
  inline def declarativeNetRequestFeedback: declarativeNetRequestFeedback = "declarativeNetRequestFeedback".asInstanceOf[declarativeNetRequestFeedback]
  
  @js.native
  sealed trait declarativeNetRequestWithHostAccess
    extends StObject
       with _PermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionNoPrompt
  inline def declarativeNetRequestWithHostAccess: declarativeNetRequestWithHostAccess = "declarativeNetRequestWithHostAccess".asInstanceOf[declarativeNetRequestWithHostAccess]
  
  @js.native
  sealed trait default_public_and_private_interfaces
    extends StObject
       with IPHandlingPolicy
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.IPHandlingPolicy
  inline def default_public_and_private_interfaces: default_public_and_private_interfaces = "default_public_and_private_interfaces".asInstanceOf[default_public_and_private_interfaces]
  
  @js.native
  sealed trait default_public_interface_only
    extends StObject
       with IPHandlingPolicy
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.IPHandlingPolicy
  inline def default_public_interface_only: default_public_interface_only = "default_public_interface_only".asInstanceOf[default_public_interface_only]
  
  @js.native
  sealed trait denied
    extends StObject
       with PermissionLevel
       with typings.thunderbirdWebextBrowser.messenger.notifications.PermissionLevel
  inline def denied: denied = "denied".asInstanceOf[denied]
  
  @js.native
  sealed trait descending
    extends StObject
       with MailTabSortOrder
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortOrder
       with UpdateUpdatePropertiesSortOrder
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortOrder
  inline def descending: descending = "descending".asInstanceOf[descending]
  
  @js.native
  sealed trait detached_panel
    extends StObject
       with CreateType
       with typings.thunderbirdWebextBrowser.messenger.windows.CreateType
  inline def detached_panel: detached_panel = "detached_panel".asInstanceOf[detached_panel]
  
  @js.native
  sealed trait development
    extends StObject
       with ExtensionInstallType
       with typings.thunderbirdWebextBrowser.messenger.management.ExtensionInstallType
  inline def development: development = "development".asInstanceOf[development]
  
  @js.native
  sealed trait devtools
    extends StObject
       with WindowType
       with typings.thunderbirdWebextBrowser.browser.tabs.WindowType
       with typings.thunderbirdWebextBrowser.messenger.windows.WindowType
       with typings.thunderbirdWebextBrowser.messenger.tabs.WindowType
  inline def devtools: devtools = "devtools".asInstanceOf[devtools]
  
  @js.native
  sealed trait devtools_child
    extends StObject
       with APIChildScope
       with typings.thunderbirdWebextBrowser.messenger.experiments.APIChildScope
  inline def devtools_child: devtools_child = "devtools_child".asInstanceOf[devtools_child]
  
  @js.native
  sealed trait devtools_parent
    extends StObject
       with APIParentScope
       with typings.thunderbirdWebextBrowser.messenger.experiments.APIParentScope
  inline def devtools_parent: devtools_parent = "devtools_parent".asInstanceOf[devtools_parent]
  
  @js.native
  sealed trait disable_ipv4
    extends StObject
       with _ResolveFlags
       with typings.thunderbirdWebextBrowser.messenger.dns._ResolveFlags
  inline def disable_ipv4: disable_ipv4 = "disable_ipv4".asInstanceOf[disable_ipv4]
  
  @js.native
  sealed trait disable_ipv6
    extends StObject
       with _ResolveFlags
       with typings.thunderbirdWebextBrowser.messenger.dns._ResolveFlags
  inline def disable_ipv6: disable_ipv6 = "disable_ipv6".asInstanceOf[disable_ipv6]
  
  @js.native
  sealed trait disable_non_proxied_udp
    extends StObject
       with IPHandlingPolicy
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.IPHandlingPolicy
  inline def disable_non_proxied_udp: disable_non_proxied_udp = "disable_non_proxied_udp".asInstanceOf[disable_non_proxied_udp]
  
  @js.native
  sealed trait disable_trr
    extends StObject
       with _ResolveFlags
       with typings.thunderbirdWebextBrowser.messenger.dns._ResolveFlags
  inline def disable_trr: disable_trr = "disable_trr".asInstanceOf[disable_trr]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with StreamFilterStatus
       with typings.thunderbirdWebextBrowser.messenger.webRequest.StreamFilterStatus
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait dns
    extends StObject
       with _PermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionNoPrompt
  inline def dns: dns = "dns".asInstanceOf[dns]
  
  @js.native
  sealed trait docked
    extends StObject
       with WindowState
       with typings.thunderbirdWebextBrowser.messenger.windows.WindowState
  inline def docked: docked = "docked".asInstanceOf[docked]
  
  @js.native
  sealed trait document_end
    extends StObject
       with RunAt
       with typings.thunderbirdWebextBrowser.messenger.extensionTypes.RunAt
  inline def document_end: document_end = "document_end".asInstanceOf[document_end]
  
  @js.native
  sealed trait document_idle
    extends StObject
       with RunAt
       with typings.thunderbirdWebextBrowser.messenger.extensionTypes.RunAt
  inline def document_idle: document_idle = "document_idle".asInstanceOf[document_idle]
  
  @js.native
  sealed trait document_start
    extends StObject
       with RunAt
       with typings.thunderbirdWebextBrowser.messenger.extensionTypes.RunAt
  inline def document_start: document_start = "document_start".asInstanceOf[document_start]
  
  @js.native
  sealed trait domain_mismatch
    extends StObject
       with SecurityInfoOverridableErrorCategory
       with typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfoOverridableErrorCategory
  inline def domain_mismatch: domain_mismatch = "domain_mismatch".asInstanceOf[domain_mismatch]
  
  @js.native
  sealed trait downloads
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def downloads: downloads = "downloads".asInstanceOf[downloads]
  
  @js.native
  sealed trait downloadsDotopen
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def downloadsDotopen: downloadsDotopen = "downloads.open".asInstanceOf[downloadsDotopen]
  
  @js.native
  sealed trait draft
    extends StObject
       with ComposeDetailsType
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsType
       with OnAfterSaveSaveInfoMode
       with typings.thunderbirdWebextBrowser.messenger.compose.OnAfterSaveSaveInfoMode
       with SaveMessageOptionsMode
       with typings.thunderbirdWebextBrowser.messenger.compose.SaveMessageOptionsMode
       with SaveMessageReturnReturnMode
       with typings.thunderbirdWebextBrowser.messenger.compose.SaveMessageReturnReturnMode
  inline def draft: draft = "draft".asInstanceOf[draft]
  
  @js.native
  sealed trait drafts
    extends StObject
       with MailFolderType
       with typings.thunderbirdWebextBrowser.messenger.folders.MailFolderType
  inline def drafts: drafts = "drafts".asInstanceOf[drafts]
  
  @js.native
  sealed trait dweb
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def dweb: dweb = "dweb".asInstanceOf[dweb]
  
  @js.native
  sealed trait editable
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def editable: editable = "editable".asInstanceOf[editable]
  
  @js.native
  sealed trait emailtracking
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def emailtracking: emailtracking = "emailtracking".asInstanceOf[emailtracking]
  
  @js.native
  sealed trait emailtracking_content
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def emailtracking_content: emailtracking_content = "emailtracking_content".asInstanceOf[emailtracking_content]
  
  @js.native
  sealed trait evicted
    extends StObject
       with OnChangedCause
       with typings.thunderbirdWebextBrowser.messenger.cookies.OnChangedCause
  inline def evicted: evicted = "evicted".asInstanceOf[evicted]
  
  @js.native
  sealed trait expired
    extends StObject
       with OnChangedCause
       with typings.thunderbirdWebextBrowser.messenger.cookies.OnChangedCause
  inline def expired: expired = "expired".asInstanceOf[expired]
  
  @js.native
  sealed trait expired_or_not_yet_valid
    extends StObject
       with SecurityInfoOverridableErrorCategory
       with typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfoOverridableErrorCategory
  inline def expired_or_not_yet_valid: expired_or_not_yet_valid = "expired_or_not_yet_valid".asInstanceOf[expired_or_not_yet_valid]
  
  @js.native
  sealed trait expired_overwrite
    extends StObject
       with OnChangedCause
       with typings.thunderbirdWebextBrowser.messenger.cookies.OnChangedCause
  inline def expired_overwrite: expired_overwrite = "expired_overwrite".asInstanceOf[expired_overwrite]
  
  @js.native
  sealed trait explicit
    extends StObject
       with OnChangedCause
       with typings.thunderbirdWebextBrowser.messenger.cookies.OnChangedCause
  inline def explicit: explicit = "explicit".asInstanceOf[explicit]
  
  @js.native
  sealed trait `extension`
    extends StObject
       with ExtensionType
       with typings.thunderbirdWebextBrowser.messenger.management.ExtensionType
  inline def `extension`: `extension` = "extension".asInstanceOf[`extension`]
  
  @js.native
  sealed trait failed
    extends StObject
       with StreamFilterStatus
       with typings.thunderbirdWebextBrowser.messenger.webRequest.StreamFilterStatus
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait favIconUrl
    extends StObject
       with UpdatePropertyName
       with typings.thunderbirdWebextBrowser.messenger.tabs.UpdatePropertyName
  inline def favIconUrl: favIconUrl = "favIconUrl".asInstanceOf[favIconUrl]
  
  @js.native
  sealed trait file
    extends StObject
       with DangerType
       with typings.thunderbirdWebextBrowser.messenger.downloads.DangerType
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait fingerprinting
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def fingerprinting: fingerprinting = "fingerprinting".asInstanceOf[fingerprinting]
  
  @js.native
  sealed trait fingerprinting_content
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def fingerprinting_content: fingerprinting_content = "fingerprinting_content".asInstanceOf[fingerprinting_content]
  
  @js.native
  sealed trait finishedtransferringdata
    extends StObject
       with StreamFilterStatus
       with typings.thunderbirdWebextBrowser.messenger.webRequest.StreamFilterStatus
  inline def finishedtransferringdata: finishedtransferringdata = "finishedtransferringdata".asInstanceOf[finishedtransferringdata]
  
  @js.native
  sealed trait flagged
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def flagged: flagged = "flagged".asInstanceOf[flagged]
  
  @js.native
  sealed trait folder_pane
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def folder_pane: folder_pane = "folder_pane".asInstanceOf[folder_pane]
  
  @js.native
  sealed trait font
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait form_submit
    extends StObject
       with TransitionType
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionType
  inline def form_submit: form_submit = "form_submit".asInstanceOf[form_submit]
  
  @js.native
  sealed trait formattoolbar
    extends StObject
       with WebExtensionManifestComposeActionDefaultArea
       with typings.thunderbirdWebextBrowser.messenger.manifest.WebExtensionManifestComposeActionDefaultArea
  inline def formattoolbar: formattoolbar = "formattoolbar".asInstanceOf[formattoolbar]
  
  @js.native
  sealed trait forward
    extends StObject
       with ComposeDetailsType
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsType
  inline def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait forwardAsAttachment
    extends StObject
       with BeginForwardForwardType
       with typings.thunderbirdWebextBrowser.messenger.compose.BeginForwardForwardType
  inline def forwardAsAttachment: forwardAsAttachment = "forwardAsAttachment".asInstanceOf[forwardAsAttachment]
  
  @js.native
  sealed trait forwardInline
    extends StObject
       with BeginForwardForwardType
       with typings.thunderbirdWebextBrowser.messenger.compose.BeginForwardForwardType
  inline def forwardInline: forwardInline = "forwardInline".asInstanceOf[forwardInline]
  
  @js.native
  sealed trait forward_back
    extends StObject
       with TransitionQualifier
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionQualifier
  inline def forward_back: forward_back = "forward_back".asInstanceOf[forward_back]
  
  @js.native
  sealed trait frame
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def frame: frame = "frame".asInstanceOf[frame]
  
  @js.native
  sealed trait from_address_bar
    extends StObject
       with TransitionQualifier
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionQualifier
  inline def from_address_bar: from_address_bar = "from_address_bar".asInstanceOf[from_address_bar]
  
  @js.native
  sealed trait ftp
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def ftp: ftp = "ftp".asInstanceOf[ftp]
  
  @js.native
  sealed trait full
    extends StObject
       with ColorManagementMode
       with typings.thunderbirdWebextBrowser.messenger.browserSettings.ColorManagementMode
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait fullscreen
    extends StObject
       with WindowState
       with typings.thunderbirdWebextBrowser.messenger.windows.WindowState
  inline def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @js.native
  sealed trait geckoProfiler
    extends StObject
       with _PermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionNoPrompt
  inline def geckoProfiler: geckoProfiler = "geckoProfiler".asInstanceOf[geckoProfiler]
  
  @js.native
  sealed trait generated
    extends StObject
       with TransitionType
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionType
  inline def generated: generated = "generated".asInstanceOf[generated]
  
  @js.native
  sealed trait geo
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def geo: geo = "geo".asInstanceOf[geo]
  
  @js.native
  sealed trait geolocation
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  
  @js.native
  sealed trait gopher
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def gopher: gopher = "gopher".asInstanceOf[gopher]
  
  @js.native
  sealed trait granted
    extends StObject
       with PermissionLevel
       with typings.thunderbirdWebextBrowser.messenger.notifications.PermissionLevel
  inline def granted: granted = "granted".asInstanceOf[granted]
  
  @js.native
  sealed trait groupedBySortType
    extends StObject
       with MailTabViewType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabViewType
       with UpdateUpdatePropertiesViewType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesViewType
  inline def groupedBySortType: groupedBySortType = "groupedBySortType".asInstanceOf[groupedBySortType]
  
  @js.native
  sealed trait groupedByThread
    extends StObject
       with MailTabViewType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabViewType
       with UpdateUpdatePropertiesViewType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesViewType
  inline def groupedByThread: groupedByThread = "groupedByThread".asInstanceOf[groupedByThread]
  
  @js.native
  sealed trait high
    extends StObject
       with ComposeDetailsPriority
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsPriority
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait highest
    extends StObject
       with ComposeDetailsPriority
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsPriority
  inline def highest: highest = "highest".asInstanceOf[highest]
  
  @js.native
  sealed trait homepage
    extends StObject
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
       with typings.thunderbirdWebextBrowser.messenger.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  inline def homepage: homepage = "homepage".asInstanceOf[homepage]
  
  @js.native
  sealed trait host
    extends StObject
       with DangerType
       with typings.thunderbirdWebextBrowser.messenger.downloads.DangerType
  inline def host: host = "host".asInstanceOf[host]
  
  @js.native
  sealed trait html
    extends StObject
       with ComposeDetailsDeliveryFormat
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsDeliveryFormat
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait id
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait identity
    extends StObject
       with _PermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionNoPrompt
  inline def identity: identity = "identity".asInstanceOf[identity]
  
  @js.native
  sealed trait idle
    extends StObject
       with IdleState
       with typings.thunderbirdWebextBrowser.messenger.idle.IdleState
       with _OptionalPermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermissionNoPrompt
  inline def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait im
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def im: im = "im".asInstanceOf[im]
  
  @js.native
  sealed trait image
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
       with TemplateType
       with typings.thunderbirdWebextBrowser.messenger.notifications.TemplateType
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait imageset
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def imageset: imageset = "imageset".asInstanceOf[imageset]
  
  @js.native
  sealed trait in_progress
    extends StObject
       with State
       with typings.thunderbirdWebextBrowser.messenger.downloads.State
  inline def in_progress: in_progress = "in_progress".asInstanceOf[in_progress]
  
  @js.native
  sealed trait inbox
    extends StObject
       with MailFolderType
       with typings.thunderbirdWebextBrowser.messenger.folders.MailFolderType
  inline def inbox: inbox = "inbox".asInstanceOf[inbox]
  
  @js.native
  sealed trait incognito_persistent
    extends StObject
       with SettingScope
       with typings.thunderbirdWebextBrowser.messenger.types.SettingScope
  inline def incognito_persistent: incognito_persistent = "incognito_persistent".asInstanceOf[incognito_persistent]
  
  @js.native
  sealed trait incognito_session_only
    extends StObject
       with SettingScope
       with typings.thunderbirdWebextBrowser.messenger.types.SettingScope
  inline def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  
  @js.native
  sealed trait insecure
    extends StObject
       with SecurityInfoState
       with typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfoState
  inline def insecure: insecure = "insecure".asInstanceOf[insecure]
  
  @js.native
  sealed trait install
    extends StObject
       with OnInstalledReason
       with typings.thunderbirdWebextBrowser.messenger.runtime.OnInstalledReason
  inline def install: install = "install".asInstanceOf[install]
  
  @js.native
  sealed trait interrupted
    extends StObject
       with State
       with typings.thunderbirdWebextBrowser.messenger.downloads.State
  inline def interrupted: interrupted = "interrupted".asInstanceOf[interrupted]
  
  @js.native
  sealed trait ipfs
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def ipfs: ipfs = "ipfs".asInstanceOf[ipfs]
  
  @js.native
  sealed trait ipns
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def ipns: ipns = "ipns".asInstanceOf[ipns]
  
  @js.native
  sealed trait irc
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def irc: irc = "irc".asInstanceOf[irc]
  
  @js.native
  sealed trait ircs
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def ircs: ircs = "ircs".asInstanceOf[ircs]
  
  @js.native
  sealed trait jpeg
    extends StObject
       with ImageFormat
       with typings.thunderbirdWebextBrowser.messenger.extensionTypes.ImageFormat
       with SetImageDataImageType
       with typings.thunderbirdWebextBrowser.messenger.clipboard.SetImageDataImageType
  inline def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  
  @js.native
  sealed trait junk
    extends StObject
       with MailFolderType
       with typings.thunderbirdWebextBrowser.messenger.folders.MailFolderType
  inline def junk: junk = "junk".asInstanceOf[junk]
  
  @js.native
  sealed trait junkStatus
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def junkStatus: junkStatus = "junkStatus".asInstanceOf[junkStatus]
  
  @js.native
  sealed trait keyword
    extends StObject
       with TransitionType
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionType
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
       with typings.thunderbirdWebextBrowser.messenger.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  inline def keyword: keyword = "keyword".asInstanceOf[keyword]
  
  @js.native
  sealed trait keyword_generated
    extends StObject
       with TransitionType
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionType
  inline def keyword_generated: keyword_generated = "keyword_generated".asInstanceOf[keyword_generated]
  
  @js.native
  sealed trait lax
    extends StObject
       with SameSiteStatus
       with typings.thunderbirdWebextBrowser.messenger.cookies.SameSiteStatus
  inline def lax: lax = "lax".asInstanceOf[lax]
  
  @js.native
  sealed trait left
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `left bottom`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def `left bottom`: `left bottom` = ("left bottom").asInstanceOf[`left bottom`]
  
  @js.native
  sealed trait `left center`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def `left center`: `left center` = ("left center").asInstanceOf[`left center`]
  
  @js.native
  sealed trait `left top`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def `left top`: `left top` = ("left top").asInstanceOf[`left top`]
  
  @js.native
  sealed trait light
    extends StObject
       with ThemeTypeColorScheme
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeColorScheme
       with ThemeTypeContentColorScheme
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeContentColorScheme
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait link
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
       with TransitionType
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionType
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait linux
    extends StObject
       with PlatformOs
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformOs
  inline def linux: linux = "linux".asInstanceOf[linux]
  
  @js.native
  sealed trait list
    extends StObject
       with TemplateType
       with typings.thunderbirdWebextBrowser.messenger.notifications.TemplateType
  inline def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait loading
    extends StObject
       with TabStatus
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabStatus
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait location
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait low
    extends StObject
       with ComposeDetailsPriority
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsPriority
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait lowest
    extends StObject
       with ComposeDetailsPriority
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsPriority
  inline def lowest: lowest = "lowest".asInstanceOf[lowest]
  
  @js.native
  sealed trait mac
    extends StObject
       with PlatformOs
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformOs
  inline def mac: mac = "mac".asInstanceOf[mac]
  
  @js.native
  sealed trait magnet
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def magnet: magnet = "magnet".asInstanceOf[magnet]
  
  @js.native
  sealed trait mail
    extends StObject
       with TabType
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabType
  inline def mail: mail = "mail".asInstanceOf[mail]
  
  @js.native
  sealed trait mailingList
    extends StObject
       with NodeType
       with typings.thunderbirdWebextBrowser.messenger.addressBooks.NodeType
       with UndefinedType
       with typings.thunderbirdWebextBrowser.messenger.compose.UndefinedType
  inline def mailingList: mailingList = "mailingList".asInstanceOf[mailingList]
  
  @js.native
  sealed trait mailto
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def mailto: mailto = "mailto".asInstanceOf[mailto]
  
  @js.native
  sealed trait main_frame
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  
  @js.native
  sealed trait maintoolbar
    extends StObject
       with ActionManifestDefaultArea
       with typings.thunderbirdWebextBrowser.messenger.manifest.ActionManifestDefaultArea
       with WebExtensionManifestComposeActionDefaultArea
       with typings.thunderbirdWebextBrowser.messenger.manifest.WebExtensionManifestComposeActionDefaultArea
  inline def maintoolbar: maintoolbar = "maintoolbar".asInstanceOf[maintoolbar]
  
  @js.native
  sealed trait management
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def management: management = "management".asInstanceOf[management]
  
  @js.native
  sealed trait manual
    extends StObject
       with ProxyConfigProxyType
       with typings.thunderbirdWebextBrowser.messenger.proxy.ProxyConfigProxyType
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait manual_subframe
    extends StObject
       with TransitionType
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionType
  inline def manual_subframe: manual_subframe = "manual_subframe".asInstanceOf[manual_subframe]
  
  @js.native
  sealed trait matrix
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def matrix: matrix = "matrix".asInstanceOf[matrix]
  
  @js.native
  sealed trait maximized
    extends StObject
       with WindowState
       with typings.thunderbirdWebextBrowser.messenger.windows.WindowState
  inline def maximized: maximized = "maximized".asInstanceOf[maximized]
  
  @js.native
  sealed trait media
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait menus
    extends StObject
       with _PermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionNoPrompt
  inline def menus: menus = "menus".asInstanceOf[menus]
  
  @js.native
  sealed trait menusDotoverrideContext
    extends StObject
       with _OptionalPermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermissionNoPrompt
  inline def menusDotoverrideContext: menusDotoverrideContext = "menus.overrideContext".asInstanceOf[menusDotoverrideContext]
  
  @js.native
  sealed trait messageCompose
    extends StObject
       with TabType
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabType
       with WindowType
       with typings.thunderbirdWebextBrowser.browser.tabs.WindowType
       with typings.thunderbirdWebextBrowser.messenger.windows.WindowType
       with typings.thunderbirdWebextBrowser.messenger.tabs.WindowType
  inline def messageCompose: messageCompose = "messageCompose".asInstanceOf[messageCompose]
  
  @js.native
  sealed trait messageDisplay
    extends StObject
       with ActionManifestDefaultWindows
       with typings.thunderbirdWebextBrowser.messenger.manifest.ActionManifestDefaultWindows
       with TabType
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabType
       with WindowType
       with typings.thunderbirdWebextBrowser.browser.tabs.WindowType
       with typings.thunderbirdWebextBrowser.messenger.windows.WindowType
       with typings.thunderbirdWebextBrowser.messenger.tabs.WindowType
  inline def messageDisplay: messageDisplay = "messageDisplay".asInstanceOf[messageDisplay]
  
  @js.native
  sealed trait message_attachments
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def message_attachments: message_attachments = "message_attachments".asInstanceOf[message_attachments]
  
  @js.native
  sealed trait message_display_action
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def message_display_action: message_display_action = "message_display_action".asInstanceOf[message_display_action]
  
  @js.native
  sealed trait message_list
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def message_list: message_list = "message_list".asInstanceOf[message_list]
  
  @js.native
  sealed trait messagesDelete
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def messagesDelete: messagesDelete = "messagesDelete".asInstanceOf[messagesDelete]
  
  @js.native
  sealed trait messagesImport
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def messagesImport: messagesImport = "messagesImport".asInstanceOf[messagesImport]
  
  @js.native
  sealed trait messagesModify
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def messagesModify: messagesModify = "messagesModify".asInstanceOf[messagesModify]
  
  @js.native
  sealed trait messagesMove
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def messagesMove: messagesMove = "messagesMove".asInstanceOf[messagesMove]
  
  @js.native
  sealed trait messagesRead
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def messagesRead: messagesRead = "messagesRead".asInstanceOf[messagesRead]
  
  @js.native
  sealed trait messagesTags
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def messagesTags: messagesTags = "messagesTags".asInstanceOf[messagesTags]
  
  @js.native
  sealed trait midi
    extends StObject
       with _SitePermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._SitePermission
  inline def midi: midi = "midi".asInstanceOf[midi]
  
  @js.native
  sealed trait `midi-sysex`
    extends StObject
       with _SitePermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._SitePermission
  inline def `midi-sysex`: `midi-sysex` = "midi-sysex".asInstanceOf[`midi-sysex`]
  
  @js.native
  sealed trait minimized
    extends StObject
       with WindowState
       with typings.thunderbirdWebextBrowser.messenger.windows.WindowState
  inline def minimized: minimized = "minimized".asInstanceOf[minimized]
  
  @js.native
  sealed trait mms
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def mms: mms = "mms".asInstanceOf[mms]
  
  @js.native
  sealed trait mousedown
    extends StObject
       with ContextMenuMouseEvent
       with typings.thunderbirdWebextBrowser.messenger.browserSettings.ContextMenuMouseEvent
  inline def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  
  @js.native
  sealed trait mouseup
    extends StObject
       with ContextMenuMouseEvent
       with typings.thunderbirdWebextBrowser.messenger.browserSettings.ContextMenuMouseEvent
  inline def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  
  @js.native
  sealed trait mozillaAddons
    extends StObject
       with _PermissionPrivileged
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionPrivileged
  inline def mozillaAddons: mozillaAddons = "mozillaAddons".asInstanceOf[mozillaAddons]
  
  @js.native
  sealed trait nativeMessaging
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def nativeMessaging: nativeMessaging = "nativeMessaging".asInstanceOf[nativeMessaging]
  
  @js.native
  sealed trait networkStatus
    extends StObject
       with _PermissionPrivileged
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionPrivileged
  inline def networkStatus: networkStatus = "networkStatus".asInstanceOf[networkStatus]
  
  @js.native
  sealed trait never
    extends StObject
       with HTTPSOnlyModeOption
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.HTTPSOnlyModeOption
       with TrackingProtectionModeOption
       with typings.thunderbirdWebextBrowser.messenger.privacy.websites.TrackingProtectionModeOption
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait `new`
    extends StObject
       with ComposeDetailsType
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsType
  inline def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait news
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def news: news = "news".asInstanceOf[news]
  
  @js.native
  sealed trait newtab
    extends StObject
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
       with typings.thunderbirdWebextBrowser.messenger.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  inline def newtab: newtab = "newtab".asInstanceOf[newtab]
  
  @js.native
  sealed trait nntp
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def nntp: nntp = "nntp".asInstanceOf[nntp]
  
  @js.native
  sealed trait `no-repeat`
    extends StObject
       with ThemeTypeAdditionalBackgroundsTiling
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsTiling
  inline def `no-repeat`: `no-repeat` = "no-repeat".asInstanceOf[`no-repeat`]
  
  @js.native
  sealed trait no_restriction
    extends StObject
       with SameSiteStatus
       with typings.thunderbirdWebextBrowser.messenger.cookies.SameSiteStatus
  inline def no_restriction: no_restriction = "no_restriction".asInstanceOf[no_restriction]
  
  @js.native
  sealed trait no_update
    extends StObject
       with RequestUpdateCheckStatus
       with typings.thunderbirdWebextBrowser.messenger.runtime.RequestUpdateCheckStatus
  inline def no_update: no_update = "no_update".asInstanceOf[no_update]
  
  @js.native
  sealed trait noarch
    extends StObject
       with PlatformArch
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformArch
  inline def noarch: noarch = "noarch".asInstanceOf[noarch]
  
  @js.native
  sealed trait none
    extends StObject
       with ImageAnimationBehavior
       with typings.thunderbirdWebextBrowser.messenger.browserSettings.ImageAnimationBehavior
       with MailTabSortOrder
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortOrder
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with ProxyConfigProxyType
       with typings.thunderbirdWebextBrowser.messenger.proxy.ProxyConfigProxyType
       with UpdateUpdatePropertiesSortOrder
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortOrder
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normal
    extends StObject
       with ActionManifestDefaultWindows
       with typings.thunderbirdWebextBrowser.messenger.manifest.ActionManifestDefaultWindows
       with ComposeDetailsPriority
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsPriority
       with CreateType
       with typings.thunderbirdWebextBrowser.messenger.windows.CreateType
       with ExtensionInstallType
       with typings.thunderbirdWebextBrowser.messenger.management.ExtensionInstallType
       with ImageAnimationBehavior
       with typings.thunderbirdWebextBrowser.messenger.browserSettings.ImageAnimationBehavior
       with ItemType
       with typings.thunderbirdWebextBrowser.messenger.menus.ItemType
       with WindowState
       with typings.thunderbirdWebextBrowser.messenger.windows.WindowState
       with WindowType
       with typings.thunderbirdWebextBrowser.browser.tabs.WindowType
       with typings.thunderbirdWebextBrowser.messenger.windows.WindowType
       with typings.thunderbirdWebextBrowser.messenger.tabs.WindowType
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait not_allowed
    extends StObject
       with WebExtensionManifestIncognito
       with typings.thunderbirdWebextBrowser.messenger.manifest.WebExtensionManifestIncognito
  inline def not_allowed: not_allowed = "not_allowed".asInstanceOf[not_allowed]
  
  @js.native
  sealed trait not_applicable
    extends StObject
       with CertificateTransparencyStatus
       with typings.thunderbirdWebextBrowser.messenger.webRequest.CertificateTransparencyStatus
  inline def not_applicable: not_applicable = "not_applicable".asInstanceOf[not_applicable]
  
  @js.native
  sealed trait not_controllable
    extends StObject
       with LevelOfControl
       with typings.thunderbirdWebextBrowser.messenger.types.LevelOfControl
  inline def not_controllable: not_controllable = "not_controllable".asInstanceOf[not_controllable]
  
  @js.native
  sealed trait notifications
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def notifications: notifications = "notifications".asInstanceOf[notifications]
  
  @js.native
  sealed trait `object`
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait object_subrequest
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def object_subrequest: object_subrequest = "object_subrequest".asInstanceOf[object_subrequest]
  
  @js.native
  sealed trait off
    extends StObject
       with ColorManagementMode
       with typings.thunderbirdWebextBrowser.messenger.browserSettings.ColorManagementMode
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait offline
    extends StObject
       with _ResolveFlags
       with typings.thunderbirdWebextBrowser.messenger.dns._ResolveFlags
  inline def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait once
    extends StObject
       with ImageAnimationBehavior
       with typings.thunderbirdWebextBrowser.messenger.browserSettings.ImageAnimationBehavior
  inline def once: once = "once".asInstanceOf[once]
  
  @js.native
  sealed trait openbsd
    extends StObject
       with PlatformOs
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformOs
  inline def openbsd: openbsd = "openbsd".asInstanceOf[openbsd]
  
  @js.native
  sealed trait os_update
    extends StObject
       with OnRestartRequiredReason
       with typings.thunderbirdWebextBrowser.messenger.runtime.OnRestartRequiredReason
  inline def os_update: os_update = "os_update".asInstanceOf[os_update]
  
  @js.native
  sealed trait other
    extends StObject
       with ExtensionInstallType
       with typings.thunderbirdWebextBrowser.messenger.management.ExtensionInstallType
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait outbox
    extends StObject
       with MailFolderType
       with typings.thunderbirdWebextBrowser.messenger.folders.MailFolderType
  inline def outbox: outbox = "outbox".asInstanceOf[outbox]
  
  @js.native
  sealed trait overwrite
    extends StObject
       with FilenameConflictAction
       with typings.thunderbirdWebextBrowser.messenger.downloads.FilenameConflictAction
       with OnChangedCause
       with typings.thunderbirdWebextBrowser.messenger.cookies.OnChangedCause
  inline def overwrite: overwrite = "overwrite".asInstanceOf[overwrite]
  
  @js.native
  sealed trait page
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait panel
    extends StObject
       with CreateType
       with typings.thunderbirdWebextBrowser.messenger.windows.CreateType
       with WindowType
       with typings.thunderbirdWebextBrowser.browser.tabs.WindowType
       with typings.thunderbirdWebextBrowser.messenger.windows.WindowType
       with typings.thunderbirdWebextBrowser.messenger.tabs.WindowType
  inline def panel: panel = "panel".asInstanceOf[panel]
  
  @js.native
  sealed trait password
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait periodic
    extends StObject
       with OnRestartRequiredReason
       with typings.thunderbirdWebextBrowser.messenger.runtime.OnRestartRequiredReason
  inline def periodic: periodic = "periodic".asInstanceOf[periodic]
  
  @js.native
  sealed trait permissions_increase
    extends StObject
       with ExtensionDisabledReason
       with typings.thunderbirdWebextBrowser.messenger.management.ExtensionDisabledReason
  inline def permissions_increase: permissions_increase = "permissions_increase".asInstanceOf[permissions_increase]
  
  @js.native
  sealed trait ping
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait pkcs11
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def pkcs11: pkcs11 = "pkcs11".asInstanceOf[pkcs11]
  
  @js.native
  sealed trait plaintext
    extends StObject
       with ComposeDetailsDeliveryFormat
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsDeliveryFormat
  inline def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  
  @js.native
  sealed trait png
    extends StObject
       with ImageFormat
       with typings.thunderbirdWebextBrowser.messenger.extensionTypes.ImageFormat
       with SetImageDataImageType
       with typings.thunderbirdWebextBrowser.messenger.clipboard.SetImageDataImageType
  inline def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait policy_compliant
    extends StObject
       with CertificateTransparencyStatus
       with typings.thunderbirdWebextBrowser.messenger.webRequest.CertificateTransparencyStatus
  inline def policy_compliant: policy_compliant = "policy_compliant".asInstanceOf[policy_compliant]
  
  @js.native
  sealed trait policy_not_diverse_scts
    extends StObject
       with CertificateTransparencyStatus
       with typings.thunderbirdWebextBrowser.messenger.webRequest.CertificateTransparencyStatus
  inline def policy_not_diverse_scts: policy_not_diverse_scts = "policy_not_diverse_scts".asInstanceOf[policy_not_diverse_scts]
  
  @js.native
  sealed trait policy_not_enough_scts
    extends StObject
       with CertificateTransparencyStatus
       with typings.thunderbirdWebextBrowser.messenger.webRequest.CertificateTransparencyStatus
  inline def policy_not_enough_scts: policy_not_enough_scts = "policy_not_enough_scts".asInstanceOf[policy_not_enough_scts]
  
  @js.native
  sealed trait popup
    extends StObject
       with CreateType
       with typings.thunderbirdWebextBrowser.messenger.windows.CreateType
       with ViewType
       with typings.thunderbirdWebextBrowser.messenger.`extension`.ViewType
       with WindowType
       with typings.thunderbirdWebextBrowser.browser.tabs.WindowType
       with typings.thunderbirdWebextBrowser.messenger.windows.WindowType
       with typings.thunderbirdWebextBrowser.messenger.tabs.WindowType
  inline def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait ppc64
    extends StObject
       with PlatformArch
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformArch
  inline def ppc64: ppc64 = "ppc64".asInstanceOf[ppc64]
  
  @js.native
  sealed trait pref
    extends StObject
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
       with typings.thunderbirdWebextBrowser.messenger.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
  inline def pref: pref = "pref".asInstanceOf[pref]
  
  @js.native
  sealed trait priority
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def priority: priority = "priority".asInstanceOf[priority]
  
  @js.native
  sealed trait priority_low
    extends StObject
       with _ResolveFlags
       with typings.thunderbirdWebextBrowser.messenger.dns._ResolveFlags
  inline def priority_low: priority_low = "priority_low".asInstanceOf[priority_low]
  
  @js.native
  sealed trait priority_medium
    extends StObject
       with _ResolveFlags
       with typings.thunderbirdWebextBrowser.messenger.dns._ResolveFlags
  inline def priority_medium: priority_medium = "priority_medium".asInstanceOf[priority_medium]
  
  @js.native
  sealed trait privacy
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def privacy: privacy = "privacy".asInstanceOf[privacy]
  
  @js.native
  sealed trait private_browsing
    extends StObject
       with HTTPSOnlyModeOption
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.HTTPSOnlyModeOption
       with TrackingProtectionModeOption
       with typings.thunderbirdWebextBrowser.messenger.privacy.websites.TrackingProtectionModeOption
  inline def private_browsing: private_browsing = "private_browsing".asInstanceOf[private_browsing]
  
  @js.native
  sealed trait progress
    extends StObject
       with TemplateType
       with typings.thunderbirdWebextBrowser.messenger.notifications.TemplateType
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait prompt
    extends StObject
       with FilenameConflictAction
       with typings.thunderbirdWebextBrowser.messenger.downloads.FilenameConflictAction
  inline def prompt: prompt = "prompt".asInstanceOf[prompt]
  
  @js.native
  sealed trait proxy
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def proxy: proxy = "proxy".asInstanceOf[proxy]
  
  @js.native
  sealed trait proxy_only
    extends StObject
       with IPHandlingPolicy
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.IPHandlingPolicy
  inline def proxy_only: proxy_only = "proxy_only".asInstanceOf[proxy_only]
  
  @js.native
  sealed trait purpose
    extends StObject
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
       with typings.thunderbirdWebextBrowser.messenger.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
  inline def purpose: purpose = "purpose".asInstanceOf[purpose]
  
  @js.native
  sealed trait radio
    extends StObject
       with ItemType
       with typings.thunderbirdWebextBrowser.messenger.menus.ItemType
  inline def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait received
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def received: received = "received".asInstanceOf[received]
  
  @js.native
  sealed trait recipient
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def recipient: recipient = "recipient".asInstanceOf[recipient]
  
  @js.native
  sealed trait redirect
    extends StObject
       with ComposeDetailsType
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsType
  inline def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @js.native
  sealed trait regular
    extends StObject
       with SettingScope
       with typings.thunderbirdWebextBrowser.messenger.types.SettingScope
  inline def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait regular_only
    extends StObject
       with SettingScope
       with typings.thunderbirdWebextBrowser.messenger.types.SettingScope
  inline def regular_only: regular_only = "regular_only".asInstanceOf[regular_only]
  
  @js.native
  sealed trait reject_all
    extends StObject
       with CookieConfigBehavior
       with typings.thunderbirdWebextBrowser.messenger.privacy.websites.CookieConfigBehavior
  inline def reject_all: reject_all = "reject_all".asInstanceOf[reject_all]
  
  @js.native
  sealed trait reject_third_party
    extends StObject
       with CookieConfigBehavior
       with typings.thunderbirdWebextBrowser.messenger.privacy.websites.CookieConfigBehavior
  inline def reject_third_party: reject_third_party = "reject_third_party".asInstanceOf[reject_third_party]
  
  @js.native
  sealed trait reject_trackers
    extends StObject
       with CookieConfigBehavior
       with typings.thunderbirdWebextBrowser.messenger.privacy.websites.CookieConfigBehavior
  inline def reject_trackers: reject_trackers = "reject_trackers".asInstanceOf[reject_trackers]
  
  @js.native
  sealed trait reject_trackers_and_partition_foreign
    extends StObject
       with CookieConfigBehavior
       with typings.thunderbirdWebextBrowser.messenger.privacy.websites.CookieConfigBehavior
  inline def reject_trackers_and_partition_foreign: reject_trackers_and_partition_foreign = "reject_trackers_and_partition_foreign".asInstanceOf[reject_trackers_and_partition_foreign]
  
  @js.native
  sealed trait reload
    extends StObject
       with TransitionType
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionType
  inline def reload: reload = "reload".asInstanceOf[reload]
  
  @js.native
  sealed trait repeat
    extends StObject
       with ThemeTypeAdditionalBackgroundsTiling
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsTiling
  inline def repeat: repeat = "repeat".asInstanceOf[repeat]
  
  @js.native
  sealed trait `repeat-x`
    extends StObject
       with ThemeTypeAdditionalBackgroundsTiling
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsTiling
  inline def `repeat-x`: `repeat-x` = "repeat-x".asInstanceOf[`repeat-x`]
  
  @js.native
  sealed trait `repeat-y`
    extends StObject
       with ThemeTypeAdditionalBackgroundsTiling
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsTiling
  inline def `repeat-y`: `repeat-y` = "repeat-y".asInstanceOf[`repeat-y`]
  
  @js.native
  sealed trait reply
    extends StObject
       with ComposeDetailsType
       with typings.thunderbirdWebextBrowser.messenger.compose.ComposeDetailsType
  inline def reply: reply = "reply".asInstanceOf[reply]
  
  @js.native
  sealed trait replyToAll
    extends StObject
       with BeginReplyReplyType
       with typings.thunderbirdWebextBrowser.messenger.compose.BeginReplyReplyType
  inline def replyToAll: replyToAll = "replyToAll".asInstanceOf[replyToAll]
  
  @js.native
  sealed trait replyToList
    extends StObject
       with BeginReplyReplyType
       with typings.thunderbirdWebextBrowser.messenger.compose.BeginReplyReplyType
  inline def replyToList: replyToList = "replyToList".asInstanceOf[replyToList]
  
  @js.native
  sealed trait replyToSender
    extends StObject
       with BeginReplyReplyType
       with typings.thunderbirdWebextBrowser.messenger.compose.BeginReplyReplyType
  inline def replyToSender: replyToSender = "replyToSender".asInstanceOf[replyToSender]
  
  @js.native
  sealed trait requestBody
    extends StObject
       with OnBeforeRequestOptions
       with typings.thunderbirdWebextBrowser.messenger.webRequest.OnBeforeRequestOptions
  inline def requestBody: requestBody = "requestBody".asInstanceOf[requestBody]
  
  @js.native
  sealed trait requestHeaders
    extends StObject
       with OnBeforeSendHeadersOptions
       with typings.thunderbirdWebextBrowser.messenger.webRequest.OnBeforeSendHeadersOptions
  inline def requestHeaders: requestHeaders = "requestHeaders".asInstanceOf[requestHeaders]
  
  @js.native
  sealed trait responseHeaders
    extends StObject
       with OnAuthRequiredOptions
       with typings.thunderbirdWebextBrowser.messenger.webRequest.OnAuthRequiredOptions
       with OnHeadersReceivedOptions
       with typings.thunderbirdWebextBrowser.messenger.webRequest.OnHeadersReceivedOptions
  inline def responseHeaders: responseHeaders = "responseHeaders".asInstanceOf[responseHeaders]
  
  @js.native
  sealed trait right
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait `right bottom`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def `right bottom`: `right bottom` = ("right bottom").asInstanceOf[`right bottom`]
  
  @js.native
  sealed trait `right center`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def `right center`: `right center` = ("right center").asInstanceOf[`right center`]
  
  @js.native
  sealed trait `right top`
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def `right top`: `right top` = ("right top").asInstanceOf[`right top`]
  
  @js.native
  sealed trait s390x
    extends StObject
       with PlatformArch
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformArch
  inline def s390x: s390x = "s390x".asInstanceOf[s390x]
  
  @js.native
  sealed trait safe
    extends StObject
       with DangerType
       with typings.thunderbirdWebextBrowser.messenger.downloads.DangerType
  inline def safe: safe = "safe".asInstanceOf[safe]
  
  @js.native
  sealed trait script
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait scripting
    extends StObject
       with _OptionalPermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermissionNoPrompt
  inline def scripting: scripting = "scripting".asInstanceOf[scripting]
  
  @js.native
  sealed trait searchbar
    extends StObject
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
       with typings.thunderbirdWebextBrowser.messenger.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  inline def searchbar: searchbar = "searchbar".asInstanceOf[searchbar]
  
  @js.native
  sealed trait secure
    extends StObject
       with SecurityInfoState
       with typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfoState
  inline def secure: secure = "secure".asInstanceOf[secure]
  
  @js.native
  sealed trait selection
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def selection: selection = "selection".asInstanceOf[selection]
  
  @js.native
  sealed trait sendLater
    extends StObject
       with OnAfterSendSendInfoMode
       with typings.thunderbirdWebextBrowser.messenger.compose.OnAfterSendSendInfoMode
       with SendMessageOptionsMode
       with typings.thunderbirdWebextBrowser.messenger.compose.SendMessageOptionsMode
       with SendMessageReturnReturnMode
       with typings.thunderbirdWebextBrowser.messenger.compose.SendMessageReturnReturnMode
  inline def sendLater: sendLater = "sendLater".asInstanceOf[sendLater]
  
  @js.native
  sealed trait sendNow
    extends StObject
       with OnAfterSendSendInfoMode
       with typings.thunderbirdWebextBrowser.messenger.compose.OnAfterSendSendInfoMode
       with SendMessageOptionsMode
       with typings.thunderbirdWebextBrowser.messenger.compose.SendMessageOptionsMode
       with SendMessageReturnReturnMode
       with typings.thunderbirdWebextBrowser.messenger.compose.SendMessageReturnReturnMode
  inline def sendNow: sendNow = "sendNow".asInstanceOf[sendNow]
  
  @js.native
  sealed trait sent
    extends StObject
       with MailFolderType
       with typings.thunderbirdWebextBrowser.messenger.folders.MailFolderType
  inline def sent: sent = "sent".asInstanceOf[sent]
  
  @js.native
  sealed trait separator
    extends StObject
       with ItemType
       with typings.thunderbirdWebextBrowser.messenger.menus.ItemType
  inline def separator: separator = "separator".asInstanceOf[separator]
  
  @js.native
  sealed trait server_redirect
    extends StObject
       with TransitionQualifier
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionQualifier
  inline def server_redirect: server_redirect = "server_redirect".asInstanceOf[server_redirect]
  
  @js.native
  sealed trait sidebar
    extends StObject
       with ViewType
       with typings.thunderbirdWebextBrowser.messenger.`extension`.ViewType
  inline def sidebar: sidebar = "sidebar".asInstanceOf[sidebar]
  
  @js.native
  sealed trait sideload
    extends StObject
       with ExtensionInstallType
       with typings.thunderbirdWebextBrowser.messenger.management.ExtensionInstallType
  inline def sideload: sideload = "sideload".asInstanceOf[sideload]
  
  @js.native
  sealed trait sip
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def sip: sip = "sip".asInstanceOf[sip]
  
  @js.native
  sealed trait size
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def size: size = "size".asInstanceOf[size]
  
  @js.native
  sealed trait sms
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait smsto
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def smsto: smsto = "smsto".asInstanceOf[smsto]
  
  @js.native
  sealed trait spanning
    extends StObject
       with WebExtensionManifestIncognito
       with typings.thunderbirdWebextBrowser.messenger.manifest.WebExtensionManifestIncognito
  inline def spanning: spanning = "spanning".asInstanceOf[spanning]
  
  @js.native
  sealed trait sparc64
    extends StObject
       with PlatformArch
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformArch
  inline def sparc64: sparc64 = "sparc64".asInstanceOf[sparc64]
  
  @js.native
  sealed trait special
    extends StObject
       with TabType
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabType
  inline def special: special = "special".asInstanceOf[special]
  
  @js.native
  sealed trait speculate
    extends StObject
       with _ResolveFlags
       with typings.thunderbirdWebextBrowser.messenger.dns._ResolveFlags
  inline def speculate: speculate = "speculate".asInstanceOf[speculate]
  
  @js.native
  sealed trait speculative
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def speculative: speculative = "speculative".asInstanceOf[speculative]
  
  @js.native
  sealed trait ssb
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def ssb: ssb = "ssb".asInstanceOf[ssb]
  
  @js.native
  sealed trait ssh
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def ssh: ssh = "ssh".asInstanceOf[ssh]
  
  @js.native
  sealed trait standard
    extends StObject
       with MailTabLayout
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabLayout
       with UpdateUpdatePropertiesLayout
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesLayout
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait start_page
    extends StObject
       with TransitionType
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionType
  inline def start_page: start_page = "start_page".asInstanceOf[start_page]
  
  @js.native
  sealed trait startup extends StObject
  inline def startup: startup = "startup".asInstanceOf[startup]
  
  @js.native
  sealed trait status
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdatePropertyName
       with typings.thunderbirdWebextBrowser.messenger.tabs.UpdatePropertyName
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait stdio extends StObject
  inline def stdio: stdio = "stdio".asInstanceOf[stdio]
  
  @js.native
  sealed trait storage
    extends StObject
       with _PermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionNoPrompt
  inline def storage: storage = "storage".asInstanceOf[storage]
  
  @js.native
  sealed trait strict
    extends StObject
       with SameSiteStatus
       with typings.thunderbirdWebextBrowser.messenger.cookies.SameSiteStatus
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait stylesheet
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @js.native
  sealed trait sub_frame
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  
  @js.native
  sealed trait subject
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def subject: subject = "subject".asInstanceOf[subject]
  
  @js.native
  sealed trait suspended
    extends StObject
       with StreamFilterStatus
       with typings.thunderbirdWebextBrowser.messenger.webRequest.StreamFilterStatus
  inline def suspended: suspended = "suspended".asInstanceOf[suspended]
  
  @js.native
  sealed trait system
    extends StObject
       with ProxyConfigProxyType
       with typings.thunderbirdWebextBrowser.messenger.proxy.ProxyConfigProxyType
  inline def system: system = "system".asInstanceOf[system]
  
  @js.native
  sealed trait tab
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
       with OpenOpenPropertiesLocation
       with typings.thunderbirdWebextBrowser.messenger.messageDisplay.OpenOpenPropertiesLocation
       with ViewType
       with typings.thunderbirdWebextBrowser.messenger.`extension`.ViewType
  inline def tab: tab = "tab".asInstanceOf[tab]
  
  @js.native
  sealed trait tabHide
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def tabHide: tabHide = "tabHide".asInstanceOf[tabHide]
  
  @js.native
  sealed trait tabs
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def tabs: tabs = "tabs".asInstanceOf[tabs]
  
  @js.native
  sealed trait tabstoolbar
    extends StObject
       with ActionManifestDefaultArea
       with typings.thunderbirdWebextBrowser.messenger.manifest.ActionManifestDefaultArea
  inline def tabstoolbar: tabstoolbar = "tabstoolbar".asInstanceOf[tabstoolbar]
  
  @js.native
  sealed trait tagged_only
    extends StObject
       with ColorManagementMode
       with typings.thunderbirdWebextBrowser.messenger.browserSettings.ColorManagementMode
  inline def tagged_only: tagged_only = "tagged_only".asInstanceOf[tagged_only]
  
  @js.native
  sealed trait tags
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def tags: tags = "tags".asInstanceOf[tags]
  
  @js.native
  sealed trait tasks
    extends StObject
       with TabType
       with typings.thunderbirdWebextBrowser.messenger.tabs.TabType
  inline def tasks: tasks = "tasks".asInstanceOf[tasks]
  
  @js.native
  sealed trait tel
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def tel: tel = "tel".asInstanceOf[tel]
  
  @js.native
  sealed trait telemetry
    extends StObject
       with _PermissionPrivileged
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionPrivileged
  inline def telemetry: telemetry = "telemetry".asInstanceOf[telemetry]
  
  @js.native
  sealed trait template
    extends StObject
       with OnAfterSaveSaveInfoMode
       with typings.thunderbirdWebextBrowser.messenger.compose.OnAfterSaveSaveInfoMode
       with SaveMessageOptionsMode
       with typings.thunderbirdWebextBrowser.messenger.compose.SaveMessageOptionsMode
       with SaveMessageReturnReturnMode
       with typings.thunderbirdWebextBrowser.messenger.compose.SaveMessageReturnReturnMode
  inline def template: template = "template".asInstanceOf[template]
  
  @js.native
  sealed trait templates
    extends StObject
       with MailFolderType
       with typings.thunderbirdWebextBrowser.messenger.folders.MailFolderType
  inline def templates: templates = "templates".asInstanceOf[templates]
  
  @js.native
  sealed trait theme
    extends StObject
       with ExtensionType
       with typings.thunderbirdWebextBrowser.messenger.management.ExtensionType
       with _PermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionNoPrompt
  inline def theme: theme = "theme".asInstanceOf[theme]
  
  @js.native
  sealed trait thread
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def thread: thread = "thread".asInstanceOf[thread]
  
  @js.native
  sealed trait throttled
    extends StObject
       with RequestUpdateCheckStatus
       with typings.thunderbirdWebextBrowser.messenger.runtime.RequestUpdateCheckStatus
  inline def throttled: throttled = "throttled".asInstanceOf[throttled]
  
  @js.native
  sealed trait title
    extends StObject
       with UpdatePropertyName
       with typings.thunderbirdWebextBrowser.messenger.tabs.UpdatePropertyName
  inline def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait tools_menu
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def tools_menu: tools_menu = "tools_menu".asInstanceOf[tools_menu]
  
  @js.native
  sealed trait top
    extends StObject
       with ThemeTypeAdditionalBackgroundsAlignment
       with typings.thunderbirdWebextBrowser.messenger.manifest.ThemeTypeAdditionalBackgroundsAlignment
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait tracking
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def tracking: tracking = "tracking".asInstanceOf[tracking]
  
  @js.native
  sealed trait tracking_ad
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def tracking_ad: tracking_ad = "tracking_ad".asInstanceOf[tracking_ad]
  
  @js.native
  sealed trait tracking_analytics
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def tracking_analytics: tracking_analytics = "tracking_analytics".asInstanceOf[tracking_analytics]
  
  @js.native
  sealed trait tracking_content
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def tracking_content: tracking_content = "tracking_content".asInstanceOf[tracking_content]
  
  @js.native
  sealed trait tracking_social
    extends StObject
       with UrlClassificationFlags
       with typings.thunderbirdWebextBrowser.messenger.webRequest.UrlClassificationFlags
  inline def tracking_social: tracking_social = "tracking_social".asInstanceOf[tracking_social]
  
  @js.native
  sealed trait transferringdata
    extends StObject
       with StreamFilterStatus
       with typings.thunderbirdWebextBrowser.messenger.webRequest.StreamFilterStatus
  inline def transferringdata: transferringdata = "transferringdata".asInstanceOf[transferringdata]
  
  @js.native
  sealed trait trash
    extends StObject
       with MailFolderType
       with typings.thunderbirdWebextBrowser.messenger.folders.MailFolderType
  inline def trash: trash = "trash".asInstanceOf[trash]
  
  @js.native
  sealed trait trust_error
    extends StObject
       with SecurityInfoOverridableErrorCategory
       with typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfoOverridableErrorCategory
  inline def trust_error: trust_error = "trust_error".asInstanceOf[trust_error]
  
  @js.native
  sealed trait typed
    extends StObject
       with TransitionType
       with typings.thunderbirdWebextBrowser.messenger.webNavigation.TransitionType
  inline def typed: typed = "typed".asInstanceOf[typed]
  
  @js.native
  sealed trait uncommon
    extends StObject
       with DangerType
       with typings.thunderbirdWebextBrowser.messenger.downloads.DangerType
  inline def uncommon: uncommon = "uncommon".asInstanceOf[uncommon]
  
  @js.native
  sealed trait ungrouped
    extends StObject
       with MailTabViewType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabViewType
       with UpdateUpdatePropertiesViewType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesViewType
  inline def ungrouped: ungrouped = "ungrouped".asInstanceOf[ungrouped]
  
  @js.native
  sealed trait uninitialized
    extends StObject
       with StreamFilterStatus
       with typings.thunderbirdWebextBrowser.messenger.webRequest.StreamFilterStatus
  inline def uninitialized: uninitialized = "uninitialized".asInstanceOf[uninitialized]
  
  @js.native
  sealed trait uniquify
    extends StObject
       with FilenameConflictAction
       with typings.thunderbirdWebextBrowser.messenger.downloads.FilenameConflictAction
  inline def uniquify: uniquify = "uniquify".asInstanceOf[uniquify]
  
  @js.native
  sealed trait unknown
    extends StObject
       with ExtensionDisabledReason
       with typings.thunderbirdWebextBrowser.messenger.management.ExtensionDisabledReason
       with SecurityInfoProtocolVersion
       with typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
       with typings.thunderbirdWebextBrowser.messenger.privacy.network.TlsVersionRestrictionConfigMinimum
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait unlimitedStorage
    extends StObject
       with _PermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._PermissionNoPrompt
  inline def unlimitedStorage: unlimitedStorage = "unlimitedStorage".asInstanceOf[unlimitedStorage]
  
  @js.native
  sealed trait unread
    extends StObject
       with MailTabSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabSortType
       with UpdateUpdatePropertiesSortType
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesSortType
  inline def unread: unread = "unread".asInstanceOf[unread]
  
  @js.native
  sealed trait unwanted
    extends StObject
       with DangerType
       with typings.thunderbirdWebextBrowser.messenger.downloads.DangerType
  inline def unwanted: unwanted = "unwanted".asInstanceOf[unwanted]
  
  @js.native
  sealed trait update
    extends StObject
       with OnInstalledReason
       with typings.thunderbirdWebextBrowser.messenger.runtime.OnInstalledReason
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait update_available
    extends StObject
       with RequestUpdateCheckStatus
       with typings.thunderbirdWebextBrowser.messenger.runtime.RequestUpdateCheckStatus
  inline def update_available: update_available = "update_available".asInstanceOf[update_available]
  
  @js.native
  sealed trait url
    extends StObject
       with DangerType
       with typings.thunderbirdWebextBrowser.messenger.downloads.DangerType
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait urn
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def urn: urn = "urn".asInstanceOf[urn]
  
  @js.native
  sealed trait user
    extends StObject
       with CSSOrigin
       with typings.thunderbirdWebextBrowser.messenger.extensionTypes.CSSOrigin
  inline def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait vertical
    extends StObject
       with MailTabLayout
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabLayout
       with UpdateUpdatePropertiesLayout
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesLayout
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait video
    extends StObject
       with ContextType
       with typings.thunderbirdWebextBrowser.messenger.menus.ContextType
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait weak
    extends StObject
       with SecurityInfoState
       with typings.thunderbirdWebextBrowser.messenger.webRequest.SecurityInfoState
  inline def weak: weak = "weak".asInstanceOf[weak]
  
  @js.native
  sealed trait webNavigation
    extends StObject
       with _OptionalPermission
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermission
  inline def webNavigation: webNavigation = "webNavigation".asInstanceOf[webNavigation]
  
  @js.native
  sealed trait webRequest
    extends StObject
       with _OptionalPermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermissionNoPrompt
  inline def webRequest: webRequest = "webRequest".asInstanceOf[webRequest]
  
  @js.native
  sealed trait webRequestBlocking
    extends StObject
       with _OptionalPermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermissionNoPrompt
  inline def webRequestBlocking: webRequestBlocking = "webRequestBlocking".asInstanceOf[webRequestBlocking]
  
  @js.native
  sealed trait webRequestFilterResponseDotserviceWorkerScript
    extends StObject
       with _OptionalPermissionNoPrompt
       with typings.thunderbirdWebextBrowser.messenger.manifest._OptionalPermissionNoPrompt
  inline def webRequestFilterResponseDotserviceWorkerScript: webRequestFilterResponseDotserviceWorkerScript = "webRequestFilterResponse.serviceWorkerScript".asInstanceOf[webRequestFilterResponseDotserviceWorkerScript]
  
  @js.native
  sealed trait web_manifest
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def web_manifest: web_manifest = "web_manifest".asInstanceOf[web_manifest]
  
  @js.native
  sealed trait webcal
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def webcal: webcal = "webcal".asInstanceOf[webcal]
  
  @js.native
  sealed trait websocket
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @js.native
  sealed trait wide
    extends StObject
       with MailTabLayout
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTabLayout
       with UpdateUpdatePropertiesLayout
       with typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdatePropertiesLayout
  inline def wide: wide = "wide".asInstanceOf[wide]
  
  @js.native
  sealed trait win
    extends StObject
       with PlatformOs
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformOs
  inline def win: win = "win".asInstanceOf[win]
  
  @js.native
  sealed trait window
    extends StObject
       with OpenOpenPropertiesLocation
       with typings.thunderbirdWebextBrowser.messenger.messageDisplay.OpenOpenPropertiesLocation
  inline def window: window = "window".asInstanceOf[window]
  
  @js.native
  sealed trait wtai
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def wtai: wtai = "wtai".asInstanceOf[wtai]
  
  @js.native
  sealed trait `x86-32`
    extends StObject
       with PlatformArch
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformArch
       with PlatformNaclArch
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformNaclArch
  inline def `x86-32`: `x86-32` = "x86-32".asInstanceOf[`x86-32`]
  
  @js.native
  sealed trait `x86-64`
    extends StObject
       with PlatformArch
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformArch
       with PlatformNaclArch
       with typings.thunderbirdWebextBrowser.messenger.runtime.PlatformNaclArch
  inline def `x86-64`: `x86-64` = "x86-64".asInstanceOf[`x86-64`]
  
  @js.native
  sealed trait xml_dtd
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def xml_dtd: xml_dtd = "xml_dtd".asInstanceOf[xml_dtd]
  
  @js.native
  sealed trait xmlhttprequest
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
  
  @js.native
  sealed trait xmpp
    extends StObject
       with ProtocolHandlerProtocol
       with typings.thunderbirdWebextBrowser.messenger.manifest.ProtocolHandlerProtocol
  inline def xmpp: xmpp = "xmpp".asInstanceOf[xmpp]
  
  @js.native
  sealed trait xslt
    extends StObject
       with ResourceType
       with typings.thunderbirdWebextBrowser.messenger.webRequest.ResourceType
  inline def xslt: xslt = "xslt".asInstanceOf[xslt]
}

package typings.webextensionPolyfill

import org.scalablytyped.runtime.Shortcut
import typings.webextensionPolyfill.actionMod.Action.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webextension-polyfill", "action")
  @js.native
  val action: Static = js.native
  
  @JSImport("webextension-polyfill", "activityLog")
  @js.native
  val activityLog: typings.webextensionPolyfill.activityLogMod.ActivityLog.Static = js.native
  
  @JSImport("webextension-polyfill", "alarms")
  @js.native
  val alarms: typings.webextensionPolyfill.alarmsMod.Alarms.Static = js.native
  
  @JSImport("webextension-polyfill", "bookmarks")
  @js.native
  val bookmarks: typings.webextensionPolyfill.bookmarksMod.Bookmarks.Static = js.native
  
  @JSImport("webextension-polyfill", "browserAction")
  @js.native
  val browserAction: typings.webextensionPolyfill.browserActionMod.BrowserAction.Static = js.native
  
  @JSImport("webextension-polyfill", "browserSettings")
  @js.native
  val browserSettings: typings.webextensionPolyfill.browserSettingsMod.BrowserSettings.Static = js.native
  
  @JSImport("webextension-polyfill", "browsingData")
  @js.native
  val browsingData: typings.webextensionPolyfill.browsingDataMod.BrowsingData.Static = js.native
  
  @JSImport("webextension-polyfill", "captivePortal")
  @js.native
  val captivePortal: typings.webextensionPolyfill.captivePortalMod.CaptivePortal.Static = js.native
  
  @JSImport("webextension-polyfill", "clipboard")
  @js.native
  val clipboard: typings.webextensionPolyfill.clipboardMod.Clipboard.Static = js.native
  
  @JSImport("webextension-polyfill", "commands")
  @js.native
  val commands: typings.webextensionPolyfill.commandsMod.Commands.Static = js.native
  
  @JSImport("webextension-polyfill", "contentScripts")
  @js.native
  val contentScripts: typings.webextensionPolyfill.contentScriptsMod.ContentScripts.Static = js.native
  
  @JSImport("webextension-polyfill", "contextMenus")
  @js.native
  val contextMenus: typings.webextensionPolyfill.contextMenusMod.ContextMenus.Static = js.native
  
  @JSImport("webextension-polyfill", "contextualIdentities")
  @js.native
  val contextualIdentities: typings.webextensionPolyfill.contextualIdentitiesMod.ContextualIdentities.Static = js.native
  
  @JSImport("webextension-polyfill", "cookies")
  @js.native
  val cookies: typings.webextensionPolyfill.cookiesMod.Cookies.Static = js.native
  
  object declarativeContent extends Shortcut {
    
    @JSImport("webextension-polyfill", "declarativeContent")
    @js.native
    val ^ : typings.webextensionPolyfill.declarativeContentMod.DeclarativeContent.Static = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("webextension-polyfill", "declarativeContent.PageStateMatcher")
    @js.native
    open class PageStateMatcher ()
      extends StObject
         with typings.webextensionPolyfill.declarativeContentMod.DeclarativeContent.PageStateMatcher {
      def this(options: typings.webextensionPolyfill.declarativeContentMod.DeclarativeContent.PageStateMatcher) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("webextension-polyfill", "declarativeContent.RequestContentScript")
    @js.native
    open class RequestContentScript ()
      extends StObject
         with typings.webextensionPolyfill.declarativeContentMod.DeclarativeContent.RequestContentScript {
      def this(options: typings.webextensionPolyfill.declarativeContentMod.DeclarativeContent.RequestContentScript) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("webextension-polyfill", "declarativeContent.SetIcon")
    @js.native
    open class SetIcon ()
      extends StObject
         with typings.webextensionPolyfill.declarativeContentMod.DeclarativeContent.SetIcon {
      def this(options: typings.webextensionPolyfill.declarativeContentMod.DeclarativeContent.SetIcon) = this()
    }
    
    type _To = typings.webextensionPolyfill.declarativeContentMod.DeclarativeContent.Static
    
    /* This means you don't have to write `^`, but can instead just say `declarativeContent.foo` */
    override def _to: typings.webextensionPolyfill.declarativeContentMod.DeclarativeContent.Static = ^
  }
  
  @JSImport("webextension-polyfill", "devtools")
  @js.native
  val devtools: typings.webextensionPolyfill.devtoolsMod.Devtools.Static = js.native
  
  @JSImport("webextension-polyfill", "dns")
  @js.native
  val dns: typings.webextensionPolyfill.dnsMod.Dns.Static = js.native
  
  @JSImport("webextension-polyfill", "downloads")
  @js.native
  val downloads: typings.webextensionPolyfill.downloadsMod.Downloads.Static = js.native
  
  @JSImport("webextension-polyfill", "events")
  @js.native
  val events: typings.webextensionPolyfill.eventsMod.Events.Static = js.native
  
  @JSImport("webextension-polyfill", "experiments")
  @js.native
  val experiments: typings.webextensionPolyfill.experimentsMod.Experiments.Static = js.native
  
  @JSImport("webextension-polyfill", "extension")
  @js.native
  val `extension`: typings.webextensionPolyfill.extensionMod.Extension.Static = js.native
  
  @JSImport("webextension-polyfill", "extensionTypes")
  @js.native
  val extensionTypes: typings.webextensionPolyfill.extensionTypesMod.ExtensionTypes.Static = js.native
  
  @JSImport("webextension-polyfill", "find")
  @js.native
  val find: typings.webextensionPolyfill.findMod.Find.Static = js.native
  
  @JSImport("webextension-polyfill", "geckoProfiler")
  @js.native
  val geckoProfiler: typings.webextensionPolyfill.geckoProfilerMod.GeckoProfiler.Static = js.native
  
  @JSImport("webextension-polyfill", "history")
  @js.native
  val history: typings.webextensionPolyfill.historyMod.History.Static = js.native
  
  @JSImport("webextension-polyfill", "i18n")
  @js.native
  val i18n: typings.webextensionPolyfill.i18nMod.I18n.Static = js.native
  
  @JSImport("webextension-polyfill", "identity")
  @js.native
  val identity: typings.webextensionPolyfill.identityMod.Identity.Static = js.native
  
  @JSImport("webextension-polyfill", "idle")
  @js.native
  val idle: typings.webextensionPolyfill.idleMod.Idle.Static = js.native
  
  @JSImport("webextension-polyfill", "management")
  @js.native
  val management: typings.webextensionPolyfill.managementMod.Management.Static = js.native
  
  @JSImport("webextension-polyfill", "manifest")
  @js.native
  val manifest: typings.webextensionPolyfill.manifestMod.Manifest.Static = js.native
  
  @JSImport("webextension-polyfill", "menus")
  @js.native
  val menus: typings.webextensionPolyfill.menusMod.Menus.Static = js.native
  
  @JSImport("webextension-polyfill", "networkStatus")
  @js.native
  val networkStatus: typings.webextensionPolyfill.networkStatusMod.NetworkStatus.Static = js.native
  
  @JSImport("webextension-polyfill", "normandyAddonStudy")
  @js.native
  val normandyAddonStudy: typings.webextensionPolyfill.normandyAddonStudyMod.NormandyAddonStudy.Static = js.native
  
  @JSImport("webextension-polyfill", "notifications")
  @js.native
  val notifications: typings.webextensionPolyfill.notificationsMod.Notifications.Static = js.native
  
  @JSImport("webextension-polyfill", "omnibox")
  @js.native
  val omnibox: typings.webextensionPolyfill.omniboxMod.Omnibox.Static = js.native
  
  @JSImport("webextension-polyfill", "pageAction")
  @js.native
  val pageAction: typings.webextensionPolyfill.pageActionMod.PageAction.Static = js.native
  
  @JSImport("webextension-polyfill", "permissions")
  @js.native
  val permissions: typings.webextensionPolyfill.permissionsMod.Permissions.Static = js.native
  
  @JSImport("webextension-polyfill", "pkcs11")
  @js.native
  val pkcs11: typings.webextensionPolyfill.pkcs11Mod.Pkcs11.Static = js.native
  
  @JSImport("webextension-polyfill", "privacy")
  @js.native
  val privacy: typings.webextensionPolyfill.privacyMod.Privacy.Static = js.native
  
  @JSImport("webextension-polyfill", "proxy")
  @js.native
  val proxy: typings.webextensionPolyfill.proxyMod.Proxy.Static = js.native
  
  @JSImport("webextension-polyfill", "runtime")
  @js.native
  val runtime: typings.webextensionPolyfill.runtimeMod.Runtime.Static = js.native
  
  @JSImport("webextension-polyfill", "scripting")
  @js.native
  val scripting: typings.webextensionPolyfill.scriptingMod.Scripting.Static = js.native
  
  @JSImport("webextension-polyfill", "search")
  @js.native
  val search: typings.webextensionPolyfill.searchMod.Search.Static = js.native
  
  @JSImport("webextension-polyfill", "sessions")
  @js.native
  val sessions: typings.webextensionPolyfill.sessionsMod.Sessions.Static = js.native
  
  @JSImport("webextension-polyfill", "sidebarAction")
  @js.native
  val sidebarAction: typings.webextensionPolyfill.sidebarActionMod.SidebarAction.Static = js.native
  
  @JSImport("webextension-polyfill", "storage")
  @js.native
  val storage: typings.webextensionPolyfill.storageMod.Storage.Static = js.native
  
  @JSImport("webextension-polyfill", "tabs")
  @js.native
  val tabs: typings.webextensionPolyfill.tabsMod.Tabs.Static = js.native
  
  @JSImport("webextension-polyfill", "theme")
  @js.native
  val theme: typings.webextensionPolyfill.themeMod.Theme.Static = js.native
  
  @JSImport("webextension-polyfill", "topSites")
  @js.native
  val topSites: typings.webextensionPolyfill.topSitesMod.TopSites.Static = js.native
  
  @JSImport("webextension-polyfill", "types")
  @js.native
  val types: typings.webextensionPolyfill.typesMod.Types.Static = js.native
  
  @JSImport("webextension-polyfill", "urlbar")
  @js.native
  val urlbar: typings.webextensionPolyfill.urlbarMod.Urlbar.Static = js.native
  
  @JSImport("webextension-polyfill", "userScripts")
  @js.native
  val userScripts: typings.webextensionPolyfill.userScriptsMod.UserScripts.Static = js.native
  
  @JSImport("webextension-polyfill", "webNavigation")
  @js.native
  val webNavigation: typings.webextensionPolyfill.webNavigationMod.WebNavigation.Static = js.native
  
  @JSImport("webextension-polyfill", "webRequest")
  @js.native
  val webRequest: typings.webextensionPolyfill.webRequestMod.WebRequest.Static = js.native
  
  @JSImport("webextension-polyfill", "windows")
  @js.native
  val windows: typings.webextensionPolyfill.windowsMod.Windows.Static = js.native
  
  trait Browser extends StObject {
    
    var action: Static
    
    var activityLog: typings.webextensionPolyfill.activityLogMod.ActivityLog.Static
    
    var alarms: typings.webextensionPolyfill.alarmsMod.Alarms.Static
    
    var bookmarks: typings.webextensionPolyfill.bookmarksMod.Bookmarks.Static
    
    var browserAction: typings.webextensionPolyfill.browserActionMod.BrowserAction.Static
    
    var browserSettings: typings.webextensionPolyfill.browserSettingsMod.BrowserSettings.Static
    
    var browsingData: typings.webextensionPolyfill.browsingDataMod.BrowsingData.Static
    
    var captivePortal: typings.webextensionPolyfill.captivePortalMod.CaptivePortal.Static
    
    var clipboard: typings.webextensionPolyfill.clipboardMod.Clipboard.Static
    
    var commands: typings.webextensionPolyfill.commandsMod.Commands.Static
    
    var contentScripts: typings.webextensionPolyfill.contentScriptsMod.ContentScripts.Static
    
    var contextMenus: typings.webextensionPolyfill.contextMenusMod.ContextMenus.Static
    
    var contextualIdentities: typings.webextensionPolyfill.contextualIdentitiesMod.ContextualIdentities.Static
    
    var cookies: typings.webextensionPolyfill.cookiesMod.Cookies.Static
    
    var declarativeContent: typings.webextensionPolyfill.declarativeContentMod.DeclarativeContent.Static
    
    var devtools: typings.webextensionPolyfill.devtoolsMod.Devtools.Static
    
    var dns: typings.webextensionPolyfill.dnsMod.Dns.Static
    
    var downloads: typings.webextensionPolyfill.downloadsMod.Downloads.Static
    
    var events: typings.webextensionPolyfill.eventsMod.Events.Static
    
    var experiments: typings.webextensionPolyfill.experimentsMod.Experiments.Static
    
    var `extension`: typings.webextensionPolyfill.extensionMod.Extension.Static
    
    var extensionTypes: typings.webextensionPolyfill.extensionTypesMod.ExtensionTypes.Static
    
    var find: typings.webextensionPolyfill.findMod.Find.Static
    
    var geckoProfiler: typings.webextensionPolyfill.geckoProfilerMod.GeckoProfiler.Static
    
    var history: typings.webextensionPolyfill.historyMod.History.Static
    
    var i18n: typings.webextensionPolyfill.i18nMod.I18n.Static
    
    var identity: typings.webextensionPolyfill.identityMod.Identity.Static
    
    var idle: typings.webextensionPolyfill.idleMod.Idle.Static
    
    var management: typings.webextensionPolyfill.managementMod.Management.Static
    
    var manifest: typings.webextensionPolyfill.manifestMod.Manifest.Static
    
    var menus: typings.webextensionPolyfill.menusMod.Menus.Static
    
    var networkStatus: typings.webextensionPolyfill.networkStatusMod.NetworkStatus.Static
    
    var normandyAddonStudy: typings.webextensionPolyfill.normandyAddonStudyMod.NormandyAddonStudy.Static
    
    var notifications: typings.webextensionPolyfill.notificationsMod.Notifications.Static
    
    var omnibox: typings.webextensionPolyfill.omniboxMod.Omnibox.Static
    
    var pageAction: typings.webextensionPolyfill.pageActionMod.PageAction.Static
    
    var permissions: typings.webextensionPolyfill.permissionsMod.Permissions.Static
    
    var pkcs11: typings.webextensionPolyfill.pkcs11Mod.Pkcs11.Static
    
    var privacy: typings.webextensionPolyfill.privacyMod.Privacy.Static
    
    var proxy: typings.webextensionPolyfill.proxyMod.Proxy.Static
    
    var runtime: typings.webextensionPolyfill.runtimeMod.Runtime.Static
    
    var scripting: typings.webextensionPolyfill.scriptingMod.Scripting.Static
    
    var search: typings.webextensionPolyfill.searchMod.Search.Static
    
    var sessions: typings.webextensionPolyfill.sessionsMod.Sessions.Static
    
    var sidebarAction: typings.webextensionPolyfill.sidebarActionMod.SidebarAction.Static
    
    var storage: typings.webextensionPolyfill.storageMod.Storage.Static
    
    var tabs: typings.webextensionPolyfill.tabsMod.Tabs.Static
    
    var theme: typings.webextensionPolyfill.themeMod.Theme.Static
    
    var topSites: typings.webextensionPolyfill.topSitesMod.TopSites.Static
    
    var types: typings.webextensionPolyfill.typesMod.Types.Static
    
    var urlbar: typings.webextensionPolyfill.urlbarMod.Urlbar.Static
    
    var userScripts: typings.webextensionPolyfill.userScriptsMod.UserScripts.Static
    
    var webNavigation: typings.webextensionPolyfill.webNavigationMod.WebNavigation.Static
    
    var webRequest: typings.webextensionPolyfill.webRequestMod.WebRequest.Static
    
    var windows: typings.webextensionPolyfill.windowsMod.Windows.Static
  }
  object Browser {
    
    inline def apply(
      action: Static,
      activityLog: typings.webextensionPolyfill.activityLogMod.ActivityLog.Static,
      alarms: typings.webextensionPolyfill.alarmsMod.Alarms.Static,
      bookmarks: typings.webextensionPolyfill.bookmarksMod.Bookmarks.Static,
      browserAction: typings.webextensionPolyfill.browserActionMod.BrowserAction.Static,
      browserSettings: typings.webextensionPolyfill.browserSettingsMod.BrowserSettings.Static,
      browsingData: typings.webextensionPolyfill.browsingDataMod.BrowsingData.Static,
      captivePortal: typings.webextensionPolyfill.captivePortalMod.CaptivePortal.Static,
      clipboard: typings.webextensionPolyfill.clipboardMod.Clipboard.Static,
      commands: typings.webextensionPolyfill.commandsMod.Commands.Static,
      contentScripts: typings.webextensionPolyfill.contentScriptsMod.ContentScripts.Static,
      contextMenus: typings.webextensionPolyfill.contextMenusMod.ContextMenus.Static,
      contextualIdentities: typings.webextensionPolyfill.contextualIdentitiesMod.ContextualIdentities.Static,
      cookies: typings.webextensionPolyfill.cookiesMod.Cookies.Static,
      declarativeContent: typings.webextensionPolyfill.declarativeContentMod.DeclarativeContent.Static,
      devtools: typings.webextensionPolyfill.devtoolsMod.Devtools.Static,
      dns: typings.webextensionPolyfill.dnsMod.Dns.Static,
      downloads: typings.webextensionPolyfill.downloadsMod.Downloads.Static,
      events: typings.webextensionPolyfill.eventsMod.Events.Static,
      experiments: typings.webextensionPolyfill.experimentsMod.Experiments.Static,
      `extension`: typings.webextensionPolyfill.extensionMod.Extension.Static,
      extensionTypes: typings.webextensionPolyfill.extensionTypesMod.ExtensionTypes.Static,
      find: typings.webextensionPolyfill.findMod.Find.Static,
      geckoProfiler: typings.webextensionPolyfill.geckoProfilerMod.GeckoProfiler.Static,
      history: typings.webextensionPolyfill.historyMod.History.Static,
      i18n: typings.webextensionPolyfill.i18nMod.I18n.Static,
      identity: typings.webextensionPolyfill.identityMod.Identity.Static,
      idle: typings.webextensionPolyfill.idleMod.Idle.Static,
      management: typings.webextensionPolyfill.managementMod.Management.Static,
      manifest: typings.webextensionPolyfill.manifestMod.Manifest.Static,
      menus: typings.webextensionPolyfill.menusMod.Menus.Static,
      networkStatus: typings.webextensionPolyfill.networkStatusMod.NetworkStatus.Static,
      normandyAddonStudy: typings.webextensionPolyfill.normandyAddonStudyMod.NormandyAddonStudy.Static,
      notifications: typings.webextensionPolyfill.notificationsMod.Notifications.Static,
      omnibox: typings.webextensionPolyfill.omniboxMod.Omnibox.Static,
      pageAction: typings.webextensionPolyfill.pageActionMod.PageAction.Static,
      permissions: typings.webextensionPolyfill.permissionsMod.Permissions.Static,
      pkcs11: typings.webextensionPolyfill.pkcs11Mod.Pkcs11.Static,
      privacy: typings.webextensionPolyfill.privacyMod.Privacy.Static,
      proxy: typings.webextensionPolyfill.proxyMod.Proxy.Static,
      runtime: typings.webextensionPolyfill.runtimeMod.Runtime.Static,
      scripting: typings.webextensionPolyfill.scriptingMod.Scripting.Static,
      search: typings.webextensionPolyfill.searchMod.Search.Static,
      sessions: typings.webextensionPolyfill.sessionsMod.Sessions.Static,
      sidebarAction: typings.webextensionPolyfill.sidebarActionMod.SidebarAction.Static,
      storage: typings.webextensionPolyfill.storageMod.Storage.Static,
      tabs: typings.webextensionPolyfill.tabsMod.Tabs.Static,
      theme: typings.webextensionPolyfill.themeMod.Theme.Static,
      topSites: typings.webextensionPolyfill.topSitesMod.TopSites.Static,
      types: typings.webextensionPolyfill.typesMod.Types.Static,
      urlbar: typings.webextensionPolyfill.urlbarMod.Urlbar.Static,
      userScripts: typings.webextensionPolyfill.userScriptsMod.UserScripts.Static,
      webNavigation: typings.webextensionPolyfill.webNavigationMod.WebNavigation.Static,
      webRequest: typings.webextensionPolyfill.webRequestMod.WebRequest.Static,
      windows: typings.webextensionPolyfill.windowsMod.Windows.Static
    ): Browser = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], activityLog = activityLog.asInstanceOf[js.Any], alarms = alarms.asInstanceOf[js.Any], bookmarks = bookmarks.asInstanceOf[js.Any], browserAction = browserAction.asInstanceOf[js.Any], browserSettings = browserSettings.asInstanceOf[js.Any], browsingData = browsingData.asInstanceOf[js.Any], captivePortal = captivePortal.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], contentScripts = contentScripts.asInstanceOf[js.Any], contextMenus = contextMenus.asInstanceOf[js.Any], contextualIdentities = contextualIdentities.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], declarativeContent = declarativeContent.asInstanceOf[js.Any], devtools = devtools.asInstanceOf[js.Any], dns = dns.asInstanceOf[js.Any], downloads = downloads.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], experiments = experiments.asInstanceOf[js.Any], extensionTypes = extensionTypes.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], geckoProfiler = geckoProfiler.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], management = management.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], menus = menus.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], normandyAddonStudy = normandyAddonStudy.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], omnibox = omnibox.asInstanceOf[js.Any], pageAction = pageAction.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], pkcs11 = pkcs11.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], scripting = scripting.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any], sidebarAction = sidebarAction.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], topSites = topSites.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], urlbar = urlbar.asInstanceOf[js.Any], userScripts = userScripts.asInstanceOf[js.Any], webNavigation = webNavigation.asInstanceOf[js.Any], webRequest = webRequest.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browser]
    }
    
    extension [Self <: Browser](x: Self) {
      
      inline def setAction(value: Static): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActivityLog(value: typings.webextensionPolyfill.activityLogMod.ActivityLog.Static): Self = StObject.set(x, "activityLog", value.asInstanceOf[js.Any])
      
      inline def setAlarms(value: typings.webextensionPolyfill.alarmsMod.Alarms.Static): Self = StObject.set(x, "alarms", value.asInstanceOf[js.Any])
      
      inline def setBookmarks(value: typings.webextensionPolyfill.bookmarksMod.Bookmarks.Static): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
      
      inline def setBrowserAction(value: typings.webextensionPolyfill.browserActionMod.BrowserAction.Static): Self = StObject.set(x, "browserAction", value.asInstanceOf[js.Any])
      
      inline def setBrowserSettings(value: typings.webextensionPolyfill.browserSettingsMod.BrowserSettings.Static): Self = StObject.set(x, "browserSettings", value.asInstanceOf[js.Any])
      
      inline def setBrowsingData(value: typings.webextensionPolyfill.browsingDataMod.BrowsingData.Static): Self = StObject.set(x, "browsingData", value.asInstanceOf[js.Any])
      
      inline def setCaptivePortal(value: typings.webextensionPolyfill.captivePortalMod.CaptivePortal.Static): Self = StObject.set(x, "captivePortal", value.asInstanceOf[js.Any])
      
      inline def setClipboard(value: typings.webextensionPolyfill.clipboardMod.Clipboard.Static): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      inline def setCommands(value: typings.webextensionPolyfill.commandsMod.Commands.Static): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setContentScripts(value: typings.webextensionPolyfill.contentScriptsMod.ContentScripts.Static): Self = StObject.set(x, "contentScripts", value.asInstanceOf[js.Any])
      
      inline def setContextMenus(value: typings.webextensionPolyfill.contextMenusMod.ContextMenus.Static): Self = StObject.set(x, "contextMenus", value.asInstanceOf[js.Any])
      
      inline def setContextualIdentities(value: typings.webextensionPolyfill.contextualIdentitiesMod.ContextualIdentities.Static): Self = StObject.set(x, "contextualIdentities", value.asInstanceOf[js.Any])
      
      inline def setCookies(value: typings.webextensionPolyfill.cookiesMod.Cookies.Static): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setDeclarativeContent(value: typings.webextensionPolyfill.declarativeContentMod.DeclarativeContent.Static): Self = StObject.set(x, "declarativeContent", value.asInstanceOf[js.Any])
      
      inline def setDevtools(value: typings.webextensionPolyfill.devtoolsMod.Devtools.Static): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      inline def setDns(value: typings.webextensionPolyfill.dnsMod.Dns.Static): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
      
      inline def setDownloads(value: typings.webextensionPolyfill.downloadsMod.Downloads.Static): Self = StObject.set(x, "downloads", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: typings.webextensionPolyfill.eventsMod.Events.Static): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setExperiments(value: typings.webextensionPolyfill.experimentsMod.Experiments.Static): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: typings.webextensionPolyfill.extensionMod.Extension.Static): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionTypes(value: typings.webextensionPolyfill.extensionTypesMod.ExtensionTypes.Static): Self = StObject.set(x, "extensionTypes", value.asInstanceOf[js.Any])
      
      inline def setFind(value: typings.webextensionPolyfill.findMod.Find.Static): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setGeckoProfiler(value: typings.webextensionPolyfill.geckoProfilerMod.GeckoProfiler.Static): Self = StObject.set(x, "geckoProfiler", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: typings.webextensionPolyfill.historyMod.History.Static): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setI18n(value: typings.webextensionPolyfill.i18nMod.I18n.Static): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: typings.webextensionPolyfill.identityMod.Identity.Static): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdle(value: typings.webextensionPolyfill.idleMod.Idle.Static): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setManagement(value: typings.webextensionPolyfill.managementMod.Management.Static): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
      
      inline def setManifest(value: typings.webextensionPolyfill.manifestMod.Manifest.Static): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setMenus(value: typings.webextensionPolyfill.menusMod.Menus.Static): Self = StObject.set(x, "menus", value.asInstanceOf[js.Any])
      
      inline def setNetworkStatus(value: typings.webextensionPolyfill.networkStatusMod.NetworkStatus.Static): Self = StObject.set(x, "networkStatus", value.asInstanceOf[js.Any])
      
      inline def setNormandyAddonStudy(value: typings.webextensionPolyfill.normandyAddonStudyMod.NormandyAddonStudy.Static): Self = StObject.set(x, "normandyAddonStudy", value.asInstanceOf[js.Any])
      
      inline def setNotifications(value: typings.webextensionPolyfill.notificationsMod.Notifications.Static): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setOmnibox(value: typings.webextensionPolyfill.omniboxMod.Omnibox.Static): Self = StObject.set(x, "omnibox", value.asInstanceOf[js.Any])
      
      inline def setPageAction(value: typings.webextensionPolyfill.pageActionMod.PageAction.Static): Self = StObject.set(x, "pageAction", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: typings.webextensionPolyfill.permissionsMod.Permissions.Static): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPkcs11(value: typings.webextensionPolyfill.pkcs11Mod.Pkcs11.Static): Self = StObject.set(x, "pkcs11", value.asInstanceOf[js.Any])
      
      inline def setPrivacy(value: typings.webextensionPolyfill.privacyMod.Privacy.Static): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: typings.webextensionPolyfill.proxyMod.Proxy.Static): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: typings.webextensionPolyfill.runtimeMod.Runtime.Static): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setScripting(value: typings.webextensionPolyfill.scriptingMod.Scripting.Static): Self = StObject.set(x, "scripting", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: typings.webextensionPolyfill.searchMod.Search.Static): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSessions(value: typings.webextensionPolyfill.sessionsMod.Sessions.Static): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
      
      inline def setSidebarAction(value: typings.webextensionPolyfill.sidebarActionMod.SidebarAction.Static): Self = StObject.set(x, "sidebarAction", value.asInstanceOf[js.Any])
      
      inline def setStorage(value: typings.webextensionPolyfill.storageMod.Storage.Static): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setTabs(value: typings.webextensionPolyfill.tabsMod.Tabs.Static): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: typings.webextensionPolyfill.themeMod.Theme.Static): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTopSites(value: typings.webextensionPolyfill.topSitesMod.TopSites.Static): Self = StObject.set(x, "topSites", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: typings.webextensionPolyfill.typesMod.Types.Static): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setUrlbar(value: typings.webextensionPolyfill.urlbarMod.Urlbar.Static): Self = StObject.set(x, "urlbar", value.asInstanceOf[js.Any])
      
      inline def setUserScripts(value: typings.webextensionPolyfill.userScriptsMod.UserScripts.Static): Self = StObject.set(x, "userScripts", value.asInstanceOf[js.Any])
      
      inline def setWebNavigation(value: typings.webextensionPolyfill.webNavigationMod.WebNavigation.Static): Self = StObject.set(x, "webNavigation", value.asInstanceOf[js.Any])
      
      inline def setWebRequest(value: typings.webextensionPolyfill.webRequestMod.WebRequest.Static): Self = StObject.set(x, "webRequest", value.asInstanceOf[js.Any])
      
      inline def setWindows(value: typings.webextensionPolyfill.windowsMod.Windows.Static): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    }
  }
}

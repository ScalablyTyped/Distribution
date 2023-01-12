package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a WebExtension manifest.json file
  */
trait WebExtensionManifest
  extends StObject
     with ManifestBase {
  
  /**
    * Optional.
    */
  var action: js.UndefOr[ActionManifest] = js.undefined
  
  /**
    * Optional.
    */
  var background: js.UndefOr[
    WebExtensionManifestBackgroundC1Type | WebExtensionManifestBackgroundC2Type | WebExtensionManifestBackgroundC3Type
  ] = js.undefined
  
  /**
    * Optional.
    */
  var browser_action: js.UndefOr[ActionManifest] = js.undefined
  
  /**
    * Optional.
    */
  var chrome_settings_overrides: js.UndefOr[WebExtensionManifestChromeSettingsOverridesType] = js.undefined
  
  /**
    * Optional.
    */
  var chrome_url_overrides: js.UndefOr[WebExtensionManifestChromeUrlOverridesType] = js.undefined
  
  /**
    * Optional.
    */
  var commands: js.UndefOr[Record[String, WebExtensionManifestCommandsType]] = js.undefined
  
  /**
    * Optional.
    */
  var content_scripts: js.UndefOr[js.Array[ContentScript]] = js.undefined
  
  /**
    * Optional.
    */
  var content_security_policy: js.UndefOr[String | WebExtensionManifestContentSecurityPolicyC2Type] = js.undefined
  
  /**
    * Optional.
    */
  var default_locale: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var devtools_page: js.UndefOr[ExtensionURL] = js.undefined
  
  /**
    * Optional.
    */
  var experiment_apis: js.UndefOr[WebExtensionManifestExperimentApisType] = js.undefined
  
  /**
    * Optional.
    */
  var granted_host_permissions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    */
  var host_permissions: js.UndefOr[js.Array[MatchPattern]] = js.undefined
  
  /**
    * Optional.
    */
  var icons: js.UndefOr[Record[String, ExtensionFileUrl]] = js.undefined
  
  /**
    * Optional.
    */
  var incognito: js.UndefOr[WebExtensionManifestIncognitoEnum] = js.undefined
  
  /**
    * Optional.
    */
  var l10n_resources: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional.
    */
  var minimum_chrome_version: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var minimum_opera_version: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var omnibox: js.UndefOr[WebExtensionManifestOmniboxType] = js.undefined
  
  /**
    * Optional.
    */
  var optional_permissions: js.UndefOr[js.Array[OptionalPermissionOrOrigin]] = js.undefined
  
  /**
    * Optional.
    */
  var options_ui: js.UndefOr[WebExtensionManifestOptionsUiType] = js.undefined
  
  /**
    * Optional.
    */
  var page_action: js.UndefOr[WebExtensionManifestPageActionType] = js.undefined
  
  /**
    * Optional.
    */
  var permissions: js.UndefOr[js.Array[Permission | PermissionOrOrigin]] = js.undefined
  
  /**
    * A list of protocol handler definitions.
    * Optional.
    */
  var protocol_handlers: js.UndefOr[js.Array[ProtocolHandler]] = js.undefined
  
  /**
    * Optional.
    */
  var sidebar_action: js.UndefOr[WebExtensionManifestSidebarActionType] = js.undefined
  
  /**
    * Optional.
    */
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.undefined
  
  /**
    * Optional.
    */
  var user_scripts: js.UndefOr[WebExtensionManifestUserScriptsType] = js.undefined
  
  /**
    * Optional.
    */
  var web_accessible_resources: js.UndefOr[js.Array[String | WebExtensionManifestWebAccessibleResourcesC2ItemType]] = js.undefined
}
object WebExtensionManifest {
  
  inline def apply(manifest_version: Double, name: String, version: String): WebExtensionManifest = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ActionManifest): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setBackground(
      value: WebExtensionManifestBackgroundC1Type | WebExtensionManifestBackgroundC2Type | WebExtensionManifestBackgroundC3Type
    ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBrowser_action(value: ActionManifest): Self = StObject.set(x, "browser_action", value.asInstanceOf[js.Any])
    
    inline def setBrowser_actionUndefined: Self = StObject.set(x, "browser_action", js.undefined)
    
    inline def setChrome_settings_overrides(value: WebExtensionManifestChromeSettingsOverridesType): Self = StObject.set(x, "chrome_settings_overrides", value.asInstanceOf[js.Any])
    
    inline def setChrome_settings_overridesUndefined: Self = StObject.set(x, "chrome_settings_overrides", js.undefined)
    
    inline def setChrome_url_overrides(value: WebExtensionManifestChromeUrlOverridesType): Self = StObject.set(x, "chrome_url_overrides", value.asInstanceOf[js.Any])
    
    inline def setChrome_url_overridesUndefined: Self = StObject.set(x, "chrome_url_overrides", js.undefined)
    
    inline def setCommands(value: Record[String, WebExtensionManifestCommandsType]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setContent_scripts(value: js.Array[ContentScript]): Self = StObject.set(x, "content_scripts", value.asInstanceOf[js.Any])
    
    inline def setContent_scriptsUndefined: Self = StObject.set(x, "content_scripts", js.undefined)
    
    inline def setContent_scriptsVarargs(value: ContentScript*): Self = StObject.set(x, "content_scripts", js.Array(value*))
    
    inline def setContent_security_policy(value: String | WebExtensionManifestContentSecurityPolicyC2Type): Self = StObject.set(x, "content_security_policy", value.asInstanceOf[js.Any])
    
    inline def setContent_security_policyUndefined: Self = StObject.set(x, "content_security_policy", js.undefined)
    
    inline def setDefault_locale(value: String): Self = StObject.set(x, "default_locale", value.asInstanceOf[js.Any])
    
    inline def setDefault_localeUndefined: Self = StObject.set(x, "default_locale", js.undefined)
    
    inline def setDevtools_page(value: ExtensionURL): Self = StObject.set(x, "devtools_page", value.asInstanceOf[js.Any])
    
    inline def setDevtools_pageUndefined: Self = StObject.set(x, "devtools_page", js.undefined)
    
    inline def setExperiment_apis(value: WebExtensionManifestExperimentApisType): Self = StObject.set(x, "experiment_apis", value.asInstanceOf[js.Any])
    
    inline def setExperiment_apisUndefined: Self = StObject.set(x, "experiment_apis", js.undefined)
    
    inline def setGranted_host_permissions(value: Boolean): Self = StObject.set(x, "granted_host_permissions", value.asInstanceOf[js.Any])
    
    inline def setGranted_host_permissionsUndefined: Self = StObject.set(x, "granted_host_permissions", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHost_permissions(value: js.Array[MatchPattern]): Self = StObject.set(x, "host_permissions", value.asInstanceOf[js.Any])
    
    inline def setHost_permissionsUndefined: Self = StObject.set(x, "host_permissions", js.undefined)
    
    inline def setHost_permissionsVarargs(value: MatchPattern*): Self = StObject.set(x, "host_permissions", js.Array(value*))
    
    inline def setIcons(value: Record[String, ExtensionFileUrl]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIncognito(value: WebExtensionManifestIncognitoEnum): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
    
    inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    
    inline def setL10n_resources(value: js.Array[String]): Self = StObject.set(x, "l10n_resources", value.asInstanceOf[js.Any])
    
    inline def setL10n_resourcesUndefined: Self = StObject.set(x, "l10n_resources", js.undefined)
    
    inline def setL10n_resourcesVarargs(value: String*): Self = StObject.set(x, "l10n_resources", js.Array(value*))
    
    inline def setMinimum_chrome_version(value: String): Self = StObject.set(x, "minimum_chrome_version", value.asInstanceOf[js.Any])
    
    inline def setMinimum_chrome_versionUndefined: Self = StObject.set(x, "minimum_chrome_version", js.undefined)
    
    inline def setMinimum_opera_version(value: String): Self = StObject.set(x, "minimum_opera_version", value.asInstanceOf[js.Any])
    
    inline def setMinimum_opera_versionUndefined: Self = StObject.set(x, "minimum_opera_version", js.undefined)
    
    inline def setOmnibox(value: WebExtensionManifestOmniboxType): Self = StObject.set(x, "omnibox", value.asInstanceOf[js.Any])
    
    inline def setOmniboxUndefined: Self = StObject.set(x, "omnibox", js.undefined)
    
    inline def setOptional_permissions(value: js.Array[OptionalPermissionOrOrigin]): Self = StObject.set(x, "optional_permissions", value.asInstanceOf[js.Any])
    
    inline def setOptional_permissionsUndefined: Self = StObject.set(x, "optional_permissions", js.undefined)
    
    inline def setOptional_permissionsVarargs(value: OptionalPermissionOrOrigin*): Self = StObject.set(x, "optional_permissions", js.Array(value*))
    
    inline def setOptions_ui(value: WebExtensionManifestOptionsUiType): Self = StObject.set(x, "options_ui", value.asInstanceOf[js.Any])
    
    inline def setOptions_uiUndefined: Self = StObject.set(x, "options_ui", js.undefined)
    
    inline def setPage_action(value: WebExtensionManifestPageActionType): Self = StObject.set(x, "page_action", value.asInstanceOf[js.Any])
    
    inline def setPage_actionUndefined: Self = StObject.set(x, "page_action", js.undefined)
    
    inline def setPermissions(value: js.Array[Permission | PermissionOrOrigin]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: (Permission | PermissionOrOrigin)*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setProtocol_handlers(value: js.Array[ProtocolHandler]): Self = StObject.set(x, "protocol_handlers", value.asInstanceOf[js.Any])
    
    inline def setProtocol_handlersUndefined: Self = StObject.set(x, "protocol_handlers", js.undefined)
    
    inline def setProtocol_handlersVarargs(value: ProtocolHandler*): Self = StObject.set(x, "protocol_handlers", js.Array(value*))
    
    inline def setSidebar_action(value: WebExtensionManifestSidebarActionType): Self = StObject.set(x, "sidebar_action", value.asInstanceOf[js.Any])
    
    inline def setSidebar_actionUndefined: Self = StObject.set(x, "sidebar_action", js.undefined)
    
    inline def setTheme_experiment(value: ThemeExperiment): Self = StObject.set(x, "theme_experiment", value.asInstanceOf[js.Any])
    
    inline def setTheme_experimentUndefined: Self = StObject.set(x, "theme_experiment", js.undefined)
    
    inline def setUser_scripts(value: WebExtensionManifestUserScriptsType): Self = StObject.set(x, "user_scripts", value.asInstanceOf[js.Any])
    
    inline def setUser_scriptsUndefined: Self = StObject.set(x, "user_scripts", js.undefined)
    
    inline def setWeb_accessible_resources(value: js.Array[String | WebExtensionManifestWebAccessibleResourcesC2ItemType]): Self = StObject.set(x, "web_accessible_resources", value.asInstanceOf[js.Any])
    
    inline def setWeb_accessible_resourcesUndefined: Self = StObject.set(x, "web_accessible_resources", js.undefined)
    
    inline def setWeb_accessible_resourcesVarargs(value: (String | WebExtensionManifestWebAccessibleResourcesC2ItemType)*): Self = StObject.set(x, "web_accessible_resources", js.Array(value*))
  }
}

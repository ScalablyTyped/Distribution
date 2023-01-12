package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.namespacesManifestMod.Manifest.ExtensionID
import typings.webextensionPolyfill.namespacesManifestMod.Manifest.HttpURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesManagementMod {
  
  object Management {
    
    /**
      * A reason the item is disabled.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.unknown
      - typings.webextensionPolyfill.webextensionPolyfillStrings.permissions_increase
    */
    trait ExtensionDisabledReason extends StObject
    object ExtensionDisabledReason {
      
      inline def permissions_increase: typings.webextensionPolyfill.webextensionPolyfillStrings.permissions_increase = "permissions_increase".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.permissions_increase]
      
      inline def unknown: typings.webextensionPolyfill.webextensionPolyfillStrings.unknown = "unknown".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.unknown]
    }
    
    /**
      * Information about an installed extension.
      */
    trait ExtensionInfo extends StObject {
      
      /**
        * The description of this extension.
        */
      var description: String
      
      /**
        * A reason the item is disabled.
        * Optional.
        */
      var disabledReason: js.UndefOr[ExtensionDisabledReason] = js.undefined
      
      /**
        * Whether it is currently enabled or disabled.
        */
      var enabled: Boolean
      
      /**
        * The URL of the homepage of this extension.
        * Optional.
        */
      var homepageUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Returns a list of host based permissions.
        * Optional.
        */
      var hostPermissions: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * A list of icon information. Note that this just reflects what was declared in the manifest,
        * and the actual image at that url may be larger or smaller than what was declared,
        * so you might consider using explicit width and height attributes on img tags referencing these images.
        * See the <a href='manifest/icons'>manifest documentation on icons</a> for more details.
        * Optional.
        */
      var icons: js.UndefOr[js.Array[IconInfo]] = js.undefined
      
      /**
        * The extension's unique identifier.
        */
      var id: String
      
      /**
        * How the extension was installed.
        */
      var installType: ExtensionInstallType
      
      /**
        * Whether this extension can be disabled or uninstalled by the user.
        */
      var mayDisable: Boolean
      
      /**
        * The name of this extension.
        */
      var name: String
      
      /**
        * The url for the item's options page, if it has one.
        */
      var optionsUrl: String
      
      /**
        * Returns a list of API based permissions.
        * Optional.
        */
      var permissions: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * A short version of the name of this extension.
        * Optional.
        */
      var shortName: js.UndefOr[String] = js.undefined
      
      /**
        * The type of this extension, 'extension' or 'theme'.
        */
      var `type`: ExtensionType
      
      /**
        * The update URL of this extension.
        * Optional.
        */
      var updateUrl: js.UndefOr[String] = js.undefined
      
      /**
        * The <a href='manifest/version'>version</a> of this extension.
        */
      var version: String
      
      /**
        * The <a href='manifest/version#version_name'>version name</a> of this extension if the manifest specified one.
        * Optional.
        */
      var versionName: js.UndefOr[String] = js.undefined
    }
    object ExtensionInfo {
      
      inline def apply(
        description: String,
        enabled: Boolean,
        id: String,
        installType: ExtensionInstallType,
        mayDisable: Boolean,
        name: String,
        optionsUrl: String,
        `type`: ExtensionType,
        version: String
      ): ExtensionInfo = {
        val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installType = installType.asInstanceOf[js.Any], mayDisable = mayDisable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsUrl = optionsUrl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExtensionInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ExtensionInfo] (val x: Self) extends AnyVal {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDisabledReason(value: ExtensionDisabledReason): Self = StObject.set(x, "disabledReason", value.asInstanceOf[js.Any])
        
        inline def setDisabledReasonUndefined: Self = StObject.set(x, "disabledReason", js.undefined)
        
        inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        inline def setHomepageUrl(value: String): Self = StObject.set(x, "homepageUrl", value.asInstanceOf[js.Any])
        
        inline def setHomepageUrlUndefined: Self = StObject.set(x, "homepageUrl", js.undefined)
        
        inline def setHostPermissions(value: js.Array[String]): Self = StObject.set(x, "hostPermissions", value.asInstanceOf[js.Any])
        
        inline def setHostPermissionsUndefined: Self = StObject.set(x, "hostPermissions", js.undefined)
        
        inline def setHostPermissionsVarargs(value: String*): Self = StObject.set(x, "hostPermissions", js.Array(value*))
        
        inline def setIcons(value: js.Array[IconInfo]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
        
        inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
        
        inline def setIconsVarargs(value: IconInfo*): Self = StObject.set(x, "icons", js.Array(value*))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setInstallType(value: ExtensionInstallType): Self = StObject.set(x, "installType", value.asInstanceOf[js.Any])
        
        inline def setMayDisable(value: Boolean): Self = StObject.set(x, "mayDisable", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOptionsUrl(value: String): Self = StObject.set(x, "optionsUrl", value.asInstanceOf[js.Any])
        
        inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
        
        inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
        
        inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
        
        inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
        
        inline def setType(value: ExtensionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setUpdateUrl(value: String): Self = StObject.set(x, "updateUrl", value.asInstanceOf[js.Any])
        
        inline def setUpdateUrlUndefined: Self = StObject.set(x, "updateUrl", js.undefined)
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
        
        inline def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
      }
    }
    
    /**
      * How the extension was installed. One of<br><var>development</var>: The extension was loaded unpacked in developer mode,
      * <br><var>normal</var>: The extension was installed normally via an .xpi file,<br><var>sideload</var>
      * : The extension was installed by other software on the machine,<br><var>other</var>
      * : The extension was installed by other means.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.development
      - typings.webextensionPolyfill.webextensionPolyfillStrings.normal
      - typings.webextensionPolyfill.webextensionPolyfillStrings.sideload
      - typings.webextensionPolyfill.webextensionPolyfillStrings.other
    */
    trait ExtensionInstallType extends StObject
    object ExtensionInstallType {
      
      inline def development: typings.webextensionPolyfill.webextensionPolyfillStrings.development = "development".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.development]
      
      inline def normal: typings.webextensionPolyfill.webextensionPolyfillStrings.normal = "normal".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.normal]
      
      inline def other: typings.webextensionPolyfill.webextensionPolyfillStrings.other = "other".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.other]
      
      inline def sideload: typings.webextensionPolyfill.webextensionPolyfillStrings.sideload = "sideload".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.sideload]
    }
    
    /**
      * The type of this extension, 'extension' or 'theme'.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.`extension`
      - typings.webextensionPolyfill.webextensionPolyfillStrings.theme
    */
    trait ExtensionType extends StObject
    object ExtensionType {
      
      inline def `extension`: typings.webextensionPolyfill.webextensionPolyfillStrings.`extension` = "extension".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.`extension`]
      
      inline def theme: typings.webextensionPolyfill.webextensionPolyfillStrings.theme = "theme".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.theme]
    }
    
    /**
      * Information about an icon belonging to an extension.
      */
    trait IconInfo extends StObject {
      
      /**
        * A number representing the width and height of the icon. Likely values include (but are not limited to) 128, 48, 24,
        * and 16.
        */
      var size: Double
      
      /**
        * The URL for this icon image. To display a grayscale version of the icon (to indicate that an extension is disabled,
        * for example), append <code>?grayscale=true</code> to the URL.
        */
      var url: String
    }
    object IconInfo {
      
      inline def apply(size: Double, url: String): IconInfo = {
        val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[IconInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IconInfo] (val x: Self) extends AnyVal {
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    trait InstallCallbackResultType extends StObject {
      
      var id: ExtensionID
    }
    object InstallCallbackResultType {
      
      inline def apply(id: ExtensionID): InstallCallbackResultType = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[InstallCallbackResultType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: InstallCallbackResultType] (val x: Self) extends AnyVal {
        
        inline def setId(value: ExtensionID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    trait InstallOptionsType extends StObject {
      
      /**
        * A hash of the XPI file, using sha256 or stronger.
        * Optional.
        */
      var hash: js.UndefOr[String] = js.undefined
      
      /**
        * URL pointing to the XPI file on addons.mozilla.org or similar.
        */
      var url: HttpURL
    }
    object InstallOptionsType {
      
      inline def apply(url: HttpURL): InstallOptionsType = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[InstallOptionsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: InstallOptionsType] (val x: Self) extends AnyVal {
        
        inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
        
        inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
        
        inline def setUrl(value: HttpURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Returns information about the installed extension that has the given ID.
        *
        * @param id The ID from an item of $(ref:management.ExtensionInfo).
        */
      def get(id: ExtensionID): js.Promise[ExtensionInfo] = js.native
      
      /**
        * Returns a list of information about installed extensions.
        */
      def getAll(): js.Promise[js.Array[ExtensionInfo]] = js.native
      
      /**
        * Returns information about the calling extension. Note: This function can be used without requesting the 'management'
        * permission in the manifest.
        */
      def getSelf(): js.Promise[ExtensionInfo] = js.native
      
      /**
        * Installs and enables a theme extension from the given url.
        *
        * @param options
        */
      def install(options: InstallOptionsType): js.Promise[InstallCallbackResultType] = js.native
      
      /**
        * Fired when an addon has been disabled.
        *
        * @param info
        */
      var onDisabled: Event[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
      
      /**
        * Fired when an addon has been enabled.
        *
        * @param info
        */
      var onEnabled: Event[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
      
      /**
        * Fired when an addon has been installed.
        *
        * @param info
        */
      var onInstalled: Event[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
      
      /**
        * Fired when an addon has been uninstalled.
        *
        * @param info
        */
      var onUninstalled: Event[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
      
      /**
        * Enables or disables the given add-on.
        *
        * @param id ID of the add-on to enable/disable.
        * @param enabled Whether to enable or disable the add-on.
        */
      def setEnabled(id: String, enabled: Boolean): js.Promise[Unit] = js.native
      
      /**
        * Uninstalls the calling extension. Note: This function can be used without requesting the 'management' permission in the
        * manifest.
        *
        * @param options Optional.
        */
      def uninstallSelf(): js.Promise[Unit] = js.native
      def uninstallSelf(options: UninstallSelfOptionsType): js.Promise[Unit] = js.native
    }
    
    trait UninstallSelfOptionsType extends StObject {
      
      /**
        * The message to display to a user when being asked to confirm removal of the extension.
        * Optional.
        */
      var dialogMessage: js.UndefOr[String] = js.undefined
      
      /**
        * Whether or not a confirm-uninstall dialog should prompt the user. Defaults to false.
        * Optional.
        */
      var showConfirmDialog: js.UndefOr[Boolean] = js.undefined
    }
    object UninstallSelfOptionsType {
      
      inline def apply(): UninstallSelfOptionsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UninstallSelfOptionsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: UninstallSelfOptionsType] (val x: Self) extends AnyVal {
        
        inline def setDialogMessage(value: String): Self = StObject.set(x, "dialogMessage", value.asInstanceOf[js.Any])
        
        inline def setDialogMessageUndefined: Self = StObject.set(x, "dialogMessage", js.undefined)
        
        inline def setShowConfirmDialog(value: Boolean): Self = StObject.set(x, "showConfirmDialog", value.asInstanceOf[js.Any])
        
        inline def setShowConfirmDialogUndefined: Self = StObject.set(x, "showConfirmDialog", js.undefined)
      }
    }
  }
}

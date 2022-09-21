package typings.webAppManifest

import typings.std.OrientationLockType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.webAppManifest.webAppManifestStrings.fullscreen
    - typings.webAppManifest.webAppManifestStrings.standalone
    - typings.webAppManifest.webAppManifestStrings.`minimal-ui`
    - typings.webAppManifest.webAppManifestStrings.browser
  */
  trait DisplayModeType extends StObject
  object DisplayModeType {
    
    inline def browser: typings.webAppManifest.webAppManifestStrings.browser = "browser".asInstanceOf[typings.webAppManifest.webAppManifestStrings.browser]
    
    inline def fullscreen: typings.webAppManifest.webAppManifestStrings.fullscreen = "fullscreen".asInstanceOf[typings.webAppManifest.webAppManifestStrings.fullscreen]
    
    inline def `minimal-ui`: typings.webAppManifest.webAppManifestStrings.`minimal-ui` = "minimal-ui".asInstanceOf[typings.webAppManifest.webAppManifestStrings.`minimal-ui`]
    
    inline def standalone: typings.webAppManifest.webAppManifestStrings.standalone = "standalone".asInstanceOf[typings.webAppManifest.webAppManifestStrings.standalone]
  }
  
  trait ExternalApplicationResource extends StObject {
    
    /**
      * The `fingerprints` member of an `ExternalApplicationResource` dictionary represents an array of
      * `Fingerprint`s.
      *
      * @see https://w3c.github.io/manifest/#fingerprints-member
      */
    var fingerprints: js.UndefOr[js.Array[Fingerprint]] = js.undefined
    
    /**
      * The `id` member of an ExternalApplicationResource dictionary represents the id which is used to
      * represent the application on the platform.
      *
      * @see https://w3c.github.io/manifest/#id-member
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * The `min_version` member of an `ExternalApplicationResource` dictionary represents the minimum version
      * of the application that is considered related to this web app.
      *
      * @see https://w3c.github.io/manifest/#min_version-member
      */
    var min_version: js.UndefOr[String] = js.undefined
    
    /**
      * The `platform` member represents the platform to which a containing object applies.
      *
      * @see https://w3c.github.io/manifest/#platform-member-0
      */
    var platform: String
    
    /**
      * The `url` member of an ExternalApplicationResource dictionary represents the
      * URL at which the application can be found.
      *
      * @see https://w3c.github.io/manifest/#url-member-0
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object ExternalApplicationResource {
    
    inline def apply(platform: String): ExternalApplicationResource = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalApplicationResource]
    }
    
    extension [Self <: ExternalApplicationResource](x: Self) {
      
      inline def setFingerprints(value: js.Array[Fingerprint]): Self = StObject.set(x, "fingerprints", value.asInstanceOf[js.Any])
      
      inline def setFingerprintsUndefined: Self = StObject.set(x, "fingerprints", js.undefined)
      
      inline def setFingerprintsVarargs(value: Fingerprint*): Self = StObject.set(x, "fingerprints", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMin_version(value: String): Self = StObject.set(x, "min_version", value.asInstanceOf[js.Any])
      
      inline def setMin_versionUndefined: Self = StObject.set(x, "min_version", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Fingerprint extends StObject {
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Fingerprint {
    
    inline def apply(): Fingerprint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fingerprint]
    }
    
    extension [Self <: Fingerprint](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ImageResource extends StObject {
    
    /**
      * The `platform` member represents the platform to which a containing object applies.
      *
      * @see https://w3c.github.io/manifest/#platform-member
      */
    var platform: js.UndefOr[String] = js.undefined
    
    /**
      * The purpose member is an unordered set of unique space-separated tokens that are ASCII case-
      * insensitive.
      *
      * @see https://w3c.github.io/manifest/#purpose-member
      */
    var purpose: js.UndefOr[String] = js.undefined
    
    /**
      * The `sizes` member of an ImageResource is a string consisting of an unordered set of unique space-
      * separated tokens which are ASCII case-insensitive that represents the dimensions of an image.
      *
      * @see https://w3c.github.io/manifest/#sizes-member
      */
    var sizes: js.UndefOr[String] = js.undefined
    
    /**
      * The `src` member of an `ImageResource` is a URL from which a user agent can fetch the image's data.
      *
      * @see https://w3c.github.io/manifest/#src-member
      */
    var src: String
    
    /**
      * The `type` member of an `ImageResource` is a hint as to the MIME type of the image.
      *
      * @see https://w3c.github.io/manifest/#type-member
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ImageResource {
    
    inline def apply(src: String): ImageResource = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageResource]
    }
    
    extension [Self <: ImageResource](x: Self) {
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
      
      inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ShortcutItem extends StObject {
    
    /**
      * The `description` member of a `ShortcutItem` is a `string` that allows the developer to describe the
      * purpose of the shortcut.
      *
      * @see https://w3c.github.io/manifest/#description-member-0
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The `icons` member of an `ShortcutItem` member is an `array` of `ImageResource`s that can serve as iconic
      * representations of the shortcut in various contexts.
      *
      * @see https://w3c.github.io/manifest/#icons-member-0
      */
    var icons: js.UndefOr[js.Array[ImageResource]] = js.undefined
    
    /**
      * The `name` member of a `ShortcutItem` is a `string` that represents the name of the shortcut as it is usually
      * displayed to the user in a context menu.
      *
      * @see https://w3c.github.io/manifest/#name-member-0
      */
    var name: String
    
    /**
      * The `short_name` member of a `ShortcutItem` is a `string` that represents a short version of the name of
      * the shortcut.
      *
      * @see https://w3c.github.io/manifest/#short_name-member-0
      */
    var short_name: js.UndefOr[String] = js.undefined
    
    /**
      * The `url` member of a `ShortcutItem` is the URL within the application's scope that opens when the
      * associated shortcut is activated.
      *
      * @see https://w3c.github.io/manifest/#url-member
      */
    var url: String
  }
  object ShortcutItem {
    
    inline def apply(name: String, url: String): ShortcutItem = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortcutItem]
    }
    
    extension [Self <: ShortcutItem](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIcons(value: js.Array[ImageResource]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setIconsVarargs(value: ImageResource*): Self = StObject.set(x, "icons", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
      
      inline def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webAppManifest.webAppManifestStrings.ltr
    - typings.webAppManifest.webAppManifestStrings.rtl
    - typings.webAppManifest.webAppManifestStrings.auto
  */
  trait TextDirectionType extends StObject
  object TextDirectionType {
    
    inline def auto: typings.webAppManifest.webAppManifestStrings.auto = "auto".asInstanceOf[typings.webAppManifest.webAppManifestStrings.auto]
    
    inline def ltr: typings.webAppManifest.webAppManifestStrings.ltr = "ltr".asInstanceOf[typings.webAppManifest.webAppManifestStrings.ltr]
    
    inline def rtl: typings.webAppManifest.webAppManifestStrings.rtl = "rtl".asInstanceOf[typings.webAppManifest.webAppManifestStrings.rtl]
  }
  
  trait WebAppManifest extends StObject {
    
    /**
      * The `background_color` member describes the expected background color of the web application.
      *
      * @see https://w3c.github.io/manifest/#background_color-member
      */
    var background_color: js.UndefOr[String] = js.undefined
    
    /**
      * The `categories` member describes the expected application categories to which the web application belongs.
      *
      * @see https://w3c.github.io/manifest/#categories-member
      */
    var categories: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The `description` member allows the developer to describe the purpose of the web application.
      *
      * @see https://w3c.github.io/manifest/#description-member
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The `dir` member specifies the base direction for the directionality-capable members of the manifest.
      *
      * @see https://w3c.github.io/manifest/#dir-member
      */
    var dir: js.UndefOr[TextDirectionType] = js.undefined
    
    /**
      * The `display` member is a `DisplayModeType`, whose value is one of display modes values.
      *
      * @see https://w3c.github.io/manifest/#display-member
      */
    var display: js.UndefOr[DisplayModeType] = js.undefined
    
    /**
      * The `iarc_rating_id` member is a `string` that represents the International Age Rating Coalition (IARC)
      * certification code of the web application.
      *
      * @see https://w3c.github.io/manifest/#iarc_rating_id-member
      */
    var iarc_rating_id: js.UndefOr[String] = js.undefined
    
    /**
      * The `icons` member is an array of `ImageResource`s that can serve as iconic representations of the web
      * application in various contexts.
      *
      * @see https://w3c.github.io/manifest/#icons-member
      */
    var icons: js.UndefOr[js.Array[ImageResource]] = js.undefined
    
    /**
      * The `lang` member is a language tag (`string`) that specifies the primary language for the values of
      * the manifest's directionality-capable members (as knowing the language can also help with directionality).
      *
      * @see https://w3c.github.io/manifest/#lang-member
      */
    var lang: js.UndefOr[String] = js.undefined
    
    /**
      * The `name` member is a `string` that represents the name of the web application as it is usually displayed
      * to the user (e.g., amongst a list of other applications, or as a label for an icon).
      *
      * @see https://w3c.github.io/manifest/#name-member
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The `orientation` member is a string that serves as the default screen orientation for all top-level
      * browsing contexts of the web application.
      *
      * @see https://w3c.github.io/manifest/#orientation-member
      */
    var orientation: js.UndefOr[OrientationLockType] = js.undefined
    
    /**
      * The `prefer_related_applications` member is a boolean value that is used as a hint for the user agent
      * to say that related applications should be preferred over the web application.
      *
      * @see https://w3c.github.io/manifest/#prefer_related_applications-member
      */
    var prefer_related_applications: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The `related_applications` member lists related applications and serves as an indication of such a
      * relationship between web application and related applications.
      *
      * @see https://w3c.github.io/manifest/#related_applications-member
      */
    var related_applications: js.UndefOr[js.Array[ExternalApplicationResource]] = js.undefined
    
    /**
      * The `scope` member is a string that represents the navigation scope of this web application's
      * application context.
      *
      * @see https://w3c.github.io/manifest/#scope-member
      */
    var scope: js.UndefOr[String] = js.undefined
    
    /**
      * The `screenshots` member is an array of `ImageResource`s, representing the web application in common
      * usage scenarios.
      *
      * @see https://w3c.github.io/manifest/#screenshots-member
      */
    var screenshots: js.UndefOr[js.Array[ImageResource]] = js.undefined
    
    /**
      * The `short_name` member is a `string` that represents a short version of the name of the web application.
      *
      * @see https://w3c.github.io/manifest/#short_name-member
      */
    var short_name: js.UndefOr[String] = js.undefined
    
    /**
      * The `shortcuts` member is an `array` of `ShortcutItem`s that provide access to key tasks within a web application.
      *
      * @see https://w3c.github.io/manifest/#shortcuts-member
      */
    var shortcuts: js.UndefOr[js.Array[ShortcutItem]] = js.undefined
    
    /**
      * The `start_url` member is a `string` that represents the start URL , which is URL that the developer
      * would prefer the user agent load when the user launches the web application (e.g., when the user
      * clicks on the icon of the web application from a device's application menu or homescreen).
      *
      * @see https://w3c.github.io/manifest/#start_url-member
      */
    var start_url: js.UndefOr[String] = js.undefined
    
    /**
      * The `theme_color` member serves as the default theme color for an application context.
      *
      * @see https://w3c.github.io/manifest/#theme_color-member
      */
    var theme_color: js.UndefOr[String] = js.undefined
  }
  object WebAppManifest {
    
    inline def apply(): WebAppManifest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebAppManifest]
    }
    
    extension [Self <: WebAppManifest](x: Self) {
      
      inline def setBackground_color(value: String): Self = StObject.set(x, "background_color", value.asInstanceOf[js.Any])
      
      inline def setBackground_colorUndefined: Self = StObject.set(x, "background_color", js.undefined)
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDir(value: TextDirectionType): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDisplay(value: DisplayModeType): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setIarc_rating_id(value: String): Self = StObject.set(x, "iarc_rating_id", value.asInstanceOf[js.Any])
      
      inline def setIarc_rating_idUndefined: Self = StObject.set(x, "iarc_rating_id", js.undefined)
      
      inline def setIcons(value: js.Array[ImageResource]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setIconsVarargs(value: ImageResource*): Self = StObject.set(x, "icons", js.Array(value*))
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrientation(value: OrientationLockType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPrefer_related_applications(value: Boolean): Self = StObject.set(x, "prefer_related_applications", value.asInstanceOf[js.Any])
      
      inline def setPrefer_related_applicationsUndefined: Self = StObject.set(x, "prefer_related_applications", js.undefined)
      
      inline def setRelated_applications(value: js.Array[ExternalApplicationResource]): Self = StObject.set(x, "related_applications", value.asInstanceOf[js.Any])
      
      inline def setRelated_applicationsUndefined: Self = StObject.set(x, "related_applications", js.undefined)
      
      inline def setRelated_applicationsVarargs(value: ExternalApplicationResource*): Self = StObject.set(x, "related_applications", js.Array(value*))
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScreenshots(value: js.Array[ImageResource]): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
      
      inline def setScreenshotsUndefined: Self = StObject.set(x, "screenshots", js.undefined)
      
      inline def setScreenshotsVarargs(value: ImageResource*): Self = StObject.set(x, "screenshots", js.Array(value*))
      
      inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
      
      inline def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
      
      inline def setShortcuts(value: js.Array[ShortcutItem]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      inline def setShortcutsVarargs(value: ShortcutItem*): Self = StObject.set(x, "shortcuts", js.Array(value*))
      
      inline def setStart_url(value: String): Self = StObject.set(x, "start_url", value.asInstanceOf[js.Any])
      
      inline def setStart_urlUndefined: Self = StObject.set(x, "start_url", js.undefined)
      
      inline def setTheme_color(value: String): Self = StObject.set(x, "theme_color", value.asInstanceOf[js.Any])
      
      inline def setTheme_colorUndefined: Self = StObject.set(x, "theme_color", js.undefined)
    }
  }
}

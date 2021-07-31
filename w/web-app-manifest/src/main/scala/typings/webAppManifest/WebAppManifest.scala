package typings.webAppManifest

import typings.std.OrientationLockType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `manifest` is a JSON document that contains startup parameters and application defaults for
  * when a web application is launched.
  *
  * @see https://w3c.github.io/manifest/#webappmanifest-dictionary
  */
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
  
  @scala.inline
  def apply(): WebAppManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAppManifest]
  }
  
  @scala.inline
  implicit class WebAppManifestMutableBuilder[Self <: WebAppManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground_color(value: String): Self = StObject.set(x, "background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground_colorUndefined: Self = StObject.set(x, "background_color", js.undefined)
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDir(value: TextDirectionType): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDisplay(value: DisplayModeType): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setIarc_rating_id(value: String): Self = StObject.set(x, "iarc_rating_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIarc_rating_idUndefined: Self = StObject.set(x, "iarc_rating_id", js.undefined)
    
    @scala.inline
    def setIcons(value: js.Array[ImageResource]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setIconsVarargs(value: ImageResource*): Self = StObject.set(x, "icons", js.Array(value :_*))
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrientation(value: OrientationLockType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPrefer_related_applications(value: Boolean): Self = StObject.set(x, "prefer_related_applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefer_related_applicationsUndefined: Self = StObject.set(x, "prefer_related_applications", js.undefined)
    
    @scala.inline
    def setRelated_applications(value: js.Array[ExternalApplicationResource]): Self = StObject.set(x, "related_applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelated_applicationsUndefined: Self = StObject.set(x, "related_applications", js.undefined)
    
    @scala.inline
    def setRelated_applicationsVarargs(value: ExternalApplicationResource*): Self = StObject.set(x, "related_applications", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScreenshots(value: js.Array[ImageResource]): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotsUndefined: Self = StObject.set(x, "screenshots", js.undefined)
    
    @scala.inline
    def setScreenshotsVarargs(value: ImageResource*): Self = StObject.set(x, "screenshots", js.Array(value :_*))
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
    
    @scala.inline
    def setShortcuts(value: js.Array[ShortcutItem]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
    
    @scala.inline
    def setShortcutsVarargs(value: ShortcutItem*): Self = StObject.set(x, "shortcuts", js.Array(value :_*))
    
    @scala.inline
    def setStart_url(value: String): Self = StObject.set(x, "start_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_urlUndefined: Self = StObject.set(x, "start_url", js.undefined)
    
    @scala.inline
    def setTheme_color(value: String): Self = StObject.set(x, "theme_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme_colorUndefined: Self = StObject.set(x, "theme_color", js.undefined)
  }
}

package typings.webAppManifest

import typings.std.OrientationLockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `manifest` is a JSON document that contains startup parameters and application defaults for
  * when a web application is launched.
  *
  * @see https://w3c.github.io/manifest/#webappmanifest-dictionary
  */
@js.native
trait WebAppManifest extends js.Object {
  /**
    * The `background_color` member describes the expected background color of the web application.
    *
    * @see https://w3c.github.io/manifest/#background_color-member
    */
  var background_color: js.UndefOr[String] = js.native
  /**
    * The `categories` member describes the expected application categories to which the web application belongs.
    *
    * @see https://w3c.github.io/manifest/#categories-member
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * The `description` member allows the developer to describe the purpose of the web application.
    *
    * @see https://w3c.github.io/manifest/#description-member
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The `dir` member specifies the base direction for the directionality-capable members of the manifest.
    *
    * @see https://w3c.github.io/manifest/#dir-member
    */
  var dir: js.UndefOr[TextDirectionType] = js.native
  /**
    * The `display` member is a `DisplayModeType`, whose value is one of display modes values.
    *
    * @see https://w3c.github.io/manifest/#display-member
    */
  var display: js.UndefOr[DisplayModeType] = js.native
  /**
    * The `iarc_rating_id` member is a `string` that represents the International Age Rating Coalition (IARC)
    * certification code of the web application.
    *
    * @see https://w3c.github.io/manifest/#iarc_rating_id-member
    */
  var iarc_rating_id: js.UndefOr[String] = js.native
  /**
    * The `icons` member is an array of `ImageResource`s that can serve as iconic representations of the web
    * application in various contexts.
    *
    * @see https://w3c.github.io/manifest/#icons-member
    */
  var icons: js.UndefOr[js.Array[ImageResource]] = js.native
  /**
    * The `lang` member is a language tag (`string`) that specifies the primary language for the values of
    * the manifest's directionality-capable members (as knowing the language can also help with directionality).
    *
    * @see https://w3c.github.io/manifest/#lang-member
    */
  var lang: js.UndefOr[String] = js.native
  /**
    * The `name` member is a `string` that represents the name of the web application as it is usually displayed
    * to the user (e.g., amongst a list of other applications, or as a label for an icon).
    *
    * @see https://w3c.github.io/manifest/#name-member
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The `orientation` member is a string that serves as the default screen orientation for all top-level
    * browsing contexts of the web application.
    *
    * @see https://w3c.github.io/manifest/#orientation-member
    */
  var orientation: js.UndefOr[OrientationLockType] = js.native
  /**
    * The `prefer_related_applications` member is a boolean value that is used as a hint for the user agent
    * to say that related applications should be preferred over the web application.
    *
    * @see https://w3c.github.io/manifest/#prefer_related_applications-member
    */
  var prefer_related_applications: js.UndefOr[Boolean] = js.native
  /**
    * The `related_applications` member lists related applications and serves as an indication of such a
    * relationship between web application and related applications.
    *
    * @see https://w3c.github.io/manifest/#related_applications-member
    */
  var related_applications: js.UndefOr[js.Array[ExternalApplicationResource]] = js.native
  /**
    * The `scope` member is a string that represents the navigation scope of this web application's
    * application context.
    *
    * @see https://w3c.github.io/manifest/#scope-member
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * The `screenshots` member is an array of `ImageResource`s, representing the web application in common
    * usage scenarios.
    *
    * @see https://w3c.github.io/manifest/#screenshots-member
    */
  var screenshots: js.UndefOr[js.Array[ImageResource]] = js.native
  /**
    * The `short_name` member is a `string` that represents a short version of the name of the web application.
    *
    * @see https://w3c.github.io/manifest/#short_name-member
    */
  var short_name: js.UndefOr[String] = js.native
  /**
    * The `shortcuts` member is an `array` of `ShortcutItem`s that provide access to key tasks within a web application.
    *
    * @see https://w3c.github.io/manifest/#shortcuts-member
    */
  var shortcuts: js.UndefOr[js.Array[ShortcutItem]] = js.native
  /**
    * The `start_url` member is a `string` that represents the start URL , which is URL that the developer
    * would prefer the user agent load when the user launches the web application (e.g., when the user
    * clicks on the icon of the web application from a device's application menu or homescreen).
    *
    * @see https://w3c.github.io/manifest/#start_url-member
    */
  var start_url: js.UndefOr[String] = js.native
  /**
    * The `theme_color` member serves as the default theme color for an application context.
    *
    * @see https://w3c.github.io/manifest/#theme_color-member
    */
  var theme_color: js.UndefOr[String] = js.native
}

object WebAppManifest {
  @scala.inline
  def apply(): WebAppManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAppManifest]
  }
  @scala.inline
  implicit class WebAppManifestOps[Self <: WebAppManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackground_color(value: String): Self = this.set("background_color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground_color: Self = this.set("background_color", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDir(value: TextDirectionType): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDisplay(value: DisplayModeType): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setIarc_rating_id(value: String): Self = this.set("iarc_rating_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIarc_rating_id: Self = this.set("iarc_rating_id", js.undefined)
    @scala.inline
    def setIconsVarargs(value: ImageResource*): Self = this.set("icons", js.Array(value :_*))
    @scala.inline
    def setIcons(value: js.Array[ImageResource]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrientation(value: OrientationLockType): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPrefer_related_applications(value: Boolean): Self = this.set("prefer_related_applications", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefer_related_applications: Self = this.set("prefer_related_applications", js.undefined)
    @scala.inline
    def setRelated_applicationsVarargs(value: ExternalApplicationResource*): Self = this.set("related_applications", js.Array(value :_*))
    @scala.inline
    def setRelated_applications(value: js.Array[ExternalApplicationResource]): Self = this.set("related_applications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelated_applications: Self = this.set("related_applications", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setScreenshotsVarargs(value: ImageResource*): Self = this.set("screenshots", js.Array(value :_*))
    @scala.inline
    def setScreenshots(value: js.Array[ImageResource]): Self = this.set("screenshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenshots: Self = this.set("screenshots", js.undefined)
    @scala.inline
    def setShort_name(value: String): Self = this.set("short_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShort_name: Self = this.set("short_name", js.undefined)
    @scala.inline
    def setShortcutsVarargs(value: ShortcutItem*): Self = this.set("shortcuts", js.Array(value :_*))
    @scala.inline
    def setShortcuts(value: js.Array[ShortcutItem]): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortcuts: Self = this.set("shortcuts", js.undefined)
    @scala.inline
    def setStart_url(value: String): Self = this.set("start_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_url: Self = this.set("start_url", js.undefined)
    @scala.inline
    def setTheme_color(value: String): Self = this.set("theme_color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme_color: Self = this.set("theme_color", js.undefined)
  }
  
}


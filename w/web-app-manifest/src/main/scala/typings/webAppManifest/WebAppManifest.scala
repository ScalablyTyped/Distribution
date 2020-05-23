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
trait WebAppManifest extends js.Object {
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
  def apply(
    background_color: String = null,
    categories: js.Array[String] = null,
    description: String = null,
    dir: TextDirectionType = null,
    display: DisplayModeType = null,
    iarc_rating_id: String = null,
    icons: js.Array[ImageResource] = null,
    lang: String = null,
    name: String = null,
    orientation: OrientationLockType = null,
    prefer_related_applications: js.UndefOr[Boolean] = js.undefined,
    related_applications: js.Array[ExternalApplicationResource] = null,
    scope: String = null,
    screenshots: js.Array[ImageResource] = null,
    short_name: String = null,
    shortcuts: js.Array[ShortcutItem] = null,
    start_url: String = null,
    theme_color: String = null
  ): WebAppManifest = {
    val __obj = js.Dynamic.literal()
    if (background_color != null) __obj.updateDynamic("background_color")(background_color.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (iarc_rating_id != null) __obj.updateDynamic("iarc_rating_id")(iarc_rating_id.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(prefer_related_applications)) __obj.updateDynamic("prefer_related_applications")(prefer_related_applications.get.asInstanceOf[js.Any])
    if (related_applications != null) __obj.updateDynamic("related_applications")(related_applications.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (screenshots != null) __obj.updateDynamic("screenshots")(screenshots.asInstanceOf[js.Any])
    if (short_name != null) __obj.updateDynamic("short_name")(short_name.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (start_url != null) __obj.updateDynamic("start_url")(start_url.asInstanceOf[js.Any])
    if (theme_color != null) __obj.updateDynamic("theme_color")(theme_color.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAppManifest]
  }
}


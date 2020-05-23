package typings.webAppManifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each `ShortcutItem` represents a link to a key task or page within a web app.
  *
  * @see https://w3c.github.io/manifest/#shortcutitem-and-its-members
  */
trait ShortcutItem extends js.Object {
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
  @scala.inline
  def apply(
    name: String,
    url: String,
    description: String = null,
    icons: js.Array[ImageResource] = null,
    short_name: String = null
  ): ShortcutItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (short_name != null) __obj.updateDynamic("short_name")(short_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutItem]
  }
}


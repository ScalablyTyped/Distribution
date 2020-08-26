package typings.webAppManifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each `ShortcutItem` represents a link to a key task or page within a web app.
  *
  * @see https://w3c.github.io/manifest/#shortcutitem-and-its-members
  */
@js.native
trait ShortcutItem extends js.Object {
  /**
    * The `description` member of a `ShortcutItem` is a `string` that allows the developer to describe the
    * purpose of the shortcut.
    *
    * @see https://w3c.github.io/manifest/#description-member-0
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The `icons` member of an `ShortcutItem` member is an `array` of `ImageResource`s that can serve as iconic
    * representations of the shortcut in various contexts.
    *
    * @see https://w3c.github.io/manifest/#icons-member-0
    */
  var icons: js.UndefOr[js.Array[ImageResource]] = js.native
  /**
    * The `name` member of a `ShortcutItem` is a `string` that represents the name of the shortcut as it is usually
    * displayed to the user in a context menu.
    *
    * @see https://w3c.github.io/manifest/#name-member-0
    */
  var name: String = js.native
  /**
    * The `short_name` member of a `ShortcutItem` is a `string` that represents a short version of the name of
    * the shortcut.
    *
    * @see https://w3c.github.io/manifest/#short_name-member-0
    */
  var short_name: js.UndefOr[String] = js.native
  /**
    * The `url` member of a `ShortcutItem` is the URL within the application's scope that opens when the
    * associated shortcut is activated.
    *
    * @see https://w3c.github.io/manifest/#url-member
    */
  var url: String = js.native
}

object ShortcutItem {
  @scala.inline
  def apply(name: String, url: String): ShortcutItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutItem]
  }
  @scala.inline
  implicit class ShortcutItemOps[Self <: ShortcutItem] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIconsVarargs(value: ImageResource*): Self = this.set("icons", js.Array(value :_*))
    @scala.inline
    def setIcons(value: js.Array[ImageResource]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setShort_name(value: String): Self = this.set("short_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShort_name: Self = this.set("short_name", js.undefined)
  }
  
}


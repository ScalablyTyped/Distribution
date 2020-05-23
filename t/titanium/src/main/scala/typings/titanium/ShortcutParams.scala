package typings.titanium

import typings.titanium.Titanium.Contacts.Person
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object of options for <Titanium.UI.iOS.ApplicationShortcuts.addDynamicShortcut>.
  */
trait ShortcutParams extends js.Object {
  /**
    * The icon to be displayed on the application shortcut. You can either use one of the constants like
    * <Titanium.UI.iOS.SHORTCUT_ICON_TYPE_COMPOSE>, a local image specified by the image path or a reference to a
    * <Titanium.Contacts.Person>.
    */
  var icon: js.UndefOr[Double | java.lang.String | Person] = js.undefined
  /**
    * The unique key for the application shortcut. Equates to the underlying `UIApplicationShortcutItemIconType` key
    */
  var identifier: java.lang.String
  /**
    * The subtitle displayed on the application shortcut.
    */
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the application shortcut.
    */
  var title: java.lang.String
  /**
    * The userInfo of the application shortcut.
    */
  var userInfo: js.UndefOr[js.Any] = js.undefined
}

object ShortcutParams {
  @scala.inline
  def apply(
    identifier: java.lang.String,
    title: java.lang.String,
    icon: Double | java.lang.String | Person = null,
    subtitle: java.lang.String = null,
    userInfo: js.Any = null
  ): ShortcutParams = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutParams]
  }
}


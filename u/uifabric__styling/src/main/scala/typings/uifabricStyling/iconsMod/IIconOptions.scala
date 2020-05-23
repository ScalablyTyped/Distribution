package typings.uifabricStyling.iconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconOptions extends js.Object {
  /**
    * By default, registering the same set of icons will generate a console warning per duplicate icon
    * registered, because this scenario can create unexpected consequences.
    *
    * Some scenarios include:
    *
    * Icon set was previously registered using a different base url.
    * Icon set was previously registered but a different version was provided.
    * Icons in a previous registered set overlap with a new set.
    *
    * To simply ignore previously registered icons, you can specify to disable warnings. This means
    * that if an icon which was previous registered is registered again, it will be silently ignored.
    * However, consider whether the problems listed above will cause issues.
    **/
  var disableWarnings: Boolean
  /**
    * @deprecated
    * Use 'disableWarnings' instead.
    */
  var warnOnMissingIcons: js.UndefOr[Boolean] = js.undefined
}

object IIconOptions {
  @scala.inline
  def apply(disableWarnings: Boolean, warnOnMissingIcons: js.UndefOr[Boolean] = js.undefined): IIconOptions = {
    val __obj = js.Dynamic.literal(disableWarnings = disableWarnings.asInstanceOf[js.Any])
    if (!js.isUndefined(warnOnMissingIcons)) __obj.updateDynamic("warnOnMissingIcons")(warnOnMissingIcons.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconOptions]
  }
}


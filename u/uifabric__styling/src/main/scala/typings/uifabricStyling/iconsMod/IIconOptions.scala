package typings.uifabricStyling.iconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var disableWarnings: Boolean = js.native
  /**
    * @deprecated
    * Use 'disableWarnings' instead.
    */
  var warnOnMissingIcons: js.UndefOr[Boolean] = js.native
}

object IIconOptions {
  @scala.inline
  def apply(disableWarnings: Boolean): IIconOptions = {
    val __obj = js.Dynamic.literal(disableWarnings = disableWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconOptions]
  }
  @scala.inline
  implicit class IIconOptionsOps[Self <: IIconOptions] (val x: Self) extends AnyVal {
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
    def setDisableWarnings(value: Boolean): Self = this.set("disableWarnings", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarnOnMissingIcons(value: Boolean): Self = this.set("warnOnMissingIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnOnMissingIcons: Self = this.set("warnOnMissingIcons", js.undefined)
  }
  
}


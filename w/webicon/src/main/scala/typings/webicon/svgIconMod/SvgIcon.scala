package typings.webicon.svgIconMod

import typings.webicon.iconMod.Icon
import typings.webicon.sizeableMod.Sizeable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgIcon
  extends Icon
     with Sizeable {
  /**
    * The default viewBox of the icon.
    */
  var viewBox: js.UndefOr[String] = js.native
}

object SvgIcon {
  @scala.inline
  def apply(): SvgIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgIcon]
  }
  @scala.inline
  implicit class SvgIconOps[Self <: SvgIcon] (val x: Self) extends AnyVal {
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
    def setViewBox(value: String): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
  }
  
}


package typings.webicon.svgIconOptionsMod

import typings.webicon.sizeableOptionsMod.SizeableOptions
import typings.webicon.storeableMod.Storeable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.webicon.sizeableMod.Sizeable because Already inherited
- typings.webicon.iconMod.Icon because Already inherited
- typings.webicon.svgIconMod.SvgIcon because var conflicts: iconIdParser, iconSize. Inlined viewBox */ @js.native
trait SvgIconOptions
  extends Storeable
     with SizeableOptions {
  /**
    * The default viewBox of the icon.
    */
  var viewBox: js.UndefOr[String] = js.native
}

object SvgIconOptions {
  @scala.inline
  def apply(): SvgIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgIconOptions]
  }
  @scala.inline
  implicit class SvgIconOptionsOps[Self <: SvgIconOptions] (val x: Self) extends AnyVal {
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


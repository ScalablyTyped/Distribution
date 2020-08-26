package typings.uifabricStyling.anon

import typings.uifabricMergeStyles.istyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/interfaces/IFontStyles.IFontStyles> */
@js.native
trait PartialIFontStyles extends js.Object {
  var large: js.UndefOr[IRawStyle] = js.native
  var medium: js.UndefOr[IRawStyle] = js.native
  var mediumPlus: js.UndefOr[IRawStyle] = js.native
  var mega: js.UndefOr[IRawStyle] = js.native
  var small: js.UndefOr[IRawStyle] = js.native
  var smallPlus: js.UndefOr[IRawStyle] = js.native
  var superLarge: js.UndefOr[IRawStyle] = js.native
  var tiny: js.UndefOr[IRawStyle] = js.native
  var xLarge: js.UndefOr[IRawStyle] = js.native
  var xLargePlus: js.UndefOr[IRawStyle] = js.native
  var xSmall: js.UndefOr[IRawStyle] = js.native
  var xxLarge: js.UndefOr[IRawStyle] = js.native
  var xxLargePlus: js.UndefOr[IRawStyle] = js.native
}

object PartialIFontStyles {
  @scala.inline
  def apply(): PartialIFontStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIFontStyles]
  }
  @scala.inline
  implicit class PartialIFontStylesOps[Self <: PartialIFontStyles] (val x: Self) extends AnyVal {
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
    def setLarge(value: IRawStyle): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setMedium(value: IRawStyle): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    @scala.inline
    def setMediumPlus(value: IRawStyle): Self = this.set("mediumPlus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediumPlus: Self = this.set("mediumPlus", js.undefined)
    @scala.inline
    def setMega(value: IRawStyle): Self = this.set("mega", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMega: Self = this.set("mega", js.undefined)
    @scala.inline
    def setSmall(value: IRawStyle): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    @scala.inline
    def setSmallPlus(value: IRawStyle): Self = this.set("smallPlus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallPlus: Self = this.set("smallPlus", js.undefined)
    @scala.inline
    def setSuperLarge(value: IRawStyle): Self = this.set("superLarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperLarge: Self = this.set("superLarge", js.undefined)
    @scala.inline
    def setTiny(value: IRawStyle): Self = this.set("tiny", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiny: Self = this.set("tiny", js.undefined)
    @scala.inline
    def setXLarge(value: IRawStyle): Self = this.set("xLarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXLarge: Self = this.set("xLarge", js.undefined)
    @scala.inline
    def setXLargePlus(value: IRawStyle): Self = this.set("xLargePlus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXLargePlus: Self = this.set("xLargePlus", js.undefined)
    @scala.inline
    def setXSmall(value: IRawStyle): Self = this.set("xSmall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXSmall: Self = this.set("xSmall", js.undefined)
    @scala.inline
    def setXxLarge(value: IRawStyle): Self = this.set("xxLarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXxLarge: Self = this.set("xxLarge", js.undefined)
    @scala.inline
    def setXxLargePlus(value: IRawStyle): Self = this.set("xxLargePlus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXxLargePlus: Self = this.set("xxLargePlus", js.undefined)
  }
  
}


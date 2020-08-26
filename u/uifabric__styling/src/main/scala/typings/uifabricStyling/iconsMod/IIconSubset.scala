package typings.uifabricStyling.iconsMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.irawstylebaseMod.IFontFace
import typings.uifabricMergeStyles.istyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconSubset extends js.Object {
  var fontFace: js.UndefOr[IFontFace] = js.native
  var icons: StringDictionary[String | Element] = js.native
  var style: js.UndefOr[IRawStyle] = js.native
}

object IIconSubset {
  @scala.inline
  def apply(icons: StringDictionary[String | Element]): IIconSubset = {
    val __obj = js.Dynamic.literal(icons = icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconSubset]
  }
  @scala.inline
  implicit class IIconSubsetOps[Self <: IIconSubset] (val x: Self) extends AnyVal {
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
    def setIcons(value: StringDictionary[String | Element]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFace(value: IFontFace): Self = this.set("fontFace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFace: Self = this.set("fontFace", js.undefined)
    @scala.inline
    def setStyle(value: IRawStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}


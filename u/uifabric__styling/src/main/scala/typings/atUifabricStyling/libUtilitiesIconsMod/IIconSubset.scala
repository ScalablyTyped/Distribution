package typings.atUifabricStyling.libUtilitiesIconsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atUifabricMergeDashStyles.libIRawStyleBaseMod.IFontFace
import typings.atUifabricMergeDashStyles.libIStyleMod.IRawStyle
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconSubset extends js.Object {
  var fontFace: js.UndefOr[IFontFace] = js.undefined
  var icons: StringDictionary[String | Element]
  var style: js.UndefOr[IRawStyle] = js.undefined
}

object IIconSubset {
  @scala.inline
  def apply(icons: StringDictionary[String | Element], fontFace: IFontFace = null, style: IRawStyle = null): IIconSubset = {
    val __obj = js.Dynamic.literal(icons = icons)
    if (fontFace != null) __obj.updateDynamic("fontFace")(fontFace)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IIconSubset]
  }
}


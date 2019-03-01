package typings
package atUifabricStylingLib.libUtilitiesIconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconSubsetRecord extends IIconSubset {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var isRegistered: js.UndefOr[scala.Boolean] = js.undefined
}

object IIconSubsetRecord {
  @scala.inline
  def apply(
    icons: org.scalablytyped.runtime.StringDictionary[java.lang.String | reactLib.reactMod.Global.JSXNs.Element],
    className: java.lang.String = null,
    fontFace: atUifabricMergeDashStylesLib.libIRawStyleBaseMod.IFontFace = null,
    isRegistered: js.UndefOr[scala.Boolean] = js.undefined,
    style: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = null
  ): IIconSubsetRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("icons")(icons)
    if (className != null) __obj.updateDynamic("className")(className)
    if (fontFace != null) __obj.updateDynamic("fontFace")(fontFace)
    if (!js.isUndefined(isRegistered)) __obj.updateDynamic("isRegistered")(isRegistered)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IIconSubsetRecord]
  }
}


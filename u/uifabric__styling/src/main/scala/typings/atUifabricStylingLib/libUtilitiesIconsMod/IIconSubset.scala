package typings
package atUifabricStylingLib.libUtilitiesIconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconSubset extends js.Object {
  var fontFace: js.UndefOr[atUifabricMergeDashStylesLib.libIRawStyleBaseMod.IFontFace] = js.undefined
  var icons: org.scalablytyped.runtime.StringDictionary[java.lang.String | reactLib.reactMod.Global.JSXNs.Element]
  var style: js.UndefOr[atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle] = js.undefined
}

object IIconSubset {
  @scala.inline
  def apply(
    icons: org.scalablytyped.runtime.StringDictionary[java.lang.String | reactLib.reactMod.Global.JSXNs.Element],
    fontFace: atUifabricMergeDashStylesLib.libIRawStyleBaseMod.IFontFace = null,
    style: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = null
  ): IIconSubset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("icons")(icons)
    if (fontFace != null) __obj.updateDynamic("fontFace")(fontFace)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IIconSubset]
  }
}


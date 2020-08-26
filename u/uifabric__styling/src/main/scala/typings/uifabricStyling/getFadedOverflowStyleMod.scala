package typings.uifabricStyling

import typings.uifabricMergeStyles.istyleMod.IRawStyle
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricStyling.uifabricStylingStrings.horizontal
import typings.uifabricStyling.uifabricStylingStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles/getFadedOverflowStyle", JSImport.Namespace)
@js.native
object getFadedOverflowStyleMod extends js.Object {
  def getFadedOverflowStyle(
    theme: ITheme,
    color: js.UndefOr[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 154 */ js.Any
    ],
    direction: js.UndefOr[horizontal | vertical],
    width: js.UndefOr[String | Double],
    height: js.UndefOr[String | Double]
  ): IRawStyle = js.native
}


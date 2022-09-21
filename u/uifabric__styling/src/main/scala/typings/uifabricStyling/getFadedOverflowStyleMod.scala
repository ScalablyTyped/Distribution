package typings.uifabricStyling

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.uifabricMergeStyles.irawstyleMod.IRawStyle
import typings.uifabricStyling.uifabricStylingStrings.horizontal
import typings.uifabricStyling.uifabricStylingStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFadedOverflowStyleMod {
  
  @JSImport("@uifabric/styling/lib/styles/getFadedOverflowStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFadedOverflowStyle(
    theme: ITheme,
    color: js.UndefOr[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 154 */ Any
    ],
    direction: js.UndefOr[horizontal | vertical],
    width: js.UndefOr[String | Double],
    height: js.UndefOr[String | Double]
  ): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getFadedOverflowStyle")(theme.asInstanceOf[js.Any], color.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
}

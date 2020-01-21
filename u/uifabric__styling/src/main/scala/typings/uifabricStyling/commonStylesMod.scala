package typings.uifabricStyling

import typings.uifabricStyling.uifabricStylingNumbers.`1024`
import typings.uifabricStyling.uifabricStylingNumbers.`1366`
import typings.uifabricStyling.uifabricStylingNumbers.`1920`
import typings.uifabricStyling.uifabricStylingNumbers.`320`
import typings.uifabricStyling.uifabricStylingNumbers.`480`
import typings.uifabricStyling.uifabricStylingNumbers.`640`
import typings.uifabricStyling.uifabricStylingNumbers.`768`
import typings.uifabricStyling.uifabricStylingStrings.`@media screen and Leftparenthesis-ms-high-contrastColon activeRightparenthesis`
import typings.uifabricStyling.uifabricStylingStrings.`@media screen and Leftparenthesis-ms-high-contrastColon black-on-whiteRightparenthesis`
import typings.uifabricStyling.uifabricStylingStrings.`@media screen and Leftparenthesis-ms-high-contrastColon white-on-blackRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles/CommonStyles", JSImport.Namespace)
@js.native
object commonStylesMod extends js.Object {
  val HighContrastSelector: `@media screen and Leftparenthesis-ms-high-contrastColon activeRightparenthesis` = js.native
  val HighContrastSelectorBlack: `@media screen and Leftparenthesis-ms-high-contrastColon white-on-blackRightparenthesis` = js.native
  val HighContrastSelectorWhite: `@media screen and Leftparenthesis-ms-high-contrastColon black-on-whiteRightparenthesis` = js.native
  val ScreenWidthMaxLarge: Double = js.native
  val ScreenWidthMaxMedium: Double = js.native
  val ScreenWidthMaxSmall: Double = js.native
  val ScreenWidthMaxXLarge: Double = js.native
  val ScreenWidthMaxXXLarge: Double = js.native
  val ScreenWidthMinLarge: `640` = js.native
  val ScreenWidthMinMedium: `480` = js.native
  val ScreenWidthMinSmall: `320` = js.native
  val ScreenWidthMinUhfMobile: `768` = js.native
  val ScreenWidthMinXLarge: `1024` = js.native
  val ScreenWidthMinXXLarge: `1366` = js.native
  val ScreenWidthMinXXXLarge: `1920` = js.native
  def getScreenSelector(min: Double, max: Double): String = js.native
}


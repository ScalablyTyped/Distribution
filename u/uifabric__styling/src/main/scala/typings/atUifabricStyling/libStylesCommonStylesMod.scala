package typings.atUifabricStyling

import typings.atUifabricStyling.atUifabricStylingNumbers.`1024`
import typings.atUifabricStyling.atUifabricStylingNumbers.`1366`
import typings.atUifabricStyling.atUifabricStylingNumbers.`1920`
import typings.atUifabricStyling.atUifabricStylingNumbers.`320`
import typings.atUifabricStyling.atUifabricStylingNumbers.`480`
import typings.atUifabricStyling.atUifabricStylingNumbers.`640`
import typings.atUifabricStyling.atUifabricStylingNumbers.`768`
import typings.atUifabricStyling.atUifabricStylingStrings.`@media screen and (-ms-high-contrast: active)`
import typings.atUifabricStyling.atUifabricStylingStrings.`@media screen and (-ms-high-contrast: black-on-white)`
import typings.atUifabricStyling.atUifabricStylingStrings.`@media screen and (-ms-high-contrast: white-on-black)`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles/CommonStyles", JSImport.Namespace)
@js.native
object libStylesCommonStylesMod extends js.Object {
  val HighContrastSelector: `@media screen and (-ms-high-contrast: active)` = js.native
  val HighContrastSelectorBlack: `@media screen and (-ms-high-contrast: white-on-black)` = js.native
  val HighContrastSelectorWhite: `@media screen and (-ms-high-contrast: black-on-white)` = js.native
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


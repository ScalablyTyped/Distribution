package typings.uifabricStyling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles/CommonStyles", JSImport.Namespace)
@js.native
object commonStylesMod extends js.Object {
  val EdgeChromiumHighContrastSelector: /* "@media screen and (-ms-high-contrast: active) and (forced-colors: active)" */ String = js.native
  val HighContrastSelector: /* "@media screen and (-ms-high-contrast: active)" */ String = js.native
  val HighContrastSelectorBlack: /* "@media screen and (-ms-high-contrast: white-on-black)" */ String = js.native
  val HighContrastSelectorWhite: /* "@media screen and (-ms-high-contrast: black-on-white)" */ String = js.native
  val ScreenWidthMaxLarge: Double = js.native
  val ScreenWidthMaxMedium: Double = js.native
  val ScreenWidthMaxSmall: Double = js.native
  val ScreenWidthMaxXLarge: Double = js.native
  val ScreenWidthMaxXXLarge: Double = js.native
  val ScreenWidthMinLarge: /* 640 */ Double = js.native
  val ScreenWidthMinMedium: /* 480 */ Double = js.native
  val ScreenWidthMinSmall: /* 320 */ Double = js.native
  val ScreenWidthMinUhfMobile: /* 768 */ Double = js.native
  val ScreenWidthMinXLarge: /* 1024 */ Double = js.native
  val ScreenWidthMinXXLarge: /* 1366 */ Double = js.native
  val ScreenWidthMinXXXLarge: /* 1920 */ Double = js.native
  def getEdgeChromiumNoHighContrastAdjustSelector(): typings.uifabricStyling.anon.EdgeChromiumHighContrastSelector = js.native
  def getScreenSelector(min: Double, max: Double): String = js.native
}


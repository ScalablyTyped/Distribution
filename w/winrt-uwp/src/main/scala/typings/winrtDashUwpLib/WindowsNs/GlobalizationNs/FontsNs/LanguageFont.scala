package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.FontsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data related to a particular font recommendation for a given language. */
@JSGlobal("Windows.Globalization.Fonts.LanguageFont")
@js.native
abstract class LanguageFont () extends js.Object {
  /** Gets the family name of the font. */
  var fontFamily: java.lang.String = js.native
  /** Gets the FontStretch property of the font. */
  var fontStretch: winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStretch = js.native
  /** Gets the FontStyle property of the font. */
  var fontStyle: winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStyle = js.native
  /** Gets the weight of the font ( FontWeight ). */
  var fontWeight: winrtDashUwpLib.WindowsNs.UINs.TextNs.FontWeight = js.native
  /** Gets a recommended font size scaling factor for the font. */
  var scaleFactor: scala.Double = js.native
}


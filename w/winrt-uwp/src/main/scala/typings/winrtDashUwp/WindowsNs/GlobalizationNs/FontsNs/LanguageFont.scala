package typings.winrtDashUwp.WindowsNs.GlobalizationNs.FontsNs

import typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontStretch
import typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontStyle
import typings.winrtDashUwp.WindowsNs.UINs.TextNs.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data related to a particular font recommendation for a given language. */
@JSGlobal("Windows.Globalization.Fonts.LanguageFont")
@js.native
abstract class LanguageFont () extends js.Object {
  /** Gets the family name of the font. */
  var fontFamily: String = js.native
  /** Gets the FontStretch property of the font. */
  var fontStretch: FontStretch = js.native
  /** Gets the FontStyle property of the font. */
  var fontStyle: FontStyle = js.native
  /** Gets the weight of the font ( FontWeight ). */
  var fontWeight: FontWeight = js.native
  /** Gets a recommended font size scaling factor for the font. */
  var scaleFactor: Double = js.native
}


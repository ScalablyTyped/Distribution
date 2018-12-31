package typings
package atUifabricMergeDashStylesLib.libIRawStyleBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFontFace extends IRawFontStyle {
  /**
    * Feature settings for the font.
    */
  var fontFeatureSettings: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the src of the font.
    */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /**
    * unicode-range allows you to set a specific range of characters to be downloaded
    * from a font (embedded using \@font-face) and made available for use on the current
    * page.
    */
  var unicodeRange: js.UndefOr[ICSSRule | java.lang.String] = js.undefined
}


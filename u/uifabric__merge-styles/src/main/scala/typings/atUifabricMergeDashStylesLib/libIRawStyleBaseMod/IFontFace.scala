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

object IFontFace {
  @scala.inline
  def apply(
    font: ICSSRule | java.lang.String = null,
    fontFamily: ICSSRule | java.lang.String = null,
    fontFeatureSettings: java.lang.String = null,
    fontKerning: ICSSRule | java.lang.String = null,
    fontSize: ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`xx-small` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`x-small` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.small | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.medium | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.large | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`x-large` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`xx-large` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.larger | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.smaller | ICSSPixelUnitRule | ICSSPercentageRule = null,
    fontSizeAdjust: ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.none | scala.Double = null,
    fontStretch: ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.normal | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`ultra-condensed` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`extra-condensed` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.condensed | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`semi-condensed` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`semi-expanded` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.expanded | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`extra-expanded` | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.`ultra-expanded` = null,
    fontStyle: ICSSRule | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.normal | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.italic | atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibStrings.oblique = null,
    fontSynthesis: ICSSRule | java.lang.String = null,
    fontVariant: ICSSRule | java.lang.String = null,
    fontVariantAlternates: ICSSRule | java.lang.String = null,
    fontWeight: IFontWeight = null,
    src: java.lang.String = null,
    unicodeRange: ICSSRule | java.lang.String = null
  ): IFontFace = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontFeatureSettings != null) __obj.updateDynamic("fontFeatureSettings")(fontFeatureSettings)
    if (fontKerning != null) __obj.updateDynamic("fontKerning")(fontKerning.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeAdjust != null) __obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontSynthesis != null) __obj.updateDynamic("fontSynthesis")(fontSynthesis.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontVariantAlternates != null) __obj.updateDynamic("fontVariantAlternates")(fontVariantAlternates.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (src != null) __obj.updateDynamic("src")(src)
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontFace]
  }
}


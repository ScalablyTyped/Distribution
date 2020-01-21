package typings.uifabricMergeStyles.irawstylebaseMod

import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`extra-condensed`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`extra-expanded`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`semi-condensed`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`semi-expanded`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`ultra-condensed`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`ultra-expanded`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`x-large`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`x-small`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`xx-large`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.`xx-small`
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.condensed
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.expanded
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.italic
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.large
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.larger
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.medium
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.none
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.normal
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.oblique
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.small
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.smaller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawFontStyle extends js.Object {
  /**
    * The font property is shorthand that allows you to do one of two things: you can
    * either set up six of the most mature font properties in one line, or you can set
    *  one of a choice of keywords to adopt a system font setting.
    */
  var font: js.UndefOr[ICSSRule | String] = js.undefined
  /**
    * The font-family property allows one or more font family names and/or generic family
    * names to be specified for usage on the selected element(s)' text. The browser then
    * goes through the list; for each character in the selection it applies the first
    * font family that has an available glyph for that character.
    */
  var fontFamily: js.UndefOr[ICSSRule | String] = js.undefined
  /**
    * The font-kerning property allows contextual adjustment of inter-glyph spacing, i.e.
    * the spaces between the characters in text. This property controls <bold>metric
    * kerning</bold> - that utilizes adjustment data contained in the font. Optical
    * Kerning is not supported as yet.
    */
  var fontKerning: js.UndefOr[ICSSRule | String] = js.undefined
  /**
    * Specifies the size of the font. Used to compute em and ex units.
    * See CSS 3 font-size property https://www.w3.org/TR/css-fonts-3/#propdef-font-size
    */
  var fontSize: js.UndefOr[
    ICSSRule | `xx-small` | `x-small` | small | medium | large | `x-large` | `xx-large` | larger | smaller | ICSSPixelUnitRule | ICSSPercentageRule
  ] = js.undefined
  /**
    * The font-size-adjust property adjusts the font-size of the fallback fonts defined
    * with font-family, so that the x-height is the same no matter what font is used.
    * This preserves the readability of the text when fallback happens.
    * See CSS 3 font-size-adjust property
    * https://www.w3.org/TR/css-fonts-3/#propdef-font-size-adjust
    */
  var fontSizeAdjust: js.UndefOr[ICSSRule | none | Double] = js.undefined
  /**
    * Allows you to expand or condense the widths for a normal, condensed, or expanded
    * font face.
    * See CSS 3 font-stretch property
    * https://drafts.csswg.org/css-fonts-3/#propdef-font-stretch
    */
  var fontStretch: js.UndefOr[
    ICSSRule | normal | `ultra-condensed` | `extra-condensed` | condensed | `semi-condensed` | `semi-expanded` | expanded | `extra-expanded` | `ultra-expanded`
  ] = js.undefined
  /**
    * The font-style property allows normal, italic, or oblique faces to be selected.
    * Italic forms are generally cursive in nature while oblique faces are typically
    * sloped versions of the regular face. Oblique faces can be simulated by artificially
    * sloping the glyphs of the regular face.
    * See CSS 3 font-style property https://www.w3.org/TR/css-fonts-3/#propdef-font-style
    */
  var fontStyle: js.UndefOr[ICSSRule | normal | italic | oblique] = js.undefined
  /**
    * This value specifies whether the user agent is allowed to synthesize bold or
    *  oblique font faces when a font family lacks bold or italic faces.
    */
  var fontSynthesis: js.UndefOr[ICSSRule | String] = js.undefined
  /**
    * The font-variant property enables you to select the small-caps font within a font
    * family.
    */
  var fontVariant: js.UndefOr[ICSSRule | String] = js.undefined
  /**
    * Fonts can provide alternate glyphs in addition to default glyph for a character.
    * This property provides control over the selection of these alternate glyphs.
    */
  var fontVariantAlternates: js.UndefOr[ICSSRule | String] = js.undefined
  /**
    * Specifies the weight or boldness of the font.
    * See CSS 3 'font-weight' property https://www.w3.org/TR/css-fonts-3/#propdef-font-weight
    */
  var fontWeight: js.UndefOr[IFontWeight] = js.undefined
}

object IRawFontStyle {
  @scala.inline
  def apply(
    font: ICSSRule | String = null,
    fontFamily: ICSSRule | String = null,
    fontKerning: ICSSRule | String = null,
    fontSize: ICSSRule | `xx-small` | `x-small` | small | medium | large | `x-large` | `xx-large` | larger | smaller | ICSSPixelUnitRule | ICSSPercentageRule = null,
    fontSizeAdjust: ICSSRule | none | Double = null,
    fontStretch: ICSSRule | normal | `ultra-condensed` | `extra-condensed` | condensed | `semi-condensed` | `semi-expanded` | expanded | `extra-expanded` | `ultra-expanded` = null,
    fontStyle: ICSSRule | normal | italic | oblique = null,
    fontSynthesis: ICSSRule | String = null,
    fontVariant: ICSSRule | String = null,
    fontVariantAlternates: ICSSRule | String = null,
    fontWeight: IFontWeight = null
  ): IRawFontStyle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontKerning != null) __obj.updateDynamic("fontKerning")(fontKerning.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeAdjust != null) __obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontSynthesis != null) __obj.updateDynamic("fontSynthesis")(fontSynthesis.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontVariantAlternates != null) __obj.updateDynamic("fontVariantAlternates")(fontVariantAlternates.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRawFontStyle]
  }
}


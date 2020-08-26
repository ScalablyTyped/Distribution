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

@js.native
trait IRawFontStyle extends js.Object {
  /**
    * The font property is shorthand that allows you to do one of two things: you can
    * either set up six of the most mature font properties in one line, or you can set
    *  one of a choice of keywords to adopt a system font setting.
    */
  var font: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The font-family property allows one or more font family names and/or generic family
    * names to be specified for usage on the selected element(s)' text. The browser then
    * goes through the list; for each character in the selection it applies the first
    * font family that has an available glyph for that character.
    */
  var fontFamily: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The font-kerning property allows contextual adjustment of inter-glyph spacing, i.e.
    * the spaces between the characters in text. This property controls <bold>metric
    * kerning</bold> - that utilizes adjustment data contained in the font. Optical
    * Kerning is not supported as yet.
    */
  var fontKerning: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the size of the font. Used to compute em and ex units.
    * See CSS 3 font-size property https://www.w3.org/TR/css-fonts-3/#propdef-font-size
    */
  var fontSize: js.UndefOr[
    ICSSRule | `xx-small` | `x-small` | small | medium | large | `x-large` | `xx-large` | larger | smaller | ICSSPixelUnitRule | ICSSPercentageRule
  ] = js.native
  /**
    * The font-size-adjust property adjusts the font-size of the fallback fonts defined
    * with font-family, so that the x-height is the same no matter what font is used.
    * This preserves the readability of the text when fallback happens.
    * See CSS 3 font-size-adjust property
    * https://www.w3.org/TR/css-fonts-3/#propdef-font-size-adjust
    */
  var fontSizeAdjust: js.UndefOr[ICSSRule | none | Double] = js.native
  /**
    * Allows you to expand or condense the widths for a normal, condensed, or expanded
    * font face.
    * See CSS 3 font-stretch property
    * https://drafts.csswg.org/css-fonts-3/#propdef-font-stretch
    */
  var fontStretch: js.UndefOr[
    ICSSRule | normal | `ultra-condensed` | `extra-condensed` | condensed | `semi-condensed` | `semi-expanded` | expanded | `extra-expanded` | `ultra-expanded`
  ] = js.native
  /**
    * The font-style property allows normal, italic, or oblique faces to be selected.
    * Italic forms are generally cursive in nature while oblique faces are typically
    * sloped versions of the regular face. Oblique faces can be simulated by artificially
    * sloping the glyphs of the regular face.
    * See CSS 3 font-style property https://www.w3.org/TR/css-fonts-3/#propdef-font-style
    */
  var fontStyle: js.UndefOr[ICSSRule | normal | italic | oblique] = js.native
  /**
    * This value specifies whether the user agent is allowed to synthesize bold or
    *  oblique font faces when a font family lacks bold or italic faces.
    */
  var fontSynthesis: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The font-variant property enables you to select the small-caps font within a font
    * family.
    */
  var fontVariant: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Fonts can provide alternate glyphs in addition to default glyph for a character.
    * This property provides control over the selection of these alternate glyphs.
    */
  var fontVariantAlternates: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the weight or boldness of the font.
    * See CSS 3 'font-weight' property https://www.w3.org/TR/css-fonts-3/#propdef-font-weight
    */
  var fontWeight: js.UndefOr[IFontWeight] = js.native
}

object IRawFontStyle {
  @scala.inline
  def apply(): IRawFontStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRawFontStyle]
  }
  @scala.inline
  implicit class IRawFontStyleOps[Self <: IRawFontStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFont(value: ICSSRule | String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFontFamily(value: ICSSRule | String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontKerning(value: ICSSRule | String): Self = this.set("fontKerning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontKerning: Self = this.set("fontKerning", js.undefined)
    @scala.inline
    def setFontSize(
      value: ICSSRule | `xx-small` | `x-small` | small | medium | large | `x-large` | `xx-large` | larger | smaller | ICSSPixelUnitRule | ICSSPercentageRule
    ): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontSizeAdjust(value: ICSSRule | none | Double): Self = this.set("fontSizeAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizeAdjust: Self = this.set("fontSizeAdjust", js.undefined)
    @scala.inline
    def setFontStretch(
      value: ICSSRule | normal | `ultra-condensed` | `extra-condensed` | condensed | `semi-condensed` | `semi-expanded` | expanded | `extra-expanded` | `ultra-expanded`
    ): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    @scala.inline
    def setFontStyle(value: ICSSRule | normal | italic | oblique): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontSynthesis(value: ICSSRule | String): Self = this.set("fontSynthesis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSynthesis: Self = this.set("fontSynthesis", js.undefined)
    @scala.inline
    def setFontVariant(value: ICSSRule | String): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    @scala.inline
    def setFontVariantAlternates(value: ICSSRule | String): Self = this.set("fontVariantAlternates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariantAlternates: Self = this.set("fontVariantAlternates", js.undefined)
    @scala.inline
    def setFontWeight(value: IFontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
  }
  
}


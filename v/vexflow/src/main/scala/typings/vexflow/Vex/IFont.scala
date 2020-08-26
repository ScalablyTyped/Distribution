package typings.vexflow.Vex

import typings.vexflow.anon.Copyright
import typings.vexflow.anon.Ha
import typings.vexflow.anon.XMax_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper interface for handling the Vex.Flow.Font object in Vex.Flow.Glyph. Not part of VexFlow!
  */
@js.native
trait IFont extends js.Object {
  var ascender: Double = js.native
  var boundingBox: XMax_ = js.native
  var cssFontStyle: String = js.native
  var cssFontWeight: String = js.native
  var descender: Double = js.native
  var familyName: String = js.native
  var glyphs: js.Array[Ha] = js.native
  var lineHeight: Double = js.native
  /**
    * This property is missing in vexflow_font.js, but present in gonville_original.js and gonville_all.js.
    */
  var original_font_information: js.UndefOr[Copyright] = js.native
  var resolution: Double = js.native
  var underlinePosition: Double = js.native
  var underlineThickness: Double = js.native
}

object IFont {
  @scala.inline
  def apply(
    ascender: Double,
    boundingBox: XMax_,
    cssFontStyle: String,
    cssFontWeight: String,
    descender: Double,
    familyName: String,
    glyphs: js.Array[Ha],
    lineHeight: Double,
    resolution: Double,
    underlinePosition: Double,
    underlineThickness: Double
  ): IFont = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], boundingBox = boundingBox.asInstanceOf[js.Any], cssFontStyle = cssFontStyle.asInstanceOf[js.Any], cssFontWeight = cssFontWeight.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], underlinePosition = underlinePosition.asInstanceOf[js.Any], underlineThickness = underlineThickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFont]
  }
  @scala.inline
  implicit class IFontOps[Self <: IFont] (val x: Self) extends AnyVal {
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
    def setAscender(value: Double): Self = this.set("ascender", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundingBox(value: XMax_): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setCssFontStyle(value: String): Self = this.set("cssFontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCssFontWeight(value: String): Self = this.set("cssFontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescender(value: Double): Self = this.set("descender", value.asInstanceOf[js.Any])
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlyphsVarargs(value: Ha*): Self = this.set("glyphs", js.Array(value :_*))
    @scala.inline
    def setGlyphs(value: js.Array[Ha]): Self = this.set("glyphs", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderlinePosition(value: Double): Self = this.set("underlinePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderlineThickness(value: Double): Self = this.set("underlineThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginal_font_information(value: Copyright): Self = this.set("original_font_information", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginal_font_information: Self = this.set("original_font_information", js.undefined)
  }
  
}


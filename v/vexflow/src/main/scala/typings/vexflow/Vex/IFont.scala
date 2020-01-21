package typings.vexflow.Vex

import typings.vexflow.AnonCopyright
import typings.vexflow.AnonHa
import typings.vexflow.AnonXMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper interface for handling the Vex.Flow.Font object in Vex.Flow.Glyph. Not part of VexFlow!
  */
trait IFont extends js.Object {
  var ascender: Double
  var boundingBox: AnonXMax
  var cssFontStyle: String
  var cssFontWeight: String
  var descender: Double
  var familyName: String
  var glyphs: js.Array[AnonHa]
  var lineHeight: Double
  /**
    * This property is missing in vexflow_font.js, but present in gonville_original.js and gonville_all.js.
    */
  var original_font_information: js.UndefOr[AnonCopyright] = js.undefined
  var resolution: Double
  var underlinePosition: Double
  var underlineThickness: Double
}

object IFont {
  @scala.inline
  def apply(
    ascender: Double,
    boundingBox: AnonXMax,
    cssFontStyle: String,
    cssFontWeight: String,
    descender: Double,
    familyName: String,
    glyphs: js.Array[AnonHa],
    lineHeight: Double,
    resolution: Double,
    underlinePosition: Double,
    underlineThickness: Double,
    original_font_information: AnonCopyright = null
  ): IFont = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], boundingBox = boundingBox.asInstanceOf[js.Any], cssFontStyle = cssFontStyle.asInstanceOf[js.Any], cssFontWeight = cssFontWeight.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], underlinePosition = underlinePosition.asInstanceOf[js.Any], underlineThickness = underlineThickness.asInstanceOf[js.Any])
    if (original_font_information != null) __obj.updateDynamic("original_font_information")(original_font_information.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFont]
  }
}


package typings.vexflow.VexNs

import typings.vexflow.Anon_Copyright
import typings.vexflow.Anon_Ha
import typings.vexflow.Anon_XMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper interface for handling the Vex.Flow.Font object in Vex.Flow.Glyph. Not part of VexFlow!
  */
trait IFont extends js.Object {
  var ascender: Double
  var boundingBox: Anon_XMax
  var cssFontStyle: String
  var cssFontWeight: String
  var descender: Double
  var familyName: String
  var glyphs: js.Array[Anon_Ha]
  var lineHeight: Double
  /**
    * This property is missing in vexflow_font.js, but present in gonville_original.js and gonville_all.js.
    */
  var original_font_information: js.UndefOr[Anon_Copyright] = js.undefined
  var resolution: Double
  var underlinePosition: Double
  var underlineThickness: Double
}

object IFont {
  @scala.inline
  def apply(
    ascender: Double,
    boundingBox: Anon_XMax,
    cssFontStyle: String,
    cssFontWeight: String,
    descender: Double,
    familyName: String,
    glyphs: js.Array[Anon_Ha],
    lineHeight: Double,
    resolution: Double,
    underlinePosition: Double,
    underlineThickness: Double,
    original_font_information: Anon_Copyright = null
  ): IFont = {
    val __obj = js.Dynamic.literal(ascender = ascender, boundingBox = boundingBox, cssFontStyle = cssFontStyle, cssFontWeight = cssFontWeight, descender = descender, familyName = familyName, glyphs = glyphs, lineHeight = lineHeight, resolution = resolution, underlinePosition = underlinePosition, underlineThickness = underlineThickness)
    if (original_font_information != null) __obj.updateDynamic("original_font_information")(original_font_information)
    __obj.asInstanceOf[IFont]
  }
}


package typings
package vexflowLib.VexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper interface for handling the Vex.Flow.Font object in Vex.Flow.Glyph. Not part of VexFlow!
  */
trait IFont extends js.Object {
  var ascender: scala.Double
  var boundingBox: vexflowLib.Anon_XMax
  var cssFontStyle: java.lang.String
  var cssFontWeight: java.lang.String
  var descender: scala.Double
  var familyName: java.lang.String
  var glyphs: js.Array[vexflowLib.Anon_Ha]
  var lineHeight: scala.Double
  /**
    * This property is missing in vexflow_font.js, but present in gonville_original.js and gonville_all.js.
    */
  var original_font_information: js.UndefOr[vexflowLib.Anon_Copyright] = js.undefined
  var resolution: scala.Double
  var underlinePosition: scala.Double
  var underlineThickness: scala.Double
}

object IFont {
  @scala.inline
  def apply(
    ascender: scala.Double,
    boundingBox: vexflowLib.Anon_XMax,
    cssFontStyle: java.lang.String,
    cssFontWeight: java.lang.String,
    descender: scala.Double,
    familyName: java.lang.String,
    glyphs: js.Array[vexflowLib.Anon_Ha],
    lineHeight: scala.Double,
    resolution: scala.Double,
    underlinePosition: scala.Double,
    underlineThickness: scala.Double,
    original_font_information: vexflowLib.Anon_Copyright = null
  ): IFont = {
    val __obj = js.Dynamic.literal(ascender = ascender, boundingBox = boundingBox, cssFontStyle = cssFontStyle, cssFontWeight = cssFontWeight, descender = descender, familyName = familyName, glyphs = glyphs, lineHeight = lineHeight, resolution = resolution, underlinePosition = underlinePosition, underlineThickness = underlineThickness)
    if (original_font_information != null) __obj.updateDynamic("original_font_information")(original_font_information)
    __obj.asInstanceOf[IFont]
  }
}


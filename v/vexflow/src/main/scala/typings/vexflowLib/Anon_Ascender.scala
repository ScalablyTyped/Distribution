package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ascender extends js.Object {
  var ascender: scala.Double
  var boundingBox: Anon_XMax
  var cssFontStyle: java.lang.String
  var cssFontWeight: java.lang.String
  var descender: scala.Double
  var familyName: java.lang.String
  var glyphs: js.Array[Anon_Ha]
  var lineHeight: scala.Double
  //inconsistent member : this is missing in vexflow_font.js, but present in gonville_original.js and gonville_all.js
  var original_font_information: Anon_Copyright
  var resolution: scala.Double
  var underlinePosition: scala.Double
  var underlineThickness: scala.Double
}

object Anon_Ascender {
  @scala.inline
  def apply(
    ascender: scala.Double,
    boundingBox: Anon_XMax,
    cssFontStyle: java.lang.String,
    cssFontWeight: java.lang.String,
    descender: scala.Double,
    familyName: java.lang.String,
    glyphs: js.Array[Anon_Ha],
    lineHeight: scala.Double,
    original_font_information: Anon_Copyright,
    resolution: scala.Double,
    underlinePosition: scala.Double,
    underlineThickness: scala.Double
  ): Anon_Ascender = {
    val __obj = js.Dynamic.literal(ascender = ascender, boundingBox = boundingBox, cssFontStyle = cssFontStyle, cssFontWeight = cssFontWeight, descender = descender, familyName = familyName, glyphs = glyphs, lineHeight = lineHeight, original_font_information = original_font_information, resolution = resolution, underlinePosition = underlinePosition, underlineThickness = underlineThickness)
  
    __obj.asInstanceOf[Anon_Ascender]
  }
}


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
  var boundingBox: vexflowLib.Anon_YMin
  var cssFontStyle: java.lang.String
  var cssFontWeight: java.lang.String
  var descender: scala.Double
  var familyName: java.lang.String
  var glyphs: js.Array[vexflowLib.Anon_Xmin]
  var lineHeight: scala.Double
  /**
    * This property is missing in vexflow_font.js, but present in gonville_original.js and gonville_all.js.
    */
  var original_font_information: js.UndefOr[vexflowLib.Anon_Versionstring] = js.undefined
  var resolution: scala.Double
  var underlinePosition: scala.Double
  var underlineThickness: scala.Double
}


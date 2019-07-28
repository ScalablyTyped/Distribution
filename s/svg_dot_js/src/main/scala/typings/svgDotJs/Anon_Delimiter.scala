package typings.svgDotJs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delimiter extends js.Object {
  var delimiter: RegExp
  var dots: RegExp
  var hex: RegExp
  var hyphen: RegExp
  var isBlank: RegExp
  var isCss: RegExp
  var isHex: RegExp
  var isImage: RegExp
  var isNumber: RegExp
  var isPathLetter: RegExp
  var isPercent: RegExp
  var isRgb: RegExp
  var numberAndUnit: RegExp
  var pathLetters: RegExp
  var reference: RegExp
  var rgb: RegExp
  var transforms: RegExp
  var whitespace: RegExp
}

object Anon_Delimiter {
  @scala.inline
  def apply(
    delimiter: RegExp,
    dots: RegExp,
    hex: RegExp,
    hyphen: RegExp,
    isBlank: RegExp,
    isCss: RegExp,
    isHex: RegExp,
    isImage: RegExp,
    isNumber: RegExp,
    isPathLetter: RegExp,
    isPercent: RegExp,
    isRgb: RegExp,
    numberAndUnit: RegExp,
    pathLetters: RegExp,
    reference: RegExp,
    rgb: RegExp,
    transforms: RegExp,
    whitespace: RegExp
  ): Anon_Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter, dots = dots, hex = hex, hyphen = hyphen, isBlank = isBlank, isCss = isCss, isHex = isHex, isImage = isImage, isNumber = isNumber, isPathLetter = isPathLetter, isPercent = isPercent, isRgb = isRgb, numberAndUnit = numberAndUnit, pathLetters = pathLetters, reference = reference, rgb = rgb, transforms = transforms, whitespace = whitespace)
  
    __obj.asInstanceOf[Anon_Delimiter]
  }
}


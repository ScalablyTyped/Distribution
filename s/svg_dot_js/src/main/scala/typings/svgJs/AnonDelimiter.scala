package typings.svgJs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelimiter extends js.Object {
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

object AnonDelimiter {
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
  ): AnonDelimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hyphen = hyphen.asInstanceOf[js.Any], isBlank = isBlank.asInstanceOf[js.Any], isCss = isCss.asInstanceOf[js.Any], isHex = isHex.asInstanceOf[js.Any], isImage = isImage.asInstanceOf[js.Any], isNumber = isNumber.asInstanceOf[js.Any], isPathLetter = isPathLetter.asInstanceOf[js.Any], isPercent = isPercent.asInstanceOf[js.Any], isRgb = isRgb.asInstanceOf[js.Any], numberAndUnit = numberAndUnit.asInstanceOf[js.Any], pathLetters = pathLetters.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDelimiter]
  }
}


package typings.svgJs.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delimiter extends js.Object {
  var delimiter: RegExp = js.native
  var dots: RegExp = js.native
  var hex: RegExp = js.native
  var hyphen: RegExp = js.native
  var isBlank: RegExp = js.native
  var isCss: RegExp = js.native
  var isHex: RegExp = js.native
  var isImage: RegExp = js.native
  var isNumber: RegExp = js.native
  var isPathLetter: RegExp = js.native
  var isPercent: RegExp = js.native
  var isRgb: RegExp = js.native
  var numberAndUnit: RegExp = js.native
  var pathLetters: RegExp = js.native
  var reference: RegExp = js.native
  var rgb: RegExp = js.native
  var transforms: RegExp = js.native
  var whitespace: RegExp = js.native
}

object Delimiter {
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
  ): Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hyphen = hyphen.asInstanceOf[js.Any], isBlank = isBlank.asInstanceOf[js.Any], isCss = isCss.asInstanceOf[js.Any], isHex = isHex.asInstanceOf[js.Any], isImage = isImage.asInstanceOf[js.Any], isNumber = isNumber.asInstanceOf[js.Any], isPathLetter = isPathLetter.asInstanceOf[js.Any], isPercent = isPercent.asInstanceOf[js.Any], isRgb = isRgb.asInstanceOf[js.Any], numberAndUnit = numberAndUnit.asInstanceOf[js.Any], pathLetters = pathLetters.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
  @scala.inline
  implicit class DelimiterOps[Self <: Delimiter] (val x: Self) extends AnyVal {
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
    def setDelimiter(value: RegExp): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def setDots(value: RegExp): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def setHex(value: RegExp): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHyphen(value: RegExp): Self = this.set("hyphen", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBlank(value: RegExp): Self = this.set("isBlank", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCss(value: RegExp): Self = this.set("isCss", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHex(value: RegExp): Self = this.set("isHex", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsImage(value: RegExp): Self = this.set("isImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNumber(value: RegExp): Self = this.set("isNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPathLetter(value: RegExp): Self = this.set("isPathLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPercent(value: RegExp): Self = this.set("isPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRgb(value: RegExp): Self = this.set("isRgb", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberAndUnit(value: RegExp): Self = this.set("numberAndUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathLetters(value: RegExp): Self = this.set("pathLetters", value.asInstanceOf[js.Any])
    @scala.inline
    def setReference(value: RegExp): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgb(value: RegExp): Self = this.set("rgb", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransforms(value: RegExp): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhitespace(value: RegExp): Self = this.set("whitespace", value.asInstanceOf[js.Any])
  }
  
}


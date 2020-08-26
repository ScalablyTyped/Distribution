package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HSLA extends Node {
  var a: Double = js.native
  var h: Double = js.native
  var hsla: HSLA = js.native
  var l: Double = js.native
  var rgba: RGBA = js.native
  var s: Double = js.native
  /**
    * Add h,s,l to the current component values
    */
  def add(h: Double, s: Double, l: Double): HSLA = js.native
  /**
    * djust hue by `deg`.
    */
  def adjustHue(deg: Double): HSLA = js.native
  /**
    * Adjust lightness by `percent`.
    */
  def adjustLightness(percent: Double): HSLA = js.native
  /**
    * Subtract h,s,l from the current component values
    */
  def substract(h: Double, s: Double, l: Double): HSLA = js.native
}

object HSLA {
  @scala.inline
  def apply(
    a: Double,
    add: (Double, Double, Double) => HSLA,
    adjustHue: Double => HSLA,
    adjustLightness: Double => HSLA,
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    h: Double,
    hash: java.lang.String,
    hsla: HSLA,
    l: Double,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    rgba: RGBA,
    s: Double,
    shouldCoerce: java.lang.String => scala.Boolean,
    substract: (Double, Double, Double) => HSLA,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column
  ): HSLA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], add = js.Any.fromFunction3(add), adjustHue = js.Any.fromFunction1(adjustHue), adjustLightness = js.Any.fromFunction1(adjustLightness), coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), rgba = rgba.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], shouldCoerce = js.Any.fromFunction1(shouldCoerce), substract = js.Any.fromFunction3(substract), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[HSLA]
  }
  @scala.inline
  implicit class HSLAOps[Self <: HSLA] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdd(value: (Double, Double, Double) => HSLA): Self = this.set("add", js.Any.fromFunction3(value))
    @scala.inline
    def setAdjustHue(value: Double => HSLA): Self = this.set("adjustHue", js.Any.fromFunction1(value))
    @scala.inline
    def setAdjustLightness(value: Double => HSLA): Self = this.set("adjustLightness", js.Any.fromFunction1(value))
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setHsla(value: HSLA): Self = this.set("hsla", value.asInstanceOf[js.Any])
    @scala.inline
    def setL(value: Double): Self = this.set("l", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgba(value: RGBA): Self = this.set("rgba", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: Double): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubstract(value: (Double, Double, Double) => HSLA): Self = this.set("substract", js.Any.fromFunction3(value))
  }
  
}


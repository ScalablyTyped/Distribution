package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Number extends js.Object {
  def format(value: Double, config: js.Any): String = js.native
  def getConfig(format: String): js.Any = js.native
  def numToStr(config: js.Any): WebixCallback = js.native
  def parse(value: String, config: js.Any): Double = js.native
}

object Number {
  @scala.inline
  def apply(
    format: (Double, js.Any) => String,
    getConfig: String => js.Any,
    numToStr: js.Any => WebixCallback,
    parse: (String, js.Any) => Double
  ): Number = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), getConfig = js.Any.fromFunction1(getConfig), numToStr = js.Any.fromFunction1(numToStr), parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[Number]
  }
  @scala.inline
  implicit class NumberOps[Self <: Number] (val x: Self) extends AnyVal {
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
    def setFormat(value: (Double, js.Any) => String): Self = this.set("format", js.Any.fromFunction2(value))
    @scala.inline
    def setGetConfig(value: String => js.Any): Self = this.set("getConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setNumToStr(value: js.Any => WebixCallback): Self = this.set("numToStr", js.Any.fromFunction1(value))
    @scala.inline
    def setParse(value: (String, js.Any) => Double): Self = this.set("parse", js.Any.fromFunction2(value))
  }
  
}


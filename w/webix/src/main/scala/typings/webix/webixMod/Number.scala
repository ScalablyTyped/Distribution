package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  def format(value: Double, config: js.Any): String
  def getConfig(format: String): js.Any
  def numToStr(config: js.Any): WebixCallback
  def parse(value: String, config: js.Any): Double
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
}


package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  def format(value: scala.Double, config: js.Any): java.lang.String
  def getConfig(format: java.lang.String): js.Any
  def numToStr(config: js.Any): webixLib.WebixCallback
  def parse(value: java.lang.String, config: js.Any): scala.Double
}

object Number {
  @scala.inline
  def apply(
    format: (scala.Double, js.Any) => java.lang.String,
    getConfig: java.lang.String => js.Any,
    numToStr: js.Any => webixLib.WebixCallback,
    parse: (java.lang.String, js.Any) => scala.Double
  ): Number = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), getConfig = js.Any.fromFunction1(getConfig), numToStr = js.Any.fromFunction1(numToStr), parse = js.Any.fromFunction2(parse))
  
    __obj.asInstanceOf[Number]
  }
}


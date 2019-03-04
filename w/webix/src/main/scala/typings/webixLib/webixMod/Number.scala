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
    format: js.Function2[scala.Double, js.Any, java.lang.String],
    getConfig: js.Function1[java.lang.String, js.Any],
    numToStr: js.Function1[js.Any, webixLib.WebixCallback],
    parse: js.Function2[java.lang.String, js.Any, scala.Double]
  ): Number = {
    val __obj = js.Dynamic.literal(format = format, getConfig = getConfig, numToStr = numToStr, parse = parse)
  
    __obj.asInstanceOf[Number]
  }
}


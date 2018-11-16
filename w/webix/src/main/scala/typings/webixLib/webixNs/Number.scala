package typings
package webixLib.webixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Number extends js.Object {
  def format(value: scala.Double, config: js.Any): java.lang.String
  def getConfig(format: java.lang.String): js.Any
  def numToStr(config: js.Any): WebixCallback
  def parse(value: java.lang.String, config: js.Any): scala.Double
}


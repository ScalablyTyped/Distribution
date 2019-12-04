package typings.webix.webix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  def format(value: Double, config: js.Any): String
  def getConfig(format: String): js.Any
  def numToStr(config: js.Any): WebixCallback
  def parse(value: String, config: js.Any): Double
}

@JSGlobal("webix.Number")
@js.native
object Number extends TopLevel[Number]


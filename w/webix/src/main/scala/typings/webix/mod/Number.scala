package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
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

@JSImport("webix", "Number")
@js.native
object Number extends TopLevel[Number]


package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sparklines extends js.Object {
  var paddingX: Double
  var paddingY: Double
  var radius: Double
  def template(item: js.Any, common: String, data: js.Array[_], column: js.Any, index: Double): String
}

@JSImport("webix", "Sparklines")
@js.native
object Sparklines extends TopLevel[Sparklines]


package typings.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBG extends js.Object {
  var b: Double
  var g: Double
  var names: js.Array[String]
  var r: Double
}

object AnonBG {
  @scala.inline
  def apply(b: Double, g: Double, names: js.Array[String], r: Double): AnonBG = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBG]
  }
}


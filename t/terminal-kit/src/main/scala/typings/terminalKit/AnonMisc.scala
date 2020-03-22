package typings.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMisc extends js.Object {
  var attr: Double
  var misc: js.Any
  var offset: Double
  var text: String
  var x: Double
  var y: Double
}

object AnonMisc {
  @scala.inline
  def apply(attr: Double, misc: js.Any, offset: Double, text: String, x: Double, y: Double): AnonMisc = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMisc]
  }
}


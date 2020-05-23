package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeChange extends js.Object {
  var codeChange: scala.Double
  var system: scala.Double
  var text: scala.Double
  var unknown: scala.Double
}

object CodeChange {
  @scala.inline
  def apply(codeChange: scala.Double, system: scala.Double, text: scala.Double, unknown: scala.Double): CodeChange = {
    val __obj = js.Dynamic.literal(codeChange = codeChange.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeChange]
  }
}


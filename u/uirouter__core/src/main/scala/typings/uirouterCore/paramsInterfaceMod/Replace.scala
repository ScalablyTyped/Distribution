package typings.uirouterCore.paramsInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replace extends js.Object {
  /**
    * The value to replace.
    *
    * May be `null` or `undefined`.
    * The entire value must match using `===`.
    * When found, the [[to]] value is used instead.
    */
  var from: String
  /**
    * The new value
    *
    * Used instead of the [[from]] value.
    */
  var to: String
}

object Replace {
  @scala.inline
  def apply(from: String, to: String): Replace = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Replace]
  }
}


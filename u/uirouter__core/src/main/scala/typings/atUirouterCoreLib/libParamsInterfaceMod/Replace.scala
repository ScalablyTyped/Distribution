package typings
package atUirouterCoreLib.libParamsInterfaceMod

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
  var from: java.lang.String
  /**
    * The new value
    *
    * Used instead of the [[from]] value.
    */
  var to: java.lang.String
}

object Replace {
  @scala.inline
  def apply(from: java.lang.String, to: java.lang.String): Replace = {
    val __obj = js.Dynamic.literal(from = from, to = to)
  
    __obj.asInstanceOf[Replace]
  }
}


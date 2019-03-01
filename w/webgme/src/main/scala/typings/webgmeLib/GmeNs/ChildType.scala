package typings
package webgmeLib.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildType extends js.Object {
  /**
    * The id of the loaded new child type
    */
  var id: java.lang.String
  /**
    * the maximum allowed children of this type
    */
  var max: scala.Double
  /**
    * the minimum necessary amount of this type of child
    */
  var min: scala.Double
}

object ChildType {
  @scala.inline
  def apply(id: java.lang.String, max: scala.Double, min: scala.Double): ChildType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[ChildType]
  }
}


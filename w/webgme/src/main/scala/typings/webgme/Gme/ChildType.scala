package typings.webgme.Gme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildType extends js.Object {
  /**
    * The id of the loaded new child type
    */
  var id: String
  /**
    * the maximum allowed children of this type
    */
  var max: Double
  /**
    * the minimum necessary amount of this type of child
    */
  var min: Double
}

object ChildType {
  @scala.inline
  def apply(id: String, max: Double, min: Double): ChildType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChildType]
  }
}


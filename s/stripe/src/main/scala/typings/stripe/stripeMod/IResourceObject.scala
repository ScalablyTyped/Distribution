package typings.stripe.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceObject extends IObject {
  var id: String
}

object IResourceObject {
  @scala.inline
  def apply(id: String, `object`: String): IResourceObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceObject]
  }
}


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
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IResourceObject]
  }
}


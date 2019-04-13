package typings
package stripeLib.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceObject extends IObject {
  var id: java.lang.String
}

object IResourceObject {
  @scala.inline
  def apply(id: java.lang.String, `object`: java.lang.String): IResourceObject = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IResourceObject]
  }
}


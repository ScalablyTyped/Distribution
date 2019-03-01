package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * State Object
  */
trait IStateObject extends js.Object {
  var id: scala.Double
  var name: java.lang.String
  var parentId: scala.Double
}

object IStateObject {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String, parentId: scala.Double): IStateObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parentId")(parentId)
    __obj.asInstanceOf[IStateObject]
  }
}


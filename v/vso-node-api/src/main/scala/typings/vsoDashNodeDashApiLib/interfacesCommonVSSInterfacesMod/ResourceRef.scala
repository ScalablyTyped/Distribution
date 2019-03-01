package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRef extends js.Object {
  var id: java.lang.String
  var url: java.lang.String
}

object ResourceRef {
  @scala.inline
  def apply(id: java.lang.String, url: java.lang.String): ResourceRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ResourceRef]
  }
}


package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRef extends js.Object {
  var id: String
  var url: String
}

object ResourceRef {
  @scala.inline
  def apply(id: String, url: String): ResourceRef = {
    val __obj = js.Dynamic.literal(id = id, url = url)
  
    __obj.asInstanceOf[ResourceRef]
  }
}


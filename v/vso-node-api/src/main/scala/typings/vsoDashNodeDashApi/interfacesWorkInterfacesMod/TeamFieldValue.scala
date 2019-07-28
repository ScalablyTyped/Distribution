package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamFieldValue extends js.Object {
  var includeChildren: Boolean
  var value: String
}

object TeamFieldValue {
  @scala.inline
  def apply(includeChildren: Boolean, value: String): TeamFieldValue = {
    val __obj = js.Dynamic.literal(includeChildren = includeChildren, value = value)
  
    __obj.asInstanceOf[TeamFieldValue]
  }
}


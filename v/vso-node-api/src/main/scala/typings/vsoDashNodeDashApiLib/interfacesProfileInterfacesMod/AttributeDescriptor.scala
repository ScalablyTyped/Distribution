package typings
package vsoDashNodeDashApiLib.interfacesProfileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeDescriptor extends js.Object {
  var attributeName: java.lang.String
  var containerName: java.lang.String
}

object AttributeDescriptor {
  @scala.inline
  def apply(attributeName: java.lang.String, containerName: java.lang.String): AttributeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributeName")(attributeName)
    __obj.updateDynamic("containerName")(containerName)
    __obj.asInstanceOf[AttributeDescriptor]
  }
}


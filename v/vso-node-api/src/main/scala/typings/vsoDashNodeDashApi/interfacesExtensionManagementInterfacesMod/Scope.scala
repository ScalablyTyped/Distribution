package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var description: String
  var title: String
  var value: String
}

object Scope {
  @scala.inline
  def apply(description: String, title: String, value: String): Scope = {
    val __obj = js.Dynamic.literal(description = description, title = title, value = value)
  
    __obj.asInstanceOf[Scope]
  }
}


package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var description: java.lang.String
  var title: java.lang.String
  var value: java.lang.String
}

object Scope {
  @scala.inline
  def apply(description: java.lang.String, title: java.lang.String, value: java.lang.String): Scope = {
    val __obj = js.Dynamic.literal(description = description, title = title, value = value)
  
    __obj.asInstanceOf[Scope]
  }
}


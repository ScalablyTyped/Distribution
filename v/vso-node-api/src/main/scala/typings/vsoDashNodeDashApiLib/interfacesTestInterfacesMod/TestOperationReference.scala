package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOperationReference extends js.Object {
  var id: java.lang.String
  var status: java.lang.String
  var url: java.lang.String
}

object TestOperationReference {
  @scala.inline
  def apply(id: java.lang.String, status: java.lang.String, url: java.lang.String): TestOperationReference = {
    val __obj = js.Dynamic.literal(id = id, status = status, url = url)
  
    __obj.asInstanceOf[TestOperationReference]
  }
}


package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var error: java.lang.String
  var id: java.lang.String
  var status: java.lang.String
  var url: java.lang.String
}

object Response {
  @scala.inline
  def apply(error: java.lang.String, id: java.lang.String, status: java.lang.String, url: java.lang.String): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Response]
  }
}


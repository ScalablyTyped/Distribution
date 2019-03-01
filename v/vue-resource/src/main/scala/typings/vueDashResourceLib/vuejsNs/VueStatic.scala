package typings
package vueDashResourceLib.vuejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueStatic extends js.Object {
  var http: Http
  var resource: Resource
}

object VueStatic {
  @scala.inline
  def apply(http: Http, resource: Resource): VueStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("http")(http)
    __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[VueStatic]
  }
}


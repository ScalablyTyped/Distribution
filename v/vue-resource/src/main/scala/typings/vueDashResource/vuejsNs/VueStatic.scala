package typings.vueDashResource.vuejsNs

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
    val __obj = js.Dynamic.literal(http = http, resource = resource)
  
    __obj.asInstanceOf[VueStatic]
  }
}


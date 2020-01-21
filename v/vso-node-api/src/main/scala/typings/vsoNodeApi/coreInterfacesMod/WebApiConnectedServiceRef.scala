package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiConnectedServiceRef extends js.Object {
  var id: String
  var url: String
}

object WebApiConnectedServiceRef {
  @scala.inline
  def apply(id: String, url: String): WebApiConnectedServiceRef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebApiConnectedServiceRef]
  }
}


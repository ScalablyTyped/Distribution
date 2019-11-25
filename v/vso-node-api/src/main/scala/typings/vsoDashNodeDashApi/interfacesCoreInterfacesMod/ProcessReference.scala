package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessReference extends js.Object {
  var name: String
  var url: String
}

object ProcessReference {
  @scala.inline
  def apply(name: String, url: String): ProcessReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessReference]
  }
}


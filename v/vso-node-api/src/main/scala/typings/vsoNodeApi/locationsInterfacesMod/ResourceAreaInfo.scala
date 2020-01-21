package typings.vsoNodeApi.locationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceAreaInfo extends js.Object {
  var id: String
  var locationUrl: String
  var name: String
}

object ResourceAreaInfo {
  @scala.inline
  def apply(id: String, locationUrl: String, name: String): ResourceAreaInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], locationUrl = locationUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceAreaInfo]
  }
}


package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  var displayName: String
  var id: String
  var imageUrl: String
  var uniqueName: String
  var url: String
}

object Member {
  @scala.inline
  def apply(displayName: String, id: String, imageUrl: String, uniqueName: String, url: String): Member = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
}


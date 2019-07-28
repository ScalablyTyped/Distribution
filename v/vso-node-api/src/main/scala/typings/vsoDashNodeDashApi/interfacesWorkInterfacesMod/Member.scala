package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

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
    val __obj = js.Dynamic.literal(displayName = displayName, id = id, imageUrl = imageUrl, uniqueName = uniqueName, url = url)
  
    __obj.asInstanceOf[Member]
  }
}


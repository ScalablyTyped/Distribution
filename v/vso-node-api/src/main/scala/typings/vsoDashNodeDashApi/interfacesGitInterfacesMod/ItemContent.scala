package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemContent extends js.Object {
  var content: String
  var contentType: ItemContentType
}

object ItemContent {
  @scala.inline
  def apply(content: String, contentType: ItemContentType): ItemContent = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType)
  
    __obj.asInstanceOf[ItemContent]
  }
}


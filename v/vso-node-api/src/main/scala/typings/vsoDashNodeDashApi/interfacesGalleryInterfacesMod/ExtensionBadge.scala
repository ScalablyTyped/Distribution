package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionBadge extends js.Object {
  var description: String
  var imgUri: String
  var link: String
}

object ExtensionBadge {
  @scala.inline
  def apply(description: String, imgUri: String, link: String): ExtensionBadge = {
    val __obj = js.Dynamic.literal(description = description, imgUri = imgUri, link = link)
  
    __obj.asInstanceOf[ExtensionBadge]
  }
}


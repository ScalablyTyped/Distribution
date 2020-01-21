package typings.vsoNodeApi.galleryInterfacesMod

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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], imgUri = imgUri.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionBadge]
  }
}


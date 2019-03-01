package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionBadge extends js.Object {
  var description: java.lang.String
  var imgUri: java.lang.String
  var link: java.lang.String
}

object ExtensionBadge {
  @scala.inline
  def apply(description: java.lang.String, imgUri: java.lang.String, link: java.lang.String): ExtensionBadge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("imgUri")(imgUri)
    __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[ExtensionBadge]
  }
}


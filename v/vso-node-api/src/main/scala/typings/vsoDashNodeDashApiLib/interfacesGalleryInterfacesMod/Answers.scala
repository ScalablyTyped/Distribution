package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Answers extends js.Object {
  /**
    * Gets or sets the vs marketplace extension name
    */
  var vSMarketplaceExtensionName: java.lang.String
  /**
    * Gets or sets the vs marketplace publsiher name
    */
  var vSMarketplacePublisherName: java.lang.String
}

object Answers {
  @scala.inline
  def apply(vSMarketplaceExtensionName: java.lang.String, vSMarketplacePublisherName: java.lang.String): Answers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("vSMarketplaceExtensionName")(vSMarketplaceExtensionName)
    __obj.updateDynamic("vSMarketplacePublisherName")(vSMarketplacePublisherName)
    __obj.asInstanceOf[Answers]
  }
}


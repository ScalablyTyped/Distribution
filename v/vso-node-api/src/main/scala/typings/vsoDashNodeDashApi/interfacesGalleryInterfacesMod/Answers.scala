package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Answers extends js.Object {
  /**
    * Gets or sets the vs marketplace extension name
    */
  var vSMarketplaceExtensionName: String
  /**
    * Gets or sets the vs marketplace publsiher name
    */
  var vSMarketplacePublisherName: String
}

object Answers {
  @scala.inline
  def apply(vSMarketplaceExtensionName: String, vSMarketplacePublisherName: String): Answers = {
    val __obj = js.Dynamic.literal(vSMarketplaceExtensionName = vSMarketplaceExtensionName.asInstanceOf[js.Any], vSMarketplacePublisherName = vSMarketplacePublisherName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Answers]
  }
}


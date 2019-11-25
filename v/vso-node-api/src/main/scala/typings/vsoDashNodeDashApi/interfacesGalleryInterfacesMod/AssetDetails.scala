package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetDetails extends js.Object {
  /**
    * Gets or sets the Answers, which contains vs marketplace extension name and publisher name
    */
  var answers: Answers
  /**
    * Gets or sets the VS publisher Id
    */
  var publisherNaturalIdentifier: String
}

object AssetDetails {
  @scala.inline
  def apply(answers: Answers, publisherNaturalIdentifier: String): AssetDetails = {
    val __obj = js.Dynamic.literal(answers = answers.asInstanceOf[js.Any], publisherNaturalIdentifier = publisherNaturalIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssetDetails]
  }
}


package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  var publisherNaturalIdentifier: java.lang.String
}

object AssetDetails {
  @scala.inline
  def apply(answers: Answers, publisherNaturalIdentifier: java.lang.String): AssetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("answers")(answers)
    __obj.updateDynamic("publisherNaturalIdentifier")(publisherNaturalIdentifier)
    __obj.asInstanceOf[AssetDetails]
  }
}


package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A monetary amount identified in the input document. */
trait ContractAmts extends js.Object {
  /** The confidence level in the identification of the contract amount. */
  var confidence_level: js.UndefOr[String] = js.undefined
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  /** The monetary amount. */
  var text: js.UndefOr[String] = js.undefined
}

object ContractAmts {
  @scala.inline
  def apply(confidence_level: String = null, location: Location = null, text: String = null): ContractAmts = {
    val __obj = js.Dynamic.literal()
    if (confidence_level != null) __obj.updateDynamic("confidence_level")(confidence_level.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractAmts]
  }
}


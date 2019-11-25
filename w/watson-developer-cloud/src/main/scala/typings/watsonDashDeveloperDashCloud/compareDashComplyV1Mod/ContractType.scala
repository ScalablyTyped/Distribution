package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The contract type identified in the input document. */
trait ContractType extends js.Object {
  /** The confidence level in the identification of the termination date. */
  var confidence_level: js.UndefOr[String] = js.undefined
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  /** The contract type. */
  var text: js.UndefOr[String] = js.undefined
}

object ContractType {
  @scala.inline
  def apply(confidence_level: String = null, location: Location = null, text: String = null): ContractType = {
    val __obj = js.Dynamic.literal()
    if (confidence_level != null) __obj.updateDynamic("confidence_level")(confidence_level.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractType]
  }
}


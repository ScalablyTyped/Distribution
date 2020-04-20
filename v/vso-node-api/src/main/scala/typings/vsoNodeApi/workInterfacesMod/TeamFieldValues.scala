package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamFieldValues extends TeamSettingsDataContractBase {
  /**
    * The default team field value
    */
  var defaultValue: String
  /**
    * Shallow ref to the field being used as a team field
    */
  var field: FieldReference
  /**
    * Collection of all valid team field values
    */
  var values: js.Array[TeamFieldValue]
}

object TeamFieldValues {
  @scala.inline
  def apply(
    _links: js.Any,
    defaultValue: String,
    field: FieldReference,
    url: String,
    values: js.Array[TeamFieldValue]
  ): TeamFieldValues = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamFieldValues]
  }
}


package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamFieldValues extends TeamSettingsDataContractBase {
  /**
    * The default team field value
    */
  var defaultValue: java.lang.String
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
    defaultValue: java.lang.String,
    field: FieldReference,
    url: java.lang.String,
    values: js.Array[TeamFieldValue]
  ): TeamFieldValues = {
    val __obj = js.Dynamic.literal(_links = _links, defaultValue = defaultValue, field = field, url = url, values = values)
  
    __obj.asInstanceOf[TeamFieldValues]
  }
}


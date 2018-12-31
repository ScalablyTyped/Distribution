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


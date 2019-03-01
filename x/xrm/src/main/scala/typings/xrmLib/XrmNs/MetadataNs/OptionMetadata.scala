package typings
package xrmLib.XrmNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type to hold the optionset metadata as part of the EntityMetadata
  */
trait OptionMetadata extends js.Object {
  var Color: java.lang.String
  var Description: Label
  var ExternalValue: js.Any
  var HasChanged: scala.Boolean
  var IsManaged: scala.Boolean
  var Label: Label
  var MetadataId: java.lang.String
  var State: scala.Double
  var TransitionData: js.Any
  var Value: scala.Double
}

object OptionMetadata {
  @scala.inline
  def apply(
    Color: java.lang.String,
    Description: Label,
    ExternalValue: js.Any,
    HasChanged: scala.Boolean,
    IsManaged: scala.Boolean,
    Label: Label,
    MetadataId: java.lang.String,
    State: scala.Double,
    TransitionData: js.Any,
    Value: scala.Double
  ): OptionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Color")(Color)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("ExternalValue")(ExternalValue)
    __obj.updateDynamic("HasChanged")(HasChanged)
    __obj.updateDynamic("IsManaged")(IsManaged)
    __obj.updateDynamic("Label")(Label)
    __obj.updateDynamic("MetadataId")(MetadataId)
    __obj.updateDynamic("State")(State)
    __obj.updateDynamic("TransitionData")(TransitionData)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[OptionMetadata]
  }
}


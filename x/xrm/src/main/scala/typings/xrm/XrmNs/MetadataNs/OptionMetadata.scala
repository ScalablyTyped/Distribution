package typings.xrm.XrmNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type to hold the optionset metadata as part of the EntityMetadata
  */
trait OptionMetadata extends js.Object {
  var Color: String
  var Description: Label
  var ExternalValue: js.Any
  var HasChanged: Boolean
  var IsManaged: Boolean
  var Label: typings.xrm.XrmNs.MetadataNs.Label
  var MetadataId: String
  var State: Double
  var TransitionData: js.Any
  var Value: Double
}

object OptionMetadata {
  @scala.inline
  def apply(
    Color: String,
    Description: Label,
    ExternalValue: js.Any,
    HasChanged: Boolean,
    IsManaged: Boolean,
    Label: Label,
    MetadataId: String,
    State: Double,
    TransitionData: js.Any,
    Value: Double
  ): OptionMetadata = {
    val __obj = js.Dynamic.literal(Color = Color, Description = Description, ExternalValue = ExternalValue, HasChanged = HasChanged, IsManaged = IsManaged, Label = Label, MetadataId = MetadataId, State = State, TransitionData = TransitionData, Value = Value)
  
    __obj.asInstanceOf[OptionMetadata]
  }
}


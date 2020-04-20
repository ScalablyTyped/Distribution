package typings.xrm.Xrm.Metadata

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
  var Label: typings.xrm.Xrm.Metadata.Label
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
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], ExternalValue = ExternalValue.asInstanceOf[js.Any], HasChanged = HasChanged.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], TransitionData = TransitionData.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionMetadata]
  }
}


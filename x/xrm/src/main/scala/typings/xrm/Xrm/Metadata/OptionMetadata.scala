package typings.xrm.Xrm.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type to hold the optionset metadata as part of the EntityMetadata
  */
@js.native
trait OptionMetadata extends js.Object {
  var Color: String = js.native
  var Description: Label = js.native
  var ExternalValue: js.Any = js.native
  var HasChanged: Boolean = js.native
  var IsManaged: Boolean = js.native
  var Label: typings.xrm.Xrm.Metadata.Label = js.native
  var MetadataId: String = js.native
  var State: Double = js.native
  var TransitionData: js.Any = js.native
  var Value: Double = js.native
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
  @scala.inline
  implicit class OptionMetadataOps[Self <: OptionMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("Color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Label): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalValue(value: js.Any): Self = this.set("ExternalValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasChanged(value: Boolean): Self = this.set("HasChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsManaged(value: Boolean): Self = this.set("IsManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Label): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataId(value: String): Self = this.set("MetadataId", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: Double): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionData(value: js.Any): Self = this.set("TransitionData", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}


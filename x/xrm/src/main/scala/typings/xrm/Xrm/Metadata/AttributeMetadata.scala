package typings.xrm.Xrm.Metadata

import typings.xrm.XrmEnum.AttributeTypeCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Type to hold the Attribute metadata as part of the EntityMetadata
  */
@js.native
trait AttributeMetadata extends js.Object {
  
  var AttributeType: AttributeTypeCode = js.native
  
  var DefaultFormValue: Double = js.native
  
  var DisplayName: String = js.native
  
  var EntityLogicalName: String = js.native
  
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var LogicalName: String = js.native
  
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var OptionSet: js.Array[OptionMetadata] = js.native
}
object AttributeMetadata {
  
  @scala.inline
  def apply(
    AttributeType: AttributeTypeCode,
    DefaultFormValue: Double,
    DisplayName: String,
    EntityLogicalName: String,
    LogicalName: String,
    OptionSet: js.Array[OptionMetadata]
  ): AttributeMetadata = {
    val __obj = js.Dynamic.literal(AttributeType = AttributeType.asInstanceOf[js.Any], DefaultFormValue = DefaultFormValue.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], EntityLogicalName = EntityLogicalName.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], OptionSet = OptionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeMetadata]
  }
  
  @scala.inline
  implicit class AttributeMetadataOps[Self <: AttributeMetadata] (val x: Self) extends AnyVal {
    
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
    def setAttributeType(value: AttributeTypeCode): Self = this.set("AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFormValue(value: Double): Self = this.set("DefaultFormValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityLogicalName(value: String): Self = this.set("EntityLogicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalName(value: String): Self = this.set("LogicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionSetVarargs(value: OptionMetadata*): Self = this.set("OptionSet", js.Array(value :_*))
    
    @scala.inline
    def setOptionSet(value: js.Array[OptionMetadata]): Self = this.set("OptionSet", value.asInstanceOf[js.Any])
  }
}

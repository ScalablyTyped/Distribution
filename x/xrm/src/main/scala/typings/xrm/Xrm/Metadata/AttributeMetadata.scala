package typings.xrm.Xrm.Metadata

import typings.xrm.XrmEnum.AttributeTypeCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type to hold the Attribute metadata as part of the EntityMetadata
  */
trait AttributeMetadata extends js.Object {
  var attributeType: AttributeTypeCode
  var defaultFormValue: Double
  var displayName: String
  var entityLogicalName: String
  var logicalName: String
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var optionSet: js.Array[OptionMetadata]
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var options: js.Array[String]
}

object AttributeMetadata {
  @scala.inline
  def apply(
    attributeType: AttributeTypeCode,
    defaultFormValue: Double,
    displayName: String,
    entityLogicalName: String,
    logicalName: String,
    optionSet: js.Array[OptionMetadata],
    options: js.Array[String]
  ): AttributeMetadata = {
    val __obj = js.Dynamic.literal(attributeType = attributeType.asInstanceOf[js.Any], defaultFormValue = defaultFormValue.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], entityLogicalName = entityLogicalName.asInstanceOf[js.Any], logicalName = logicalName.asInstanceOf[js.Any], optionSet = optionSet.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeMetadata]
  }
}


package typings.xrm.XrmNs.MetadataNs

import typings.xrm.XrmEnumNs.AttributeTypeCode
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
    val __obj = js.Dynamic.literal(attributeType = attributeType, defaultFormValue = defaultFormValue, displayName = displayName, entityLogicalName = entityLogicalName, logicalName = logicalName, optionSet = optionSet, options = options)
  
    __obj.asInstanceOf[AttributeMetadata]
  }
}


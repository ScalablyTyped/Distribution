package typings
package xrmLib.XrmNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type to hold the Attribute metadata as part of the EntityMetadata
  */
trait AttributeMetadata extends js.Object {
  var attributeType: xrmLib.XrmEnumNs.AttributeTypeCode
  var defaultFormValue: scala.Double
  var displayName: java.lang.String
  var entityLogicalName: java.lang.String
  var logicalName: java.lang.String
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var optionSet: js.Array[OptionMetadata]
  /**
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var options: js.Array[java.lang.String]
}

object AttributeMetadata {
  @scala.inline
  def apply(
    attributeType: xrmLib.XrmEnumNs.AttributeTypeCode,
    defaultFormValue: scala.Double,
    displayName: java.lang.String,
    entityLogicalName: java.lang.String,
    logicalName: java.lang.String,
    optionSet: js.Array[OptionMetadata],
    options: js.Array[java.lang.String]
  ): AttributeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributeType")(attributeType)
    __obj.updateDynamic("defaultFormValue")(defaultFormValue)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("entityLogicalName")(entityLogicalName)
    __obj.updateDynamic("logicalName")(logicalName)
    __obj.updateDynamic("optionSet")(optionSet)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AttributeMetadata]
  }
}


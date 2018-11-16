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


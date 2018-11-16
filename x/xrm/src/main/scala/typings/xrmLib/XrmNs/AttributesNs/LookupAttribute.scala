package typings
package xrmLib.XrmNs.AttributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Interface a Lookup attribute.
         *
         * @see {@link Attribute}
         */

trait LookupAttribute extends Attribute {
  /**
               * A collection of all the controls on the form that interface with this attribute.
               * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
               */
  @JSName("controls")
  var controls_LookupAttribute: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.LookupControl]
  /**
               * Gets a boolean value indicating whether the Lookup is a multi-value PartyList.
               * @returns true the attribute is a PartyList, otherwise false.
               */
  def getIsPartyList(): scala.Boolean
  /**
               * Sets the value.
               * @param value The value.
               * @remarks Attributes on Quick Create Forms will not save values set with this method.
               */
  def setValue(value: js.Array[xrmLib.XrmNs.LookupValue]): scala.Unit
}


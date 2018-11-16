package typings
package xrmLib.XrmNs.AttributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Interface for a String attribute.
         * @see {@link Attribute}
         */

trait StringAttribute extends Attribute {
  /**
               * A collection of all the controls on the form that interface with this attribute.
               * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
               */
  @JSName("controls")
  var controls_StringAttribute: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.StringControl]
  /**
               * Gets maximum length allowed.
               * @returns The maximum length allowed.
               * @remarks The email form's "Description" attribute does not have the this method.
               */
  def getMaxLength(): scala.Double
  /**
               * Sets the value.
               * @param value The value.
               * @remarks A String field with the {@link Attribute.getFormat|email} format enforces email
               *          address formatting. Attributes on Quick Create Forms will not save values set
               *          with this method.
               */
  def setValue(value: java.lang.String): scala.Unit
}


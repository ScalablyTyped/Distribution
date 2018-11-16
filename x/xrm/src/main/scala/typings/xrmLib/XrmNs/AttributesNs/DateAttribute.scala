package typings
package xrmLib.XrmNs.AttributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Interface for a Date attribute.
         *
         * @see {@link Attribute}
         */

trait DateAttribute extends Attribute {
  /**
               * A collection of all the controls on the form that interface with this attribute.
               * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
               */
  @JSName("controls")
  var controls_DateAttribute: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.DateControl]
  /**
               * Sets the value.
               * @param value The value.
               * @remarks Attributes on Quick Create Forms will not save values set with this method.
               */
  def setValue(value: stdLib.Date): scala.Unit
}


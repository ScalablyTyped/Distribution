package typings
package xrmLib.XrmNs.AttributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Number attribute.
  * @see {@link Attribute}
  */
trait NumberAttribute extends Attribute {
  /**
    * A collection of all the controls on the form that interface with this attribute.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  @JSName("controls")
  var controls_NumberAttribute: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.NumberControl]
  /**
    * Gets the maximum value allowed.
    * @returns The maximum value allowed.
    */
  def getMax(): scala.Double
  /**
    * Gets the minimum value allowed.
    * @returns The minimum value allowed.
    */
  def getMin(): scala.Double
  /**
    * Gets the attribute's configured precision.
    * @returns The total number of allowed decimal places.
    */
  def getPrecision(): scala.Double
  /**
    * Sets the value.
    * @param value The value.
    * @remarks Attributes on Quick Create Forms will not save values set with this method.
    */
  def setValue(value: scala.Double): scala.Unit
}


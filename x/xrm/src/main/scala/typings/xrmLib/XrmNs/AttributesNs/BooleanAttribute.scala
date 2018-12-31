package typings
package xrmLib.XrmNs.AttributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Boolean attribute.
  * @see {@link EnumAttribute}
  */
trait BooleanAttribute extends EnumAttribute {
  /**
    * Sets the value.
    * @param value The value.
    * @remarks Attributes on Quick Create Forms will not save values set with this method.
    */
  def setValue(value: scala.Boolean): scala.Unit
}


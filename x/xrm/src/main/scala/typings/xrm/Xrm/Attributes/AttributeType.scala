package typings.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attribute types for {@link Attributes.Attribute.setDisplayState()}.
  * @see {@link XrmEnum.AttributeType}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.boolean
  - typings.xrm.xrmStrings.datetime
  - typings.xrm.xrmStrings.decimal
  - typings.xrm.xrmStrings.double
  - typings.xrm.xrmStrings.integer
  - typings.xrm.xrmStrings.lookup
  - typings.xrm.xrmStrings.memo
  - typings.xrm.xrmStrings.money
  - typings.xrm.xrmStrings.multioptionset
  - typings.xrm.xrmStrings.optionset
  - typings.xrm.xrmStrings.string
*/
trait AttributeType extends js.Object

object AttributeType {
  @scala.inline
  def boolean: typings.xrm.xrmStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def datetime: typings.xrm.xrmStrings.datetime = this.cast("datetime")
  @scala.inline
  def decimal: typings.xrm.xrmStrings.decimal = this.cast("decimal")
  @scala.inline
  def double: typings.xrm.xrmStrings.double = this.cast("double")
  @scala.inline
  def integer: typings.xrm.xrmStrings.integer = this.cast("integer")
  @scala.inline
  def lookup: typings.xrm.xrmStrings.lookup = this.cast("lookup")
  @scala.inline
  def memo: typings.xrm.xrmStrings.memo = this.cast("memo")
  @scala.inline
  def money: typings.xrm.xrmStrings.money = this.cast("money")
  @scala.inline
  def multioptionset: typings.xrm.xrmStrings.multioptionset = this.cast("multioptionset")
  @scala.inline
  def optionset: typings.xrm.xrmStrings.optionset = this.cast("optionset")
  @scala.inline
  def string: typings.xrm.xrmStrings.string = this.cast("string")
}


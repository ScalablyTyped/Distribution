package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Attribute types for {@link Attributes.Attribute.setDisplayState()}.
  * @see {@link Xrm.Attributes.AttributeType}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.boolean
  - xrmLib.xrmLibStrings.datetime
  - xrmLib.xrmLibStrings.decimal
  - xrmLib.xrmLibStrings.double
  - xrmLib.xrmLibStrings.integer
  - xrmLib.xrmLibStrings.lookup
  - xrmLib.xrmLibStrings.memo
  - xrmLib.xrmLibStrings.money
  - xrmLib.xrmLibStrings.multioptionset
  - xrmLib.xrmLibStrings.optionset
  - xrmLib.xrmLibStrings.string
*/
trait AttributeType extends js.Object

object AttributeType {
  @scala.inline
  def Boolean: xrmLib.xrmLibStrings.boolean = this.cast("boolean")
  @scala.inline
  def DateTime: xrmLib.xrmLibStrings.datetime = this.cast("datetime")
  @scala.inline
  def Decimal: xrmLib.xrmLibStrings.decimal = this.cast("decimal")
  @scala.inline
  def Double: xrmLib.xrmLibStrings.double = this.cast("double")
  @scala.inline
  def Integer: xrmLib.xrmLibStrings.integer = this.cast("integer")
  @scala.inline
  def Lookup: xrmLib.xrmLibStrings.lookup = this.cast("lookup")
  @scala.inline
  def Memo: xrmLib.xrmLibStrings.memo = this.cast("memo")
  @scala.inline
  def Money: xrmLib.xrmLibStrings.money = this.cast("money")
  @scala.inline
  def MultiOptionSet: xrmLib.xrmLibStrings.multioptionset = this.cast("multioptionset")
  @scala.inline
  def OptionSet: xrmLib.xrmLibStrings.optionset = this.cast("optionset")
  @scala.inline
  def String: xrmLib.xrmLibStrings.string = this.cast("string")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


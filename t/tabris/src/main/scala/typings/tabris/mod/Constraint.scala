package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Constraint")
@js.native
class Constraint protected () extends _ConstraintValue {
  def this(reference: Percent, offset: Offset) = this()
  def this(reference: SiblingReference, offset: Offset) = this()
  /**
    * An additional distance between the reference point and the edge of the widget itself.
    * @constant
    */
  var offset: Offset = js.native
  /**
    * A reference point from which the offset is added. Either a
    * [SiblingReference](../types.md#siblingreference) - indicating the opposing edge of that widget - or a
    * [`Percent`](./Percent.md) instance, indicating a fraction of the width/height (padding excluded) of
    * the parent widget.
    * If the sibling reference is a string it will be a valid selector string and not contain any pseudo
    * selectors   (`'next()'`/`'prev()'`).
    * @constant
    */
  var reference: Percent | SiblingReference = js.native
  /**
    * Tests if the given value is a `Constraint` instance that is deeply equal to this one.
    * @param value
    */
  def equals(value: Constraint): Boolean = js.native
  /**
    * A tuple consisting of the values of the `reference` and `offset` properties, i.e. `[reference,
    * offset]`.
    */
  def toArray(): ConstraintArray = js.native
}

/* static members */
@JSImport("tabris", "Constraint")
@js.native
object Constraint extends js.Object {
  /**
    * A [SiblingReference](../types.md#siblingreference) indicating the next widget in the list of children
    * attached to the same parent. Used by the [`reference`](#reference) property. Also available as
    * `LayoutData.next`.
    */
  val next: js.Symbol = js.native
  /**
    * A [SiblingReference](../types.md#siblingreference) indicating the previous widget in the list of
    * children attached to the same parent. Used by the [`reference`](#reference) property. Also available
    * as `LayoutData.prev`.
    */
  val prev: js.Symbol = js.native
  /**
    * Creates a new instance of Constraint using [any valid constraint
    * expression](../types.md#constraintvalue). For any other value, including `null` and `'auto'`, the
    * method throws.
    * @param constraintValue The value to create an Constraint instance from.
    */
  def from(constraintValue: ConstraintValue): Constraint = js.native
}


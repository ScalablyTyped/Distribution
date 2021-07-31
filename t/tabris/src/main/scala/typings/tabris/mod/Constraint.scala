package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Constraint")
@js.native
class Constraint protected ()
  extends StObject
     with _ConstraintValue {
  def this(reference: Percent, offset: Offset) = this()
  def this(reference: SiblingReference, offset: Offset) = this()
  
  /**
    * Tests if the given value is a `Constraint` instance that is deeply equal to this one.
    * @param value
    */
  def equals(value: Constraint): Boolean = js.native
  
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
    * A tuple consisting of the values of the `reference` and `offset` properties, i.e. `[reference,
    * offset]`.
    */
  def toArray(): ConstraintArray = js.native
}
/* static members */
object Constraint {
  
  @JSImport("tabris", "Constraint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance of Constraint using [any valid constraint
    * expression](../types.md#constraintvalue). For any other value, including `null` and `'auto'`, the
    * method throws.
    * @param constraintValue The value to create an Constraint instance from.
    */
  @scala.inline
  def from(constraintValue: ConstraintValue): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(constraintValue.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  
  /**
    * A [SiblingReference](../types.md#siblingreference) indicating the next widget in the list of children
    * attached to the same parent. Used by the [`reference`](#reference) property. Also available as
    * `LayoutData.next`.
    */
  @JSImport("tabris", "Constraint.next")
  @js.native
  val next: js.Symbol = js.native
  
  /**
    * A [SiblingReference](../types.md#siblingreference) indicating the previous widget in the list of
    * children attached to the same parent. Used by the [`reference`](#reference) property. Also available
    * as `LayoutData.prev`.
    */
  @JSImport("tabris", "Constraint.prev")
  @js.native
  val prev: js.Symbol = js.native
}

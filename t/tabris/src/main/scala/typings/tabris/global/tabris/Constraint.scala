package typings.tabris.global.tabris

import typings.tabris.mod.ConstraintValue
import typings.tabris.mod.Offset
import typings.tabris.mod.SiblingReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Constraint")
@js.native
class Constraint protected ()
  extends typings.tabris.mod.Constraint {
  def this(reference: typings.tabris.mod.Percent, offset: Offset) = this()
  def this(reference: SiblingReference, offset: Offset) = this()
}
/* static members */
object Constraint {
  
  @JSGlobal("tabris.Constraint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance of Constraint using [any valid constraint
    * expression](../types.md#constraintvalue). For any other value, including `null` and `'auto'`, the
    * method throws.
    * @param constraintValue The value to create an Constraint instance from.
    */
  inline def from(constraintValue: ConstraintValue): typings.tabris.mod.Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(constraintValue.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.Constraint]
  
  /**
    * A [SiblingReference](../types.md#siblingreference) indicating the next widget in the list of children
    * attached to the same parent. Used by the [`reference`](#reference) property. Also available as
    * `LayoutData.next`.
    */
  @JSGlobal("tabris.Constraint.next")
  @js.native
  val next: js.Symbol = js.native
  
  /**
    * A [SiblingReference](../types.md#siblingreference) indicating the previous widget in the list of
    * children attached to the same parent. Used by the [`reference`](#reference) property. Also available
    * as `LayoutData.prev`.
    */
  @JSGlobal("tabris.Constraint.prev")
  @js.native
  val prev: js.Symbol = js.native
}

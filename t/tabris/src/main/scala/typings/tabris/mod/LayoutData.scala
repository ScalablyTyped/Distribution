package typings.tabris.mod

import typings.tabris.tabrisStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "LayoutData")
@js.native
class LayoutData protected () extends js.Object {
  def this(parameters: LayoutDataProperties) = this()
  /**
    * The vertical position of the widget's baseline relative to a sibling widget.
    * @constant
    */
  val baseline: SiblingReference | auto = js.native
  /**
    * The position of the widget's bottom edge relative to the parent or a sibling widget. Must not be
    * negative.
    * @constant
    */
  val bottom: Constraint | auto = js.native
  /**
    * The horizontal position of the widget's center relative to the parent's center.
    * @constant
    */
  val centerX: Offset | auto = js.native
  /**
    * The vertical position of the widget's center relative to the parent's center.
    * @constant
    */
  val centerY: Offset | auto = js.native
  /**
    * The height of the widget.
    * @constant
    */
  val height: Dimension | auto = js.native
  /**
    * The position of the widget's left edge relative to the parent or a sibling widget. Must not be
    * negative.
    * @constant
    */
  val left: Constraint | auto = js.native
  /**
    * The position of the widget's right edge relative to the parent or a sibling widget. Must not be
    * negative.
    * @constant
    */
  val right: Constraint | auto = js.native
  /**
    * The position of the widget's top edge relative to the parent or a sibling widget. Must not be
    * negative.
    * @constant
    */
  val top: Constraint | auto = js.native
  /**
    * The width of the widget.
    * @constant
    */
  val width: Dimension | auto = js.native
  /**
    * Tests if the given value is a `LayoutData` instance that is deeply equal to this one.
    * @param value
    */
  def equals(value: LayoutData): Boolean = js.native
}

/* static members */
@JSImport("tabris", "LayoutData")
@js.native
object LayoutData extends js.Object {
  /**
    * An instance of LayoutData that centers a widget horizontally and vertically. Equivalent to
    * `LayoutData.from({centerX: 0, centerY: 0})`
    */
  val center: LayoutData = js.native
  /**
    * A [SiblingReference](../types.md#siblingreference) indicating the next widget in the list of children
    * attached to the same parent. Used by the [`baseline`](#baseline) property. An alias of
    * `Constraint.next`.
    */
  val next: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Constraint.next */ js.Any = js.native
  /**
    * A [SiblingReference](../types.md#siblingreference) indicating the previous widget in the list of
    * children attached to the same parent. Used by the [`baseline`](#baseline) property. An alias of
    * `Constraint.next`.
    */
  val prev: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Constraint.prev */ js.Any = js.native
  /**
    * An instance of LayoutData that makes a widget fill the inner width and height of its parent (padding
    * excluded). Equivalent to `LayoutData.from({left: 0, top: 0, right: 0, bottom: 0})`.
    */
  val stretch: LayoutData = js.native
  /**
    * An instance of LayoutData that makes a widget as wide as its parent (padding excluded). Equivalent to
    * `LayoutData.from({left: 0, right: 0})`.
    */
  val stretchX: LayoutData = js.native
  /**
    * An instance of LayoutData that makes a widget as high as its parent (padding excluded). Equivalent to
    * `LayoutData.from({top: 0, bottom: 0})`.
    */
  val stretchY: LayoutData = js.native
  /**
    * Creates a new instance of LayoutData using any valid layoutData expression. For any other value,
    * including `null`, the method throws.
    * @param layoutDataValue The value to create
    */
  def from(layoutDataValue: LayoutDataValue): LayoutData = js.native
}


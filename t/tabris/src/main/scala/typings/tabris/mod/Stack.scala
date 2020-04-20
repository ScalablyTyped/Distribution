package typings.tabris.mod

import typings.tabris.OmitStackset
import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.stretchX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Stack")
@js.native
class Stack () extends Composite[Widget] {
  def this(properties: Properties[Stack, OmitStackset]) = this()
  /**
    * Determines the horizontal placement of the children. For the `stretchX` value to work correctly the
    * `Stack` needs to be given a width either by setting `width` or by setting `left` and `right`.
    * @constant
    */
  var alignment: left | centerX | stretchX | right = js.native
  /**
    * The stack layout manager responsible for interpreting the [`layoutData`](./Widget.md#layoutdata) of
    * the child widgets of this Composite.
    * @constant
    */
  @JSName("layout")
  var layout_Stack: StackLayout = js.native
  /**
    * Additional space to add between the children in device independent pixel.
    * @constant
    */
  var spacing: Double = js.native
}


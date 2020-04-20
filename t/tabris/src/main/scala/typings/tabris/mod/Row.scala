package typings.tabris.mod

import typings.tabris.OmitRowset
import typings.tabris.tabrisStrings.baseline
import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.centerY
import typings.tabris.tabrisStrings.stretchY
import typings.tabris.tabrisStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Row")
@js.native
class Row () extends Composite[Widget] {
  def this(properties: Properties[Row, OmitRowset]) = this()
  /**
    * Determines the vertical placement of the children. For the `stretchY` value to work correctly the
    * `Row` needs to be given a height either by setting `height` or by setting `top` and `bottom`.
    * @constant
    */
  var alignment: top | centerY | stretchY | bottom | baseline = js.native
  /**
    * The row layout manager responsible for interpreting the [`layoutData`](./Widget.md#layoutdata) of the
    * child widgets of this Composite.
    * @constant
    */
  @JSName("layout")
  var layout_Row: RowLayout = js.native
  /**
    * The space between the children in device independent pixel.
    * @constant
    */
  var spacing: Double = js.native
}


package typings.tabris.mod

import typings.tabris.AnonAlignment
import typings.tabris.tabrisStrings.baseline
import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.centerY
import typings.tabris.tabrisStrings.stretchY
import typings.tabris.tabrisStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "RowLayout")
@js.native
class RowLayout () extends Layout {
  def this(options: AnonAlignment) = this()
  /**
    * Determines the vertical placement of the children. For the `stretchY` value to work correctly the
    * composite needs to be given a width either by setting `width` or by setting `top` and `bottom`.
    * @constant
    */
  val alignment: top | centerY | stretchY | bottom | baseline = js.native
  /**
    * The Space between the children in device independent pixel.
    * @constant
    */
  val spacing: Double = js.native
}

/* static members */
@JSImport("tabris", "RowLayout")
@js.native
object RowLayout extends js.Object {
  /**
    * Instance of RowLayout used as the default `layout` property value of `Row` widgets. Equivalent to
    * `new RowLayout()`
    */
  var default: RowLayout = js.native
}


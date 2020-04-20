package typings.tabris.mod

import typings.tabris.AnonSpacing
import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.stretchX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "StackLayout")
@js.native
class StackLayout () extends Layout {
  def this(options: AnonSpacing) = this()
  /**
    * Determines the horizontal placement of the children. For the `stretchX` value to work correctly the
    * composite needs to be given a width either by setting `width` or by setting `left` and `right`.
    * @constant
    */
  val alignment: left | centerX | stretchX | right = js.native
  /**
    * The space between the children in device independent pixel.
    * @constant
    */
  val spacing: Double = js.native
}

/* static members */
@JSImport("tabris", "StackLayout")
@js.native
object StackLayout extends js.Object {
  /**
    * Instance of StackLayout used as the default `layout` property value of `Stack` widgets. Equivalent to
    * `new StackLayout()`
    */
  var default: StackLayout = js.native
}


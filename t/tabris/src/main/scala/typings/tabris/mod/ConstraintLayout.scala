package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "ConstraintLayout")
@js.native
class ConstraintLayout () extends Layout {
  def this(options: js.Object) = this()
}

/* static members */
@JSImport("tabris", "ConstraintLayout")
@js.native
object ConstraintLayout extends js.Object {
  /**
    * Instance of ConstraintLayout used as the default `layout` property value of `Composite`, `Page`,
    * `Tab` and `Canvas`. Equivalent to `new ConstraintLayout()`
    */
  var default: ConstraintLayout = js.native
}


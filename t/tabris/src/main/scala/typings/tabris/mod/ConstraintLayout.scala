package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "ConstraintLayout")
@js.native
class ConstraintLayout () extends Layout {
  def this(options: js.Object) = this()
}
/* static members */
object ConstraintLayout {
  
  @JSImport("tabris", "ConstraintLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instance of ConstraintLayout used as the default `layout` property value of `Composite`, `Page`,
    * `Tab` and `Canvas`. Equivalent to `new ConstraintLayout()`
    */
  @JSImport("tabris", "ConstraintLayout.default")
  @js.native
  def default: ConstraintLayout = js.native
  @scala.inline
  def default_=(x: ConstraintLayout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}

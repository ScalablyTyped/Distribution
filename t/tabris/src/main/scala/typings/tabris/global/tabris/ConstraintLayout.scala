package typings.tabris.global.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.ConstraintLayout")
@js.native
/**
  * The default, constraints-based layout.
  */
open class ConstraintLayout ()
  extends typings.tabris.mod.ConstraintLayout {
  def this(options: js.Object) = this()
}
/* static members */
object ConstraintLayout {
  
  @JSGlobal("tabris.ConstraintLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instance of ConstraintLayout used as the default `layout` property value of `Composite`, `Page`,
    * `Tab` and `Canvas`. Equivalent to `new ConstraintLayout()`
    */
  @JSGlobal("tabris.ConstraintLayout.default")
  @js.native
  def default: typings.tabris.mod.ConstraintLayout = js.native
  inline def default_=(x: typings.tabris.mod.ConstraintLayout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}

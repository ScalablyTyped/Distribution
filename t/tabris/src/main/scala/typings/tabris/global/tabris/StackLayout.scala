package typings.tabris.global.tabris

import typings.tabris.anon.Spacing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.StackLayout")
@js.native
/**
  * Stack based layout manager. Can be set on the `layout` property of any `Composite` or widget
  * extending `Composite` like `Page` or `Tab` widget. The `Stack` uses it as the default `layout`.
  * <br/><br/> All children of the composite are automatically arranged in one vertical stack, starting
  * from the top.
  */
open class StackLayout ()
  extends typings.tabris.mod.StackLayout {
  def this(options: Spacing) = this()
}
/* static members */
object StackLayout {
  
  @JSGlobal("tabris.StackLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instance of StackLayout used as the default `layout` property value of `Stack` widgets. Equivalent to
    * `new StackLayout()`
    */
  @JSGlobal("tabris.StackLayout.default")
  @js.native
  def default: typings.tabris.mod.StackLayout = js.native
  inline def default_=(x: typings.tabris.mod.StackLayout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}

package typings.tabris.global.tabris

import typings.tabris.anon.Alignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.RowLayout")
@js.native
/**
  * Row based layout manager. Can be set on the `layout` property of any `Composite` or widget extending
  * `Composite` like `Page` or `Tab` widget. The `Row` uses it as the default `layout`. <br/><br/> All
  * children of the composite are automatically arranged in one horizontal row, starting from the left.
  */
open class RowLayout ()
  extends typings.tabris.mod.RowLayout {
  def this(options: Alignment) = this()
}
/* static members */
object RowLayout {
  
  @JSGlobal("tabris.RowLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instance of RowLayout used as the default `layout` property value of `Row` widgets. Equivalent to
    * `new RowLayout()`
    */
  @JSGlobal("tabris.RowLayout.default")
  @js.native
  def default: typings.tabris.mod.RowLayout = js.native
  inline def default_=(x: typings.tabris.mod.RowLayout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}

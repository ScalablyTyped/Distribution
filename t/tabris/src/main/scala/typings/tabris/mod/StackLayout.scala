package typings.tabris.mod

import typings.tabris.anon.Spacing
import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.stretchX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "StackLayout")
@js.native
/**
  * Stack based layout manager. Can be set on the `layout` property of any `Composite` or widget
  * extending `Composite` like `Page` or `Tab` widget. The `Stack` uses it as the default `layout`.
  * <br/><br/> All children of the composite are automatically arranged in one vertical stack, starting
  * from the top.
  */
open class StackLayout () extends Layout {
  def this(options: Spacing) = this()
  
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
object StackLayout {
  
  @JSImport("tabris", "StackLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instance of StackLayout used as the default `layout` property value of `Stack` widgets. Equivalent to
    * `new StackLayout()`
    */
  @JSImport("tabris", "StackLayout.default")
  @js.native
  def default: StackLayout = js.native
  inline def default_=(x: StackLayout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}

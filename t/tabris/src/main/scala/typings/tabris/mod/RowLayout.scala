package typings.tabris.mod

import typings.tabris.anon.Alignment
import typings.tabris.tabrisStrings.baseline
import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.centerY
import typings.tabris.tabrisStrings.stretchY
import typings.tabris.tabrisStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "RowLayout")
@js.native
class RowLayout () extends Layout {
  def this(options: Alignment) = this()
  
  /**
    * Determines the vertical placement of the children.
    * For `stretchY` to work correctly the `Row` needs to be given a height either by setting `height` or
    * by setting `top` and `bottom`.
    * If `baseline` is set the first widget in the row will determine where that baseline is. By setting
    * `top`, `bottom` or `centerY` on that widget the baseline can be shifted.
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
object RowLayout {
  
  @JSImport("tabris", "RowLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instance of RowLayout used as the default `layout` property value of `Row` widgets. Equivalent to
    * `new RowLayout()`
    */
  @JSImport("tabris", "RowLayout.default")
  @js.native
  def default: RowLayout = js.native
  @scala.inline
  def default_=(x: RowLayout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}

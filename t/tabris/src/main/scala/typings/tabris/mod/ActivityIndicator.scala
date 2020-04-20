package typings.tabris.mod

import typings.tabris.OmitActivityIndicatorset
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.tintColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "ActivityIndicator")
@js.native
class ActivityIndicator () extends Widget {
  def this(properties: Properties[ActivityIndicator, OmitActivityIndicatorset]) = this()
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_ActivityIndicator: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with js.Object = js.native
  /**
    * Fired when the [*tintColor*](#tintColor) property has changed.
    */
  var onTintColorChanged: ChangeListeners[this.type, tintColor] = js.native
  /**
    * The color of the indicator.
    */
  var tintColor: ColorValue = js.native
}


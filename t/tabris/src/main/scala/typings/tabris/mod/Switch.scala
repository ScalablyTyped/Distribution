package typings.tabris.mod

import typings.tabris.AnonChildrenString
import typings.tabris.OmitSwitchset
import typings.tabris.tabrisStrings.checked
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.thumbOffColor
import typings.tabris.tabrisStrings.thumbOnColor
import typings.tabris.tabrisStrings.trackOffColor
import typings.tabris.tabrisStrings.trackOnColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Switch")
@js.native
class Switch () extends Widget {
  def this(properties: Properties[Switch, OmitSwitchset]) = this()
  /**
    * The checked state of the switch.
    */
  var checked: Boolean = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_Switch: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with AnonChildrenString = js.native
  /**
    * Fired when the [*checked*](#checked) property has changed.
    */
  var onCheckedChanged: ChangeListeners[this.type, checked] = js.native
  /**
    * Fired when the switch is toggled by the user.
    */
  var onSelect: Listeners[SwitchSelectEvent[this.type]] = js.native
  /**
    * Fired when the [*thumbOffColor*](#thumbOffColor) property has changed.
    */
  var onThumbOffColorChanged: ChangeListeners[this.type, thumbOffColor] = js.native
  /**
    * Fired when the [*thumbOnColor*](#thumbOnColor) property has changed.
    */
  var onThumbOnColorChanged: ChangeListeners[this.type, thumbOnColor] = js.native
  /**
    * Fired when the [*trackOffColor*](#trackOffColor) property has changed.
    */
  var onTrackOffColorChanged: ChangeListeners[this.type, trackOffColor] = js.native
  /**
    * Fired when the [*trackOnColor*](#trackOnColor) property has changed.
    */
  var onTrackOnColorChanged: ChangeListeners[this.type, trackOnColor] = js.native
  /**
    * The color of the movable thumb, when switched *off*.
    */
  var thumbOffColor: ColorValue = js.native
  /**
    * The color of the movable thumb, when switched *on*.
    */
  var thumbOnColor: ColorValue = js.native
  /**
    * The color of the track that holds the thumb, when switched *off*.
    */
  var trackOffColor: ColorValue = js.native
  /**
    * The color of the track that holds the thumb, when switched *on*.
    */
  var trackOnColor: ColorValue = js.native
}


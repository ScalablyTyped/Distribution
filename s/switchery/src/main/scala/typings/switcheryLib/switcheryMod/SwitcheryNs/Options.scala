package typings
package switcheryLib.switcheryMod.SwitcheryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * class name for the switch element (by default styled in switchery.css)
    * @default 'switchery'
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * color of the switch element (HEX or RGB value)
    * @default '#64bd63'
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * enable or disable click events and changing the state of the switch (boolean value)
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * opacity of the switch when it's disabled (0 to 1)
    * @default 0.5
    */
  var disabledOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * color of the jack/handle element
    * @default '#fff'
    */
  var jackColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * color of unchecked jack/handle element
    * @default 'null'
  		 */
  var jackSecondaryColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * secondary color for background color and border, when the switch is off
    * @default '#dfdfdf'
    */
  var secondaryColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * size of the switch element (small or large)
    * @default 'default'
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /**
    * length of time that the transition will take, ex. '0.4s', '1s', '2.2s' (Note: transition speed of the handle is twice shorter)
    * @default '0.1s'
    */
  var speed: js.UndefOr[java.lang.String] = js.undefined
}


package typings.switchery.mod.Switchery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * class name for the switch element (by default styled in switchery.css)
    * @default 'switchery'
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * color of the switch element (HEX or RGB value)
    * @default '#64bd63'
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * enable or disable click events and changing the state of the switch (boolean value)
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * opacity of the switch when it's disabled (0 to 1)
    * @default 0.5
    */
  var disabledOpacity: js.UndefOr[Double] = js.undefined
  /**
    * color of the jack/handle element
    * @default '#fff'
    */
  var jackColor: js.UndefOr[String] = js.undefined
  /**
    * color of unchecked jack/handle element
    * @default 'null'
    */
  var jackSecondaryColor: js.UndefOr[String] = js.undefined
  /**
    * secondary color for background color and border, when the switch is off
    * @default '#dfdfdf'
    */
  var secondaryColor: js.UndefOr[String] = js.undefined
  /**
    * size of the switch element (small or large)
    * @default 'default'
    */
  var size: js.UndefOr[String] = js.undefined
  /**
    * length of time that the transition will take, ex. '0.4s', '1s', '2.2s' (Note: transition speed of the handle is twice shorter)
    * @default '0.1s'
    */
  var speed: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledOpacity: js.UndefOr[Double] = js.undefined,
    jackColor: String = null,
    jackSecondaryColor: String = null,
    secondaryColor: String = null,
    size: String = null,
    speed: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledOpacity)) __obj.updateDynamic("disabledOpacity")(disabledOpacity.get.asInstanceOf[js.Any])
    if (jackColor != null) __obj.updateDynamic("jackColor")(jackColor.asInstanceOf[js.Any])
    if (jackSecondaryColor != null) __obj.updateDynamic("jackSecondaryColor")(jackSecondaryColor.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


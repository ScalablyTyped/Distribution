package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object for specifying the animation properties to use when inserting or deleting
  * sections or cells, or scrolling the list.
  */
trait ListViewAnimationProperties extends js.Object {
  /**
    * Whether this list change should be animated. Ignored if any `animationStyle` value is specified.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * Type of animation to use for cell insertions and deletions.
    */
  var animationStyle: js.UndefOr[Double] = js.undefined
  /**
    * Specifies what position to scroll the selected cell to.
    */
  var position: js.UndefOr[Double] = js.undefined
}

object ListViewAnimationProperties {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animationStyle: js.UndefOr[Double] = js.undefined,
    position: js.UndefOr[Double] = js.undefined
  ): ListViewAnimationProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationStyle)) __obj.updateDynamic("animationStyle")(animationStyle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewAnimationProperties]
  }
}


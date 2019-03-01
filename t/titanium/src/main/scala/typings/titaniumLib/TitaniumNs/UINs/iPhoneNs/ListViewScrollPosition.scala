package typings
package titaniumLib.TitaniumNs.UINs.iPhoneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the position value that can be used for the `position` property of
			 * <ListViewAnimationProperties> when invoking the ListView's `scrollToItem`, `appendSection`,
			 * `deleteSectionAt`, `insertSectionAt` and `replaceSectionAt` methods.
			 */
trait ListViewScrollPosition
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The list view scrolls the row of interest to the bottom of the visible list view.
  				 */
  val BOTTOM: scala.Double
  /**
  				 * The list view scrolls the row of interest to the middle of the list table view.
  				 */
  val MIDDLE: scala.Double
  /**
  				 * The table view scrolls the row of interest to be fully visible with a minimal movement.
  				 * If the row is already fully visible, no scrolling occurs. For example, if the row is above the
  				 * visible area, the behavior is identical to that specified by `TOP`. This is the default.
  				 */
  val NONE: scala.Double
  /**
  				 * The list view scrolls the row of interest to the top of the visible list view.
  				 */
  val TOP: scala.Double
}

object ListViewScrollPosition {
  @scala.inline
  def apply(
    BOTTOM: scala.Double,
    MIDDLE: scala.Double,
    NONE: scala.Double,
    TOP: scala.Double,
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): ListViewScrollPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BOTTOM")(BOTTOM)
    __obj.updateDynamic("MIDDLE")(MIDDLE)
    __obj.updateDynamic("NONE")(NONE)
    __obj.updateDynamic("TOP")(TOP)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ListViewScrollPosition]
  }
}


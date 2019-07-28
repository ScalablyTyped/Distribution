package typings.titanium.TitaniumNs.UINs.iPhoneNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the style that can be used for the `selectionStyle` property of a
			 * ListItem, which is set in the `properties` dictionary of either the <ListDataItem> or
			 * <ItemTemplate>.
			 */
trait ListViewCellSelectionStyle extends Proxy {
  /**
  				 * The cell when selected has a blue background. This is the default value.
  				 */
  val BLUE: Double
  /**
  				 * The cell when selected has a gray background.
  				 */
  val GRAY: Double
  /**
  				 * The cell has no distinct style for when it is selected.
  				 */
  val NONE: Double
}

object ListViewCellSelectionStyle {
  @scala.inline
  def apply(
    BLUE: Double,
    GRAY: Double,
    NONE: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): ListViewCellSelectionStyle = {
    val __obj = js.Dynamic.literal(BLUE = BLUE, GRAY = GRAY, NONE = NONE, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ListViewCellSelectionStyle]
  }
}


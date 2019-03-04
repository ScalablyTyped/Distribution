package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dynamic behavior defining an item's movement to a specific point.
			 */
trait SnapBehavior
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Specifies the amount of oscillation during the conclusion of the snap.
  				 */
  var damping: scala.Double
  /**
  				 * Item to add to this behavior.
  				 */
  var item: titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Specifies the point to snap to.
  				 */
  var snapPoint: titaniumLib.Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.damping> property.
  				 */
  def getDamping(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.item> property.
  				 */
  def getItem(): titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.snapPoint> property.
  				 */
  def getSnapPoint(): titaniumLib.Point
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.damping> property.
  				 */
  def setDamping(damping: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.item> property.
  				 */
  def setItem(item: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.snapPoint> property.
  				 */
  def setSnapPoint(snapPoint: titaniumLib.Point): scala.Unit
}

object SnapBehavior {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    damping: scala.Double,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getDamping: js.Function0[scala.Double],
    getItem: js.Function0[titaniumLib.TitaniumNs.UINs.View],
    getSnapPoint: js.Function0[titaniumLib.Point],
    item: titaniumLib.TitaniumNs.UINs.View,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setDamping: js.Function1[scala.Double, scala.Unit],
    setItem: js.Function1[js.Any, scala.Unit],
    setSnapPoint: js.Function1[titaniumLib.Point, scala.Unit],
    snapPoint: titaniumLib.Point,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): SnapBehavior = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, damping = damping, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getDamping = getDamping, getItem = getItem, getSnapPoint = getSnapPoint, item = item, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, setDamping = setDamping, setItem = setItem, setSnapPoint = setSnapPoint, snapPoint = snapPoint)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[SnapBehavior]
  }
}


package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Continuous or instantaneous force to apply to an item.
			 */
trait PushBehavior
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * State of the push behavior's force.
  				 */
  var active: scala.Boolean
  /**
  				 * Specifies the angle of the force vector in radians.
  				 */
  var angle: scala.Double
  /**
  				 * Items added to this behavior.
  				 */
  val items: js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Specifies the magnitude of the force vector.
  				 */
  var magnitude: scala.Double
  /**
  				 * Specifies the direction of the force vector as an x, y pair.
  				 */
  var pushDirection: titaniumLib.Point
  /**
  				 * Specifies the push mode.
  				 */
  var pushMode: scala.Double
  /**
  				 * Adds an item to this behavior.
  				 */
  def addItem(item: js.Any): scala.Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.active> property.
  				 */
  def getActive(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.angle> property.
  				 */
  def getAngle(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.items> property.
  				 */
  def getItems(): js.Array[titaniumLib.TitaniumNs.UINs.View]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.magnitude> property.
  				 */
  def getMagnitude(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.pushDirection> property.
  				 */
  def getPushDirection(): titaniumLib.Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PushBehavior.pushMode> property.
  				 */
  def getPushMode(): scala.Double
  /**
  				 * Removes the specified item from this behavior.
  				 */
  def removeItem(item: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.active> property.
  				 */
  def setActive(active: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.angle> property.
  				 */
  def setAngle(angle: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.magnitude> property.
  				 */
  def setMagnitude(magnitude: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.pushDirection> property.
  				 */
  def setPushDirection(pushDirection: titaniumLib.Point): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PushBehavior.pushMode> property.
  				 */
  def setPushMode(pushMode: scala.Double): scala.Unit
}

object PushBehavior {
  @scala.inline
  def apply(
    active: scala.Boolean,
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    addItem: js.Function1[js.Any, scala.Unit],
    angle: scala.Double,
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getActive: js.Function0[scala.Boolean],
    getAngle: js.Function0[scala.Double],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getItems: js.Function0[js.Array[titaniumLib.TitaniumNs.UINs.View]],
    getMagnitude: js.Function0[scala.Double],
    getPushDirection: js.Function0[titaniumLib.Point],
    getPushMode: js.Function0[scala.Double],
    items: js.Array[titaniumLib.TitaniumNs.UINs.View],
    magnitude: scala.Double,
    pushDirection: titaniumLib.Point,
    pushMode: scala.Double,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    removeItem: js.Function1[js.Any, scala.Unit],
    setActive: js.Function1[scala.Boolean, scala.Unit],
    setAngle: js.Function1[scala.Double, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setMagnitude: js.Function1[scala.Double, scala.Unit],
    setPushDirection: js.Function1[titaniumLib.Point, scala.Unit],
    setPushMode: js.Function1[scala.Double, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): PushBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addItem")(addItem)
    __obj.updateDynamic("angle")(angle)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getActive")(getActive)
    __obj.updateDynamic("getAngle")(getAngle)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getItems")(getItems)
    __obj.updateDynamic("getMagnitude")(getMagnitude)
    __obj.updateDynamic("getPushDirection")(getPushDirection)
    __obj.updateDynamic("getPushMode")(getPushMode)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("magnitude")(magnitude)
    __obj.updateDynamic("pushDirection")(pushDirection)
    __obj.updateDynamic("pushMode")(pushMode)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeItem")(removeItem)
    __obj.updateDynamic("setActive")(setActive)
    __obj.updateDynamic("setAngle")(setAngle)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setMagnitude")(setMagnitude)
    __obj.updateDynamic("setPushDirection")(setPushDirection)
    __obj.updateDynamic("setPushMode")(setPushMode)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PushBehavior]
  }
}


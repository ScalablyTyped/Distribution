package typings
package titaniumLib.TitaniumNs.PlatformNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Display Caps object returned by the <Titanium.Platform.displayCaps> property.
		 */
trait DisplayCaps
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Logical density of the display.
  			 */
  val density: java.lang.String
  /**
  			 * Display density expressed as dots-per-inch.
  			 */
  val dpi: scala.Double
  /**
  			 * Logical density of the display, as a scaling factor for the Density Independent Pixel (dip)
  			 * unit.
  			 */
  val logicalDensityFactor: scala.Double
  /**
  			 * Absolute height of the display in relation to UI orientation. Measured in platform-specific
  			 * units; pixels on Android and density-independent pixels (dip) on iOS.
  			 */
  val platformHeight: scala.Double
  /**
  			 * Absolute width of the display in relation to UI orientation. Measured in platform-specific
  			 * units; pixels on Android and density-independent pixels (dip) on iOS.
  			 */
  val platformWidth: scala.Double
  /**
  			 * Physical pixels per inch of the display in the X dimension.
  			 */
  val xdpi: scala.Double
  /**
  			 * Physical pixels per inch of the display in the Y dimension.
  			 */
  val ydpi: scala.Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.density> property.
  			 */
  def getDensity(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.dpi> property.
  			 */
  def getDpi(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.logicalDensityFactor> property.
  			 */
  def getLogicalDensityFactor(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.platformHeight> property.
  			 */
  def getPlatformHeight(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.platformWidth> property.
  			 */
  def getPlatformWidth(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.xdpi> property.
  			 */
  def getXdpi(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.ydpi> property.
  			 */
  def getYdpi(): scala.Double
}

object DisplayCaps {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    density: java.lang.String,
    dpi: scala.Double,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getDensity: () => java.lang.String,
    getDpi: () => scala.Double,
    getLogicalDensityFactor: () => scala.Double,
    getPlatformHeight: () => scala.Double,
    getPlatformWidth: () => scala.Double,
    getXdpi: () => scala.Double,
    getYdpi: () => scala.Double,
    logicalDensityFactor: scala.Double,
    platformHeight: scala.Double,
    platformWidth: scala.Double,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    xdpi: scala.Double,
    ydpi: scala.Double,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): DisplayCaps = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, density = density, dpi = dpi, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDensity = js.Any.fromFunction0(getDensity), getDpi = js.Any.fromFunction0(getDpi), getLogicalDensityFactor = js.Any.fromFunction0(getLogicalDensityFactor), getPlatformHeight = js.Any.fromFunction0(getPlatformHeight), getPlatformWidth = js.Any.fromFunction0(getPlatformWidth), getXdpi = js.Any.fromFunction0(getXdpi), getYdpi = js.Any.fromFunction0(getYdpi), logicalDensityFactor = logicalDensityFactor, platformHeight = platformHeight, platformWidth = platformWidth, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), xdpi = xdpi, ydpi = ydpi)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[DisplayCaps]
  }
}


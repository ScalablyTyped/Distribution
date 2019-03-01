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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    density: java.lang.String,
    dpi: scala.Double,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getDensity: js.Function0[java.lang.String],
    getDpi: js.Function0[scala.Double],
    getLogicalDensityFactor: js.Function0[scala.Double],
    getPlatformHeight: js.Function0[scala.Double],
    getPlatformWidth: js.Function0[scala.Double],
    getXdpi: js.Function0[scala.Double],
    getYdpi: js.Function0[scala.Double],
    logicalDensityFactor: scala.Double,
    platformHeight: scala.Double,
    platformWidth: scala.Double,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    xdpi: scala.Double,
    ydpi: scala.Double,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): DisplayCaps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("density")(density)
    __obj.updateDynamic("dpi")(dpi)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getDensity")(getDensity)
    __obj.updateDynamic("getDpi")(getDpi)
    __obj.updateDynamic("getLogicalDensityFactor")(getLogicalDensityFactor)
    __obj.updateDynamic("getPlatformHeight")(getPlatformHeight)
    __obj.updateDynamic("getPlatformWidth")(getPlatformWidth)
    __obj.updateDynamic("getXdpi")(getXdpi)
    __obj.updateDynamic("getYdpi")(getYdpi)
    __obj.updateDynamic("logicalDensityFactor")(logicalDensityFactor)
    __obj.updateDynamic("platformHeight")(platformHeight)
    __obj.updateDynamic("platformWidth")(platformWidth)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("xdpi")(xdpi)
    __obj.updateDynamic("ydpi")(ydpi)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[DisplayCaps]
  }
}


package typings.titanium.Titanium.Platform

import org.scalablytyped.runtime.TopLevel
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Display Caps object returned by the <Titanium.Platform.displayCaps> property.
		 */
trait DisplayCaps extends Proxy {
  /**
  			 * Logical density of the display.
  			 */
  val density: String
  /**
  			 * Display density expressed as dots-per-inch.
  			 */
  val dpi: Double
  /**
  			 * Logical density of the display, as a scaling factor for the Density Independent Pixel (dip)
  			 * unit.
  			 */
  val logicalDensityFactor: Double
  /**
  			 * Absolute height of the display in relation to UI orientation. Measured in platform-specific
  			 * units; pixels on Android and density-independent pixels (dip) on iOS.
  			 */
  val platformHeight: Double
  /**
  			 * Absolute width of the display in relation to UI orientation. Measured in platform-specific
  			 * units; pixels on Android and density-independent pixels (dip) on iOS.
  			 */
  val platformWidth: Double
  /**
  			 * Physical pixels per inch of the display in the X dimension.
  			 */
  val xdpi: Double
  /**
  			 * Physical pixels per inch of the display in the Y dimension.
  			 */
  val ydpi: Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.density> property.
  			 */
  def getDensity(): String
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.dpi> property.
  			 */
  def getDpi(): Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.logicalDensityFactor> property.
  			 */
  def getLogicalDensityFactor(): Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.platformHeight> property.
  			 */
  def getPlatformHeight(): Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.platformWidth> property.
  			 */
  def getPlatformWidth(): Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.xdpi> property.
  			 */
  def getXdpi(): Double
  /**
  			 * Gets the value of the <Titanium.Platform.DisplayCaps.ydpi> property.
  			 */
  def getYdpi(): Double
}

object DisplayCaps {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    density: String,
    dpi: Double,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getDensity: () => String,
    getDpi: () => Double,
    getLogicalDensityFactor: () => Double,
    getPlatformHeight: () => Double,
    getPlatformWidth: () => Double,
    getXdpi: () => Double,
    getYdpi: () => Double,
    logicalDensityFactor: Double,
    platformHeight: Double,
    platformWidth: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    xdpi: Double,
    ydpi: Double,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): DisplayCaps = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDensity = js.Any.fromFunction0(getDensity), getDpi = js.Any.fromFunction0(getDpi), getLogicalDensityFactor = js.Any.fromFunction0(getLogicalDensityFactor), getPlatformHeight = js.Any.fromFunction0(getPlatformHeight), getPlatformWidth = js.Any.fromFunction0(getPlatformWidth), getXdpi = js.Any.fromFunction0(getXdpi), getYdpi = js.Any.fromFunction0(getYdpi), logicalDensityFactor = logicalDensityFactor.asInstanceOf[js.Any], platformHeight = platformHeight.asInstanceOf[js.Any], platformWidth = platformWidth.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), xdpi = xdpi.asInstanceOf[js.Any], ydpi = ydpi.asInstanceOf[js.Any])
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayCaps]
  }
}

/**
		 * Returns the DisplayCaps object.
		 */
@JSGlobal("Titanium.Platform.displayCaps")
@js.native
object displayCaps extends TopLevel[DisplayCaps]


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


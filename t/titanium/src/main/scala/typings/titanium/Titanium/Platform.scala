package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The top-level Platform module.  The Platform module is used to access the device's platform-related
  * functionality.
  */
@JSGlobal("Titanium.Platform")
@js.native
object Platform extends js.Object {
  /**
    * The Display Caps object returned by the <Titanium.Platform.displayCaps> property.
    */
  @js.native
  trait DisplayCaps extends Proxy {
    /**
      * Logical density of the display.
      */
    val density: String = js.native
    /**
      * Display density expressed as dots-per-inch.
      */
    val dpi: Double = js.native
    /**
      * Logical density of the display, as a scaling factor for the Density Independent Pixel (dip)
      * unit.
      */
    val logicalDensityFactor: Double = js.native
    /**
      * Absolute height of the display in relation to UI orientation. Measured in platform-specific
      * units; pixels on Android and density-independent pixels (dip) on iOS.
      */
    val platformHeight: Double = js.native
    /**
      * Absolute width of the display in relation to UI orientation. Measured in platform-specific
      * units; pixels on Android and density-independent pixels (dip) on iOS.
      */
    val platformWidth: Double = js.native
    /**
      * Physical pixels per inch of the display in the X dimension.
      */
    val xdpi: Double = js.native
    /**
      * Physical pixels per inch of the display in the Y dimension.
      */
    val ydpi: Double = js.native
    /**
      * Gets the value of the <Titanium.Platform.DisplayCaps.density> property.
      * @deprecated Access <Titanium.Platform.DisplayCaps.density> instead.
      */
    def getDensity(): String = js.native
    /**
      * Gets the value of the <Titanium.Platform.DisplayCaps.dpi> property.
      * @deprecated Access <Titanium.Platform.DisplayCaps.dpi> instead.
      */
    def getDpi(): Double = js.native
    /**
      * Gets the value of the <Titanium.Platform.DisplayCaps.logicalDensityFactor> property.
      * @deprecated Access <Titanium.Platform.DisplayCaps.logicalDensityFactor> instead.
      */
    def getLogicalDensityFactor(): Double = js.native
    /**
      * Gets the value of the <Titanium.Platform.DisplayCaps.platformHeight> property.
      * @deprecated Access <Titanium.Platform.DisplayCaps.platformHeight> instead.
      */
    def getPlatformHeight(): Double = js.native
    /**
      * Gets the value of the <Titanium.Platform.DisplayCaps.platformWidth> property.
      * @deprecated Access <Titanium.Platform.DisplayCaps.platformWidth> instead.
      */
    def getPlatformWidth(): Double = js.native
    /**
      * Gets the value of the <Titanium.Platform.DisplayCaps.xdpi> property.
      * @deprecated Access <Titanium.Platform.DisplayCaps.xdpi> instead.
      */
    def getXdpi(): Double = js.native
    /**
      * Gets the value of the <Titanium.Platform.DisplayCaps.ydpi> property.
      * @deprecated Access <Titanium.Platform.DisplayCaps.ydpi> instead.
      */
    def getYdpi(): Double = js.native
  }
  
  /**
    * The Android-specific Platform module, used to access the device's platform-related functionality.
    */
  type Android = Module
}


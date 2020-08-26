package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the classes, interfaces, structures and other components that are built on top of the Windows Image Acquisition (WIA) COM APIs to provide scan functionality for Windows Store apps and desktop apps. */
@JSGlobal("Windows.Devices.Scanners")
@js.native
object Scanners extends js.Object {
  /** Represents the properties of images to scan. */
  @js.native
  abstract class ImageScanner ()
    extends typings.winrtUwp.Windows.Devices.Scanners.ImageScanner
  
  /** Represents the auto-configured scan source of the scanner. */
  @js.native
  abstract class ImageScannerAutoConfiguration ()
    extends typings.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoConfiguration
  
  /** Represents the Feeder scan source of the scanner. */
  @js.native
  abstract class ImageScannerFeederConfiguration ()
    extends typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFeederConfiguration
  
  /** Represents the Flatbed scan source of the scanner. */
  @js.native
  abstract class ImageScannerFlatbedConfiguration ()
    extends typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFlatbedConfiguration
  
  /** Represents the result of a preview scan job. */
  @js.native
  abstract class ImageScannerPreviewResult ()
    extends typings.winrtUwp.Windows.Devices.Scanners.ImageScannerPreviewResult
  
  /** Represents the result of a scan job. */
  @js.native
  abstract class ImageScannerScanResult ()
    extends typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanResult
  
  /* static members */
  @js.native
  object ImageScanner extends js.Object {
    /**
      * Creates an instance of a ImageScanner object based on a scanners device information ID. This method is required for broker device enumeration.
      * @param deviceId The device information ID. See DeviceInformation.Id property.
      * @return The ImageScanner object.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Scanners.ImageScanner] = js.native
    /**
      * Returns the class selection string that apps can use to enumerate scanner devices. This method is required for the brokered device enumeration.
      * @return The class selection.
      */
    def getDeviceSelector(): String = js.native
  }
  
  /** Specifies the automatic crop mode of the scanning device. */
  @js.native
  object ImageScannerAutoCroppingMode extends js.Object {
    /* 0 */ val disabled: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode.disabled with Double = js.native
    /* 2 */ val multipleRegion: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode.multipleRegion with Double = js.native
    /* 1 */ val singleRegion: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode.singleRegion with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode with Double
      ] = js.native
  }
  
  /** Specifies the color modes for the scan source. */
  @js.native
  object ImageScannerColorMode extends js.Object {
    /* 3 */ val autoColor: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode.autoColor with Double = js.native
    /* 0 */ val color: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode.color with Double = js.native
    /* 1 */ val grayscale: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode.grayscale with Double = js.native
    /* 2 */ val monochrome: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode.monochrome with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode with Double] = js.native
  }
  
  /** The type of files to scan to. */
  @js.native
  object ImageScannerFormat extends js.Object {
    /* 2 */ val deviceIndependentBitmap: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.deviceIndependentBitmap with Double = js.native
    /* 0 */ val jpeg: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.jpeg with Double = js.native
    /* 5 */ val openXps: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.openXps with Double = js.native
    /* 6 */ val pdf: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.pdf with Double = js.native
    /* 1 */ val png: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.png with Double = js.native
    /* 3 */ val tiff: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.tiff with Double = js.native
    /* 4 */ val xps: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.xps with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat with Double] = js.native
  }
  
  /** The types of scan source for the scanning device. */
  @js.native
  object ImageScannerScanSource extends js.Object {
    /* 3 */ val autoConfigured: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource.autoConfigured with Double = js.native
    /* 0 */ val default: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource.default with Double = js.native
    /* 2 */ val feeder: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource.feeder with Double = js.native
    /* 1 */ val flatbed: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource.flatbed with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource with Double] = js.native
  }
  
}


package typings.winrtDashUwp.Windows.System

import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables apps to get information about the system. */
@JSGlobal("Windows.System.Profile")
@js.native
object Profile extends js.Object {
  /** Provides information about the device for profiling purposes. */
  @js.native
  abstract class AnalyticsInfo () extends js.Object
  
  /** Provides version information about the device family. */
  @js.native
  abstract class AnalyticsVersionInfo () extends js.Object {
    /** Gets the device family. */
    var deviceFamily: String = js.native
    /** Gets the version within the device family. */
    var deviceFamilyVersion: String = js.native
  }
  
  /** Provides the ability to obtain a hardware identifier that represents the current hardware. */
  @js.native
  abstract class HardwareIdentification () extends js.Object
  
  /** Represents a token that contains a hardware based identification that is sufficiently unique. */
  @js.native
  abstract class HardwareToken () extends js.Object {
    /** Gets the certificate that is used to sign the Id and is used to help verify the authenticity of the Id. */
    var certificate: IBuffer = js.native
    /** Gets the hardware identifier that identifies the device. */
    var id: IBuffer = js.native
    /** Gets the digital signature of hardware Id that helps verify the authenticity of returned Id. */
    var signature: IBuffer = js.native
  }
  
  /** Identifies the string keys that might exist within the RetailInfo.Properties map of retail-demo relevant property values. */
  @js.native
  abstract class KnownRetailInfoProperties () extends js.Object
  
  @js.native
  abstract class PlatformDiagnosticsAndUsageDataSettings () extends js.Object
  
  /** A utility class that supports one method, IsDemoModeEnabled , and one property, Properties . Call IsDemoModeEnabled to determine whether the device where the app is running has specifically enabled its retail demo mode. */
  @js.native
  abstract class RetailInfo () extends js.Object
  
  /* static members */
  @js.native
  object AnalyticsInfo extends js.Object {
    /** Gets the device form. */
    var deviceForm: String = js.native
    /** Gets version info about the device family. */
    var versionInfo: AnalyticsVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object HardwareIdentification extends js.Object {
    /**
      * Gets a hardware identifier ( ASHWID) that represents the current hardware. The returned ASHWID will be different for each application package. In other words, this API will return different identifiers when called by two apps from different packages. It will return the same identifier when called by two apps that are part of the same package.
      * @param nonce The cryptographic nonce is optional. The nonce is recommended when ASHWID needs to be verified on the cloud against replay attacks. In the scenarios where nonce is desired, the remote server should generate a random nonce and pass it to the client app, and then verify that the signature has the expected nonce once the ASHWID is received from the client system.
      * @return The hardware Id information.
      */
    def getPackageSpecificToken(nonce: IBuffer): HardwareToken = js.native
  }
  
  /* static members */
  @js.native
  object KnownRetailInfoProperties extends js.Object {
    /** Gets the string that identifies the KnownRetailInfoProperties retail demo property. */
    var batteryLifeDescription: String = js.native
    /** Gets the string that identifies the DisplayDescription retail demo property. */
    var displayDescription: String = js.native
    /** Gets the string that identifies the DisplayModelName retail demo property. */
    var displayModelName: String = js.native
    /** Gets the string that identifies the FormFactor retail demo property. */
    var formFactor: String = js.native
    /** Gets the string that identifies the FrontCameraDescription retail demo property. */
    var frontCameraDescription: String = js.native
    /** Gets the string that identifies the GraphicsDescription retail demo property. */
    var graphicsDescription: String = js.native
    /** Gets the string that identifies the HasNfc retail demo property. */
    var hasNfc: String = js.native
    /** Gets the string that identifies the HasOpticalDrive retail demo property. */
    var hasOpticalDrive: String = js.native
    /** Gets the string that identifies the HasSdSlot retail demo property. */
    var hasSdSlot: String = js.native
    /** Gets the string that identifies the IsFeatured retail demo property. */
    var isFeatured: String = js.native
    /** Gets the string that identifies the IsOfficeInstalled retail demo property. */
    var isOfficeInstalled: String = js.native
    /** Gets the string that identifies the ManufacturerName retail demo property. */
    var manufacturerName: String = js.native
    /** Gets the string that identifies the Memory retail demo property. */
    var memory: String = js.native
    /** Gets the string that identifies the ModelName retail demo property. */
    var modelName: String = js.native
    /** Gets the string that identifies the Price retail demo property. */
    var price: String = js.native
    /** Gets the string that identifies the ProcessorDescription retail demo property. */
    var processorDescription: String = js.native
    /** Gets the string that identifies the RearCameraDescription retail demo property. */
    var rearCameraDescription: String = js.native
    /** Gets the string that identifies the RetailAccessCode retail demo property. */
    var retailAccessCode: String = js.native
    /** Gets the string that identifies the ScreenSize retail demo property. */
    var screenSize: String = js.native
    /** Gets the string that identifies the StorageDescription retail demo property. */
    var storageDescription: String = js.native
    /** Gets the string that identifies the Weight retail demo property. */
    var weight: String = js.native
    /** Gets the string that identifies the WindowsEdition retail demo property. */
    var windowsEdition: String = js.native
  }
  
  @js.native
  object PlatformDataCollectionLevel extends js.Object {
    var basic: js.Any = js.native
    var enhanced: js.Any = js.native
    var full: js.Any = js.native
    var security: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object PlatformDiagnosticsAndUsageDataSettings extends js.Object {
    var addEventListener: js.Any = js.native
     /* unmapped type */ var canCollectDiagnostics: js.Any = js.native
     /* unmapped type */ var collectionLevel: js.Any = js.native
     /* unmapped type */ var oncollectionlevelchanged: js.Any = js.native
     /* unmapped type */ var removeEventListener: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object RetailInfo extends js.Object {
    /** Determines whether the device where the app is running has specifically enabled its retail demo mode. */
    var isDemoModeEnabled: Boolean = js.native
    /** Gets an object that represents the set of available retail demo properties and their values. */
    var properties: IMapView[String, _] = js.native
  }
  
  /** Provides info for hardware developers and OEMs. */
  @js.native
  object SystemManufacturers extends js.Object {
    /** Enables access to properties from the SMBIOS for the system. */
    @js.native
    abstract class SmbiosInformation () extends js.Object
    
    /* static members */
    @js.native
    object SmbiosInformation extends js.Object {
      /** Gets the serial number from the SMBIOS for the system. */
      var serialNumber: String = js.native
    }
    
  }
  
}


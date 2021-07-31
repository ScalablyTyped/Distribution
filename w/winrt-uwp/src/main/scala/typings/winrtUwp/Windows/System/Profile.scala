package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables apps to get information about the system. */
object Profile {
  
  /** Provides information about the device for profiling purposes. */
  trait AnalyticsInfo extends StObject
  
  /** Provides version information about the device family. */
  trait AnalyticsVersionInfo extends StObject {
    
    /** Gets the device family. */
    var deviceFamily: String
    
    /** Gets the version within the device family. */
    var deviceFamilyVersion: String
  }
  object AnalyticsVersionInfo {
    
    @scala.inline
    def apply(deviceFamily: String, deviceFamilyVersion: String): AnalyticsVersionInfo = {
      val __obj = js.Dynamic.literal(deviceFamily = deviceFamily.asInstanceOf[js.Any], deviceFamilyVersion = deviceFamilyVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsVersionInfo]
    }
    
    @scala.inline
    implicit class AnalyticsVersionInfoMutableBuilder[Self <: AnalyticsVersionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceFamily(value: String): Self = StObject.set(x, "deviceFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceFamilyVersion(value: String): Self = StObject.set(x, "deviceFamilyVersion", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides the ability to obtain a hardware identifier that represents the current hardware. */
  trait HardwareIdentification extends StObject
  
  /** Represents a token that contains a hardware based identification that is sufficiently unique. */
  trait HardwareToken extends StObject {
    
    /** Gets the certificate that is used to sign the Id and is used to help verify the authenticity of the Id. */
    var certificate: IBuffer
    
    /** Gets the hardware identifier that identifies the device. */
    var id: IBuffer
    
    /** Gets the digital signature of hardware Id that helps verify the authenticity of returned Id. */
    var signature: IBuffer
  }
  object HardwareToken {
    
    @scala.inline
    def apply(certificate: IBuffer, id: IBuffer, signature: IBuffer): HardwareToken = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[HardwareToken]
    }
    
    @scala.inline
    implicit class HardwareTokenMutableBuilder[Self <: HardwareToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificate(value: IBuffer): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: IBuffer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: IBuffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  /** Identifies the string keys that might exist within the RetailInfo.Properties map of retail-demo relevant property values. */
  trait KnownRetailInfoProperties extends StObject
  
  trait PlatformDiagnosticsAndUsageDataSettings extends StObject
  
  /** A utility class that supports one method, IsDemoModeEnabled , and one property, Properties . Call IsDemoModeEnabled to determine whether the device where the app is running has specifically enabled its retail demo mode. */
  trait RetailInfo extends StObject
  
  /** Provides info for hardware developers and OEMs. */
  object SystemManufacturers {
    
    /** Enables access to properties from the SMBIOS for the system. */
    trait SmbiosInformation extends StObject
  }
}

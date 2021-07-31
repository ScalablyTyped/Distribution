package typings.useragent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Device extends StObject {
    
    var device: String
    
    var family: String
    
    var major: String
    
    var minor: String
    
    var os: String
    
    var patch: String
  }
  object Device {
    
    @scala.inline
    def apply(device: String, family: String, major: String, minor: String, os: String, patch: String): Device = {
      val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    }
  }
  
  trait Family extends StObject {
    
    var family: String
    
    var major: js.UndefOr[String] = js.undefined
    
    var minor: js.UndefOr[String] = js.undefined
    
    var patch: js.UndefOr[String] = js.undefined
  }
  object Family {
    
    @scala.inline
    def apply(family: String): Family = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
      __obj.asInstanceOf[Family]
    }
    
    @scala.inline
    implicit class FamilyMutableBuilder[Self <: Family] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      @scala.inline
      def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
      
      @scala.inline
      def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    }
  }
  
  trait Major extends StObject {
    
    var device: js.UndefOr[String] = js.undefined
    
    var family: String
    
    var major: String
    
    var minor: String
    
    var os: js.UndefOr[String] = js.undefined
    
    var patch: String
  }
  object Major {
    
    @scala.inline
    def apply(family: String, major: String, minor: String, patch: String): Major = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Major]
    }
    
    @scala.inline
    implicit class MajorMutableBuilder[Self <: Major] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      @scala.inline
      def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    }
  }
}

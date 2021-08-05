package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 4. Operating System
trait OsData extends StObject {
  
  var arch: String
  
  var build: String
  
  var codename: String
  
  var codepage: String
  
  var distro: String
  
  var hostname: String
  
  var kernel: String
  
  var logofile: String
  
  var platform: String
  
  var release: String
  
  var serial: String
  
  var servicepack: String
  
  var uefi: Boolean
}
object OsData {
  
  inline def apply(
    arch: String,
    build: String,
    codename: String,
    codepage: String,
    distro: String,
    hostname: String,
    kernel: String,
    logofile: String,
    platform: String,
    release: String,
    serial: String,
    servicepack: String,
    uefi: Boolean
  ): OsData = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], codename = codename.asInstanceOf[js.Any], codepage = codepage.asInstanceOf[js.Any], distro = distro.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], logofile = logofile.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], servicepack = servicepack.asInstanceOf[js.Any], uefi = uefi.asInstanceOf[js.Any])
    __obj.asInstanceOf[OsData]
  }
  
  extension [Self <: OsData](x: Self) {
    
    inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setCodename(value: String): Self = StObject.set(x, "codename", value.asInstanceOf[js.Any])
    
    inline def setCodepage(value: String): Self = StObject.set(x, "codepage", value.asInstanceOf[js.Any])
    
    inline def setDistro(value: String): Self = StObject.set(x, "distro", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setKernel(value: String): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
    
    inline def setLogofile(value: String): Self = StObject.set(x, "logofile", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setServicepack(value: String): Self = StObject.set(x, "servicepack", value.asInstanceOf[js.Any])
    
    inline def setUefi(value: Boolean): Self = StObject.set(x, "uefi", value.asInstanceOf[js.Any])
  }
}

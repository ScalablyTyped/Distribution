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
  
  var fqdn: String
  
  var hostname: String
  
  var hypervisor: js.UndefOr[Boolean] = js.undefined
  
  var hypervizor: js.UndefOr[Boolean] = js.undefined
  
  var kernel: String
  
  var logofile: String
  
  var platform: String
  
  var release: String
  
  var remoteSession: js.UndefOr[Boolean] = js.undefined
  
  var serial: String
  
  var servicepack: String
  
  var uefi: Boolean | Null
}
object OsData {
  
  inline def apply(
    arch: String,
    build: String,
    codename: String,
    codepage: String,
    distro: String,
    fqdn: String,
    hostname: String,
    kernel: String,
    logofile: String,
    platform: String,
    release: String,
    serial: String,
    servicepack: String
  ): OsData = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], codename = codename.asInstanceOf[js.Any], codepage = codepage.asInstanceOf[js.Any], distro = distro.asInstanceOf[js.Any], fqdn = fqdn.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], logofile = logofile.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], servicepack = servicepack.asInstanceOf[js.Any], uefi = null)
    __obj.asInstanceOf[OsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OsData] (val x: Self) extends AnyVal {
    
    inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setCodename(value: String): Self = StObject.set(x, "codename", value.asInstanceOf[js.Any])
    
    inline def setCodepage(value: String): Self = StObject.set(x, "codepage", value.asInstanceOf[js.Any])
    
    inline def setDistro(value: String): Self = StObject.set(x, "distro", value.asInstanceOf[js.Any])
    
    inline def setFqdn(value: String): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHypervisor(value: Boolean): Self = StObject.set(x, "hypervisor", value.asInstanceOf[js.Any])
    
    inline def setHypervisorUndefined: Self = StObject.set(x, "hypervisor", js.undefined)
    
    inline def setHypervizor(value: Boolean): Self = StObject.set(x, "hypervizor", value.asInstanceOf[js.Any])
    
    inline def setHypervizorUndefined: Self = StObject.set(x, "hypervizor", js.undefined)
    
    inline def setKernel(value: String): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
    
    inline def setLogofile(value: String): Self = StObject.set(x, "logofile", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setRemoteSession(value: Boolean): Self = StObject.set(x, "remoteSession", value.asInstanceOf[js.Any])
    
    inline def setRemoteSessionUndefined: Self = StObject.set(x, "remoteSession", js.undefined)
    
    inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setServicepack(value: String): Self = StObject.set(x, "servicepack", value.asInstanceOf[js.Any])
    
    inline def setUefi(value: Boolean): Self = StObject.set(x, "uefi", value.asInstanceOf[js.Any])
    
    inline def setUefiNull: Self = StObject.set(x, "uefi", null)
  }
}

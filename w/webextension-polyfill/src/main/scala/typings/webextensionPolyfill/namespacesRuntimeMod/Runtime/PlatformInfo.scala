package typings.webextensionPolyfill.namespacesRuntimeMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing information about the current platform.
  */
trait PlatformInfo extends StObject {
  
  /**
    * The machine's processor architecture.
    */
  var arch: PlatformArch
  
  /**
    * The operating system the browser is running on.
    */
  var os: PlatformOs
}
object PlatformInfo {
  
  inline def apply(arch: PlatformArch, os: PlatformOs): PlatformInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformInfo]
  }
  
  extension [Self <: PlatformInfo](x: Self) {
    
    inline def setArch(value: PlatformArch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setOs(value: PlatformOs): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
  }
}

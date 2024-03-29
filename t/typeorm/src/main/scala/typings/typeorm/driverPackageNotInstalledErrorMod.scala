package typings.typeorm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driverPackageNotInstalledErrorMod {
  
  @JSImport("typeorm/browser/error/DriverPackageNotInstalledError", "DriverPackageNotInstalledError")
  @js.native
  class DriverPackageNotInstalledError protected ()
    extends StObject
       with Error {
    def this(driverName: String, packageName: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}

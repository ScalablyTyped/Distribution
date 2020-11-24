package typings.typeorm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/DriverPackageNotInstalledError", JSImport.Namespace)
@js.native
object errorDriverPackageNotInstalledErrorMod extends js.Object {
  
  @js.native
  class DriverPackageNotInstalledError protected () extends Error {
    def this(driverName: String, packageName: String) = this()
  }
}

package typings.typeorm

import typings.std.Error
import typings.typeorm.driverDriverMod.Driver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/TreeRepositoryNotSupportedError", JSImport.Namespace)
@js.native
object errorTreeRepositoryNotSupportedErrorMod extends js.Object {
  
  @js.native
  class TreeRepositoryNotSupportedError protected () extends Error {
    def this(driver: Driver) = this()
  }
}

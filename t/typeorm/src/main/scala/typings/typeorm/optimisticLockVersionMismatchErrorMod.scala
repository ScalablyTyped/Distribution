package typings.typeorm

import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/OptimisticLockVersionMismatchError", JSImport.Namespace)
@js.native
object optimisticLockVersionMismatchErrorMod extends js.Object {
  
  @js.native
  class OptimisticLockVersionMismatchError protected () extends Error {
    def this(entity: String, expectedVersion: Double, actualVersion: Double) = this()
    def this(entity: String, expectedVersion: Double, actualVersion: Date) = this()
    def this(entity: String, expectedVersion: Date, actualVersion: Double) = this()
    def this(entity: String, expectedVersion: Date, actualVersion: Date) = this()
  }
}

package typings.typeorm

import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorOptimisticLockVersionMismatchErrorMod {
  
  @JSImport("typeorm/error/OptimisticLockVersionMismatchError", "OptimisticLockVersionMismatchError")
  @js.native
  class OptimisticLockVersionMismatchError protected () extends Error {
    def this(entity: String, expectedVersion: Double, actualVersion: Double) = this()
    def this(entity: String, expectedVersion: Double, actualVersion: Date) = this()
    def this(entity: String, expectedVersion: Date, actualVersion: Double) = this()
    def this(entity: String, expectedVersion: Date, actualVersion: Date) = this()
  }
}

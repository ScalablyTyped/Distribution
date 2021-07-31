package typings.typeorm

import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optimisticLockVersionMismatchErrorMod {
  
  @JSImport("typeorm/browser/error/OptimisticLockVersionMismatchError", "OptimisticLockVersionMismatchError")
  @js.native
  class OptimisticLockVersionMismatchError protected ()
    extends StObject
       with Error {
    def this(entity: String, expectedVersion: Double, actualVersion: Double) = this()
    def this(entity: String, expectedVersion: Double, actualVersion: Date) = this()
    def this(entity: String, expectedVersion: Date, actualVersion: Double) = this()
    def this(entity: String, expectedVersion: Date, actualVersion: Date) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}

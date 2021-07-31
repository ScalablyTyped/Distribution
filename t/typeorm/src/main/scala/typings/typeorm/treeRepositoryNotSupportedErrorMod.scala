package typings.typeorm

import typings.std.Error
import typings.typeorm.driverMod.Driver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeRepositoryNotSupportedErrorMod {
  
  @JSImport("typeorm/browser/error/TreeRepositoryNotSupportedError", "TreeRepositoryNotSupportedError")
  @js.native
  class TreeRepositoryNotSupportedError protected ()
    extends StObject
       with Error {
    def this(driver: Driver) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}

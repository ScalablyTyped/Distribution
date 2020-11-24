package typings.tstl

import typings.tstl.ilockableMod.ILockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/thread/Mutex", JSImport.Namespace)
@js.native
object mutexMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  class Mutex () extends ILockable {
    
    var mutex_ : js.Any = js.native
  }
}

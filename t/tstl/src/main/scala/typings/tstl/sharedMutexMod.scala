package typings.tstl

import typings.tstl.isharedlockableMod.ISharedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/thread/SharedMutex", JSImport.Namespace)
@js.native
object sharedMutexMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  class SharedMutex () extends ISharedLockable {
    
    var mutex_ : js.Any = js.native
  }
}

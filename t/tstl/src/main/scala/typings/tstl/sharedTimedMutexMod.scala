package typings.tstl

import typings.tstl.isharedtimedlockableMod.ISharedTimedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/thread/SharedTimedMutex", JSImport.Namespace)
@js.native
object sharedTimedMutexMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  class SharedTimedMutex () extends ISharedTimedLockable {
    
    var _Cancel: js.Any = js.native
    
    var _Current_access_type: js.Any = js.native
    
    var _Release: js.Any = js.native
    
    var queue_ : js.Any = js.native
    
    var reading_ : js.Any = js.native
    
    var source_ : js.Any = js.native
    
    var writing_ : js.Any = js.native
  }
}

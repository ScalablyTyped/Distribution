package typings.webLocksApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  var locks: LockManager
}
object Navigator {
  
  inline def apply(locks: LockManager): Navigator = {
    val __obj = js.Dynamic.literal(locks = locks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    inline def setLocks(value: LockManager): Self = StObject.set(x, "locks", value.asInstanceOf[js.Any])
  }
}

package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  /** The value true (or a missing property) signals to the client that all threads have been resumed. The value false indicates that not all threads were resumed. */
  var allThreadsContinued: js.UndefOr[Boolean] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setAllThreadsContinued(value: Boolean): Self = StObject.set(x, "allThreadsContinued", value.asInstanceOf[js.Any])
    
    inline def setAllThreadsContinuedUndefined: Self = StObject.set(x, "allThreadsContinued", js.undefined)
  }
}

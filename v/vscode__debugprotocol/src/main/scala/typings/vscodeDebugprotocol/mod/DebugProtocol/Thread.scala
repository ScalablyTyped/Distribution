package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Thread */
trait Thread extends StObject {
  
  /** Unique identifier for the thread. */
  var id: Double
  
  /** The name of the thread. */
  var name: String
}
object Thread {
  
  inline def apply(id: Double, name: String): Thread = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thread]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Thread] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

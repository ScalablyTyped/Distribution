package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.mod.DebugProtocol.Thread
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Threads extends StObject {
  
  /** All threads. */
  var threads: js.Array[Thread]
}
object Threads {
  
  inline def apply(threads: js.Array[Thread]): Threads = {
    val __obj = js.Dynamic.literal(threads = threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threads]
  }
  
  extension [Self <: Threads](x: Self) {
    
    inline def setThreads(value: js.Array[Thread]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsVarargs(value: Thread*): Self = StObject.set(x, "threads", js.Array(value*))
  }
}

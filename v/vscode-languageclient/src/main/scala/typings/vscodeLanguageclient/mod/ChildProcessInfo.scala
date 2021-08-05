package typings.vscodeLanguageclient.mod

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildProcessInfo extends StObject {
  
  var detached: Boolean
  
  var process: ChildProcess
}
object ChildProcessInfo {
  
  inline def apply(detached: Boolean, process: ChildProcess): ChildProcessInfo = {
    val __obj = js.Dynamic.literal(detached = detached.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildProcessInfo]
  }
  
  extension [Self <: ChildProcessInfo](x: Self) {
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setProcess(value: ChildProcess): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
  }
}

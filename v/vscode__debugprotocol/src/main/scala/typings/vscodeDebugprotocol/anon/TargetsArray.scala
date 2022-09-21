package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.mod.DebugProtocol.GotoTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetsArray extends StObject {
  
  /** The possible goto targets of the specified location. */
  var targets: js.Array[GotoTarget]
}
object TargetsArray {
  
  inline def apply(targets: js.Array[GotoTarget]): TargetsArray = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetsArray]
  }
  
  extension [Self <: TargetsArray](x: Self) {
    
    inline def setTargets(value: js.Array[GotoTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: GotoTarget*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}

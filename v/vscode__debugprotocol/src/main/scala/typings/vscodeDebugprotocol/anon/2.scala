package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.mod.DebugProtocol.CompletionItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  /** The possible completions for . */
  var targets: js.Array[CompletionItem]
}
object `2` {
  
  inline def apply(targets: js.Array[CompletionItem]): `2` = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setTargets(value: js.Array[CompletionItem]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: CompletionItem*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}

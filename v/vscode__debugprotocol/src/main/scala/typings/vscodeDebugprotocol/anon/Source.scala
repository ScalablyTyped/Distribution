package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.`new`
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.changed
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /** The reason for the event. */
  var reason: `new` | changed | removed
  
  /** The new, changed, or removed source. */
  var source: typings.vscodeDebugprotocol.mod.DebugProtocol.Source
}
object Source {
  
  inline def apply(reason: `new` | changed | removed, source: typings.vscodeDebugprotocol.mod.DebugProtocol.Source): Source = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setReason(value: `new` | changed | removed): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSource(value: typings.vscodeDebugprotocol.mod.DebugProtocol.Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

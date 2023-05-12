package typings.vscode.anon

import typings.vscode.vscodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log extends StObject {
  
  var log: `true`
}
object Log {
  
  inline def apply(): Log = {
    val __obj = js.Dynamic.literal(log = true)
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
    
    inline def setLog(value: `true`): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
  }
}

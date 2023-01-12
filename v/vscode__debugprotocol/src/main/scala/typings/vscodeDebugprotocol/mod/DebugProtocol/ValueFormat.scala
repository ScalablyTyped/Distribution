package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides formatting information for a value. */
trait ValueFormat extends StObject {
  
  /** Display the value in hex. */
  var hex: js.UndefOr[Boolean] = js.undefined
}
object ValueFormat {
  
  inline def apply(): ValueFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueFormat] (val x: Self) extends AnyVal {
    
    inline def setHex(value: Boolean): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
  }
}

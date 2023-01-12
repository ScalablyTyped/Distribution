package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyFlags extends StObject {
  
  var flags: Double
}
object ApplyFlags {
  
  inline def apply(flags: Double): ApplyFlags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyFlags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplyFlags] (val x: Self) extends AnyVal {
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
  }
}

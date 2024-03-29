package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfTest extends StObject {
  
  var payload: js.UndefOr[String] = js.undefined
}
object SelfTest {
  
  inline def apply(): SelfTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfTest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelfTest] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}

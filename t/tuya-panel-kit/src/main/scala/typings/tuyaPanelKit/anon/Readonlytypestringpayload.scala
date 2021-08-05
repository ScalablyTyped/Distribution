package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  type :string,   payload :object | undefined,   source :string | undefined,   target :string | undefined}> */
trait Readonlytypestringpayload extends StObject {
  
  val payload: js.UndefOr[js.Object] = js.undefined
  
  val source: js.UndefOr[String] = js.undefined
  
  val target: js.UndefOr[String] = js.undefined
  
  val `type`: String
}
object Readonlytypestringpayload {
  
  inline def apply(`type`: String): Readonlytypestringpayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlytypestringpayload]
  }
  
  extension [Self <: Readonlytypestringpayload](x: Self) {
    
    inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

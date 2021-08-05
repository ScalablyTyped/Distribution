package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.tuyaPanelKitStrings.RESET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var payload: js.UndefOr[
    Readonlykeystringindexnum | PartialStateReadonlykeyst | PickReadonlykeystringinde
  ] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var source: js.UndefOr[String] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: RESET
}
object Target {
  
  inline def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RESET")
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setPayload(value: Readonlykeystringindexnum | PartialStateReadonlykeyst | PickReadonlykeystringinde): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: RESET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

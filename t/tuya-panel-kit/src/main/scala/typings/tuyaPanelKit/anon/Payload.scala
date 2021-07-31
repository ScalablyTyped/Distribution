package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.tuyaPanelKitStrings.NAVIGATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload
  extends StObject
     with typings.tuyaPanelKit.commonActionsMod.Action {
  
  var payload: Merge | KeyMerge
  
  // tslint:disable-next-line no-redundant-undefined
  var source: js.UndefOr[String] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: NAVIGATE
}
object Payload {
  
  @scala.inline
  def apply(payload: Merge | KeyMerge): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NAVIGATE")
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Merge | KeyMerge): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: NAVIGATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

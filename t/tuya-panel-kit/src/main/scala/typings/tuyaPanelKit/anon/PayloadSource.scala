package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.stackRouterMod.StackActionType
import typings.tuyaPanelKit.tuyaPanelKitStrings.REPLACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadSource
  extends StObject
     with StackActionType {
  
  var payload: Params
  
  // tslint:disable-next-line no-redundant-undefined
  var source: js.UndefOr[String] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: REPLACE
}
object PayloadSource {
  
  @scala.inline
  def apply(payload: Params): PayloadSource = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REPLACE")
    __obj.asInstanceOf[PayloadSource]
  }
  
  @scala.inline
  implicit class PayloadSourceMutableBuilder[Self <: PayloadSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Params): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: REPLACE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.commonActionsMod.ResetState
import typings.tuyaPanelKit.tuyaPanelKitStrings.RESET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayloadSourceTarget
  extends typings.tuyaPanelKit.commonActionsMod.Action {
  
  var payload: js.UndefOr[ResetState] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var `type`: RESET = js.native
}
object PayloadSourceTarget {
  
  @scala.inline
  def apply(`type`: RESET): PayloadSourceTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadSourceTarget]
  }
  
  @scala.inline
  implicit class PayloadSourceTargetMutableBuilder[Self <: PayloadSourceTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: ResetState): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: RESET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

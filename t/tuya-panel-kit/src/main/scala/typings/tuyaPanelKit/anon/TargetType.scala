package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.stackRouterMod.StackActionType
import typings.tuyaPanelKit.tuyaPanelKitStrings.POP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetType
  extends StObject
     with StackActionType {
  
  var payload: Count
  
  // tslint:disable-next-line no-redundant-undefined
  var source: js.UndefOr[String] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: POP
}
object TargetType {
  
  @scala.inline
  def apply(payload: Count): TargetType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("POP")
    __obj.asInstanceOf[TargetType]
  }
  
  @scala.inline
  implicit class TargetTypeMutableBuilder[Self <: TargetType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Count): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: POP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

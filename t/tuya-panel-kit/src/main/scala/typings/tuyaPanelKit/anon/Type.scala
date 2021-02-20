package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.tuyaPanelKitStrings.SET_PARAMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type
  extends typings.tuyaPanelKit.commonActionsMod.Action {
  
  /**
    * List of previously visited route keys.
    */
  var payload: `0` = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  var source: js.UndefOr[String] = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  var target: js.UndefOr[String] = js.native
  
  var `type`: SET_PARAMS = js.native
}
object Type {
  
  @scala.inline
  def apply(payload: `0`, `type`: SET_PARAMS): Type = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: `0`): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: SET_PARAMS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.stackRouterMod.StackActionType
import typings.tuyaPanelKit.tuyaPanelKitStrings.POP_TO_TOP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceTargetType extends StackActionType {
  
  // tslint:disable-next-line no-redundant-undefined
  var source: js.UndefOr[String] = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  var target: js.UndefOr[String] = js.native
  
  var `type`: POP_TO_TOP = js.native
}
object SourceTargetType {
  
  @scala.inline
  def apply(`type`: POP_TO_TOP): SourceTargetType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTargetType]
  }
  
  @scala.inline
  implicit class SourceTargetTypeMutableBuilder[Self <: SourceTargetType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: POP_TO_TOP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

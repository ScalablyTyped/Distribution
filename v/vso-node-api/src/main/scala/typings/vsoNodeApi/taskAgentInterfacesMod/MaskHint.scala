package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskHint extends StObject {
  
  var `type`: MaskType
  
  var value: String
}
object MaskHint {
  
  @scala.inline
  def apply(`type`: MaskType, value: String): MaskHint = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskHint]
  }
  
  @scala.inline
  implicit class MaskHintMutableBuilder[Self <: MaskHint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: MaskType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

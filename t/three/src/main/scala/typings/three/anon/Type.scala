package typings.three.anon

import typings.three.webXRControllerMod.XRControllerEventType
import typings.three.webXRMod.XRInputSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var data: js.UndefOr[XRInputSource] = js.undefined
  
  var `type`: XRControllerEventType
}
object Type {
  
  @scala.inline
  def apply(`type`: XRControllerEventType): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: XRInputSource): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setType(value: XRControllerEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

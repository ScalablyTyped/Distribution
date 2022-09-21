package typings.three.anon

import typings.three.webXRControllerMod.XRControllerEventType
import typings.webxr.XRInputSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataType extends StObject {
  
  var data: js.UndefOr[XRInputSource] = js.undefined
  
  var `type`: XRControllerEventType
}
object DataType {
  
  inline def apply(`type`: XRControllerEventType): DataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
  
  extension [Self <: DataType](x: Self) {
    
    inline def setData(value: XRInputSource): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setType(value: XRControllerEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

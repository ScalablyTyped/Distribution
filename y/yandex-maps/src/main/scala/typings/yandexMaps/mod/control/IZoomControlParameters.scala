package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IZoomControlParameters extends StObject {
  
  var options: js.UndefOr[Size] = js.undefined
}
object IZoomControlParameters {
  
  inline def apply(): IZoomControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IZoomControlParameters]
  }
  
  extension [Self <: IZoomControlParameters](x: Self) {
    
    inline def setOptions(value: Size): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}

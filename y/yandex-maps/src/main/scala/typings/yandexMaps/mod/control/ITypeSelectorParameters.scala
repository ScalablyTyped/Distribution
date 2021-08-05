package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.PanoramasItemMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITypeSelectorParameters extends StObject {
  
  var options: js.UndefOr[PanoramasItemMode] = js.undefined
}
object ITypeSelectorParameters {
  
  inline def apply(): ITypeSelectorParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITypeSelectorParameters]
  }
  
  extension [Self <: ITypeSelectorParameters](x: Self) {
    
    inline def setOptions(value: PanoramasItemMode): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}

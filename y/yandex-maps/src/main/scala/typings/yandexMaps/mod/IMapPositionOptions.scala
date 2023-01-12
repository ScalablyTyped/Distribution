package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapPositionOptions
  extends StObject
     with IMapZoomOptions {
  
  var timingFunction: js.UndefOr[String] = js.undefined
}
object IMapPositionOptions {
  
  inline def apply(): IMapPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapPositionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMapPositionOptions] (val x: Self) extends AnyVal {
    
    inline def setTimingFunction(value: String): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    inline def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
  }
}

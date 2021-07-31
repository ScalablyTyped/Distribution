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
  
  @scala.inline
  def apply(): IMapPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapPositionOptions]
  }
  
  @scala.inline
  implicit class IMapPositionOptionsMutableBuilder[Self <: IMapPositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimingFunction(value: String): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
  }
}

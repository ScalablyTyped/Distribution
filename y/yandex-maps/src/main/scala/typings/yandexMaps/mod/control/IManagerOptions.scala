package typings.yandexMaps.mod.control

import typings.yandexMaps.mod.IPane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IManagerOptions extends StObject {
  
  var margin: js.UndefOr[Double] = js.undefined
  
  var pane: js.UndefOr[IPane] = js.undefined
  
  var states: js.UndefOr[js.Array[String]] = js.undefined
}
object IManagerOptions {
  
  inline def apply(): IManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IManagerOptions]
  }
  
  extension [Self <: IManagerOptions](x: Self) {
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setPane(value: IPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setStates(value: js.Array[String]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatesVarargs(value: String*): Self = StObject.set(x, "states", js.Array(value :_*))
  }
}

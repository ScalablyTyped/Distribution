package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecConfigMod.DefaultsConfig
import typings.vegaTypings.vegaTypingsStrings.any
import typings.vegaTypings.vegaTypingsStrings.container
import typings.vegaTypings.vegaTypingsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bind extends StObject {
  
  var bind: js.UndefOr[any | container | none] = js.undefined
  
  var defaults: js.UndefOr[DefaultsConfig] = js.undefined
  
  var globalCursor: js.UndefOr[Boolean] = js.undefined
  
  var selector: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var timer: js.UndefOr[Boolean] = js.undefined
  
  var view: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var window: js.UndefOr[Boolean | js.Array[String]] = js.undefined
}
object Bind {
  
  inline def apply(): Bind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bind]
  }
  
  extension [Self <: Bind](x: Self) {
    
    inline def setBind(value: any | container | none): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    inline def setDefaults(value: DefaultsConfig): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setGlobalCursor(value: Boolean): Self = StObject.set(x, "globalCursor", value.asInstanceOf[js.Any])
    
    inline def setGlobalCursorUndefined: Self = StObject.set(x, "globalCursor", js.undefined)
    
    inline def setSelector(value: Boolean | js.Array[String]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSelectorVarargs(value: String*): Self = StObject.set(x, "selector", js.Array(value*))
    
    inline def setTimer(value: Boolean): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
    
    inline def setView(value: Boolean | js.Array[String]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setViewVarargs(value: String*): Self = StObject.set(x, "view", js.Array(value*))
    
    inline def setWindow(value: Boolean | js.Array[String]): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    inline def setWindowVarargs(value: String*): Self = StObject.set(x, "window", js.Array(value*))
  }
}

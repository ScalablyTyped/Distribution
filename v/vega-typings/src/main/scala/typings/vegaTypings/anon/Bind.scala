package typings.vegaTypings.anon

import typings.vegaTypings.configMod.DefaultsConfig
import typings.vegaTypings.vegaTypingsStrings.any
import typings.vegaTypings.vegaTypingsStrings.container
import typings.vegaTypings.vegaTypingsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bind extends StObject {
  
  var bind: js.UndefOr[any | container | none] = js.native
  
  var defaults: js.UndefOr[DefaultsConfig] = js.native
  
  var globalCursor: js.UndefOr[Boolean] = js.native
  
  var selector: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  var timer: js.UndefOr[Boolean] = js.native
  
  var view: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  var window: js.UndefOr[Boolean | js.Array[String]] = js.native
}
object Bind {
  
  @scala.inline
  def apply(): Bind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bind]
  }
  
  @scala.inline
  implicit class BindMutableBuilder[Self <: Bind] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBind(value: any | container | none): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    @scala.inline
    def setDefaults(value: DefaultsConfig): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    @scala.inline
    def setGlobalCursor(value: Boolean): Self = StObject.set(x, "globalCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalCursorUndefined: Self = StObject.set(x, "globalCursor", js.undefined)
    
    @scala.inline
    def setSelector(value: Boolean | js.Array[String]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSelectorVarargs(value: String*): Self = StObject.set(x, "selector", js.Array(value :_*))
    
    @scala.inline
    def setTimer(value: Boolean): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
    
    @scala.inline
    def setView(value: Boolean | js.Array[String]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setViewVarargs(value: String*): Self = StObject.set(x, "view", js.Array(value :_*))
    
    @scala.inline
    def setWindow(value: Boolean | js.Array[String]): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    @scala.inline
    def setWindowVarargs(value: String*): Self = StObject.set(x, "window", js.Array(value :_*))
  }
}

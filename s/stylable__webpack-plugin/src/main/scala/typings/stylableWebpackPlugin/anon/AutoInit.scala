package typings.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoInit extends StObject {
  
  var autoInit: Boolean = js.native
  
  var getAutoInitModule: js.UndefOr[js.Any] = js.native
  
  var globalInjection: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
}
object AutoInit {
  
  @scala.inline
  def apply(autoInit: Boolean): AutoInit = {
    val __obj = js.Dynamic.literal(autoInit = autoInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoInit]
  }
  
  @scala.inline
  implicit class AutoInitMutableBuilder[Self <: AutoInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoInit(value: Boolean): Self = StObject.set(x, "autoInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAutoInitModule(value: js.Any): Self = StObject.set(x, "getAutoInitModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAutoInitModuleUndefined: Self = StObject.set(x, "getAutoInitModule", js.undefined)
    
    @scala.inline
    def setGlobalInjection(value: /* p */ String => String): Self = StObject.set(x, "globalInjection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGlobalInjectionUndefined: Self = StObject.set(x, "globalInjection", js.undefined)
  }
}

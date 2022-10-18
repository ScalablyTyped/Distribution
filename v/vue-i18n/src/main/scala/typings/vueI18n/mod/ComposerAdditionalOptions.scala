package typings.vueI18n.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComposerAdditionalOptions extends StObject {
  
  var useScope: js.UndefOr[I18nScope] = js.undefined
}
object ComposerAdditionalOptions {
  
  inline def apply(): ComposerAdditionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposerAdditionalOptions]
  }
  
  extension [Self <: ComposerAdditionalOptions](x: Self) {
    
    inline def setUseScope(value: I18nScope): Self = StObject.set(x, "useScope", value.asInstanceOf[js.Any])
    
    inline def setUseScopeUndefined: Self = StObject.set(x, "useScope", js.undefined)
  }
}

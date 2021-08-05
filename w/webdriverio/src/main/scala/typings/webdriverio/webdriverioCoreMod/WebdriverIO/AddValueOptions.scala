package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddValueOptions extends StObject {
  
  var translateToUnicode: js.UndefOr[Boolean] = js.undefined
}
object AddValueOptions {
  
  inline def apply(): AddValueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddValueOptions]
  }
  
  extension [Self <: AddValueOptions](x: Self) {
    
    inline def setTranslateToUnicode(value: Boolean): Self = StObject.set(x, "translateToUnicode", value.asInstanceOf[js.Any])
    
    inline def setTranslateToUnicodeUndefined: Self = StObject.set(x, "translateToUnicode", js.undefined)
  }
}

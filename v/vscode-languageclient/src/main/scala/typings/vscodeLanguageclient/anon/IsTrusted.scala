package typings.vscodeLanguageclient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsTrusted extends StObject {
  
  var isTrusted: js.UndefOr[Boolean] = js.undefined
  
  var supportHtml: js.UndefOr[Boolean] = js.undefined
}
object IsTrusted {
  
  inline def apply(): IsTrusted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsTrusted]
  }
  
  extension [Self <: IsTrusted](x: Self) {
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
    
    inline def setSupportHtml(value: Boolean): Self = StObject.set(x, "supportHtml", value.asInstanceOf[js.Any])
    
    inline def setSupportHtmlUndefined: Self = StObject.set(x, "supportHtml", js.undefined)
  }
}

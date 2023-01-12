package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveOptions extends StObject {
  
  /**
    * The client is supposed to include the content on save.
    */
  var includeText: js.UndefOr[Boolean] = js.undefined
}
object SaveOptions {
  
  inline def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeText(value: Boolean): Self = StObject.set(x, "includeText", value.asInstanceOf[js.Any])
    
    inline def setIncludeTextUndefined: Self = StObject.set(x, "includeText", js.undefined)
  }
}

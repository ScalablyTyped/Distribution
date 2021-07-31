package typings.vscodeLanguageserverProtocol.protocolMod

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
  
  @scala.inline
  def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
  
  @scala.inline
  implicit class SaveOptionsMutableBuilder[Self <: SaveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeText(value: Boolean): Self = StObject.set(x, "includeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTextUndefined: Self = StObject.set(x, "includeText", js.undefined)
  }
}

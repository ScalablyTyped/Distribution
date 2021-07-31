package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddValueOptions extends StObject {
  
  var translateToUnicode: js.UndefOr[Boolean] = js.undefined
}
object AddValueOptions {
  
  @scala.inline
  def apply(): AddValueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddValueOptions]
  }
  
  @scala.inline
  implicit class AddValueOptionsMutableBuilder[Self <: AddValueOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranslateToUnicode(value: Boolean): Self = StObject.set(x, "translateToUnicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateToUnicodeUndefined: Self = StObject.set(x, "translateToUnicode", js.undefined)
  }
}

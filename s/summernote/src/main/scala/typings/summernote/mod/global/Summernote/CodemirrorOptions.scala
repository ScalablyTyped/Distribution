package typings.summernote.mod.global.Summernote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodemirrorOptions extends StObject {
  
  var htmlNode: js.UndefOr[Boolean] = js.undefined
  
  var lineNumbers: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
}
object CodemirrorOptions {
  
  @scala.inline
  def apply(): CodemirrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodemirrorOptions]
  }
  
  @scala.inline
  implicit class CodemirrorOptionsMutableBuilder[Self <: CodemirrorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlNode(value: Boolean): Self = StObject.set(x, "htmlNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlNodeUndefined: Self = StObject.set(x, "htmlNode", js.undefined)
    
    @scala.inline
    def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}

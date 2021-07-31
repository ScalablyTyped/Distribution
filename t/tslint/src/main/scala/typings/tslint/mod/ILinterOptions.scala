package typings.tslint.mod

import typings.tslint.formatterMod.FormatterConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILinterOptions extends StObject {
  
  var fix: Boolean
  
  var formatter: js.UndefOr[String | FormatterConstructor] = js.undefined
  
  var formattersDirectory: js.UndefOr[String] = js.undefined
  
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.undefined
}
object ILinterOptions {
  
  @scala.inline
  def apply(fix: Boolean): ILinterOptions = {
    val __obj = js.Dynamic.literal(fix = fix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinterOptions]
  }
  
  @scala.inline
  implicit class ILinterOptionsMutableBuilder[Self <: ILinterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatter(value: String | FormatterConstructor): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setFormattersDirectory(value: String): Self = StObject.set(x, "formattersDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattersDirectoryUndefined: Self = StObject.set(x, "formattersDirectory", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    @scala.inline
    def setRulesDirectory(value: String | js.Array[String]): Self = StObject.set(x, "rulesDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesDirectoryUndefined: Self = StObject.set(x, "rulesDirectory", js.undefined)
    
    @scala.inline
    def setRulesDirectoryVarargs(value: String*): Self = StObject.set(x, "rulesDirectory", js.Array(value :_*))
  }
}

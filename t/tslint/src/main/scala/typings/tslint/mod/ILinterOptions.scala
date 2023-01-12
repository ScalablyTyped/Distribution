package typings.tslint.mod

import typings.tslint.libLanguageFormatterFormatterMod.FormatterConstructor
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
  
  inline def apply(fix: Boolean): ILinterOptions = {
    val __obj = js.Dynamic.literal(fix = fix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILinterOptions] (val x: Self) extends AnyVal {
    
    inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
    
    inline def setFormatter(value: String | FormatterConstructor): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setFormattersDirectory(value: String): Self = StObject.set(x, "formattersDirectory", value.asInstanceOf[js.Any])
    
    inline def setFormattersDirectoryUndefined: Self = StObject.set(x, "formattersDirectory", js.undefined)
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def setRulesDirectory(value: String | js.Array[String]): Self = StObject.set(x, "rulesDirectory", value.asInstanceOf[js.Any])
    
    inline def setRulesDirectoryUndefined: Self = StObject.set(x, "rulesDirectory", js.undefined)
    
    inline def setRulesDirectoryVarargs(value: String*): Self = StObject.set(x, "rulesDirectory", js.Array(value*))
  }
}

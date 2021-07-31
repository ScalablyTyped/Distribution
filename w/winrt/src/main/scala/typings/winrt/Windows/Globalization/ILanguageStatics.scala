package typings.winrt.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguageStatics extends StObject {
  
  var currentInputMethodLanguageTag: String
  
  def isWellFormed(languageTag: String): Boolean
}
object ILanguageStatics {
  
  @scala.inline
  def apply(currentInputMethodLanguageTag: String, isWellFormed: String => Boolean): ILanguageStatics = {
    val __obj = js.Dynamic.literal(currentInputMethodLanguageTag = currentInputMethodLanguageTag.asInstanceOf[js.Any], isWellFormed = js.Any.fromFunction1(isWellFormed))
    __obj.asInstanceOf[ILanguageStatics]
  }
  
  @scala.inline
  implicit class ILanguageStaticsMutableBuilder[Self <: ILanguageStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentInputMethodLanguageTag(value: String): Self = StObject.set(x, "currentInputMethodLanguageTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWellFormed(value: String => Boolean): Self = StObject.set(x, "isWellFormed", js.Any.fromFunction1(value))
  }
}

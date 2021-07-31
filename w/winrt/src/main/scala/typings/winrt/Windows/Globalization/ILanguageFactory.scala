package typings.winrt.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguageFactory extends StObject {
  
  def createLanguage(languageTag: String): Language
}
object ILanguageFactory {
  
  @scala.inline
  def apply(createLanguage: String => Language): ILanguageFactory = {
    val __obj = js.Dynamic.literal(createLanguage = js.Any.fromFunction1(createLanguage))
    __obj.asInstanceOf[ILanguageFactory]
  }
  
  @scala.inline
  implicit class ILanguageFactoryMutableBuilder[Self <: ILanguageFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateLanguage(value: String => Language): Self = StObject.set(x, "createLanguage", js.Any.fromFunction1(value))
  }
}

package typings.winrtUwp.Windows.Storage.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the language of a property, as a BCP-47 language code. */
@js.native
trait ValueAndLanguage extends StObject {
  
  /** Gets or sets the language of the property value, specified as a BCP-47 language code. */
  var language: String = js.native
  
  /** Gets or sets the property value for the current ValueAndLanguage . */
  var value: js.Any = js.native
}
object ValueAndLanguage {
  
  @scala.inline
  def apply(language: String, value: js.Any): ValueAndLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAndLanguage]
  }
  
  @scala.inline
  implicit class ValueAndLanguageMutableBuilder[Self <: ValueAndLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

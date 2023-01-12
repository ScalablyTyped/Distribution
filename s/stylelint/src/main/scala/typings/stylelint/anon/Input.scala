package typings.stylelint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  var input: File
  
  var lang: Unit
}
object Input {
  
  inline def apply(input: File, lang: Unit): Input = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    inline def setInput(value: File): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setLang(value: Unit): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
  }
}

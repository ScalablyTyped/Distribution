package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instructions extends StObject {
  
  var instructions: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object Instructions {
  
  inline def apply(): Instructions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instructions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Instructions] (val x: Self) extends AnyVal {
    
    inline def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

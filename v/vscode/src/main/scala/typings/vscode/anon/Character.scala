package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Character extends StObject {
  
  var character: js.UndefOr[Double] = js.undefined
  
  var line: js.UndefOr[Double] = js.undefined
}
object Character {
  
  inline def apply(): Character = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Character]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Character] (val x: Self) extends AnyVal {
    
    inline def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    inline def setCharacterUndefined: Self = StObject.set(x, "character", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}

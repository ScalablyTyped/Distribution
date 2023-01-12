package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterDelta extends StObject {
  
  var characterDelta: js.UndefOr[Double] = js.undefined
  
  var lineDelta: js.UndefOr[Double] = js.undefined
}
object CharacterDelta {
  
  inline def apply(): CharacterDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharacterDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CharacterDelta] (val x: Self) extends AnyVal {
    
    inline def setCharacterDelta(value: Double): Self = StObject.set(x, "characterDelta", value.asInstanceOf[js.Any])
    
    inline def setCharacterDeltaUndefined: Self = StObject.set(x, "characterDelta", js.undefined)
    
    inline def setLineDelta(value: Double): Self = StObject.set(x, "lineDelta", value.asInstanceOf[js.Any])
    
    inline def setLineDeltaUndefined: Self = StObject.set(x, "lineDelta", js.undefined)
  }
}

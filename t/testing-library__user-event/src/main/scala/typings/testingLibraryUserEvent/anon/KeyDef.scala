package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.distTypesSystemKeyboardMod.keyboardKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyDef extends StObject {
  
  var keyDef: keyboardKey
  
  var releasePrevious: Boolean
  
  var releaseSelf: Boolean
  
  var repeat: Double
}
object KeyDef {
  
  inline def apply(keyDef: keyboardKey, releasePrevious: Boolean, releaseSelf: Boolean, repeat: Double): KeyDef = {
    val __obj = js.Dynamic.literal(keyDef = keyDef.asInstanceOf[js.Any], releasePrevious = releasePrevious.asInstanceOf[js.Any], releaseSelf = releaseSelf.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyDef]
  }
  
  extension [Self <: KeyDef](x: Self) {
    
    inline def setKeyDef(value: keyboardKey): Self = StObject.set(x, "keyDef", value.asInstanceOf[js.Any])
    
    inline def setReleasePrevious(value: Boolean): Self = StObject.set(x, "releasePrevious", value.asInstanceOf[js.Any])
    
    inline def setReleaseSelf(value: Boolean): Self = StObject.set(x, "releaseSelf", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
  }
}

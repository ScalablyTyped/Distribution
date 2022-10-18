package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.distTypesSystemKeyboardMod.keyboardKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnpreventedDefault extends StObject {
  
  var keyDef: keyboardKey
  
  var unpreventedDefault: Boolean
}
object UnpreventedDefault {
  
  inline def apply(keyDef: keyboardKey, unpreventedDefault: Boolean): UnpreventedDefault = {
    val __obj = js.Dynamic.literal(keyDef = keyDef.asInstanceOf[js.Any], unpreventedDefault = unpreventedDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnpreventedDefault]
  }
  
  extension [Self <: UnpreventedDefault](x: Self) {
    
    inline def setKeyDef(value: keyboardKey): Self = StObject.set(x, "keyDef", value.asInstanceOf[js.Any])
    
    inline def setUnpreventedDefault(value: Boolean): Self = StObject.set(x, "unpreventedDefault", value.asInstanceOf[js.Any])
  }
}

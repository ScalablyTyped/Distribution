package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.distTypesSystemPointerSharedMod.pointerKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleasePrevious extends StObject {
  
  var keyDef: pointerKey
  
  var releasePrevious: Boolean
  
  var releaseSelf: Boolean
}
object ReleasePrevious {
  
  inline def apply(keyDef: pointerKey, releasePrevious: Boolean, releaseSelf: Boolean): ReleasePrevious = {
    val __obj = js.Dynamic.literal(keyDef = keyDef.asInstanceOf[js.Any], releasePrevious = releasePrevious.asInstanceOf[js.Any], releaseSelf = releaseSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleasePrevious]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleasePrevious] (val x: Self) extends AnyVal {
    
    inline def setKeyDef(value: pointerKey): Self = StObject.set(x, "keyDef", value.asInstanceOf[js.Any])
    
    inline def setReleasePrevious(value: Boolean): Self = StObject.set(x, "releasePrevious", value.asInstanceOf[js.Any])
    
    inline def setReleaseSelf(value: Boolean): Self = StObject.set(x, "releaseSelf", value.asInstanceOf[js.Any])
  }
}

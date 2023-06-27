package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEffectiveTypeRootsHost extends StObject {
  
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}
object GetEffectiveTypeRootsHost {
  
  inline def apply(): GetEffectiveTypeRootsHost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectiveTypeRootsHost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEffectiveTypeRootsHost] (val x: Self) extends AnyVal {
    
    inline def setGetCurrentDirectory(value: () => java.lang.String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    inline def setGetCurrentDirectoryUndefined: Self = StObject.set(x, "getCurrentDirectory", js.undefined)
  }
}

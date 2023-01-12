package typings.vscodeLanguageserver.anon

import typings.vscodeLanguageserverTypes.mod.LSPObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait New extends StObject {
  
  var `new`: js.UndefOr[LSPObject] = js.undefined
  
  var old: js.UndefOr[LSPObject] = js.undefined
}
object New {
  
  inline def apply(): New = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[New]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: New] (val x: Self) extends AnyVal {
    
    inline def setNew(value: LSPObject): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
    
    inline def setOld(value: LSPObject): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    
    inline def setOldUndefined: Self = StObject.set(x, "old", js.undefined)
  }
}

package typings.typedoc.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dicttag
  extends StObject
     with /* tag */ StringDictionary[Boolean] {
  
  var external: js.UndefOr[Boolean] = js.undefined
  
  var inherited: js.UndefOr[Boolean] = js.undefined
  
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var `protected`: js.UndefOr[Boolean] = js.undefined
}
object Dicttag {
  
  inline def apply(): Dicttag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dicttag]
  }
  
  extension [Self <: Dicttag](x: Self) {
    
    inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    inline def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
  }
}

package typings.uirouterCore.anon

import typings.uirouterCore.libCommonGlobMod.Glob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameGlob extends StObject {
  
  /** Might be null */
  var nameGlob: js.UndefOr[Glob] = js.undefined
}
object NameGlob {
  
  inline def apply(): NameGlob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameGlob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameGlob] (val x: Self) extends AnyVal {
    
    inline def setNameGlob(value: Glob): Self = StObject.set(x, "nameGlob", value.asInstanceOf[js.Any])
    
    inline def setNameGlobUndefined: Self = StObject.set(x, "nameGlob", js.undefined)
  }
}

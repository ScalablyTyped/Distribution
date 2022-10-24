package typings.yarnpkgParsers.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndSemicolon extends StObject {
  
  var endSemicolon: js.UndefOr[Boolean] = js.undefined
}
object EndSemicolon {
  
  inline def apply(): EndSemicolon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndSemicolon]
  }
  
  extension [Self <: EndSemicolon](x: Self) {
    
    inline def setEndSemicolon(value: Boolean): Self = StObject.set(x, "endSemicolon", value.asInstanceOf[js.Any])
    
    inline def setEndSemicolonUndefined: Self = StObject.set(x, "endSemicolon", js.undefined)
  }
}

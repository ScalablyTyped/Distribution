package typings.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replace extends StObject {
  
  var replace: js.UndefOr[String | Boolean] = js.undefined
}
object Replace {
  
  inline def apply(): Replace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replace]
  }
  
  extension [Self <: Replace](x: Self) {
    
    inline def setReplace(value: String | Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}

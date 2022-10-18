package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WantList extends StObject {
  
  var Keys: js.Array[WantListItem]
}
object WantList {
  
  inline def apply(Keys: js.Array[WantListItem]): WantList = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[WantList]
  }
  
  extension [Self <: WantList](x: Self) {
    
    inline def setKeys(value: js.Array[WantListItem]): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: WantListItem*): Self = StObject.set(x, "Keys", js.Array(value*))
  }
}

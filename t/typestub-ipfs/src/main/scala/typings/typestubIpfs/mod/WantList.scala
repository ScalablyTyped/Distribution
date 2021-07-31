package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WantList extends StObject {
  
  var Keys: js.Array[WantListItem]
}
object WantList {
  
  @scala.inline
  def apply(Keys: js.Array[WantListItem]): WantList = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[WantList]
  }
  
  @scala.inline
  implicit class WantListMutableBuilder[Self <: WantList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[WantListItem]): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: WantListItem*): Self = StObject.set(x, "Keys", js.Array(value :_*))
  }
}

package typings.vastClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VASTClientCustomStorage
  extends StObject
     with /* key */ StringDictionary[Any | js.Function0[Any]] {
  
  def getItem(key: String): String | Null
  
  def setItem(key: String, `val`: String): Unit
}
object VASTClientCustomStorage {
  
  inline def apply(getItem: String => String | Null, setItem: (String, String) => Unit): VASTClientCustomStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[VASTClientCustomStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VASTClientCustomStorage] (val x: Self) extends AnyVal {
    
    inline def setGetItem(value: String => String | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setSetItem(value: (String, String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
  }
}

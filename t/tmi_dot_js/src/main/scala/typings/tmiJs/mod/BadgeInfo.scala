package typings.tmiJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeInfo
  extends StObject
     with /* other */ StringDictionary[js.UndefOr[String]] {
  
  var subscriber: js.UndefOr[String] = js.undefined
}
object BadgeInfo {
  
  inline def apply(): BadgeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadgeInfo]
  }
  
  extension [Self <: BadgeInfo](x: Self) {
    
    inline def setSubscriber(value: String): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    
    inline def setSubscriberUndefined: Self = StObject.set(x, "subscriber", js.undefined)
  }
}

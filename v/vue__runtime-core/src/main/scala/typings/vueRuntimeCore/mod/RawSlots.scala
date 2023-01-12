package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawSlots
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$stable")
  var $stable: js.UndefOr[Boolean] = js.undefined
}
object RawSlots {
  
  inline def apply(): RawSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawSlots] (val x: Self) extends AnyVal {
    
    inline def set$stable(value: Boolean): Self = StObject.set(x, "$stable", value.asInstanceOf[js.Any])
    
    inline def set$stableUndefined: Self = StObject.set(x, "$stable", js.undefined)
  }
}

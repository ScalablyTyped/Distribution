package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownCreateStatsOptionsContext extends StObject {
  
  var forToString: js.UndefOr[Boolean] = js.undefined
}
object KnownCreateStatsOptionsContext {
  
  inline def apply(): KnownCreateStatsOptionsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownCreateStatsOptionsContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnownCreateStatsOptionsContext] (val x: Self) extends AnyVal {
    
    inline def setForToString(value: Boolean): Self = StObject.set(x, "forToString", value.asInstanceOf[js.Any])
    
    inline def setForToStringUndefined: Self = StObject.set(x, "forToString", js.undefined)
  }
}

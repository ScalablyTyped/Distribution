package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var disableMixedMap: js.UndefOr[Boolean] = js.undefined
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setDisableMixedMap(value: Boolean): Self = StObject.set(x, "disableMixedMap", value.asInstanceOf[js.Any])
    
    inline def setDisableMixedMapUndefined: Self = StObject.set(x, "disableMixedMap", js.undefined)
  }
}

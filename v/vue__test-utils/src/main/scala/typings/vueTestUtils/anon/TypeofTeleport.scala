package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTeleport extends StObject {
  
  var __isTeleport: `true`
}
object TypeofTeleport {
  
  inline def apply(): TypeofTeleport = {
    val __obj = js.Dynamic.literal(__isTeleport = true)
    __obj.asInstanceOf[TypeofTeleport]
  }
  
  extension [Self <: TypeofTeleport](x: Self) {
    
    inline def set__isTeleport(value: `true`): Self = StObject.set(x, "__isTeleport", value.asInstanceOf[js.Any])
  }
}

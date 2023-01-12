package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSuspense extends StObject {
  
  var __isSuspense: `true`
}
object TypeofSuspense {
  
  inline def apply(): TypeofSuspense = {
    val __obj = js.Dynamic.literal(__isSuspense = true)
    __obj.asInstanceOf[TypeofSuspense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSuspense] (val x: Self) extends AnyVal {
    
    inline def set__isSuspense(value: `true`): Self = StObject.set(x, "__isSuspense", value.asInstanceOf[js.Any])
  }
}

package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofKeepAlive extends StObject {
  
  var __isKeepAlive: `true`
}
object TypeofKeepAlive {
  
  inline def apply(): TypeofKeepAlive = {
    val __obj = js.Dynamic.literal(__isKeepAlive = true)
    __obj.asInstanceOf[TypeofKeepAlive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofKeepAlive] (val x: Self) extends AnyVal {
    
    inline def set__isKeepAlive(value: `true`): Self = StObject.set(x, "__isKeepAlive", value.asInstanceOf[js.Any])
  }
}

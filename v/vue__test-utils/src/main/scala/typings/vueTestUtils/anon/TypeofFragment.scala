package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFragment extends StObject {
  
  var __isFragment: `true`
}
object TypeofFragment {
  
  inline def apply(): TypeofFragment = {
    val __obj = js.Dynamic.literal(__isFragment = true)
    __obj.asInstanceOf[TypeofFragment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFragment] (val x: Self) extends AnyVal {
    
    inline def set__isFragment(value: `true`): Self = StObject.set(x, "__isFragment", value.asInstanceOf[js.Any])
  }
}

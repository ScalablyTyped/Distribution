package typings.tonicUiReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `547` extends StObject {
  
  var appear: js.UndefOr[Boolean] = js.undefined
}
object `547` {
  
  inline def apply(): `547` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`547`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `547`] (val x: Self) extends AnyVal {
    
    inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
  }
}

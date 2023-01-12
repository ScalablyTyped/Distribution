package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def tap(): scala.Nothing
}
object `0` {
  
  inline def apply(tap: () => scala.Nothing): `0` = {
    val __obj = js.Dynamic.literal(tap = js.Any.fromFunction0(tap))
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setTap(value: () => scala.Nothing): Self = StObject.set(x, "tap", js.Any.fromFunction0(value))
  }
}

package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def tap(): Unit
}
object `1` {
  
  inline def apply(tap: () => Unit): `1` = {
    val __obj = js.Dynamic.literal(tap = js.Any.fromFunction0(tap))
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setTap(value: () => Unit): Self = StObject.set(x, "tap", js.Any.fromFunction0(value))
  }
}

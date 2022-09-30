package typings.victoryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[T] extends StObject {
  
  var x: js.UndefOr[T] = js.undefined
  
  var y: js.UndefOr[T] = js.undefined
}
object `4` {
  
  inline def apply[T](): `4`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[T]]
  }
  
  extension [Self <: `4`[?], T](x: Self & `4`[T]) {
    
    inline def setX(value: T): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: T): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

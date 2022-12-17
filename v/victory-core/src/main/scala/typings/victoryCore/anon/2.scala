package typings.victoryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[T] extends StObject {
  
  var x: js.UndefOr[T] = js.undefined
  
  var y: js.UndefOr[T] = js.undefined
}
object `2` {
  
  inline def apply[T](): `2`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[T]]
  }
  
  extension [Self <: `2`[?], T](x: Self & `2`[T]) {
    
    inline def setX(value: T): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: T): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

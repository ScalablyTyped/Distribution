package typings.typeFest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LengthL[L /* <: Double */] extends StObject {
  
  val length: L
}
object LengthL {
  
  inline def apply[L /* <: Double */](length: L): LengthL[L] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthL[L]]
  }
  
  extension [Self <: LengthL[?], L /* <: Double */](x: Self & LengthL[L]) {
    
    inline def setLength(value: L): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}

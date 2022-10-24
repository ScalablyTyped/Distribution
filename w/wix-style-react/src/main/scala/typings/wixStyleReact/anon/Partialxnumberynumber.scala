package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  x :number,   y :number}> */
trait Partialxnumberynumber extends StObject {
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object Partialxnumberynumber {
  
  inline def apply(): Partialxnumberynumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialxnumberynumber]
  }
  
  extension [Self <: Partialxnumberynumber](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

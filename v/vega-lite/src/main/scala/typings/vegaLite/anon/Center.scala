package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  val center: typings.vegaLite.vegaLiteInts.`1`
  
  val normalize: typings.vegaLite.vegaLiteInts.`1`
  
  val zero: typings.vegaLite.vegaLiteInts.`1`
}
object Center {
  
  inline def apply(): Center = {
    val __obj = js.Dynamic.literal(center = 1, normalize = 1, zero = 1)
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setZero(value: typings.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
  }
}

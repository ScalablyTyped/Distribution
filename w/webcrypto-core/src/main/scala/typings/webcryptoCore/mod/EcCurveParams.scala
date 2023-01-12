package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcCurveParams extends StObject {
  
  /**
    * The object identifier of the curve
    */
  var id: String
  
  /**
    * The name of the curve
    */
  var name: String
  
  /**
    * Curve point size in bits
    */
  var size: Double
}
object EcCurveParams {
  
  inline def apply(id: String, name: String, size: Double): EcCurveParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcCurveParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcCurveParams] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}

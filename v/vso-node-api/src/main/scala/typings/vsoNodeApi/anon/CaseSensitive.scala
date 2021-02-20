package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseSensitive extends StObject {
  
  var caseSensitive: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var objectTooLarge: scala.Double = js.native
  
  var unknown: scala.Double = js.native
}
object CaseSensitive {
  
  @scala.inline
  def apply(
    caseSensitive: scala.Double,
    none: scala.Double,
    objectTooLarge: scala.Double,
    unknown: scala.Double
  ): CaseSensitive = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], objectTooLarge = objectTooLarge.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
  
  @scala.inline
  implicit class CaseSensitiveMutableBuilder[Self <: CaseSensitive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: scala.Double): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTooLarge(value: scala.Double): Self = StObject.set(x, "objectTooLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: scala.Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlwaysInclude extends StObject {
  
  var alwaysInclude: scala.Double
  
  var onlyIfLicensed: scala.Double
  
  var onlyIfUnlicensed: scala.Double
}
object AlwaysInclude {
  
  inline def apply(alwaysInclude: scala.Double, onlyIfLicensed: scala.Double, onlyIfUnlicensed: scala.Double): AlwaysInclude = {
    val __obj = js.Dynamic.literal(alwaysInclude = alwaysInclude.asInstanceOf[js.Any], onlyIfLicensed = onlyIfLicensed.asInstanceOf[js.Any], onlyIfUnlicensed = onlyIfUnlicensed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlwaysInclude]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlwaysInclude] (val x: Self) extends AnyVal {
    
    inline def setAlwaysInclude(value: scala.Double): Self = StObject.set(x, "alwaysInclude", value.asInstanceOf[js.Any])
    
    inline def setOnlyIfLicensed(value: scala.Double): Self = StObject.set(x, "onlyIfLicensed", value.asInstanceOf[js.Any])
    
    inline def setOnlyIfUnlicensed(value: scala.Double): Self = StObject.set(x, "onlyIfUnlicensed", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hosted extends StObject {
  
  var all: scala.Double
  
  var hosted: scala.Double
  
  var onPremises: scala.Double
}
object Hosted {
  
  inline def apply(all: scala.Double, hosted: scala.Double, onPremises: scala.Double): Hosted = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], hosted = hosted.asInstanceOf[js.Any], onPremises = onPremises.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hosted]
  }
  
  extension [Self <: Hosted](x: Self) {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setHosted(value: scala.Double): Self = StObject.set(x, "hosted", value.asInstanceOf[js.Any])
    
    inline def setOnPremises(value: scala.Double): Self = StObject.set(x, "onPremises", value.asInstanceOf[js.Any])
  }
}

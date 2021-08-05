package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exclusion extends StObject {
  
  var exclusion: scala.Double
  
  var inclusion: scala.Double
}
object Exclusion {
  
  inline def apply(exclusion: scala.Double, inclusion: scala.Double): Exclusion = {
    val __obj = js.Dynamic.literal(exclusion = exclusion.asInstanceOf[js.Any], inclusion = inclusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclusion]
  }
  
  extension [Self <: Exclusion](x: Self) {
    
    inline def setExclusion(value: scala.Double): Self = StObject.set(x, "exclusion", value.asInstanceOf[js.Any])
    
    inline def setInclusion(value: scala.Double): Self = StObject.set(x, "inclusion", value.asInstanceOf[js.Any])
  }
}

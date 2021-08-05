package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Preliminary extends StObject {
  
  var full: scala.Double
  
  var preliminary: scala.Double
}
object Preliminary {
  
  inline def apply(full: scala.Double, preliminary: scala.Double): Preliminary = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], preliminary = preliminary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preliminary]
  }
  
  extension [Self <: Preliminary](x: Self) {
    
    inline def setFull(value: scala.Double): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setPreliminary(value: scala.Double): Self = StObject.set(x, "preliminary", value.asInstanceOf[js.Any])
  }
}

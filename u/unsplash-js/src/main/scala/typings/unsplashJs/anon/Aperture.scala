package typings.unsplashJs.anon

import typings.unsplashJs.distHelpersTypescriptMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aperture extends StObject {
  
  var aperture: Nullable[String]
  
  var exposure_time: Nullable[String]
  
  var focal_length: Nullable[String]
  
  var iso: Nullable[Double]
  
  var make: Nullable[String]
  
  var model: Nullable[String]
}
object Aperture {
  
  inline def apply(): Aperture = {
    val __obj = js.Dynamic.literal(aperture = null, exposure_time = null, focal_length = null, iso = null, make = null, model = null)
    __obj.asInstanceOf[Aperture]
  }
  
  extension [Self <: Aperture](x: Self) {
    
    inline def setAperture(value: Nullable[String]): Self = StObject.set(x, "aperture", value.asInstanceOf[js.Any])
    
    inline def setApertureNull: Self = StObject.set(x, "aperture", null)
    
    inline def setExposure_time(value: Nullable[String]): Self = StObject.set(x, "exposure_time", value.asInstanceOf[js.Any])
    
    inline def setExposure_timeNull: Self = StObject.set(x, "exposure_time", null)
    
    inline def setFocal_length(value: Nullable[String]): Self = StObject.set(x, "focal_length", value.asInstanceOf[js.Any])
    
    inline def setFocal_lengthNull: Self = StObject.set(x, "focal_length", null)
    
    inline def setIso(value: Nullable[Double]): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    inline def setIsoNull: Self = StObject.set(x, "iso", null)
    
    inline def setMake(value: Nullable[String]): Self = StObject.set(x, "make", value.asInstanceOf[js.Any])
    
    inline def setMakeNull: Self = StObject.set(x, "make", null)
    
    inline def setModel(value: Nullable[String]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
  }
}

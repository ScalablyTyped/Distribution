package typings.three.examplesJsmLoadersIfcloaderMod

import typings.three.srcThreeMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometriesByMaterial extends StObject {
  
  var geometries: IdGeometries
  
  var material: Material
}
object GeometriesByMaterial {
  
  inline def apply(geometries: IdGeometries, material: Material): GeometriesByMaterial = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometriesByMaterial]
  }
  
  extension [Self <: GeometriesByMaterial](x: Self) {
    
    inline def setGeometries(value: IdGeometries): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setMaterial(value: Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
  }
}

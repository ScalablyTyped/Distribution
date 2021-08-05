package typings.topojson

import typings.topojsonSpecification.mod.GeometryCollection
import typings.topojsonSpecification.mod.MultiPolygon
import typings.topojsonSpecification.mod.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Counties extends StObject {
    
    var counties: Geometries
    
    var nation: GeometryCollection[js.Object]
    
    var states: Geometries
  }
  object Counties {
    
    inline def apply(counties: Geometries, nation: GeometryCollection[js.Object], states: Geometries): Counties = {
      val __obj = js.Dynamic.literal(counties = counties.asInstanceOf[js.Any], nation = nation.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
      __obj.asInstanceOf[Counties]
    }
    
    extension [Self <: Counties](x: Self) {
      
      inline def setCounties(value: Geometries): Self = StObject.set(x, "counties", value.asInstanceOf[js.Any])
      
      inline def setNation(value: GeometryCollection[js.Object]): Self = StObject.set(x, "nation", value.asInstanceOf[js.Any])
      
      inline def setStates(value: Geometries): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    }
  }
  
  trait Countries extends StObject {
    
    var countries: Geometries
    
    var land: GeometryCollection[js.Object]
  }
  object Countries {
    
    inline def apply(countries: Geometries, land: GeometryCollection[js.Object]): Countries = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], land = land.asInstanceOf[js.Any])
      __obj.asInstanceOf[Countries]
    }
    
    extension [Self <: Countries](x: Self) {
      
      inline def setCountries(value: Geometries): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setLand(value: GeometryCollection[js.Object]): Self = StObject.set(x, "land", value.asInstanceOf[js.Any])
    }
  }
  
  trait Geometries extends StObject {
    
    var geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
    
    var `type`: typings.topojson.topojsonStrings.GeometryCollection
  }
  object Geometries {
    
    inline def apply(geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]): Geometries = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[Geometries]
    }
    
    extension [Self <: Geometries](x: Self) {
      
      inline def setGeometries(value: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesVarargs(value: (Polygon[js.Object] | MultiPolygon[js.Object])*): Self = StObject.set(x, "geometries", js.Array(value :_*))
      
      inline def setType(value: typings.topojson.topojsonStrings.GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

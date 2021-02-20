package typings.topojson

import typings.topojsonSpecification.mod.GeometryCollection
import typings.topojsonSpecification.mod.MultiPolygon
import typings.topojsonSpecification.mod.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Counties extends StObject {
    
    var counties: Geometries = js.native
    
    var nation: GeometryCollection[js.Object] = js.native
    
    var states: Geometries = js.native
  }
  object Counties {
    
    @scala.inline
    def apply(counties: Geometries, nation: GeometryCollection[js.Object], states: Geometries): Counties = {
      val __obj = js.Dynamic.literal(counties = counties.asInstanceOf[js.Any], nation = nation.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
      __obj.asInstanceOf[Counties]
    }
    
    @scala.inline
    implicit class CountiesMutableBuilder[Self <: Counties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCounties(value: Geometries): Self = StObject.set(x, "counties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNation(value: GeometryCollection[js.Object]): Self = StObject.set(x, "nation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStates(value: Geometries): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Countries extends StObject {
    
    var countries: Geometries = js.native
    
    var land: GeometryCollection[js.Object] = js.native
  }
  object Countries {
    
    @scala.inline
    def apply(countries: Geometries, land: GeometryCollection[js.Object]): Countries = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], land = land.asInstanceOf[js.Any])
      __obj.asInstanceOf[Countries]
    }
    
    @scala.inline
    implicit class CountriesMutableBuilder[Self <: Countries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountries(value: Geometries): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLand(value: GeometryCollection[js.Object]): Self = StObject.set(x, "land", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Geometries extends StObject {
    
    var geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]] = js.native
    
    var `type`: typings.topojson.topojsonStrings.GeometryCollection = js.native
  }
  object Geometries {
    
    @scala.inline
    def apply(
      geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]],
      `type`: typings.topojson.topojsonStrings.GeometryCollection
    ): Geometries = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geometries]
    }
    
    @scala.inline
    implicit class GeometriesMutableBuilder[Self <: Geometries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeometries(value: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometriesVarargs(value: (Polygon[js.Object] | MultiPolygon[js.Object])*): Self = StObject.set(x, "geometries", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.topojson.topojsonStrings.GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

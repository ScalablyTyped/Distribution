package typings.svelteLeafletjs.mod

import typings.geojson.mod.GeometryObject
import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.CircleMarker_
import typings.leaflet.mod.Circle_
import typings.leaflet.mod.GeoJSON__
import typings.leaflet.mod.Map_
import typings.leaflet.mod.Marker_
import typings.leaflet.mod.Polygon_
import typings.leaflet.mod.Polyline_
import typings.leaflet.mod.Rectangle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LeafletContext {
  
  trait Circle extends StObject {
    
    def getLayer(): Circle_[Any]
  }
  object Circle {
    
    inline def apply(getLayer: () => Circle_[Any]): typings.svelteLeafletjs.mod.LeafletContext.Circle = {
      val __obj = js.Dynamic.literal(getLayer = js.Any.fromFunction0(getLayer))
      __obj.asInstanceOf[typings.svelteLeafletjs.mod.LeafletContext.Circle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.svelteLeafletjs.mod.LeafletContext.Circle] (val x: Self) extends AnyVal {
      
      inline def setGetLayer(value: () => Circle_[Any]): Self = StObject.set(x, "getLayer", js.Any.fromFunction0(value))
    }
  }
  
  trait CircleMarker extends StObject {
    
    def getLayer(): CircleMarker_[Any]
  }
  object CircleMarker {
    
    inline def apply(getLayer: () => CircleMarker_[Any]): typings.svelteLeafletjs.mod.LeafletContext.CircleMarker = {
      val __obj = js.Dynamic.literal(getLayer = js.Any.fromFunction0(getLayer))
      __obj.asInstanceOf[typings.svelteLeafletjs.mod.LeafletContext.CircleMarker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.svelteLeafletjs.mod.LeafletContext.CircleMarker] (val x: Self) extends AnyVal {
      
      inline def setGetLayer(value: () => CircleMarker_[Any]): Self = StObject.set(x, "getLayer", js.Any.fromFunction0(value))
    }
  }
  
  trait GeoJSON extends StObject {
    
    def getLayer(): GeoJSON__[Any, GeometryObject]
  }
  object GeoJSON {
    
    inline def apply(getLayer: () => GeoJSON__[Any, GeometryObject]): typings.svelteLeafletjs.mod.LeafletContext.GeoJSON = {
      val __obj = js.Dynamic.literal(getLayer = js.Any.fromFunction0(getLayer))
      __obj.asInstanceOf[typings.svelteLeafletjs.mod.LeafletContext.GeoJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.svelteLeafletjs.mod.LeafletContext.GeoJSON] (val x: Self) extends AnyVal {
      
      inline def setGetLayer(value: () => GeoJSON__[Any, GeometryObject]): Self = StObject.set(x, "getLayer", js.Any.fromFunction0(value))
    }
  }
  
  trait Map extends StObject {
    
    def getMap(): Map_
  }
  object Map {
    
    inline def apply(getMap: () => Map_): Map = {
      val __obj = js.Dynamic.literal(getMap = js.Any.fromFunction0(getMap))
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      inline def setGetMap(value: () => Map_): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
    }
  }
  
  trait Marker extends StObject {
    
    def getLayer(): Marker_[Any]
    
    def getMarker(): Marker_[Any]
  }
  object Marker {
    
    inline def apply(getLayer: () => Marker_[Any], getMarker: () => Marker_[Any]): typings.svelteLeafletjs.mod.LeafletContext.Marker = {
      val __obj = js.Dynamic.literal(getLayer = js.Any.fromFunction0(getLayer), getMarker = js.Any.fromFunction0(getMarker))
      __obj.asInstanceOf[typings.svelteLeafletjs.mod.LeafletContext.Marker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.svelteLeafletjs.mod.LeafletContext.Marker] (val x: Self) extends AnyVal {
      
      inline def setGetLayer(value: () => Marker_[Any]): Self = StObject.set(x, "getLayer", js.Any.fromFunction0(value))
      
      inline def setGetMarker(value: () => Marker_[Any]): Self = StObject.set(x, "getMarker", js.Any.fromFunction0(value))
    }
  }
  
  trait Polygon extends StObject {
    
    def getPolygon(): Polygon_[Any]
  }
  object Polygon {
    
    inline def apply(getPolygon: () => Polygon_[Any]): typings.svelteLeafletjs.mod.LeafletContext.Polygon = {
      val __obj = js.Dynamic.literal(getPolygon = js.Any.fromFunction0(getPolygon))
      __obj.asInstanceOf[typings.svelteLeafletjs.mod.LeafletContext.Polygon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.svelteLeafletjs.mod.LeafletContext.Polygon] (val x: Self) extends AnyVal {
      
      inline def setGetPolygon(value: () => Polygon_[Any]): Self = StObject.set(x, "getPolygon", js.Any.fromFunction0(value))
    }
  }
  
  trait Polyline extends StObject {
    
    def getPolyline(): Polyline_[LineString | MultiLineString, Any]
  }
  object Polyline {
    
    inline def apply(getPolyline: () => Polyline_[LineString | MultiLineString, Any]): typings.svelteLeafletjs.mod.LeafletContext.Polyline = {
      val __obj = js.Dynamic.literal(getPolyline = js.Any.fromFunction0(getPolyline))
      __obj.asInstanceOf[typings.svelteLeafletjs.mod.LeafletContext.Polyline]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.svelteLeafletjs.mod.LeafletContext.Polyline] (val x: Self) extends AnyVal {
      
      inline def setGetPolyline(value: () => Polyline_[LineString | MultiLineString, Any]): Self = StObject.set(x, "getPolyline", js.Any.fromFunction0(value))
    }
  }
  
  trait Rectangle extends StObject {
    
    def getLayer(): Rectangle_[Any]
  }
  object Rectangle {
    
    inline def apply(getLayer: () => Rectangle_[Any]): typings.svelteLeafletjs.mod.LeafletContext.Rectangle = {
      val __obj = js.Dynamic.literal(getLayer = js.Any.fromFunction0(getLayer))
      __obj.asInstanceOf[typings.svelteLeafletjs.mod.LeafletContext.Rectangle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.svelteLeafletjs.mod.LeafletContext.Rectangle] (val x: Self) extends AnyVal {
      
      inline def setGetLayer(value: () => Rectangle_[Any]): Self = StObject.set(x, "getLayer", js.Any.fromFunction0(value))
    }
  }
}

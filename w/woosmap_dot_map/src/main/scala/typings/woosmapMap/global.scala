package typings.woosmapMap

import typings.std.Element
import typings.std.HTMLElement
import typings.woosmapMap.woosmap.map.CircleOptions
import typings.woosmapMap.woosmap.map.Coordinates
import typings.woosmapMap.woosmap.map.DirectionRequest
import typings.woosmapMap.woosmap.map.DirectionResult
import typings.woosmapMap.woosmap.map.DirectionsRendererOptions
import typings.woosmapMap.woosmap.map.FeatureData
import typings.woosmapMap.woosmap.map.GeoJSONFeature
import typings.woosmapMap.woosmap.map.GeoJSONGeometry
import typings.woosmapMap.woosmap.map.GeometryArray
import typings.woosmapMap.woosmap.map.GeometryCollectionElement
import typings.woosmapMap.woosmap.map.GeometryOptions
import typings.woosmapMap.woosmap.map.InfoWindowOptions
import typings.woosmapMap.woosmap.map.LatLngLiteral
import typings.woosmapMap.woosmap.map.MapEventListener
import typings.woosmapMap.woosmap.map.MapOptions
import typings.woosmapMap.woosmap.map.MarkerOptions
import typings.woosmapMap.woosmap.map.PolygonOptions
import typings.woosmapMap.woosmap.map.PolylineOptions
import typings.woosmapMap.woosmap.map.RectangleOptions
import typings.woosmapMap.woosmap.map.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object woosmap {
    
    object map {
      
      @JSGlobal("woosmap.map.BaseGeometry")
      @js.native
      open class BaseGeometry ()
        extends StObject
           with typings.woosmapMap.woosmap.map.BaseGeometry
      
      @JSGlobal("woosmap.map.BasePolygon")
      @js.native
      open class BasePolygon protected ()
        extends StObject
           with typings.woosmapMap.woosmap.map.BaseGeometry {
        def this(options: GeometryOptions) = this()
      }
      
      @JSGlobal("woosmap.map.Circle")
      @js.native
      open class Circle protected ()
        extends StObject
           with typings.woosmapMap.woosmap.map.Circle {
        /**
          * Constructs a Circle.
          */
        def this(options: CircleOptions) = this()
      }
      
      /**
        * A layer for displaying geospatial data. Points can be displayed.
        */
      @JSGlobal("woosmap.map.Data")
      @js.native
      /**
        * Creates an empty collection.
        */
      open class Data_ ()
        extends StObject
           with typings.woosmapMap.woosmap.map.Data_
      object Data_ {
        
        @JSGlobal("woosmap.map.Data.GeometryCollection")
        @js.native
        open class GeometryCollection protected ()
          extends StObject
             with typings.woosmapMap.woosmap.map.Data_.GeometryCollection {
          /**
            * Constructs a geometry collection from an array of geometries.
            */
          def this(elements: js.Array[GeoJSONGeometry] | GeometryArray) = this()
          
          /* CompleteClass */
          override def forEachLatLng(callback: js.Function1[/* point */ typings.woosmapMap.woosmap.map.LatLng, Unit]): Unit = js.native
          
          /* CompleteClass */
          override def getArray(): GeometryArray = js.native
          
          /**
            * Returns the n-th Geometry of the GeometryCollection.
            */
          /* CompleteClass */
          override def getAt(n: Double): GeometryCollectionElement = js.native
          
          /* CompleteClass */
          override def getLength(): Double = js.native
          
          /**
            * Returns `"GeometryCollection"`.
            */
          /* CompleteClass */
          override def getType(): typings.woosmapMap.woosmapMapStrings.GeometryCollection = js.native
        }
        
        @JSGlobal("woosmap.map.Data.LineString")
        @js.native
        open class LineString protected ()
          extends StObject
             with typings.woosmapMap.woosmap.map.Data_.LineString {
          def this(points: js.Array[Coordinates | typings.woosmapMap.woosmap.map.LatLng | LatLngLiteral]) = this()
          
          /* CompleteClass */
          override def forEachLatLng(callback: js.Function1[/* point */ typings.woosmapMap.woosmap.map.LatLng, Unit]): Unit = js.native
          
          /**
            * Returns the points of the linestring as an array of LatLng.
            */
          /* CompleteClass */
          override def getArray(): js.Array[typings.woosmapMap.woosmap.map.LatLng] = js.native
          
          /**
            * Returns the n-th Point (as LatLng) of the LineString.
            */
          /* CompleteClass */
          override def getAt(n: Double): typings.woosmapMap.woosmap.map.LatLng = js.native
          
          /**
            * Returns the count of points in the linestring.
            */
          /* CompleteClass */
          override def getLength(): Double = js.native
          
          /* CompleteClass */
          override def getType(): typings.woosmapMap.woosmapMapStrings.LineString = js.native
        }
        
        @JSGlobal("woosmap.map.Data.LinearRing")
        @js.native
        open class LinearRing protected ()
          extends StObject
             with typings.woosmapMap.woosmap.map.Data_.LineString {
          /**
            * Constructs a linear ring.
            */
          def this(points: js.Array[Coordinates | typings.woosmapMap.woosmap.map.LatLng | LatLngLiteral]) = this()
          
          /* CompleteClass */
          override def forEachLatLng(callback: js.Function1[/* point */ typings.woosmapMap.woosmap.map.LatLng, Unit]): Unit = js.native
          
          /**
            * Returns the points of the linestring as an array of LatLng.
            */
          /* CompleteClass */
          override def getArray(): js.Array[typings.woosmapMap.woosmap.map.LatLng] = js.native
          
          /**
            * Returns the n-th Point (as LatLng) of the LineString.
            */
          /* CompleteClass */
          override def getAt(n: Double): typings.woosmapMap.woosmap.map.LatLng = js.native
          
          /**
            * Returns the count of points in the linestring.
            */
          /* CompleteClass */
          override def getLength(): Double = js.native
          
          /* CompleteClass */
          override def getType(): typings.woosmapMap.woosmapMapStrings.LineString = js.native
        }
        
        @JSGlobal("woosmap.map.Data.MultiLineString")
        @js.native
        open class MultiLineString protected ()
          extends StObject
             with typings.woosmapMap.woosmap.map.Data_.MultiLineString {
          /**
            * Constructs a MultiLineString.
            * A MultiLineString is a collection of LineString.
            */
          def this(linestrings: js.Array[
                        (js.Array[typings.woosmapMap.woosmap.map.LatLng | LatLngLiteral]) | typings.woosmapMap.woosmap.map.Data_.LineString
                      ]) = this()
          
          /* CompleteClass */
          override def forEachLatLng(callback: js.Function1[/* point */ typings.woosmapMap.woosmap.map.LatLng, Unit]): Unit = js.native
          
          /* CompleteClass */
          override def getArray(): js.Array[typings.woosmapMap.woosmap.map.Data_.LineString] = js.native
          
          /**
            * Returns the n-th LineString of the MultiLineString.
            */
          /* CompleteClass */
          override def getAt(n: Double): typings.woosmapMap.woosmap.map.Data_.LineString = js.native
          
          /**
            * Returns `"MultiLineString"`.
            */
          /* CompleteClass */
          override def getType(): typings.woosmapMap.woosmapMapStrings.MultiLineString = js.native
        }
        
        @JSGlobal("woosmap.map.Data.MultiPoint")
        @js.native
        open class MultiPoint protected ()
          extends StObject
             with typings.woosmapMap.woosmap.map.Data_.MultiPoint {
          /**
            * Constructs a Multipoint geometry.
            */
          def this(points: js.Array[Coordinates | typings.woosmapMap.woosmap.map.LatLng | LatLngLiteral]) = this()
          
          /**
            * For each point calls the callback.
            */
          /* CompleteClass */
          override def forEachLatLng(callback: js.Function1[/* point */ typings.woosmapMap.woosmap.map.LatLng, Unit]): Unit = js.native
          
          /**
            * Return the array of points
            */
          /* CompleteClass */
          override def getArray(): js.Array[typings.woosmapMap.woosmap.map.LatLng] = js.native
          
          /**
            * Returns n-th Point of the MultiPoint.
            */
          /* CompleteClass */
          override def getAt(n: Double): typings.woosmapMap.woosmap.map.LatLng = js.native
          
          /**
            * Returns the length of the multipoint.
            */
          /* CompleteClass */
          override def getLength(): Double = js.native
          
          /**
            * Returns `"MultiPoint"`.
            */
          /* CompleteClass */
          override def getType(): typings.woosmapMap.woosmapMapStrings.MultiPoint = js.native
        }
        
        @JSGlobal("woosmap.map.Data.MultiPolygon")
        @js.native
        open class MultiPolygon protected ()
          extends StObject
             with typings.woosmapMap.woosmap.map.Data_.MultiPolygon {
          /**
            * Constructs a MultiPolygon geometry.
            * A MultiPolygon is a set of Polygons.
            */
          def this(elements: js.Array[
                        (js.Array[
                          (js.Array[typings.woosmapMap.woosmap.map.LatLng | LatLngLiteral]) | typings.woosmapMap.woosmap.map.Data_.LinearRing
                        ]) | typings.woosmapMap.woosmap.map.Data_.Polygon
                      ]) = this()
          
          /* CompleteClass */
          override def forEachLatLng(callback: js.Function1[/* point */ typings.woosmapMap.woosmap.map.LatLng, Unit]): Unit = js.native
          
          /**
            * Returns the array of Polygons that makes the MultiPolygon.
            */
          /* CompleteClass */
          override def getArray(): js.Array[typings.woosmapMap.woosmap.map.Data_.Polygon] = js.native
          
          /**
            * Returns the n-th polygon of the MultiPolygon.
            */
          /* CompleteClass */
          override def getAt(n: Double): typings.woosmapMap.woosmap.map.Data_.Polygon = js.native
          
          /**
            * Return the count of Polygon in the MultiPolygon.
            */
          /* CompleteClass */
          override def getLength(): Double = js.native
          
          /**
            * Returns `"MultiPolygon"`.
            */
          /* CompleteClass */
          override def getType(): String = js.native
        }
        
        @JSGlobal("woosmap.map.Data.Point")
        @js.native
        open class Point protected ()
          extends StObject
             with typings.woosmapMap.woosmap.map.Data_.Point {
          def this(point: Coordinates) = this()
          /**
            * Constructs a Point geometry
            */
          def this(point: typings.woosmapMap.woosmap.map.LatLng) = this()
          def this(point: LatLngLiteral) = this()
          
          /* CompleteClass */
          override def forEachLatLng(callback: js.Function1[/* point */ typings.woosmapMap.woosmap.map.LatLng, Unit]): Unit = js.native
          
          /**
            * Returns the point geometry
            */
          /* CompleteClass */
          override def get(): typings.woosmapMap.woosmap.map.LatLng = js.native
          
          /**
            * Returns `"Point"`.
            */
          /* CompleteClass */
          override def getType(): typings.woosmapMap.woosmapMapStrings.Point = js.native
        }
        
        @JSGlobal("woosmap.map.Data.Polygon")
        @js.native
        open class Polygon protected ()
          extends StObject
             with typings.woosmapMap.woosmap.map.Data_.Polygon {
          /**
            * Constructs a Polygon, using a set of linear ring.
            */
          def this(elements: js.Array[
                        (js.Array[Coordinates | typings.woosmapMap.woosmap.map.LatLng | LatLngLiteral]) | typings.woosmapMap.woosmap.map.Data_.LinearRing
                      ]) = this()
          
          /**
            * For each LinearRing call `callback`.
            */
          /* CompleteClass */
          override def forEachLatLng(callback: js.Function1[/* point */ typings.woosmapMap.woosmap.map.LatLng, Unit]): Unit = js.native
          
          /**
            * Returns the array of LinearRing that composes the Polygon.
            */
          /* CompleteClass */
          override def getArray(): js.Array[typings.woosmapMap.woosmap.map.Data_.LinearRing] = js.native
          
          /**
            * Returns the n-th LinearRing of the Polygon.
            */
          /* CompleteClass */
          override def getAt(n: Double): typings.woosmapMap.woosmap.map.Data_.LinearRing = js.native
          
          /**
            * Returns the count of LinearRings that composes the Polygon.
            */
          /* CompleteClass */
          override def getLength(): Double = js.native
          
          /**
            * Returns `"Polygon"`.
            */
          /* CompleteClass */
          override def getType(): typings.woosmapMap.woosmapMapStrings.Polygon = js.native
        }
      }
      
      @JSGlobal("woosmap.map.DirectionStatus")
      @js.native
      object DirectionStatus extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.woosmapMap.woosmap.map.DirectionStatus & String] = js.native
        
        /* "OK" */ val OK: typings.woosmapMap.woosmap.map.DirectionStatus.OK & String = js.native
      }
      
      @JSGlobal("woosmap.map.DirectionsRenderer")
      @js.native
      open class DirectionsRenderer protected ()
        extends StObject
           with typings.woosmapMap.woosmap.map.DirectionsRenderer {
        def this(options: DirectionsRendererOptions) = this()
      }
      
      @JSGlobal("woosmap.map.DirectionsService")
      @js.native
      open class DirectionsService ()
        extends StObject
           with typings.woosmapMap.woosmap.map.DirectionsService {
        
        /**
          * Issue a directions search request.
          */
        /* CompleteClass */
        override def route(
          request: DirectionRequest,
          callback: js.Function2[/* result */ DirectionResult, /* status */ String, Any]
        ): Unit = js.native
      }
      
      @JSGlobal("woosmap.map.InfoWindow")
      @js.native
      open class InfoWindow protected ()
        extends StObject
           with typings.woosmapMap.woosmap.map.InfoWindow {
        def this(options: InfoWindowOptions) = this()
      }
      
      @JSGlobal("woosmap.map.LatLng")
      @js.native
      open class LatLng protected ()
        extends StObject
           with typings.woosmapMap.woosmap.map.LatLng {
        def this(lat: js.Function0[Double], lng: js.Function0[Double]) = this()
        def this(lat: js.Function0[Double], lng: Double) = this()
        def this(lat: Double, lng: js.Function0[Double]) = this()
        /**
          * Creates a `LatLng` object representing a geographic point.
          * Latitude is specified in degrees within the range [-90, 90].
          * Longitude is specified in degrees within the range [-180, 180].
          * Set `noWrap` to `true` to enable values outside of this range.
          * Note the ordering of latitude and longitude.
          */
        def this(lat: Double, lng: Double) = this()
        
        /**
          * Comparison function.
          */
        /* CompleteClass */
        override def equals(other: typings.woosmapMap.woosmap.map.LatLng): Boolean = js.native
        
        /**
          * Returns the latitude in degrees.
          */
        /* CompleteClass */
        override def lat(): Double = js.native
        
        /**
          * Returns the longitude in degrees.
          */
        /* CompleteClass */
        override def lng(): Double = js.native
        
        /**
          * Converts to JSON representation. This function is intended to be used via `JSON.stringify`.
          */
        /* CompleteClass */
        override def toJSON(): LatLngLiteral = js.native
      }
      
      @JSGlobal("woosmap.map.LatLngBounds")
      @js.native
      /**
        * Creates a LatLngBounds object
        */
      open class LatLngBounds ()
        extends StObject
           with typings.woosmapMap.woosmap.map.LatLngBounds {
        def this(northEast: typings.woosmapMap.woosmap.map.LatLng) = this()
        def this(northEast: LatLngLiteral) = this()
        def this(northEast: Null, southWest: typings.woosmapMap.woosmap.map.LatLng) = this()
        def this(northEast: Null, southWest: LatLngLiteral) = this()
        def this(northEast: Unit, southWest: typings.woosmapMap.woosmap.map.LatLng) = this()
        def this(northEast: Unit, southWest: LatLngLiteral) = this()
        def this(northEast: LatLngLiteral, southWest: typings.woosmapMap.woosmap.map.LatLng) = this()
        def this(northEast: LatLngLiteral, southWest: LatLngLiteral) = this()
        def this(northEast: typings.woosmapMap.woosmap.map.LatLng, southWest: typings.woosmapMap.woosmap.map.LatLng) = this()
        def this(northEast: typings.woosmapMap.woosmap.map.LatLng, southWest: LatLngLiteral) = this()
      }
      
      @JSGlobal("woosmap.map.MVCArray")
      @js.native
      open class MVCArray[T] ()
        extends StObject
           with typings.woosmapMap.woosmap.map.MVCArray[T] {
        def this(array: js.Array[T]) = this()
      }
      
      /**
        * Constructor for MVCObject.
        */
      @JSGlobal("woosmap.map.MVCObject")
      @js.native
      open class MVCObject ()
        extends StObject
           with typings.woosmapMap.woosmap.map.MVCObject
      
      @JSGlobal("woosmap.map.Map")
      @js.native
      open class Map protected ()
        extends StObject
           with typings.woosmapMap.woosmap.map.Map {
        def this(mapDiv: String) = this()
        /**
          * Creates a new map inside the given HTML container, which is typically a `DIV` element.
          */
        def this(mapDiv: HTMLElement) = this()
        def this(mapDiv: String, options: MapOptions) = this()
        def this(mapDiv: HTMLElement, options: MapOptions) = this()
      }
      
      @JSGlobal("woosmap.map.Marker")
      @js.native
      /**
        * Constructs a Marker
        */
      open class Marker ()
        extends StObject
           with typings.woosmapMap.woosmap.map.Marker {
        def this(options: MarkerOptions) = this()
      }
      
      @JSGlobal("woosmap.map.OverlayView")
      @js.native
      open class OverlayView ()
        extends StObject
           with typings.woosmapMap.woosmap.map.OverlayView
      
      @JSGlobal("woosmap.map.Point")
      @js.native
      open class Point protected ()
        extends StObject
           with typings.woosmapMap.woosmap.map.Point {
        /**
          * Creates a Point object
          */
        def this(x: Double, y: Double) = this()
        
        /**
          * Indicates whether some other object is "equal to" this one.
          */
        /* CompleteClass */
        override def equals(other: typings.woosmapMap.woosmap.map.Point): Boolean = js.native
      }
      
      @JSGlobal("woosmap.map.Polygon")
      @js.native
      open class Polygon protected ()
        extends StObject
           with typings.woosmapMap.woosmap.map.Polygon {
        /**
          * Constructs a polygon.
          */
        def this(options: PolygonOptions) = this()
      }
      
      @JSGlobal("woosmap.map.Polyline")
      @js.native
      open class Polyline protected ()
        extends StObject
           with typings.woosmapMap.woosmap.map.Polyline {
        /**
          * Constructs a Polyline.
          */
        def this(options: PolylineOptions) = this()
      }
      
      @JSGlobal("woosmap.map.Rectangle")
      @js.native
      open class Rectangle protected ()
        extends StObject
           with typings.woosmapMap.woosmap.map.Rectangle {
        /**
          * Constructs a Rectangle.
          */
        def this(options: RectangleOptions) = this()
      }
      
      @JSGlobal("woosmap.map.Size")
      @js.native
      open class Size protected ()
        extends StObject
           with typings.woosmapMap.woosmap.map.Size {
        /**
          * Creates a Size object
          */
        def this(width: Double, height: Double) = this()
        
        /**
          * Indicates whether some other object is "equal to" this one.
          */
        /* CompleteClass */
        override def equals(other: typings.woosmapMap.woosmap.map.Size): Boolean = js.native
      }
      
      @JSGlobal("woosmap.map.StoresOverlay")
      @js.native
      open class StoresOverlay protected ()
        extends StObject
           with typings.woosmapMap.woosmap.map.StoresOverlay {
        /**
          * Constructs a StoreOverlay
          */
        def this(style: Style) = this()
      }
      
      @JSGlobal("woosmap.map.TravelMode")
      @js.native
      object TravelMode extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.woosmapMap.woosmap.map.TravelMode & String] = js.native
        
        /* "BICYCLING" */ val BICYCLING: typings.woosmapMap.woosmap.map.TravelMode.BICYCLING & String = js.native
        
        /* "DRIVING" */ val DRIVING: typings.woosmapMap.woosmap.map.TravelMode.DRIVING & String = js.native
        
        /* "WALKING" */ val WALKING: typings.woosmapMap.woosmap.map.TravelMode.WALKING & String = js.native
      }
      
      @JSGlobal("woosmap.map.UnitSystem")
      @js.native
      object UnitSystem extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.woosmapMap.woosmap.map.UnitSystem & String] = js.native
        
        /* "IMPERIAL" */ val IMPERIAL: typings.woosmapMap.woosmap.map.UnitSystem.IMPERIAL & String = js.native
        
        /* "METRIC" */ val METRIC: typings.woosmapMap.woosmap.map.UnitSystem.METRIC & String = js.native
      }
      
      object data {
        
        @JSGlobal("woosmap.map.data.Feature")
        @js.native
        open class Feature protected ()
          extends StObject
             with typings.woosmapMap.woosmap.map.data.Feature {
          /**
            * Constructs a new Data.Feature
            */
          def this(featureData: FeatureData) = this()
          def this(featureData: GeoJSONFeature) = this()
        }
      }
      
      object event {
        
        @JSGlobal("woosmap.map.event")
        @js.native
        val ^ : js.Any = js.native
        
        inline def addDomListener(element: Element, eventName: String, handler: js.Function1[/* repeated */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListener")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /**
          * Adds the given listener function to the given event name for the given object instance.
          * Returns an identifier for this listener that can be used with `removeListener()`.
          */
        inline def addListener(instance: js.Object, eventName: String, handler: js.Function1[/* repeated */ Any, Any]): MapEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[MapEventListener]
        
        /**
          * Like addListener, but the handler removes itself after handling the first event.
          */
        inline def addListenerOnce(instance: js.Object, eventName: String, handler: js.Function1[/* repeated */ Any, Any]): MapEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addListenerOnce")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[MapEventListener]
        
        /**
          * Removes all listeners for all events for the given instance.
          */
        inline def clearInstanceListeners(instance: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInstanceListeners")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        /**
          * Removes all listeners for the given event for the given instance.
          */
        inline def clearListeners(instance: js.Object, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearListeners")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /**
          * Removes the given listener, which should have been returned by addListener above.
          * Equivalent to calling `listener.remove()`.
          */
        inline def removeListener(listener: MapEventListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        /**
          * Triggers the given event. All arguments after eventName are passed as arguments to the listeners.
          */
        inline def trigger(instance: js.Object, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def trigger(instance: js.Object, eventName: String, eventArgs: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventArgs.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
      
      object geometry {
        
        @JSGlobal("woosmap.map.geometry")
        @js.native
        val ^ : js.Any = js.native
        
        inline def containsLocation(point: LatLngLiteral, polygon: typings.woosmapMap.woosmap.map.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsLocation")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
        /**
          * Computes whether the given point lies inside the specified polygon.
          */
        inline def containsLocation(point: typings.woosmapMap.woosmap.map.LatLng, polygon: typings.woosmapMap.woosmap.map.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsLocation")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
        
        inline def isLocationOnEdge(point: LatLngLiteral, poly: typings.woosmapMap.woosmap.map.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
        inline def isLocationOnEdge(point: LatLngLiteral, poly: typings.woosmapMap.woosmap.map.Polygon, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
        /**
          * Computes whether the given point lies on or near to a polyline, or the edge of a polygon,
          * within a specified tolerance.
          * Returns true when the difference between the latitude and longitude of the supplied point,
          * and the closest point on the edge, is less than the tolerance. The tolerance defaults to 10-9 degrees.
          */
        inline def isLocationOnEdge(point: typings.woosmapMap.woosmap.map.LatLng, poly: typings.woosmapMap.woosmap.map.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
        inline def isLocationOnEdge(
          point: typings.woosmapMap.woosmap.map.LatLng,
          poly: typings.woosmapMap.woosmap.map.Polygon,
          tolerance: Double
        ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocationOnEdge")(point.asInstanceOf[js.Any], poly.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      }
    }
  }
}

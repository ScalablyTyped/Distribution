package typings.supercluster

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.mod.BBox
import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Point
import typings.supercluster.superclusterBooleans.`true`
import typings.supercluster.superclusterNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A very fast geospatial point clustering library for browsers and Node.
    */
  @JSImport("supercluster", JSImport.Namespace)
  @js.native
  class ^[P /* <: GeoJsonProperties */, C /* <: GeoJsonProperties */] ()
    extends StObject
       with Supercluster[P, C] {
    def this(options: Options[P, C]) = this()
  }
  
  /**
    * Default properties type, allowing any properties.
    * Try to avoid this for better typesafety by using proper types.
    */
  type AnyProps = StringDictionary[js.Any]
  
  type ClusterFeature[C] = PointFeature[ClusterProperties & C]
  
  trait ClusterProperties extends StObject {
    
    /**
      * Always `true` to indicate that the Feature is a Cluster and not
      * an individual point.
      */
    var cluster: `true`
    
    /** Cluster ID */
    var cluster_id: Double
    
    /** Number of points in the cluster. */
    var point_count: Double
    
    /**
      * Abbreviated number of points in the cluster as string if the number
      * is 1000 or greater (e.g. `1.3k` if the number is 1298).
      *
      * For less than 1000 points it is the same value as `point_count`.
      */
    var point_count_abbreviated: String | Double
  }
  object ClusterProperties {
    
    inline def apply(cluster_id: Double, point_count: Double, point_count_abbreviated: String | Double): ClusterProperties = {
      val __obj = js.Dynamic.literal(cluster = true, cluster_id = cluster_id.asInstanceOf[js.Any], point_count = point_count.asInstanceOf[js.Any], point_count_abbreviated = point_count_abbreviated.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterProperties]
    }
    
    extension [Self <: ClusterProperties](x: Self) {
      
      inline def setCluster(value: `true`): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      inline def setCluster_id(value: Double): Self = StObject.set(x, "cluster_id", value.asInstanceOf[js.Any])
      
      inline def setPoint_count(value: Double): Self = StObject.set(x, "point_count", value.asInstanceOf[js.Any])
      
      inline def setPoint_count_abbreviated(value: String | Double): Self = StObject.set(x, "point_count_abbreviated", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[P, C] extends StObject {
    
    /**
      * (Tiles) Tile extent. Radius is calculated relative to this value.
      *
      * @default 512
      */
    var extent: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether timing info should be logged.
      *
      * @default false
      */
    var log: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that returns cluster properties corresponding to a single point.
      *
      * @example
      * (props) => ({sum: props.myValue})
      */
    var map: js.UndefOr[js.Function1[/* props */ P, C]] = js.undefined
    
    /**
      * Maximum zoom level at which clusters are generated.
      *
      * @default 16
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum zoom level at which clusters are generated.
      *
      * @default 0
      */
    var minZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * Size of the KD-tree leaf node. Affects performance.
      *
      * @default 64
      */
    var nodeSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Cluster radius, in pixels.
      *
      * @default 40
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /**
      * A reduce function that merges properties of two clusters into one.
      *
      * @example
      * (accumulated, props) => { accumulated.sum += props.sum; }
      */
    var reduce: js.UndefOr[js.Function2[/* accumulated */ C, /* props */ C, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply[P, C](): Options[P, C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[P, C]]
    }
    
    extension [Self <: Options[?, ?], P, C](x: Self & (Options[P, C])) {
      
      inline def setExtent(value: Double): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMap(value: /* props */ P => C): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setNodeSize(value: Double): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      inline def setNodeSizeUndefined: Self = StObject.set(x, "nodeSize", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setReduce(value: (/* accumulated */ C, /* props */ C) => Unit): Self = StObject.set(x, "reduce", js.Any.fromFunction2(value))
      
      inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
    }
  }
  
  /**
    * [GeoJSON Feature](https://tools.ietf.org/html/rfc7946#section-3.2),
    * with the geometry being a
    * [GeoJSON Point](https://tools.ietf.org/html/rfc7946#section-3.1.2).
    */
  type PointFeature[P] = Feature[Point, P]
  
  /**
    * A very fast geospatial point clustering library for browsers and Node.
    */
  @js.native
  trait Supercluster[P /* <: GeoJsonProperties */, C /* <: GeoJsonProperties */] extends StObject {
    
    /**
      * Returns the children of a cluster (on the next zoom level).
      *
      * @param clusterId Cluster ID (`cluster_id` value from feature properties).
      * @throws {Error} If `clusterId` does not exist.
      */
    def getChildren(clusterId: Double): js.Array[ClusterFeature[C] | PointFeature[P]] = js.native
    
    /**
      * Returns the zoom level on which the cluster expands into several
      * children (useful for "click to zoom" feature).
      *
      * @param clusterId Cluster ID (`cluster_id` value from feature properties).
      */
    def getClusterExpansionZoom(clusterId: Double): Double = js.native
    
    /**
      * Returns an array of clusters and points as `GeoJSON.Feature` objects
      * for the given bounding box (`bbox`) and zoom level (`zoom`).
      *
      * @param bbox Bounding box (`[westLng, southLat, eastLng, northLat]`).
      * @param zoom Zoom level.
      */
    def getClusters(bbox: BBox, zoom: Double): js.Array[ClusterFeature[C] | PointFeature[P]] = js.native
    
    /**
      * Returns all the points of a cluster (with pagination support).
      *
      * @param clusterId Cluster ID (`cluster_id` value from feature properties).
      * @param limit The number of points to return (set to `Infinity` for all points).
      * @param offset The amount of points to skip (for pagination).
      */
    def getLeaves(clusterId: Double): js.Array[PointFeature[P]] = js.native
    def getLeaves(clusterId: Double, limit: Double): js.Array[PointFeature[P]] = js.native
    def getLeaves(clusterId: Double, limit: Double, offset: Double): js.Array[PointFeature[P]] = js.native
    def getLeaves(clusterId: Double, limit: Unit, offset: Double): js.Array[PointFeature[P]] = js.native
    
    /**
      * For a given zoom and x/y coordinates, returns a
      * [geojson-vt](https://github.com/mapbox/geojson-vt)-compatible JSON
      * tile object with cluster any point features.
      */
    def getTile(zoom: Double, x: Double, y: Double): (Tile[C, P]) | Null = js.native
    
    /**
      * Loads an array of GeoJSON Feature objects. Each feature's geometry
      * must be a GeoJSON Point. Once loaded, index is immutable.
      *
      * @param points Array of GeoJSON Features, the geometries being GeoJSON Points.
      */
    def load(points: js.Array[PointFeature[P]]): Supercluster[P, C] = js.native
  }
  
  trait Tile[C, P] extends StObject {
    
    var features: js.Array[TileFeature[C, P]]
  }
  object Tile {
    
    inline def apply[C, P](features: js.Array[TileFeature[C, P]]): Tile[C, P] = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tile[C, P]]
    }
    
    extension [Self <: Tile[?, ?], C, P](x: Self & (Tile[C, P])) {
      
      inline def setFeatures(value: js.Array[TileFeature[C, P]]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: (TileFeature[C, P])*): Self = StObject.set(x, "features", js.Array(value :_*))
    }
  }
  
  trait TileFeature[C, P] extends StObject {
    
    var geometry: js.Array[js.Tuple2[Double, Double]]
    
    var tags: (ClusterProperties & C) | P
    
    var `type`: `1`
  }
  object TileFeature {
    
    inline def apply[C, P](geometry: js.Array[js.Tuple2[Double, Double]], tags: (ClusterProperties & C) | P): TileFeature[C, P] = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(1)
      __obj.asInstanceOf[TileFeature[C, P]]
    }
    
    extension [Self <: TileFeature[?, ?], C, P](x: Self & (TileFeature[C, P])) {
      
      inline def setGeometry(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "geometry", js.Array(value :_*))
      
      inline def setTags(value: (ClusterProperties & C) | P): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

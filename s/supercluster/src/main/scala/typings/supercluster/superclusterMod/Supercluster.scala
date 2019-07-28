package typings.supercluster.superclusterMod

import typings.geojson.geojsonMod.BBox
import typings.geojson.geojsonMod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A very fast geospatial point clustering library for browsers and Node.
  */
@js.native
trait Supercluster[P /* <: GeoJsonProperties */, C /* <: GeoJsonProperties */] extends js.Object {
  /**
    * Returns the children of a cluster (on the next zoom level).
    *
    * @param clusterId Cluster ID (`cluster_id` value from feature properties).
    * @throws {Error} If `clusterId` does not exist.
    */
  def getChildren(clusterId: Double): js.Array[ClusterFeature[C] | PointFeature[P]] = js.native
   // Cluster[];
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
  def getLeaves(clusterId: Double): js.Array[ClusterFeature[C] | PointFeature[P]] = js.native
  def getLeaves(clusterId: Double, limit: Double): js.Array[ClusterFeature[C] | PointFeature[P]] = js.native
  def getLeaves(clusterId: Double, limit: Double, offset: Double): js.Array[ClusterFeature[C] | PointFeature[P]] = js.native
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


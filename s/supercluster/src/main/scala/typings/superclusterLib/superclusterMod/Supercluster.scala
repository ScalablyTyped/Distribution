package typings
package superclusterLib.superclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("supercluster", "Supercluster")
@js.native
class Supercluster () extends js.Object {
  /**
       * Returns the children of a cluster (on the next zoom level) given its id (cluster_id value from feature properties) and zoom the cluster was from.
       */
  def getChildren(clusterId: scala.Double, clusterZoom: scala.Double): Clusters = js.native
  /**
       * Returns the zoom on which the cluster expands into several children (useful for "click to zoom" feature), given the cluster's cluster_id and zoom.
       */
  def getClusterExpansionZoom(clusterId: scala.Double, clusterZoom: scala.Double): scala.Double = js.native
  /**
       * For the given bbox array ([westLng, southLat, eastLng, northLat]) and integer zoom, returns an array of clusters and points as GeoJSON.Feature objects.
       */
  def getClusters(bbox: BBox, zoom: scala.Double): Clusters = js.native
  /**
       * Returns all the points of a cluster (given its cluster_id and zoom),
       * with pagination support: limit is the number of points to return (set to Infinity for all points),
       * and offset is the amount of points to skip (for pagination).
       */
  def getLeaves(clusterId: scala.Double, clusterZoom: scala.Double): Clusters = js.native
  /**
       * Returns all the points of a cluster (given its cluster_id and zoom),
       * with pagination support: limit is the number of points to return (set to Infinity for all points),
       * and offset is the amount of points to skip (for pagination).
       */
  def getLeaves(clusterId: scala.Double, clusterZoom: scala.Double, limit: scala.Double): Clusters = js.native
  /**
       * Returns all the points of a cluster (given its cluster_id and zoom),
       * with pagination support: limit is the number of points to return (set to Infinity for all points),
       * and offset is the amount of points to skip (for pagination).
       */
  def getLeaves(clusterId: scala.Double, clusterZoom: scala.Double, limit: scala.Double, offset: scala.Double): Clusters = js.native
  /**
       * For a given zoom and x/y coordinates, returns a geojson-vt-compatible JSON tile object with cluster/point features.
       */
  def getTile(z: scala.Double, x: scala.Double, y: scala.Double): Tile = js.native
  /**
       * Loads an array of GeoJSON.Feature objects. Each feature's geometry must be a GeoJSON.Point. Once loaded, index is immutable.
       */
  def load(points: Points): Supercluster = js.native
}


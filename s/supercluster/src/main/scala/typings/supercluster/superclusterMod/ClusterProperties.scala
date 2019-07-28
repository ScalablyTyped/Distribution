package typings.supercluster.superclusterMod

import typings.supercluster.superclusterNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterProperties extends js.Object {
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
  @scala.inline
  def apply(cluster: `true`, cluster_id: Double, point_count: Double, point_count_abbreviated: String | Double): ClusterProperties = {
    val __obj = js.Dynamic.literal(cluster = cluster, cluster_id = cluster_id, point_count = point_count, point_count_abbreviated = point_count_abbreviated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterProperties]
  }
}


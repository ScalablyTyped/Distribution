package typings
package superclusterLib.superclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterProperties extends js.Object {
  /**
    * Always `true` to indicate that the Feature is a Cluster and not
    * an individual point.
    */
  var cluster: superclusterLib.superclusterLibNumbers.`true`
  /** Cluster ID */
  var cluster_id: scala.Double
  /** Number of points in the cluster. */
  var point_count: scala.Double
  /**
    * Abbreviated number of points in the cluster as string if the number
    * is 1000 or greater (e.g. `1.3k` if the number is 1298).
    *
    * For less than 1000 points it is the same value as `point_count`.
    */
  var point_count_abbreviated: java.lang.String | scala.Double
}

object ClusterProperties {
  @scala.inline
  def apply(
    cluster: superclusterLib.superclusterLibNumbers.`true`,
    cluster_id: scala.Double,
    point_count: scala.Double,
    point_count_abbreviated: java.lang.String | scala.Double
  ): ClusterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cluster")(cluster)
    __obj.updateDynamic("cluster_id")(cluster_id)
    __obj.updateDynamic("point_count")(point_count)
    __obj.updateDynamic("point_count_abbreviated")(point_count_abbreviated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterProperties]
  }
}


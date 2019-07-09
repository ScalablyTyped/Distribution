package typings
package atTensorflowTfjsDashCoreLib.distIoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightsManifestGroupConfig extends js.Object {
  /**
    * An ordered list of paths.
    *
    * Paths are intentionally abstract in order to be general. For example, they
    * can be relative URL paths or relative paths on the file system.
    */
  var paths: js.Array[java.lang.String]
  /**
    * Specifications of the weights stored in the paths.
    */
  var weights: js.Array[WeightsManifestEntry]
}

object WeightsManifestGroupConfig {
  @scala.inline
  def apply(paths: js.Array[java.lang.String], weights: js.Array[WeightsManifestEntry]): WeightsManifestGroupConfig = {
    val __obj = js.Dynamic.literal(paths = paths, weights = weights)
  
    __obj.asInstanceOf[WeightsManifestGroupConfig]
  }
}


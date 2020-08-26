package typings.tensorflowTfjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightsManifestGroupConfig extends js.Object {
  /**
    * An ordered list of paths.
    *
    * Paths are intentionally abstract in order to be general. For example, they
    * can be relative URL paths or relative paths on the file system.
    */
  var paths: js.Array[String] = js.native
  /**
    * Specifications of the weights stored in the paths.
    */
  var weights: js.Array[WeightsManifestEntry] = js.native
}

object WeightsManifestGroupConfig {
  @scala.inline
  def apply(paths: js.Array[String], weights: js.Array[WeightsManifestEntry]): WeightsManifestGroupConfig = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightsManifestGroupConfig]
  }
  @scala.inline
  implicit class WeightsManifestGroupConfigOps[Self <: WeightsManifestGroupConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeightsVarargs(value: WeightsManifestEntry*): Self = this.set("weights", js.Array(value :_*))
    @scala.inline
    def setWeights(value: js.Array[WeightsManifestEntry]): Self = this.set("weights", value.asInstanceOf[js.Any])
  }
  
}


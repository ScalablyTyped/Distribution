package typings.workboxBuild.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestTransformResult extends js.Object {
  var manifest: js.Array[ManifestEntry]
  var warnings: js.Array[js.UndefOr[String]]
}

object ManifestTransformResult {
  @scala.inline
  def apply(manifest: js.Array[ManifestEntry], warnings: js.Array[js.UndefOr[String]]): ManifestTransformResult = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestTransformResult]
  }
}


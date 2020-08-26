package typings.workboxBuild.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestTransformResult extends js.Object {
  var manifest: js.Array[ManifestEntry] = js.native
  var warnings: js.Array[js.UndefOr[String]] = js.native
}

object ManifestTransformResult {
  @scala.inline
  def apply(manifest: js.Array[ManifestEntry], warnings: js.Array[js.UndefOr[String]]): ManifestTransformResult = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestTransformResult]
  }
  @scala.inline
  implicit class ManifestTransformResultOps[Self <: ManifestTransformResult] (val x: Self) extends AnyVal {
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
    def setManifestVarargs(value: ManifestEntry*): Self = this.set("manifest", js.Array(value :_*))
    @scala.inline
    def setManifest(value: js.Array[ManifestEntry]): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningsVarargs(value: js.UndefOr[String]*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[js.UndefOr[String]]): Self = this.set("warnings", value.asInstanceOf[js.Any])
  }
  
}


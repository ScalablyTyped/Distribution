package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectReference extends js.Object {
  /** True if it is intended that this reference form a circularity */
  var circular: js.UndefOr[Boolean] = js.native
  /** The path as the user originally wrote it */
  var originalPath: js.UndefOr[java.lang.String] = js.native
  /** A normalized path on disk */
  var path: java.lang.String = js.native
  /** True if the output of this reference should be prepended to the output of this project. Only valid for --outFile compilations */
  var prepend: js.UndefOr[Boolean] = js.native
}

object ProjectReference {
  @scala.inline
  def apply(path: java.lang.String): ProjectReference = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectReference]
  }
  @scala.inline
  implicit class ProjectReferenceOps[Self <: ProjectReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPath(value: java.lang.String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircular(value: Boolean): Self = this.set("circular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    @scala.inline
    def setOriginalPath(value: java.lang.String): Self = this.set("originalPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalPath: Self = this.set("originalPath", js.undefined)
    @scala.inline
    def setPrepend(value: Boolean): Self = this.set("prepend", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
  }
  
}


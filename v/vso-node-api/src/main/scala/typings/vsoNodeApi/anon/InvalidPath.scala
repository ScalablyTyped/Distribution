package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidPath extends js.Object {
  var invalidPath: scala.Double = js.native
  var mergeContentNotFound: scala.Double = js.native
  var none: scala.Double = js.native
  var otherError: scala.Double = js.native
  var pathInUse: scala.Double = js.native
  var unknownAction: scala.Double = js.native
  var unknownMergeType: scala.Double = js.native
}

object InvalidPath {
  @scala.inline
  def apply(
    invalidPath: scala.Double,
    mergeContentNotFound: scala.Double,
    none: scala.Double,
    otherError: scala.Double,
    pathInUse: scala.Double,
    unknownAction: scala.Double,
    unknownMergeType: scala.Double
  ): InvalidPath = {
    val __obj = js.Dynamic.literal(invalidPath = invalidPath.asInstanceOf[js.Any], mergeContentNotFound = mergeContentNotFound.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], otherError = otherError.asInstanceOf[js.Any], pathInUse = pathInUse.asInstanceOf[js.Any], unknownAction = unknownAction.asInstanceOf[js.Any], unknownMergeType = unknownMergeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPath]
  }
  @scala.inline
  implicit class InvalidPathOps[Self <: InvalidPath] (val x: Self) extends AnyVal {
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
    def setInvalidPath(value: scala.Double): Self = this.set("invalidPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeContentNotFound(value: scala.Double): Self = this.set("mergeContentNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setOtherError(value: scala.Double): Self = this.set("otherError", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathInUse(value: scala.Double): Self = this.set("pathInUse", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknownAction(value: scala.Double): Self = this.set("unknownAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknownMergeType(value: scala.Double): Self = this.set("unknownMergeType", value.asInstanceOf[js.Any])
  }
  
}


package typings.workboxBuild.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Count extends js.Object {
  var count: Double = js.native
  var filePaths: js.Array[String] = js.native
  var size: Double = js.native
  var warnings: js.Array[String] = js.native
}

object Count {
  @scala.inline
  def apply(count: Double, filePaths: js.Array[String], size: Double, warnings: js.Array[String]): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], filePaths = filePaths.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePathsVarargs(value: String*): Self = this.set("filePaths", js.Array(value :_*))
    @scala.inline
    def setFilePaths(value: js.Array[String]): Self = this.set("filePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
  }
  
}


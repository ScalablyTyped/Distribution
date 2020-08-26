package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapping extends js.Object {
  var childMappings: js.Array[SourceMapping] = js.native
  var end: SourceMapPosition = js.native
  var nameIndex: Double = js.native
  var start: SourceMapPosition = js.native
}

object SourceMapping {
  @scala.inline
  def apply(
    childMappings: js.Array[SourceMapping],
    end: SourceMapPosition,
    nameIndex: Double,
    start: SourceMapPosition
  ): SourceMapping = {
    val __obj = js.Dynamic.literal(childMappings = childMappings.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], nameIndex = nameIndex.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapping]
  }
  @scala.inline
  implicit class SourceMappingOps[Self <: SourceMapping] (val x: Self) extends AnyVal {
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
    def setChildMappingsVarargs(value: SourceMapping*): Self = this.set("childMappings", js.Array(value :_*))
    @scala.inline
    def setChildMappings(value: js.Array[SourceMapping]): Self = this.set("childMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: SourceMapPosition): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameIndex(value: Double): Self = this.set("nameIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: SourceMapPosition): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}


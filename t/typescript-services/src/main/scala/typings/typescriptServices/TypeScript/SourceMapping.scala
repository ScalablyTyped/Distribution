package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapping extends js.Object {
  var childMappings: js.Array[SourceMapping]
  var end: SourceMapPosition
  var nameIndex: Double
  var start: SourceMapPosition
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
}


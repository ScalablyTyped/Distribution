package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hover extends js.Object {
  /**
    * The hover's content
    */
  var contents: MarkupContent | MarkedString | js.Array[MarkedString]
  /**
    * An optional range
    */
  var range: js.UndefOr[Range] = js.undefined
}

object Hover {
  @scala.inline
  def apply(contents: MarkupContent | MarkedString | js.Array[MarkedString], range: Range = null): Hover = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Hover]
  }
}


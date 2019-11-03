package typings.svgDashIntersections.svgDashIntersectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var meta: js.Object
  var params: js.Object
  var `type`: String
}

object Shape {
  @scala.inline
  def apply(meta: js.Object, params: js.Object, `type`: String): Shape = {
    val __obj = js.Dynamic.literal(meta = meta, params = params)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Shape]
  }
}

@JSImport("svg-intersections", "shape")
@js.native
object shape extends js.Object {
  def apply[T /* <: SvgElements */](svgElementName: T, svgProps: SvgProperties[T]): Shape = js.native
}


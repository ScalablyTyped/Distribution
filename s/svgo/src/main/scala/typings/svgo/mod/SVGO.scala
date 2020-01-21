package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGO extends js.Object {
  def optimize(svgString: String): js.Promise[OptimizedSvg] = js.native
  def optimize(svgString: String, info: SvgInfo): js.Promise[OptimizedSvg] = js.native
}


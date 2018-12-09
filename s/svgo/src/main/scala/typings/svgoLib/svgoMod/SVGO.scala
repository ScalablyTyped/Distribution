package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGO extends js.Object {
  def optimize(svgString: java.lang.String): js.Promise[OptimizedSvg] = js.native
  def optimize(svgString: java.lang.String, info: SvgInfo): js.Promise[OptimizedSvg] = js.native
}


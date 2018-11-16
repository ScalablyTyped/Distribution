package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGO extends js.Object {
  def optimize(svgString: java.lang.String): stdLib.Promise[OptimizedSvg] = js.native
  def optimize(svgString: java.lang.String, info: SvgInfo): stdLib.Promise[OptimizedSvg] = js.native
}


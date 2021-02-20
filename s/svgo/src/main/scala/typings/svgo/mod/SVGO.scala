package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGO extends StObject {
  
  def optimize(svgString: String): js.Promise[OptimizedSvg] = js.native
  def optimize(svgString: String, info: SvgInfo): js.Promise[OptimizedSvg] = js.native
}

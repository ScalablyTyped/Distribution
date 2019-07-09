package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FenceContext extends js.Object {
  var query: webgl2Lib.WebGLQuery | webgl2Lib.WebGLSync
  def isFencePassed(): scala.Boolean
}

object FenceContext {
  @scala.inline
  def apply(isFencePassed: () => scala.Boolean, query: webgl2Lib.WebGLQuery | webgl2Lib.WebGLSync): FenceContext = {
    val __obj = js.Dynamic.literal(isFencePassed = js.Any.fromFunction0(isFencePassed), query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FenceContext]
  }
}


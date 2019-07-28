package typings.atTensorflowTfjsDashCore.distBackendsWebglGpgpuUnderscoreContextMod

import typings.webgl2.WebGLQuery
import typings.webgl2.WebGLSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FenceContext extends js.Object {
  var query: WebGLQuery | WebGLSync
  def isFencePassed(): Boolean
}

object FenceContext {
  @scala.inline
  def apply(isFencePassed: () => Boolean, query: WebGLQuery | WebGLSync): FenceContext = {
    val __obj = js.Dynamic.literal(isFencePassed = js.Any.fromFunction0(isFencePassed), query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FenceContext]
  }
}


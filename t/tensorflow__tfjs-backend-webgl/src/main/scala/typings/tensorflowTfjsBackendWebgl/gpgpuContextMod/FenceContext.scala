package typings.tensorflowTfjsBackendWebgl.gpgpuContextMod

import typings.std.WebGLQuery
import typings.std.WebGLSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FenceContext extends js.Object {
  
  def isFencePassed(): Boolean = js.native
  
  var query: WebGLQuery | WebGLSync = js.native
}
object FenceContext {
  
  @scala.inline
  def apply(isFencePassed: () => Boolean, query: WebGLQuery | WebGLSync): FenceContext = {
    val __obj = js.Dynamic.literal(isFencePassed = js.Any.fromFunction0(isFencePassed), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[FenceContext]
  }
  
  @scala.inline
  implicit class FenceContextOps[Self <: FenceContext] (val x: Self) extends AnyVal {
    
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
    def setIsFencePassed(value: () => Boolean): Self = this.set("isFencePassed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQuery(value: WebGLQuery | WebGLSync): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}

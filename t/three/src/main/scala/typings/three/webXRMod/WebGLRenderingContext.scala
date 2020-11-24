package typings.three.webXRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLRenderingContext extends js.Object {
  
  def makeXRCompatible(): js.Promise[Unit] = js.native
}
object WebGLRenderingContext {
  
  @scala.inline
  def apply(makeXRCompatible: () => js.Promise[Unit]): WebGLRenderingContext = {
    val __obj = js.Dynamic.literal(makeXRCompatible = js.Any.fromFunction0(makeXRCompatible))
    __obj.asInstanceOf[WebGLRenderingContext]
  }
  
  @scala.inline
  implicit class WebGLRenderingContextOps[Self <: WebGLRenderingContext] (val x: Self) extends AnyVal {
    
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
    def setMakeXRCompatible(value: () => js.Promise[Unit]): Self = this.set("makeXRCompatible", js.Any.fromFunction0(value))
  }
}

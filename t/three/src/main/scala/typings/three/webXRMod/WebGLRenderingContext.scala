package typings.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLRenderingContext extends StObject {
  
  def makeXRCompatible(): js.Promise[Unit] = js.native
}
object WebGLRenderingContext {
  
  @scala.inline
  def apply(makeXRCompatible: () => js.Promise[Unit]): WebGLRenderingContext = {
    val __obj = js.Dynamic.literal(makeXRCompatible = js.Any.fromFunction0(makeXRCompatible))
    __obj.asInstanceOf[WebGLRenderingContext]
  }
  
  @scala.inline
  implicit class WebGLRenderingContextMutableBuilder[Self <: WebGLRenderingContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMakeXRCompatible(value: () => js.Promise[Unit]): Self = StObject.set(x, "makeXRCompatible", js.Any.fromFunction0(value))
  }
}

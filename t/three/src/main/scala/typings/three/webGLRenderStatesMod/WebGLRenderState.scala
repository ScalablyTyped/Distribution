package typings.three.webGLRenderStatesMod

import typings.three.anon.Lights
import typings.three.cameraMod.Camera
import typings.three.lightMod.Light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLRenderState extends js.Object {
  
  def init(): Unit = js.native
  
  def pushLight(light: Light): Unit = js.native
  
  def pushShadow(shadowLight: Light): Unit = js.native
  
  def setupLights(camera: Camera): Unit = js.native
  
  var state: Lights = js.native
}
object WebGLRenderState {
  
  @scala.inline
  def apply(
    init: () => Unit,
    pushLight: Light => Unit,
    pushShadow: Light => Unit,
    setupLights: Camera => Unit,
    state: Lights
  ): WebGLRenderState = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), pushLight = js.Any.fromFunction1(pushLight), pushShadow = js.Any.fromFunction1(pushShadow), setupLights = js.Any.fromFunction1(setupLights), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLRenderState]
  }
  
  @scala.inline
  implicit class WebGLRenderStateOps[Self <: WebGLRenderState] (val x: Self) extends AnyVal {
    
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
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPushLight(value: Light => Unit): Self = this.set("pushLight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPushShadow(value: Light => Unit): Self = this.set("pushShadow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetupLights(value: Camera => Unit): Self = this.set("setupLights", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: Lights): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}

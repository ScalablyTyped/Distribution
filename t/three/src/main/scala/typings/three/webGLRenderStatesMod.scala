package typings.three

import typings.three.anon.Lights
import typings.three.cameraMod.Camera
import typings.three.lightMod.Light
import typings.three.sceneMod.Scene
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import typings.three.webGLExtensionsMod.WebGLExtensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLRenderStatesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLRenderStates", "WebGLRenderStates")
  @js.native
  class WebGLRenderStates protected () extends StObject {
    def this(extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
    
    def dispose(): Unit = js.native
    
    def get(scene: Scene, camera: Camera): WebGLRenderState = js.native
  }
  
  @js.native
  trait WebGLRenderState extends StObject {
    
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
    implicit class WebGLRenderStateMutableBuilder[Self <: WebGLRenderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPushLight(value: Light => Unit): Self = StObject.set(x, "pushLight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPushShadow(value: Light => Unit): Self = StObject.set(x, "pushShadow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetupLights(value: Camera => Unit): Self = StObject.set(x, "setupLights", js.Any.fromFunction1(value))
      
      @scala.inline
      def setState(value: Lights): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}

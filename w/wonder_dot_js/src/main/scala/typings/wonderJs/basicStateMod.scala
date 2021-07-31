package typings.wonderJs

import typings.wonderJs.webGLStateMod.WebGLState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicStateMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/state/BasicState", "BasicState")
  @js.native
  class BasicState () extends WebGLState
  /* static members */
  object BasicState {
    
    @JSImport("wonder.js/dist/es2015/renderer/state/BasicState", "BasicState")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): BasicState = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BasicState]
  }
}

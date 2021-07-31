package typings.wonderJs

import typings.wonderJs.rendererMod.Renderer
import typings.wonderJs.sceneDispatcherMod.SceneDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directorMod {
  
  @JSImport("wonder.js/dist/es2015/core/Director", "Director")
  @js.native
  class Director () extends StObject {
    
    val elapsed: Double = js.native
    
    val fps: Double = js.native
    
    val gameTime: Double = js.native
    
    def getDeltaTime(): Double = js.native
    
    def initWhenCreate(): Unit = js.native
    
    val isNormal: Boolean = js.native
    
    val isPause: Boolean = js.native
    
    val isStop: Boolean = js.native
    
    val isTimeChange: Boolean = js.native
    
    def pause(): Unit = js.native
    
    var renderer: Renderer = js.native
    
    def resume(): Unit = js.native
    
    var scene: SceneDispatcher = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    val view: js.Any = js.native
  }
  /* static members */
  object Director {
    
    @JSImport("wonder.js/dist/es2015/core/Director", "Director")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getInstance(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[js.Any]
  }
}

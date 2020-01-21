package typings.wonderJs

import typings.wonderJs.rendererMod.Renderer
import typings.wonderJs.sceneDispatcherMod.SceneDispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/Director", JSImport.Namespace)
@js.native
object directorMod extends js.Object {
  @js.native
  class Director () extends js.Object {
    val elapsed: Double = js.native
    val fps: Double = js.native
    val gameTime: Double = js.native
    val isNormal: Boolean = js.native
    val isPause: Boolean = js.native
    val isStop: Boolean = js.native
    val isTimeChange: Boolean = js.native
    var renderer: Renderer = js.native
    var scene: SceneDispatcher = js.native
    val view: js.Any = js.native
    def getDeltaTime(): Double = js.native
    def initWhenCreate(): Unit = js.native
    def pause(): Unit = js.native
    def resume(): Unit = js.native
    def start(): Unit = js.native
    def stop(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Director extends js.Object {
    def getInstance(): js.Any = js.native
  }
  
}


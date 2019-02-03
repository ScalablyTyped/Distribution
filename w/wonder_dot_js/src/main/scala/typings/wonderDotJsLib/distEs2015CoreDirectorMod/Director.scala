package typings
package wonderDotJsLib.distEs2015CoreDirectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/Director", "Director")
@js.native
class Director () extends js.Object {
  val elapsed: scala.Double = js.native
  val fps: scala.Double = js.native
  val gameTime: scala.Double = js.native
  val isNormal: scala.Boolean = js.native
  val isPause: scala.Boolean = js.native
  val isStop: scala.Boolean = js.native
  val isTimeChange: scala.Boolean = js.native
  var renderer: wonderDotJsLib.distEs2015RendererRendererRendererMod.Renderer = js.native
  var scene: wonderDotJsLib.distEs2015CoreEntityObjectSceneSceneDispatcherMod.SceneDispatcher = js.native
  val view: js.Any = js.native
  def getDeltaTime(): scala.Double = js.native
  def initWhenCreate(): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/core/Director", "Director")
@js.native
object Director extends js.Object {
  def getInstance(): js.Any = js.native
}


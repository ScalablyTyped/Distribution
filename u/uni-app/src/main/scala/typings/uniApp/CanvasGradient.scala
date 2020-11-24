package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasGradient extends js.Object {
  
  /**
    * 创建一个颜色的渐变点
    */
  def addColorStop(): Unit = js.native
  def addColorStop(stop: js.UndefOr[scala.Nothing], color: String): Unit = js.native
  def addColorStop(stop: Double): Unit = js.native
  def addColorStop(stop: Double, color: String): Unit = js.native
}

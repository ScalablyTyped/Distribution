package typings.vexflow.Vex.Flow

import typings.std.HTMLElement
import typings.vexflow.Vex.Flow.Renderer.Backends
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Renderer")
@js.native
class Renderer_ protected () extends js.Object {
  def this(sel: HTMLElement, backend: Backends) = this()
  def getContext(): IRenderContext = js.native
  def resize(width: Double, height: Double): Renderer = js.native
}


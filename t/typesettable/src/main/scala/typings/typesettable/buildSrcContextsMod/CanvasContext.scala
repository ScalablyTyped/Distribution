package typings.typesettable.buildSrcContextsMod

import typings.std.CanvasRenderingContext2D
import typings.typesettable.buildSrcContextsCanvasMod.ICanvasFontStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts", "CanvasContext")
@js.native
class CanvasContext protected ()
  extends typings.typesettable.buildSrcContextsCanvasMod.CanvasContext {
  def this(ctx: CanvasRenderingContext2D) = this()
  def this(ctx: CanvasRenderingContext2D, lineHeight: Double) = this()
  def this(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
}


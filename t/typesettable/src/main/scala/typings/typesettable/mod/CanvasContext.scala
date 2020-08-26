package typings.typesettable.mod

import typings.std.CanvasRenderingContext2D
import typings.typesettable.canvasMod.ICanvasFontStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "CanvasContext")
@js.native
class CanvasContext protected ()
  extends typings.typesettable.contextsMod.CanvasContext {
  def this(ctx: CanvasRenderingContext2D) = this()
  def this(ctx: CanvasRenderingContext2D, lineHeight: Double) = this()
  def this(ctx: CanvasRenderingContext2D, lineHeight: js.UndefOr[scala.Nothing], style: ICanvasFontStyle) = this()
  def this(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
}


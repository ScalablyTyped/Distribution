package typings
package typesettableLib.buildSrcContextsCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts/canvas", "CanvasContext")
@js.native
class CanvasContext protected ()
  extends typesettableLib.buildSrcContextsMod.ITypesetterContext[stdLib.CanvasRenderingContext2D] {
  def this(ctx: stdLib.CanvasRenderingContext2D) = this()
  def this(ctx: stdLib.CanvasRenderingContext2D, lineHeight: scala.Double) = this()
  def this(ctx: stdLib.CanvasRenderingContext2D, lineHeight: scala.Double, style: ICanvasFontStyle) = this()
  var ctx: js.Any = js.native
  var lineHeight: js.Any = js.native
  var style: js.Any = js.native
  /* private */ def createCanvasPen(ctx: js.Any): js.Any = js.native
}


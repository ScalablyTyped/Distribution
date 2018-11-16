package typings
package typesettableLib.typesettableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "Typesetter")
@js.native
class Typesetter protected ()
  extends typesettableLib.buildSrcTypesetterMod.Typesetter {
  def this(context: typesettableLib.buildSrcContextsMod.ITypesetterContext[_]) = this()
}

@JSImport("typesettable", "Typesetter")
@js.native
object Typesetter extends js.Object {
  def canvas(ctx: stdLib.CanvasRenderingContext2D): typesettableLib.buildSrcTypesetterMod.Typesetter = js.native
  def canvas(ctx: stdLib.CanvasRenderingContext2D, lineHeight: scala.Double): typesettableLib.buildSrcTypesetterMod.Typesetter = js.native
  def canvas(
    ctx: stdLib.CanvasRenderingContext2D,
    lineHeight: scala.Double,
    style: typesettableLib.buildSrcContextsCanvasMod.ICanvasFontStyle
  ): typesettableLib.buildSrcTypesetterMod.Typesetter = js.native
  def html(element: stdLib.HTMLElement): typesettableLib.buildSrcTypesetterMod.Typesetter = js.native
  def html(element: stdLib.HTMLElement, className: java.lang.String): typesettableLib.buildSrcTypesetterMod.Typesetter = js.native
  def html(element: stdLib.HTMLElement, className: java.lang.String, addTitle: scala.Boolean): typesettableLib.buildSrcTypesetterMod.Typesetter = js.native
  def svg(element: stdLib.SVGElement): typesettableLib.buildSrcTypesetterMod.Typesetter = js.native
  def svg(element: stdLib.SVGElement, className: java.lang.String): typesettableLib.buildSrcTypesetterMod.Typesetter = js.native
  def svg(element: stdLib.SVGElement, className: java.lang.String, addTitleElement: scala.Boolean): typesettableLib.buildSrcTypesetterMod.Typesetter = js.native
}


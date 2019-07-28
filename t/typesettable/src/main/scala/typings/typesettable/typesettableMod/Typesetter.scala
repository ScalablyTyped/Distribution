package typings.typesettable.typesettableMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import typings.std.SVGElement
import typings.typesettable.buildSrcContextsCanvasMod.ICanvasFontStyle
import typings.typesettable.buildSrcContextsMod.ITypesetterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "Typesetter")
@js.native
class Typesetter protected ()
  extends typings.typesettable.buildSrcTypesetterMod.Typesetter {
  def this(context: ITypesetterContext[_]) = this()
}

/* static members */
@JSImport("typesettable", "Typesetter")
@js.native
object Typesetter extends js.Object {
  def canvas(ctx: CanvasRenderingContext2D): typings.typesettable.buildSrcTypesetterMod.Typesetter = js.native
  def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double): typings.typesettable.buildSrcTypesetterMod.Typesetter = js.native
  def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle): typings.typesettable.buildSrcTypesetterMod.Typesetter = js.native
  def html(element: HTMLElement): typings.typesettable.buildSrcTypesetterMod.Typesetter = js.native
  def html(element: HTMLElement, className: String): typings.typesettable.buildSrcTypesetterMod.Typesetter = js.native
  def html(element: HTMLElement, className: String, addTitle: Boolean): typings.typesettable.buildSrcTypesetterMod.Typesetter = js.native
  def svg(element: SVGElement): typings.typesettable.buildSrcTypesetterMod.Typesetter = js.native
  def svg(element: SVGElement, className: String): typings.typesettable.buildSrcTypesetterMod.Typesetter = js.native
  def svg(element: SVGElement, className: String, addTitleElement: Boolean): typings.typesettable.buildSrcTypesetterMod.Typesetter = js.native
}


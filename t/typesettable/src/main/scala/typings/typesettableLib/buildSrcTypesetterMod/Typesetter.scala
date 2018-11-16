package typings
package typesettableLib.buildSrcTypesetterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/typesetter", "Typesetter")
@js.native
class Typesetter protected () extends js.Object {
  def this(context: typesettableLib.buildSrcContextsMod.ITypesetterContext[_]) = this()
  var context: js.Any = js.native
  var measurer: typesettableLib.buildSrcMeasurersMod.CacheMeasurer = js.native
  var wrapper: typesettableLib.buildSrcWrappersMod.Wrapper = js.native
  var writer: typesettableLib.buildSrcWritersMod.Writer = js.native
  /**
       * Clears the `Measurer`'s CacheMeasurer.
       *
       * Call this if your font style changee in SVG.
       */
  def clearMeasurerCache(): scala.Unit = js.native
  /**
       * Wraps the given string into the width/height and writes it into the
       * canvas or SVG (depending on context).
       *
       * Delegates to `Writer.write` using the internal `ITypesetterContext`.
       */
  def write(text: java.lang.String, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
       * Wraps the given string into the width/height and writes it into the
       * canvas or SVG (depending on context).
       *
       * Delegates to `Writer.write` using the internal `ITypesetterContext`.
       */
  def write(
    text: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    options: typesettableLib.buildSrcWritersWriterMod.IWriteOptions
  ): scala.Unit = js.native
  /**
       * Wraps the given string into the width/height and writes it into the
       * canvas or SVG (depending on context).
       *
       * Delegates to `Writer.write` using the internal `ITypesetterContext`.
       */
  def write(
    text: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    options: typesettableLib.buildSrcWritersWriterMod.IWriteOptions,
    into: js.Any
  ): scala.Unit = js.native
}

@JSImport("typesettable/build/src/typesetter", "Typesetter")
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


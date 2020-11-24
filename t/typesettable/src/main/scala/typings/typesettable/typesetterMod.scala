package typings.typesettable

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import typings.std.SVGElement
import typings.typesettable.canvasMod.ICanvasFontStyle
import typings.typesettable.contextsMod.ITypesetterContext
import typings.typesettable.measurersMod.CacheMeasurer
import typings.typesettable.wrappersMod.Wrapper
import typings.typesettable.writerMod.IWriteOptions
import typings.typesettable.writersMod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable/build/src/typesetter", JSImport.Namespace)
@js.native
object typesetterMod extends js.Object {
  
  @js.native
  class Typesetter protected () extends js.Object {
    def this(context: ITypesetterContext[_]) = this()
    
    /**
      * Clears the `Measurer`'s CacheMeasurer.
      *
      * Call this if your font style changee in SVG.
      */
    def clearMeasurerCache(): Unit = js.native
    
    var context: js.Any = js.native
    
    var measurer: CacheMeasurer = js.native
    
    var wrapper: Wrapper = js.native
    
    /**
      * Wraps the given string into the width/height and writes it into the
      * canvas or SVG (depending on context).
      *
      * Delegates to `Writer.write` using the internal `ITypesetterContext`.
      */
    def write(text: String, width: Double, height: Double): Unit = js.native
    def write(text: String, width: Double, height: Double, options: js.UndefOr[scala.Nothing], into: js.Any): Unit = js.native
    def write(text: String, width: Double, height: Double, options: IWriteOptions): Unit = js.native
    def write(text: String, width: Double, height: Double, options: IWriteOptions, into: js.Any): Unit = js.native
    
    var writer: Writer = js.native
  }
  /* static members */
  @js.native
  object Typesetter extends js.Object {
    
    def canvas(ctx: CanvasRenderingContext2D): Typesetter = js.native
    def canvas(ctx: CanvasRenderingContext2D, lineHeight: js.UndefOr[scala.Nothing], style: ICanvasFontStyle): Typesetter = js.native
    def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double): Typesetter = js.native
    def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle): Typesetter = js.native
    
    def html(element: HTMLElement): Typesetter = js.native
    def html(element: HTMLElement, className: js.UndefOr[scala.Nothing], addTitle: Boolean): Typesetter = js.native
    def html(element: HTMLElement, className: String): Typesetter = js.native
    def html(element: HTMLElement, className: String, addTitle: Boolean): Typesetter = js.native
    
    def svg(element: SVGElement): Typesetter = js.native
    def svg(element: SVGElement, className: js.UndefOr[scala.Nothing], addTitleElement: Boolean): Typesetter = js.native
    def svg(element: SVGElement, className: String): Typesetter = js.native
    def svg(element: SVGElement, className: String, addTitleElement: Boolean): Typesetter = js.native
  }
}

package typings.typesettable

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import typings.std.SVGElement
import typings.typesettable.buildSrcContextsCanvasMod.ICanvasFontStyle
import typings.typesettable.buildSrcContextsMod.ITypesetterContext
import typings.typesettable.buildSrcMeasurersMod.CacheMeasurer
import typings.typesettable.buildSrcWrappersMod.Wrapper
import typings.typesettable.buildSrcWritersMod.Writer
import typings.typesettable.buildSrcWritersWriterMod.IWriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesetterMod {
  
  @JSImport("typesettable/build/src/typesetter", "Typesetter")
  @js.native
  open class Typesetter protected () extends StObject {
    def this(context: ITypesetterContext[Any]) = this()
    
    /**
      * Clears the `Measurer`'s CacheMeasurer.
      *
      * Call this if your font style changee in SVG.
      */
    def clearMeasurerCache(): Unit = js.native
    
    /* private */ var context: Any = js.native
    
    var measurer: CacheMeasurer = js.native
    
    var wrapper: Wrapper = js.native
    
    /**
      * Wraps the given string into the width/height and writes it into the
      * canvas or SVG (depending on context).
      *
      * Delegates to `Writer.write` using the internal `ITypesetterContext`.
      */
    def write(text: String, width: Double, height: Double): Unit = js.native
    def write(text: String, width: Double, height: Double, options: Unit, into: Any): Unit = js.native
    def write(text: String, width: Double, height: Double, options: IWriteOptions): Unit = js.native
    def write(text: String, width: Double, height: Double, options: IWriteOptions, into: Any): Unit = js.native
    
    var writer: Writer = js.native
  }
  /* static members */
  object Typesetter {
    
    @JSImport("typesettable/build/src/typesetter", "Typesetter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def canvas(ctx: CanvasRenderingContext2D): Typesetter = ^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(ctx.asInstanceOf[js.Any]).asInstanceOf[Typesetter]
    inline def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double): Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(ctx.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any])).asInstanceOf[Typesetter]
    inline def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle): Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(ctx.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Typesetter]
    inline def canvas(ctx: CanvasRenderingContext2D, lineHeight: Unit, style: ICanvasFontStyle): Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(ctx.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Typesetter]
    
    inline def html(element: HTMLElement): Typesetter = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(element.asInstanceOf[js.Any]).asInstanceOf[Typesetter]
    inline def html(element: HTMLElement, className: String): Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Typesetter]
    inline def html(element: HTMLElement, className: String, addTitle: Boolean): Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], addTitle.asInstanceOf[js.Any])).asInstanceOf[Typesetter]
    inline def html(element: HTMLElement, className: Unit, addTitle: Boolean): Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], addTitle.asInstanceOf[js.Any])).asInstanceOf[Typesetter]
    
    inline def svg(element: SVGElement): Typesetter = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")(element.asInstanceOf[js.Any]).asInstanceOf[Typesetter]
    inline def svg(element: SVGElement, className: String): Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("svg")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Typesetter]
    inline def svg(element: SVGElement, className: String, addTitleElement: Boolean): Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("svg")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], addTitleElement.asInstanceOf[js.Any])).asInstanceOf[Typesetter]
    inline def svg(element: SVGElement, className: Unit, addTitleElement: Boolean): Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("svg")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], addTitleElement.asInstanceOf[js.Any])).asInstanceOf[Typesetter]
  }
}

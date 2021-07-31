package typings.typesettable

import typings.std.CanvasRenderingContext2D
import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.abstractMeasurerMod.IRulerFactory
import typings.typesettable.contextsMod.ITypesetterContext
import typings.typesettable.writerMod.IPen
import typings.typesettable.writerMod.IPenFactory
import typings.typesettable.writerMod.ITransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasMod {
  
  @JSImport("typesettable/build/src/contexts/canvas", "CanvasContext")
  @js.native
  class CanvasContext protected ()
    extends StObject
       with ITypesetterContext[CanvasRenderingContext2D] {
    def this(ctx: CanvasRenderingContext2D) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Unit, style: ICanvasFontStyle) = this()
    
    /* private */ def createCanvasPen(ctx: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def createPen(text: String, transform: ITransform): IPen = js.native
    /* CompleteClass */
    override def createPen(text: String, transform: ITransform, container: CanvasRenderingContext2D): IPen = js.native
    /* CompleteClass */
    @JSName("createPen")
    var createPen_Original: IPenFactory[CanvasRenderingContext2D] = js.native
    
    /* CompleteClass */
    override def createRuler(): IRuler = js.native
    /* CompleteClass */
    @JSName("createRuler")
    var createRuler_Original: IRulerFactory = js.native
    
    var ctx: js.Any = js.native
    
    var lineHeight: js.Any = js.native
    
    var style: js.Any = js.native
  }
  
  trait ICanvasFontStyle extends StObject {
    
    /**
      * An optional fill color.
      *
      * If `null` the text will not be filled. But, if `undefined` we will
      * default to `#444` filled text.
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /**
      * An optional CSS font string.
      *
      * If `null` or `undefined`, we will not set the font before writing text,
      * but there may already be a font style defined on the canvas rendering
      * context.
      */
    var font: js.UndefOr[String] = js.undefined
    
    /**
      * An optional stroke color.
      *
      * If `null` or `undefined` the text will not be stroked.
      */
    var stroke: js.UndefOr[String] = js.undefined
  }
  object ICanvasFontStyle {
    
    @scala.inline
    def apply(): ICanvasFontStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICanvasFontStyle]
    }
    
    @scala.inline
    implicit class ICanvasFontStyleMutableBuilder[Self <: ICanvasFontStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
}

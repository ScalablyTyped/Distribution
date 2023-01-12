package typings.typesettable

import typings.std.CanvasRenderingContext2D
import typings.typesettable.buildSrcContextsMod.ITypesetterContext
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRulerFactory
import typings.typesettable.buildSrcWritersWriterMod.IPen
import typings.typesettable.buildSrcWritersWriterMod.IPenFactory
import typings.typesettable.buildSrcWritersWriterMod.ITransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcContextsCanvasMod {
  
  @JSImport("typesettable/build/src/contexts/canvas", "CanvasContext")
  @js.native
  open class CanvasContext protected ()
    extends StObject
       with ITypesetterContext[CanvasRenderingContext2D] {
    def this(ctx: CanvasRenderingContext2D) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Unit, style: ICanvasFontStyle) = this()
    
    /* private */ def createCanvasPen(ctx: Any): Any = js.native
    
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
    
    /* private */ var ctx: Any = js.native
    
    /* private */ var lineHeight: Any = js.native
    
    /* private */ var style: Any = js.native
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
    
    inline def apply(): ICanvasFontStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICanvasFontStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICanvasFontStyle] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
}

package typings.typesettable

import typings.std.CanvasRenderingContext2D
import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGElement
import typings.std.SVGGraphicsElement
import typings.typesettable.abstractMeasurerMod.IDimensions
import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.abstractMeasurerMod.IRulerFactory
import typings.typesettable.canvasMod.ICanvasFontStyle
import typings.typesettable.writerMod.IPen
import typings.typesettable.writerMod.IPenFactory
import typings.typesettable.writerMod.ITransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextsMod {
  
  @JSImport("typesettable/build/src/contexts", "CanvasContext")
  @js.native
  open class CanvasContext protected ()
    extends typings.typesettable.canvasMod.CanvasContext {
    def this(ctx: CanvasRenderingContext2D) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Unit, style: ICanvasFontStyle) = this()
  }
  
  @JSImport("typesettable/build/src/contexts", "HtmlContext")
  @js.native
  open class HtmlContext protected ()
    extends typings.typesettable.htmlMod.HtmlContext {
    /**
      * @param element - The CSS font styles applied to `element` will determine the
      * size of text measurements. Also the default text block container.
      * @param className - added to new text blocks
      * @param addTitle - enable title attribute to be added to new text blocks.
      */
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, className: String) = this()
    def this(element: HTMLElement, className: String, addTitle: Boolean) = this()
    def this(element: HTMLElement, className: Unit, addTitle: Boolean) = this()
  }
  
  @JSImport("typesettable/build/src/contexts", "HtmlUtils")
  @js.native
  open class HtmlUtils ()
    extends typings.typesettable.htmlMod.HtmlUtils
  /* static members */
  object HtmlUtils {
    
    @JSImport("typesettable/build/src/contexts", "HtmlUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds the variadic classnames to the Element
      */
    inline def addClasses(element: Element, classNames: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addClasses")(List(element.asInstanceOf[js.Any]).`++`(classNames.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    /**
      * Appends an HTML element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    inline def append(element: Element, tagName: String, classNames: String*): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("append")((List(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).`++`(classNames.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[HTMLElement]
    
    /**
      * Creates and returns a new HTMLElement with the attached classnames.
      */
    inline def create(tagName: String, classNames: String*): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(List(tagName.asInstanceOf[js.Any]).`++`(classNames.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HTMLElement]
    
    /**
      * Returns the width/height of HTMLElement's bounding box
      */
    inline def getDimensions(element: HTMLElement): IDimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[IDimensions]
  }
  
  @JSImport("typesettable/build/src/contexts", "SvgContext")
  @js.native
  open class SvgContext protected ()
    extends typings.typesettable.svgMod.SvgContext {
    def this(element: SVGElement) = this()
    def this(element: SVGElement, className: String) = this()
    def this(element: SVGElement, className: String, addTitleElement: Boolean) = this()
    def this(element: SVGElement, className: Unit, addTitleElement: Boolean) = this()
  }
  /* static members */
  object SvgContext {
    
    @JSImport("typesettable/build/src/contexts", "SvgContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable/build/src/contexts", "SvgContext.AnchorMap")
    @js.native
    def AnchorMap: Any = js.native
    inline def AnchorMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnchorMap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typesettable/build/src/contexts", "SvgUtils")
  @js.native
  open class SvgUtils ()
    extends typings.typesettable.svgMod.SvgUtils
  /* static members */
  object SvgUtils {
    
    @JSImport("typesettable/build/src/contexts", "SvgUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable/build/src/contexts", "SvgUtils.SVG_NS")
    @js.native
    def SVG_NS: String = js.native
    inline def SVG_NS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SVG_NS")(x.asInstanceOf[js.Any])
    
    /**
      * Appends an SVG element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    inline def append(element: Element, tagName: String, classNames: String*): SVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("append")((List(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).`++`(classNames.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[SVGElement]
    
    /**
      * Creates and returns a new SVGElement with the attached classnames.
      */
    inline def create(tagName: String, classNames: String*): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(List(tagName.asInstanceOf[js.Any]).`++`(classNames.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SVGElement]
    
    /**
      * Returns the width/height of svg element's bounding box
      */
    inline def getDimensions(element: SVGGraphicsElement): IDimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[IDimensions]
  }
  
  trait IPenFactoryContext[T] extends StObject {
    
    def createPen(text: String, transform: ITransform): IPen
    def createPen(text: String, transform: ITransform, container: T): IPen
    @JSName("createPen")
    var createPen_Original: IPenFactory[T]
  }
  object IPenFactoryContext {
    
    inline def apply[T](createPen: (/* text */ String, /* transform */ ITransform, /* container */ js.UndefOr[T]) => IPen): IPenFactoryContext[T] = {
      val __obj = js.Dynamic.literal(createPen = js.Any.fromFunction3(createPen))
      __obj.asInstanceOf[IPenFactoryContext[T]]
    }
    
    extension [Self <: IPenFactoryContext[?], T](x: Self & IPenFactoryContext[T]) {
      
      inline def setCreatePen(value: (/* text */ String, /* transform */ ITransform, /* container */ js.UndefOr[T]) => IPen): Self = StObject.set(x, "createPen", js.Any.fromFunction3(value))
    }
  }
  
  trait IRulerFactoryContext extends StObject {
    
    def createRuler(): IRuler
    @JSName("createRuler")
    var createRuler_Original: IRulerFactory
  }
  object IRulerFactoryContext {
    
    inline def apply(createRuler: () => IRuler): IRulerFactoryContext = {
      val __obj = js.Dynamic.literal(createRuler = js.Any.fromFunction0(createRuler))
      __obj.asInstanceOf[IRulerFactoryContext]
    }
    
    extension [Self <: IRulerFactoryContext](x: Self) {
      
      inline def setCreateRuler(value: () => IRuler): Self = StObject.set(x, "createRuler", js.Any.fromFunction0(value))
    }
  }
  
  trait ITypesetterContext[T]
    extends StObject
       with IPenFactoryContext[T]
       with IRulerFactoryContext
  object ITypesetterContext {
    
    inline def apply[T](
      createPen: (/* text */ String, /* transform */ ITransform, /* container */ js.UndefOr[T]) => IPen,
      createRuler: () => IRuler
    ): ITypesetterContext[T] = {
      val __obj = js.Dynamic.literal(createPen = js.Any.fromFunction3(createPen), createRuler = js.Any.fromFunction0(createRuler))
      __obj.asInstanceOf[ITypesetterContext[T]]
    }
  }
}

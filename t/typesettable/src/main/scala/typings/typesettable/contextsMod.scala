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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextsMod {
  
  @JSImport("typesettable/build/src/contexts", "CanvasContext")
  @js.native
  class CanvasContext protected ()
    extends typings.typesettable.canvasMod.CanvasContext {
    def this(ctx: CanvasRenderingContext2D) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: js.UndefOr[scala.Nothing], style: ICanvasFontStyle) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
  }
  
  @JSImport("typesettable/build/src/contexts", "HtmlContext")
  @js.native
  class HtmlContext protected ()
    extends typings.typesettable.htmlMod.HtmlContext {
    /**
      * @param element - The CSS font styles applied to `element` will determine the
      * size of text measurements. Also the default text block container.
      * @param className - added to new text blocks
      * @param addTitle - enable title attribute to be added to new text blocks.
      */
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, className: String) = this()
    def this(element: HTMLElement, className: js.UndefOr[scala.Nothing], addTitle: Boolean) = this()
    def this(element: HTMLElement, className: String, addTitle: Boolean) = this()
  }
  
  @JSImport("typesettable/build/src/contexts", "HtmlUtils")
  @js.native
  class HtmlUtils ()
    extends typings.typesettable.htmlMod.HtmlUtils
  /* static members */
  object HtmlUtils {
    
    /**
      * Adds the variadic classnames to the Element
      */
    @JSImport("typesettable/build/src/contexts", "HtmlUtils.addClasses")
    @js.native
    def addClasses(element: Element, classNames: String*): Unit = js.native
    
    /**
      * Appends an HTML element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    @JSImport("typesettable/build/src/contexts", "HtmlUtils.append")
    @js.native
    def append(element: Element, tagName: String, classNames: String*): HTMLElement = js.native
    
    /**
      * Creates and returns a new HTMLElement with the attached classnames.
      */
    @JSImport("typesettable/build/src/contexts", "HtmlUtils.create")
    @js.native
    def create(tagName: String, classNames: String*): HTMLElement = js.native
    
    /**
      * Returns the width/height of HTMLElement's bounding box
      */
    @JSImport("typesettable/build/src/contexts", "HtmlUtils.getDimensions")
    @js.native
    def getDimensions(element: HTMLElement): IDimensions = js.native
  }
  
  @JSImport("typesettable/build/src/contexts", "SvgContext")
  @js.native
  class SvgContext protected ()
    extends typings.typesettable.svgMod.SvgContext {
    def this(element: SVGElement) = this()
    def this(element: SVGElement, className: String) = this()
    def this(element: SVGElement, className: js.UndefOr[scala.Nothing], addTitleElement: Boolean) = this()
    def this(element: SVGElement, className: String, addTitleElement: Boolean) = this()
  }
  /* static members */
  object SvgContext {
    
    @JSImport("typesettable/build/src/contexts", "SvgContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable/build/src/contexts", "SvgContext.AnchorMap")
    @js.native
    def AnchorMap: js.Any = js.native
    @scala.inline
    def AnchorMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnchorMap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typesettable/build/src/contexts", "SvgUtils")
  @js.native
  class SvgUtils ()
    extends typings.typesettable.svgMod.SvgUtils
  /* static members */
  object SvgUtils {
    
    @JSImport("typesettable/build/src/contexts", "SvgUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable/build/src/contexts", "SvgUtils.SVG_NS")
    @js.native
    def SVG_NS: String = js.native
    @scala.inline
    def SVG_NS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SVG_NS")(x.asInstanceOf[js.Any])
    
    /**
      * Appends an SVG element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    @JSImport("typesettable/build/src/contexts", "SvgUtils.append")
    @js.native
    def append(element: Element, tagName: String, classNames: String*): SVGElement = js.native
    
    /**
      * Creates and returns a new SVGElement with the attached classnames.
      */
    @JSImport("typesettable/build/src/contexts", "SvgUtils.create")
    @js.native
    def create(tagName: String, classNames: String*): SVGElement = js.native
    
    /**
      * Returns the width/height of svg element's bounding box
      */
    @JSImport("typesettable/build/src/contexts", "SvgUtils.getDimensions")
    @js.native
    def getDimensions(element: SVGGraphicsElement): IDimensions = js.native
  }
  
  @js.native
  trait IPenFactoryContext[T] extends StObject {
    
    def createPen(text: String, transform: ITransform): IPen = js.native
    def createPen(text: String, transform: ITransform, container: T): IPen = js.native
    @JSName("createPen")
    var createPen_Original: IPenFactory[T] = js.native
  }
  
  @js.native
  trait IRulerFactoryContext extends StObject {
    
    def createRuler(): IRuler = js.native
    @JSName("createRuler")
    var createRuler_Original: IRulerFactory = js.native
  }
  
  @js.native
  trait ITypesetterContext[T]
    extends IPenFactoryContext[T]
       with IRulerFactoryContext
}

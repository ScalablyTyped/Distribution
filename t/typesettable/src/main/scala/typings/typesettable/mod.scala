package typings.typesettable

import typings.std.CanvasRenderingContext2D
import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGElement
import typings.std.SVGGraphicsElement
import typings.typesettable.abstractMeasurerMod.IDimensions
import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.anon.KinIXAlignnumber
import typings.typesettable.anon.KinIYAlignnumber
import typings.typesettable.canvasMod.ICanvasFontStyle
import typings.typesettable.contextsMod.IPenFactoryContext
import typings.typesettable.contextsMod.IRulerFactoryContext
import typings.typesettable.contextsMod.ITypesetterContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typesettable", "AbstractMeasurer")
  @js.native
  open class AbstractMeasurer protected ()
    extends typings.typesettable.measurersMod.AbstractMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
  }
  /* static members */
  object AbstractMeasurer {
    
    @JSImport("typesettable", "AbstractMeasurer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A string representing the full ascender/descender range of your text.
      *
      * Note that this is really only applicable to western alphabets. If you are
      * using a different locale language such as arabic or chinese, you may want
      * to override this.
      */
    @JSImport("typesettable", "AbstractMeasurer.HEIGHT_TEXT")
    @js.native
    def HEIGHT_TEXT: String = js.native
    inline def HEIGHT_TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHT_TEXT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typesettable", "Cache")
  @js.native
  open class Cache[T] protected ()
    extends typings.typesettable.utilsMod.Cache[T] {
    /**
      * @constructor
      *
      * @param {string} compute The function whose results will be cached.
      */
    def this(compute: js.Function1[/* k */ String, T]) = this()
  }
  
  @JSImport("typesettable", "CacheCharacterMeasurer")
  @js.native
  open class CacheCharacterMeasurer protected ()
    extends typings.typesettable.measurersMod.CacheCharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
  
  @JSImport("typesettable", "CacheMeasurer")
  @js.native
  open class CacheMeasurer protected ()
    extends typings.typesettable.measurersMod.CacheMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
  }
  
  @JSImport("typesettable", "CanvasContext")
  @js.native
  open class CanvasContext protected ()
    extends typings.typesettable.contextsMod.CanvasContext {
    def this(ctx: CanvasRenderingContext2D) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Unit, style: ICanvasFontStyle) = this()
  }
  
  @JSImport("typesettable", "CharacterMeasurer")
  @js.native
  open class CharacterMeasurer protected ()
    extends typings.typesettable.measurersMod.CharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
  
  @JSImport("typesettable", "HtmlContext")
  @js.native
  open class HtmlContext protected ()
    extends typings.typesettable.contextsMod.HtmlContext {
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
  
  @JSImport("typesettable", "HtmlUtils")
  @js.native
  open class HtmlUtils ()
    extends typings.typesettable.contextsMod.HtmlUtils
  /* static members */
  object HtmlUtils {
    
    @JSImport("typesettable", "HtmlUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds the variadic classnames to the Element
      */
    inline def addClasses(element: Element, classNames: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addClasses")(scala.List(element.asInstanceOf[js.Any]).`++`(classNames.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    /**
      * Appends an HTML element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    inline def append(element: Element, tagName: String, classNames: String*): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("append")((scala.List(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).`++`(classNames.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[HTMLElement]
    
    /**
      * Creates and returns a new HTMLElement with the attached classnames.
      */
    inline def create(tagName: String, classNames: String*): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scala.List(tagName.asInstanceOf[js.Any]).`++`(classNames.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HTMLElement]
    
    /**
      * Returns the width/height of HTMLElement's bounding box
      */
    inline def getDimensions(element: HTMLElement): IDimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[IDimensions]
  }
  
  @JSImport("typesettable", "Measurer")
  @js.native
  open class Measurer protected ()
    extends typings.typesettable.measurersMod.Measurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
  
  @JSImport("typesettable", "Methods")
  @js.native
  open class Methods ()
    extends typings.typesettable.utilsMod.Methods
  /* static members */
  object Methods {
    
    @JSImport("typesettable", "Methods")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Check if two arrays are equal by strict equality.
      */
    inline def arrayEq[T](a: js.Array[T], b: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Shim for _.defaults
      */
    inline def defaults(target: Any, objects: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(scala.List(target.asInstanceOf[js.Any]).`++`(objects.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    /**
      * @param {any} a Object to check against b for equality.
      * @param {any} b Object to check against a for equality.
      *
      * @returns {boolean} whether or not two objects share the same keys, and
      *          values associated with those keys. Values will be compared
      *          with ===.
      */
    inline def objEq(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("objEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def strictEq(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("typesettable", "SingleLineWrapper")
  @js.native
  open class SingleLineWrapper ()
    extends typings.typesettable.wrappersMod.SingleLineWrapper
  /* static members */
  object SingleLineWrapper {
    
    @JSImport("typesettable", "SingleLineWrapper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable", "SingleLineWrapper.NO_WRAP_ITERATIONS")
    @js.native
    def NO_WRAP_ITERATIONS: Any = js.native
    inline def NO_WRAP_ITERATIONS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_WRAP_ITERATIONS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typesettable", "StringMethods")
  @js.native
  open class StringMethods ()
    extends typings.typesettable.utilsMod.StringMethods
  /* static members */
  object StringMethods {
    
    @JSImport("typesettable", "StringMethods")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Treat all sequences of consecutive spaces as a single " ".
      */
    inline def combineWhitespace(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("combineWhitespace")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isNotEmptyString(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmptyString")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def trimEnd(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimEnd")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def trimEnd(str: String, c: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimEnd")(str.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def trimStart(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimStart")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def trimStart(str: String, splitter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimStart")(str.asInstanceOf[js.Any], splitter.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("typesettable", "SvgContext")
  @js.native
  open class SvgContext protected ()
    extends typings.typesettable.contextsMod.SvgContext {
    def this(element: SVGElement) = this()
    def this(element: SVGElement, className: String) = this()
    def this(element: SVGElement, className: String, addTitleElement: Boolean) = this()
    def this(element: SVGElement, className: Unit, addTitleElement: Boolean) = this()
  }
  /* static members */
  object SvgContext {
    
    @JSImport("typesettable", "SvgContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable", "SvgContext.AnchorMap")
    @js.native
    def AnchorMap: Any = js.native
    inline def AnchorMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnchorMap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typesettable", "SvgUtils")
  @js.native
  open class SvgUtils ()
    extends typings.typesettable.contextsMod.SvgUtils
  /* static members */
  object SvgUtils {
    
    @JSImport("typesettable", "SvgUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable", "SvgUtils.SVG_NS")
    @js.native
    def SVG_NS: String = js.native
    inline def SVG_NS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SVG_NS")(x.asInstanceOf[js.Any])
    
    /**
      * Appends an SVG element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    inline def append(element: Element, tagName: String, classNames: String*): SVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("append")((scala.List(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).`++`(classNames.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[SVGElement]
    
    /**
      * Creates and returns a new SVGElement with the attached classnames.
      */
    inline def create(tagName: String, classNames: String*): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scala.List(tagName.asInstanceOf[js.Any]).`++`(classNames.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SVGElement]
    
    /**
      * Returns the width/height of svg element's bounding box
      */
    inline def getDimensions(element: SVGGraphicsElement): IDimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[IDimensions]
  }
  
  @JSImport("typesettable", "Tokenizer")
  @js.native
  open class Tokenizer ()
    extends typings.typesettable.utilsMod.Tokenizer
  
  @JSImport("typesettable", "Typesetter")
  @js.native
  open class Typesetter protected ()
    extends typings.typesettable.typesetterMod.Typesetter {
    def this(context: ITypesetterContext[Any]) = this()
  }
  /* static members */
  object Typesetter {
    
    @JSImport("typesettable", "Typesetter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def canvas(ctx: CanvasRenderingContext2D): typings.typesettable.typesetterMod.Typesetter = ^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(ctx.asInstanceOf[js.Any]).asInstanceOf[typings.typesettable.typesetterMod.Typesetter]
    inline def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double): typings.typesettable.typesetterMod.Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(ctx.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any])).asInstanceOf[typings.typesettable.typesetterMod.Typesetter]
    inline def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle): typings.typesettable.typesetterMod.Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(ctx.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typings.typesettable.typesetterMod.Typesetter]
    inline def canvas(ctx: CanvasRenderingContext2D, lineHeight: Unit, style: ICanvasFontStyle): typings.typesettable.typesetterMod.Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(ctx.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typings.typesettable.typesetterMod.Typesetter]
    
    inline def html(element: HTMLElement): typings.typesettable.typesetterMod.Typesetter = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(element.asInstanceOf[js.Any]).asInstanceOf[typings.typesettable.typesetterMod.Typesetter]
    inline def html(element: HTMLElement, className: String): typings.typesettable.typesetterMod.Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[typings.typesettable.typesetterMod.Typesetter]
    inline def html(element: HTMLElement, className: String, addTitle: Boolean): typings.typesettable.typesetterMod.Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], addTitle.asInstanceOf[js.Any])).asInstanceOf[typings.typesettable.typesetterMod.Typesetter]
    inline def html(element: HTMLElement, className: Unit, addTitle: Boolean): typings.typesettable.typesetterMod.Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], addTitle.asInstanceOf[js.Any])).asInstanceOf[typings.typesettable.typesetterMod.Typesetter]
    
    inline def svg(element: SVGElement): typings.typesettable.typesetterMod.Typesetter = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")(element.asInstanceOf[js.Any]).asInstanceOf[typings.typesettable.typesetterMod.Typesetter]
    inline def svg(element: SVGElement, className: String): typings.typesettable.typesetterMod.Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("svg")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[typings.typesettable.typesetterMod.Typesetter]
    inline def svg(element: SVGElement, className: String, addTitleElement: Boolean): typings.typesettable.typesetterMod.Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("svg")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], addTitleElement.asInstanceOf[js.Any])).asInstanceOf[typings.typesettable.typesetterMod.Typesetter]
    inline def svg(element: SVGElement, className: Unit, addTitleElement: Boolean): typings.typesettable.typesetterMod.Typesetter = (^.asInstanceOf[js.Dynamic].applyDynamic("svg")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], addTitleElement.asInstanceOf[js.Any])).asInstanceOf[typings.typesettable.typesetterMod.Typesetter]
  }
  
  @JSImport("typesettable", "Wrapper")
  @js.native
  open class Wrapper ()
    extends typings.typesettable.wrappersMod.Wrapper
  
  @JSImport("typesettable", "Writer")
  @js.native
  open class Writer protected ()
    extends typings.typesettable.writersMod.Writer {
    def this(
      _measurer: typings.typesettable.measurersMod.AbstractMeasurer,
      _penFactory: IPenFactoryContext[Any]
    ) = this()
    def this(
      _measurer: typings.typesettable.measurersMod.AbstractMeasurer,
      _penFactory: IPenFactoryContext[Any],
      _wrapper: typings.typesettable.wrappersMod.Wrapper
    ) = this()
  }
  /* static members */
  object Writer {
    
    @JSImport("typesettable", "Writer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable", "Writer.SupportedRotation")
    @js.native
    def SupportedRotation: Any = js.native
    inline def SupportedRotation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SupportedRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("typesettable", "Writer.XOffsetFactor")
    @js.native
    def XOffsetFactor: KinIXAlignnumber = js.native
    inline def XOffsetFactor_=(x: KinIXAlignnumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XOffsetFactor")(x.asInstanceOf[js.Any])
    
    @JSImport("typesettable", "Writer.YOffsetFactor")
    @js.native
    def YOffsetFactor: KinIYAlignnumber = js.native
    inline def YOffsetFactor_=(x: KinIYAlignnumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YOffsetFactor")(x.asInstanceOf[js.Any])
  }
}

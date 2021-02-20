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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typesettable", "AbstractMeasurer")
  @js.native
  class AbstractMeasurer protected ()
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
    @scala.inline
    def HEIGHT_TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHT_TEXT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typesettable", "Cache")
  @js.native
  class Cache[T] protected ()
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
  class CacheCharacterMeasurer protected ()
    extends typings.typesettable.measurersMod.CacheCharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
  
  @JSImport("typesettable", "CacheMeasurer")
  @js.native
  class CacheMeasurer protected ()
    extends typings.typesettable.measurersMod.CacheMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
  }
  
  @JSImport("typesettable", "CanvasContext")
  @js.native
  class CanvasContext protected ()
    extends typings.typesettable.contextsMod.CanvasContext {
    def this(ctx: CanvasRenderingContext2D) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: js.UndefOr[scala.Nothing], style: ICanvasFontStyle) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
  }
  
  @JSImport("typesettable", "CharacterMeasurer")
  @js.native
  class CharacterMeasurer protected ()
    extends typings.typesettable.measurersMod.CharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
  
  @JSImport("typesettable", "HtmlContext")
  @js.native
  class HtmlContext protected ()
    extends typings.typesettable.contextsMod.HtmlContext {
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
  
  @JSImport("typesettable", "HtmlUtils")
  @js.native
  class HtmlUtils ()
    extends typings.typesettable.contextsMod.HtmlUtils
  /* static members */
  object HtmlUtils {
    
    /**
      * Adds the variadic classnames to the Element
      */
    @JSImport("typesettable", "HtmlUtils.addClasses")
    @js.native
    def addClasses(element: Element, classNames: String*): Unit = js.native
    
    /**
      * Appends an HTML element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    @JSImport("typesettable", "HtmlUtils.append")
    @js.native
    def append(element: Element, tagName: String, classNames: String*): HTMLElement = js.native
    
    /**
      * Creates and returns a new HTMLElement with the attached classnames.
      */
    @JSImport("typesettable", "HtmlUtils.create")
    @js.native
    def create(tagName: String, classNames: String*): HTMLElement = js.native
    
    /**
      * Returns the width/height of HTMLElement's bounding box
      */
    @JSImport("typesettable", "HtmlUtils.getDimensions")
    @js.native
    def getDimensions(element: HTMLElement): IDimensions = js.native
  }
  
  @JSImport("typesettable", "Measurer")
  @js.native
  class Measurer protected ()
    extends typings.typesettable.measurersMod.Measurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
  
  @JSImport("typesettable", "Methods")
  @js.native
  class Methods ()
    extends typings.typesettable.utilsMod.Methods
  /* static members */
  object Methods {
    
    /**
      * Check if two arrays are equal by strict equality.
      */
    @JSImport("typesettable", "Methods.arrayEq")
    @js.native
    def arrayEq[T](a: js.Array[T], b: js.Array[T]): Boolean = js.native
    
    /**
      * Shim for _.defaults
      */
    @JSImport("typesettable", "Methods.defaults")
    @js.native
    def defaults(target: js.Any, objects: js.Any*): js.Any = js.native
    
    /**
      * @param {any} a Object to check against b for equality.
      * @param {any} b Object to check against a for equality.
      *
      * @returns {boolean} whether or not two objects share the same keys, and
      *          values associated with those keys. Values will be compared
      *          with ===.
      */
    @JSImport("typesettable", "Methods.objEq")
    @js.native
    def objEq(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSImport("typesettable", "Methods.strictEq")
    @js.native
    def strictEq(a: js.Any, b: js.Any): Boolean = js.native
  }
  
  @JSImport("typesettable", "SingleLineWrapper")
  @js.native
  class SingleLineWrapper ()
    extends typings.typesettable.wrappersMod.SingleLineWrapper
  /* static members */
  object SingleLineWrapper {
    
    @JSImport("typesettable", "SingleLineWrapper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable", "SingleLineWrapper.NO_WRAP_ITERATIONS")
    @js.native
    def NO_WRAP_ITERATIONS: js.Any = js.native
    @scala.inline
    def NO_WRAP_ITERATIONS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_WRAP_ITERATIONS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typesettable", "StringMethods")
  @js.native
  class StringMethods ()
    extends typings.typesettable.utilsMod.StringMethods
  /* static members */
  object StringMethods {
    
    /**
      * Treat all sequences of consecutive spaces as a single " ".
      */
    @JSImport("typesettable", "StringMethods.combineWhitespace")
    @js.native
    def combineWhitespace(str: String): String = js.native
    
    @JSImport("typesettable", "StringMethods.isNotEmptyString")
    @js.native
    def isNotEmptyString(str: String): Boolean = js.native
    
    @JSImport("typesettable", "StringMethods.trimEnd")
    @js.native
    def trimEnd(str: String): String = js.native
    @JSImport("typesettable", "StringMethods.trimEnd")
    @js.native
    def trimEnd(str: String, c: String): String = js.native
    
    @JSImport("typesettable", "StringMethods.trimStart")
    @js.native
    def trimStart(str: String): String = js.native
    @JSImport("typesettable", "StringMethods.trimStart")
    @js.native
    def trimStart(str: String, splitter: String): String = js.native
  }
  
  @JSImport("typesettable", "SvgContext")
  @js.native
  class SvgContext protected ()
    extends typings.typesettable.contextsMod.SvgContext {
    def this(element: SVGElement) = this()
    def this(element: SVGElement, className: String) = this()
    def this(element: SVGElement, className: js.UndefOr[scala.Nothing], addTitleElement: Boolean) = this()
    def this(element: SVGElement, className: String, addTitleElement: Boolean) = this()
  }
  /* static members */
  object SvgContext {
    
    @JSImport("typesettable", "SvgContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable", "SvgContext.AnchorMap")
    @js.native
    def AnchorMap: js.Any = js.native
    @scala.inline
    def AnchorMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnchorMap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typesettable", "SvgUtils")
  @js.native
  class SvgUtils ()
    extends typings.typesettable.contextsMod.SvgUtils
  /* static members */
  object SvgUtils {
    
    @JSImport("typesettable", "SvgUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable", "SvgUtils.SVG_NS")
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
    @JSImport("typesettable", "SvgUtils.append")
    @js.native
    def append(element: Element, tagName: String, classNames: String*): SVGElement = js.native
    
    /**
      * Creates and returns a new SVGElement with the attached classnames.
      */
    @JSImport("typesettable", "SvgUtils.create")
    @js.native
    def create(tagName: String, classNames: String*): SVGElement = js.native
    
    /**
      * Returns the width/height of svg element's bounding box
      */
    @JSImport("typesettable", "SvgUtils.getDimensions")
    @js.native
    def getDimensions(element: SVGGraphicsElement): IDimensions = js.native
  }
  
  @JSImport("typesettable", "Tokenizer")
  @js.native
  class Tokenizer ()
    extends typings.typesettable.utilsMod.Tokenizer
  
  @JSImport("typesettable", "Typesetter")
  @js.native
  class Typesetter protected ()
    extends typings.typesettable.typesetterMod.Typesetter {
    def this(context: ITypesetterContext[_]) = this()
  }
  /* static members */
  object Typesetter {
    
    @JSImport("typesettable", "Typesetter.canvas")
    @js.native
    def canvas(ctx: CanvasRenderingContext2D): typings.typesettable.typesetterMod.Typesetter = js.native
    @JSImport("typesettable", "Typesetter.canvas")
    @js.native
    def canvas(ctx: CanvasRenderingContext2D, lineHeight: js.UndefOr[scala.Nothing], style: ICanvasFontStyle): typings.typesettable.typesetterMod.Typesetter = js.native
    @JSImport("typesettable", "Typesetter.canvas")
    @js.native
    def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double): typings.typesettable.typesetterMod.Typesetter = js.native
    @JSImport("typesettable", "Typesetter.canvas")
    @js.native
    def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle): typings.typesettable.typesetterMod.Typesetter = js.native
    
    @JSImport("typesettable", "Typesetter.html")
    @js.native
    def html(element: HTMLElement): typings.typesettable.typesetterMod.Typesetter = js.native
    @JSImport("typesettable", "Typesetter.html")
    @js.native
    def html(element: HTMLElement, className: js.UndefOr[scala.Nothing], addTitle: Boolean): typings.typesettable.typesetterMod.Typesetter = js.native
    @JSImport("typesettable", "Typesetter.html")
    @js.native
    def html(element: HTMLElement, className: String): typings.typesettable.typesetterMod.Typesetter = js.native
    @JSImport("typesettable", "Typesetter.html")
    @js.native
    def html(element: HTMLElement, className: String, addTitle: Boolean): typings.typesettable.typesetterMod.Typesetter = js.native
    
    @JSImport("typesettable", "Typesetter.svg")
    @js.native
    def svg(element: SVGElement): typings.typesettable.typesetterMod.Typesetter = js.native
    @JSImport("typesettable", "Typesetter.svg")
    @js.native
    def svg(element: SVGElement, className: js.UndefOr[scala.Nothing], addTitleElement: Boolean): typings.typesettable.typesetterMod.Typesetter = js.native
    @JSImport("typesettable", "Typesetter.svg")
    @js.native
    def svg(element: SVGElement, className: String): typings.typesettable.typesetterMod.Typesetter = js.native
    @JSImport("typesettable", "Typesetter.svg")
    @js.native
    def svg(element: SVGElement, className: String, addTitleElement: Boolean): typings.typesettable.typesetterMod.Typesetter = js.native
  }
  
  @JSImport("typesettable", "Wrapper")
  @js.native
  class Wrapper ()
    extends typings.typesettable.wrappersMod.Wrapper
  
  @JSImport("typesettable", "Writer")
  @js.native
  class Writer protected ()
    extends typings.typesettable.writersMod.Writer {
    def this(_measurer: typings.typesettable.measurersMod.AbstractMeasurer, _penFactory: IPenFactoryContext[_]) = this()
    def this(
      _measurer: typings.typesettable.measurersMod.AbstractMeasurer,
      _penFactory: IPenFactoryContext[_],
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
    def SupportedRotation: js.Any = js.native
    @scala.inline
    def SupportedRotation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SupportedRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("typesettable", "Writer.XOffsetFactor")
    @js.native
    def XOffsetFactor: KinIXAlignnumber = js.native
    @scala.inline
    def XOffsetFactor_=(x: KinIXAlignnumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XOffsetFactor")(x.asInstanceOf[js.Any])
    
    @JSImport("typesettable", "Writer.YOffsetFactor")
    @js.native
    def YOffsetFactor: KinIYAlignnumber = js.native
    @scala.inline
    def YOffsetFactor_=(x: KinIYAlignnumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YOffsetFactor")(x.asInstanceOf[js.Any])
  }
}

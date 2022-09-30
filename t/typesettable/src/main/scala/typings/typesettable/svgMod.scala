package typings.typesettable

import typings.std.Element
import typings.std.SVGElement
import typings.std.SVGGraphicsElement
import typings.typesettable.abstractMeasurerMod.IDimensions
import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.abstractMeasurerMod.IRulerFactory
import typings.typesettable.anon.Write
import typings.typesettable.contextsMod.ITypesetterContext
import typings.typesettable.writerMod.IPen
import typings.typesettable.writerMod.IPenFactory
import typings.typesettable.writerMod.ITransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgMod {
  
  @JSImport("typesettable/build/src/contexts/svg", "SvgContext")
  @js.native
  open class SvgContext protected ()
    extends StObject
       with ITypesetterContext[SVGElement] {
    def this(element: SVGElement) = this()
    def this(element: SVGElement, className: String) = this()
    def this(element: SVGElement, className: String, addTitleElement: Boolean) = this()
    def this(element: SVGElement, className: Unit, addTitleElement: Boolean) = this()
    
    /* private */ var addTitleElement: Any = js.native
    
    /* private */ var className: Any = js.native
    
    /* CompleteClass */
    override def createPen(text: String, transform: ITransform): IPen = js.native
    /* CompleteClass */
    override def createPen(text: String, transform: ITransform, container: SVGElement): IPen = js.native
    def createPen(text: String, transform: ITransform, element: Element): Write = js.native
    /* CompleteClass */
    @JSName("createPen")
    var createPen_Original: IPenFactory[SVGElement] = js.native
    
    /* CompleteClass */
    override def createRuler(): IRuler = js.native
    /* CompleteClass */
    @JSName("createRuler")
    var createRuler_Original: IRulerFactory = js.native
    
    /* private */ def createSvgLinePen(textBlockGroup: Any): Any = js.native
    
    /* private */ var element: Any = js.native
    
    /* private */ def getTextElements(element: Any): Any = js.native
    
    def setAddTitleElement(addTitleElement: Boolean): Unit = js.native
  }
  /* static members */
  object SvgContext {
    
    @JSImport("typesettable/build/src/contexts/svg", "SvgContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable/build/src/contexts/svg", "SvgContext.AnchorMap")
    @js.native
    def AnchorMap: Any = js.native
    inline def AnchorMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnchorMap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typesettable/build/src/contexts/svg", "SvgUtils")
  @js.native
  open class SvgUtils () extends StObject
  /* static members */
  object SvgUtils {
    
    @JSImport("typesettable/build/src/contexts/svg", "SvgUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable/build/src/contexts/svg", "SvgUtils.SVG_NS")
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.typesettable.typesettableStrings.start
    - typings.typesettable.typesettableStrings.middle
    - typings.typesettable.typesettableStrings.end
  */
  trait IAnchor extends StObject
  object IAnchor {
    
    inline def end: typings.typesettable.typesettableStrings.end = "end".asInstanceOf[typings.typesettable.typesettableStrings.end]
    
    inline def middle: typings.typesettable.typesettableStrings.middle = "middle".asInstanceOf[typings.typesettable.typesettableStrings.middle]
    
    inline def start: typings.typesettable.typesettableStrings.start = "start".asInstanceOf[typings.typesettable.typesettableStrings.start]
  }
}

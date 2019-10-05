package typings.typesettable

import typings.std.Element
import typings.std.SVGElement
import typings.std.SVGGraphicsElement
import typings.typesettable.buildSrcContextsMod.ITypesetterContext
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IDimensions
import typings.typesettable.buildSrcWritersWriterMod.ITransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts/svg", JSImport.Namespace)
@js.native
object buildSrcContextsSvgMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.typesettable.typesettableStrings.start
    - typings.typesettable.typesettableStrings.middle
    - typings.typesettable.typesettableStrings.end
  */
  trait IAnchor extends js.Object
  
  @js.native
  class SvgContext protected () extends ITypesetterContext[SVGElement] {
    def this(element: SVGElement) = this()
    def this(element: SVGElement, className: String) = this()
    def this(element: SVGElement, className: String, addTitleElement: Boolean) = this()
    var addTitleElement: js.Any = js.native
    var className: js.Any = js.native
    var element: js.Any = js.native
    def createPen(text: String, transform: ITransform, element: Element): Anon_Line = js.native
    /* private */ def createSvgLinePen(textBlockGroup: js.Any): js.Any = js.native
    /* private */ def getTextElements(element: js.Any): js.Any = js.native
    def setAddTitleElement(addTitleElement: Boolean): Unit = js.native
  }
  
  @js.native
  class SvgUtils () extends js.Object
  
  /* static members */
  @js.native
  object SvgContext extends js.Object {
    var AnchorMap: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SvgUtils extends js.Object {
    var SVG_NS: String = js.native
    /**
      * Appends an SVG element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    def append(element: Element, tagName: String, classNames: String*): SVGElement = js.native
    /**
      * Creates and returns a new SVGElement with the attached classnames.
      */
    def create(tagName: String, classNames: String*): SVGElement = js.native
    /**
      * Returns the width/height of svg element's bounding box
      */
    def getDimensions(element: SVGGraphicsElement): IDimensions = js.native
  }
  
}


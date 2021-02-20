package typings.typesettable

import typings.std.Element
import typings.std.HTMLElement
import typings.typesettable.abstractMeasurerMod.IDimensions
import typings.typesettable.anon.Write
import typings.typesettable.contextsMod.ITypesetterContext
import typings.typesettable.writerMod.ITransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlMod {
  
  @JSImport("typesettable/build/src/contexts/html", "HtmlContext")
  @js.native
  class HtmlContext protected () extends ITypesetterContext[HTMLElement] {
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
    
    var addTitle: js.Any = js.native
    
    var className: js.Any = js.native
    
    /* private */ def createHtmlLinePen(textBlock: js.Any): js.Any = js.native
    
    def createPen(text: String, transform: ITransform, element: Element): Write = js.native
    
    var element: js.Any = js.native
    
    def setAddTitle(addTitle: Boolean): Unit = js.native
  }
  
  @JSImport("typesettable/build/src/contexts/html", "HtmlUtils")
  @js.native
  class HtmlUtils () extends StObject
  /* static members */
  object HtmlUtils {
    
    /**
      * Adds the variadic classnames to the Element
      */
    @JSImport("typesettable/build/src/contexts/html", "HtmlUtils.addClasses")
    @js.native
    def addClasses(element: Element, classNames: String*): Unit = js.native
    
    /**
      * Appends an HTML element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    @JSImport("typesettable/build/src/contexts/html", "HtmlUtils.append")
    @js.native
    def append(element: Element, tagName: String, classNames: String*): HTMLElement = js.native
    
    /**
      * Creates and returns a new HTMLElement with the attached classnames.
      */
    @JSImport("typesettable/build/src/contexts/html", "HtmlUtils.create")
    @js.native
    def create(tagName: String, classNames: String*): HTMLElement = js.native
    
    /**
      * Returns the width/height of HTMLElement's bounding box
      */
    @JSImport("typesettable/build/src/contexts/html", "HtmlUtils.getDimensions")
    @js.native
    def getDimensions(element: HTMLElement): IDimensions = js.native
  }
}

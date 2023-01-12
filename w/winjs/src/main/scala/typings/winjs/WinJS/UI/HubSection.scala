package typings.winjs.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a section of a Hub.
  **/
trait HubSection extends StObject {
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the HubSection control's content.
    **/
  var contentElement: HTMLElement
  
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this HubSection. Call this method when the HubSection is no longer needed. After calling this method, the HubSection becomes unusable.
    **/
  def dispose(): Unit
  
  /**
    * Gets the DOM element that hosts this HubSection.
    **/
  var element: HTMLElement
  
  /**
    * Gets or sets the header for this HubSection.
    **/
  var header: String
  
  /**
    * Gets a value that specifies whether the header is static.
    **/
  var isHeaderStatic: Boolean
}
object HubSection {
  
  inline def apply(
    contentElement: HTMLElement,
    dispose: () => Unit,
    element: HTMLElement,
    header: String,
    isHeaderStatic: Boolean
  ): HubSection = {
    val __obj = js.Dynamic.literal(contentElement = contentElement.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), element = element.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], isHeaderStatic = isHeaderStatic.asInstanceOf[js.Any])
    __obj.asInstanceOf[HubSection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HubSection] (val x: Self) extends AnyVal {
    
    inline def setContentElement(value: HTMLElement): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setIsHeaderStatic(value: Boolean): Self = StObject.set(x, "isHeaderStatic", value.asInstanceOf[js.Any])
  }
}

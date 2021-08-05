package typings.winjs.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An item within a Pivot control.
  **/
trait PivotItem extends StObject {
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the PivotItem control's content.
    **/
  var contentElement: HTMLElement
  
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this PivotItem. Call this method when the PivotItem is no longer needed. After calling this method, the PivotItem becomes unusable.
    **/
  def dispose(): Unit
  
  /**
    * Gets the DOM element that hosts the PivotItem control.
    **/
  var element: HTMLElement
  
  /**
    * Gets or sets the header for this PivotItem.
    **/
  var header: String
}
object PivotItem {
  
  inline def apply(contentElement: HTMLElement, dispose: () => Unit, element: HTMLElement, header: String): PivotItem = {
    val __obj = js.Dynamic.literal(contentElement = contentElement.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), element = element.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotItem]
  }
  
  extension [Self <: PivotItem](x: Self) {
    
    inline def setContentElement(value: HTMLElement): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}

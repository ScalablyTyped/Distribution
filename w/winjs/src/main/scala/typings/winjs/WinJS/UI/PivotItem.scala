package typings.winjs.WinJS.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An item within a Pivot control.
  **/
trait PivotItem extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the PivotItem control's content.
    **/
  var contentElement: HTMLElement
  /**
    * Gets the DOM element that hosts the PivotItem control.
    **/
  var element: HTMLElement
  /**
    * Gets or sets the header for this PivotItem.
    **/
  var header: String
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this PivotItem. Call this method when the PivotItem is no longer needed. After calling this method, the PivotItem becomes unusable.
    **/
  def dispose(): Unit
}

object PivotItem {
  @scala.inline
  def apply(contentElement: HTMLElement, dispose: () => Unit, element: HTMLElement, header: String): PivotItem = {
    val __obj = js.Dynamic.literal(contentElement = contentElement.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), element = element.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotItem]
  }
}


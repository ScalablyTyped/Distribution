package typings.winjs.WinJS.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a section of a Hub.
  **/
trait HubSection extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the HubSection control's content.
    **/
  var contentElement: HTMLElement
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
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this HubSection. Call this method when the HubSection is no longer needed. After calling this method, the HubSection becomes unusable.
    **/
  def dispose(): Unit
}

object HubSection {
  @scala.inline
  def apply(
    contentElement: HTMLElement,
    dispose: () => Unit,
    element: HTMLElement,
    header: String,
    isHeaderStatic: Boolean
  ): HubSection = {
    val __obj = js.Dynamic.literal(contentElement = contentElement.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), element = element.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], isHeaderStatic = isHeaderStatic.asInstanceOf[js.Any])
    __obj.asInstanceOf[HubSection]
  }
}


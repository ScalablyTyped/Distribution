package typings.winjs.WinJS.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a section of a Hub.
  **/
@js.native
trait HubSection extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the HubSection control's content.
    **/
  var contentElement: HTMLElement = js.native
  /**
    * Gets the DOM element that hosts this HubSection.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets or sets the header for this HubSection.
    **/
  var header: String = js.native
  /**
    * Gets a value that specifies whether the header is static.
    **/
  var isHeaderStatic: Boolean = js.native
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this HubSection. Call this method when the HubSection is no longer needed. After calling this method, the HubSection becomes unusable.
    **/
  def dispose(): Unit = js.native
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
  @scala.inline
  implicit class HubSectionOps[Self <: HubSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentElement(value: HTMLElement): Self = this.set("contentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHeaderStatic(value: Boolean): Self = this.set("isHeaderStatic", value.asInstanceOf[js.Any])
  }
  
}


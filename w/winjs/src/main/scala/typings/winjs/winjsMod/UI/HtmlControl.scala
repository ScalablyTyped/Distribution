package typings.winjs.winjsMod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enables you to include an HTML page dynamically. As part of the constructor, you must include an option indicating the URI of the page.
  **/
@JSImport("winjs", "UI.HtmlControl")
@js.native
//#region Constructors
/**
  * Initializes a new instance of HtmlControl to define a new page control.
  * @constructor
  * @param element The element that hosts the HtmlControl.
  * @param options The options for configuring the page. The uri option is required in order to specify the source document for the content of the page. Other options are the ones used by the WinJS.Pages.render method.
  **/
class HtmlControl ()
  extends typings.winjs.WinJS.UI.HtmlControl {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.HtmlControl")
@js.native
object HtmlControl extends js.Object {
  //#endregion Constructors
  //#region Properties
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}


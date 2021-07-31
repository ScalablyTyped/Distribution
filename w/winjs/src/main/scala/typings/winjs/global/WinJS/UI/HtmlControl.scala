package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables you to include an HTML page dynamically. As part of the constructor, you must include an option indicating the URI of the page.
  **/
@JSGlobal("WinJS.UI.HtmlControl")
@js.native
//#region Constructors
/**
  * Initializes a new instance of HtmlControl to define a new page control.
  * @constructor
  * @param element The element that hosts the HtmlControl.
  * @param options The options for configuring the page. The uri option is required in order to specify the source document for the content of the page. Other options are the ones used by the WinJS.Pages.render method.
  **/
class HtmlControl ()
  extends StObject
     with typings.winjs.WinJS.UI.HtmlControl {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object HtmlControl {
  
  @JSGlobal("WinJS.UI.HtmlControl")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion Constructors
  //#region Properties
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.HtmlControl.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a command to be displayed in a Menu object.
  **/
@JSGlobal("WinJS.UI.MenuCommand")
@js.native
//#region Constructors
/**
  * Creates a new MenuCommand object.
  * @constructor
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new MenuCommand.
  **/
class MenuCommand ()
  extends StObject
     with typings.winjs.WinJS.UI.MenuCommand {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object MenuCommand {
  
  @JSGlobal("WinJS.UI.MenuCommand")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.MenuCommand.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a command in the SplitView Pane.
  **/
@JSGlobal("WinJS.UI.SplitViewCommand")
@js.native
//#region Constructors
/**
  * Creates a new SplitViewCommand.
  * @constructor
  * @param element The DOM element hosts the new SplitViewCommand.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
open class SplitViewCommand ()
  extends StObject
     with typings.winjs.WinJS.UI.SplitViewCommand {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: Any) = this()
  def this(element: HTMLElement, options: Any) = this()
}
object SplitViewCommand {
  
  @JSGlobal("WinJS.UI.SplitViewCommand")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.SplitViewCommand.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

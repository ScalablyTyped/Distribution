package typings.winjs.mod.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A control that lets the user switch an option between two states: on (checked is set to true) and off (checked is set to false).
  **/
@JSImport("winjs", "UI.ToggleSwitch")
@js.native
//#region Constructors
/**
  * Creates a new ToggleSwitch.
  * @constructor
  * @param element The DOM that hosts the control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the change event, add a property named "onchange" to the options object and set its value to the event handler.
  **/
class ToggleSwitch ()
  extends StObject
     with typings.winjs.WinJS.UI.ToggleSwitch {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object ToggleSwitch {
  
  @JSImport("winjs", "UI.ToggleSwitch")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.ToggleSwitch.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

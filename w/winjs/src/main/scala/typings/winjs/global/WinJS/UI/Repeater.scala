package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates HTML from a set of data. Use this control to generate lists of items.
  **/
@JSGlobal("WinJS.UI.Repeater")
@js.native
//#region Constructors
/**
  * Creates a new Repeater control.
  * @constructor
  * @param elemnt The DOM element that will host the new control. The Repeater will create an element if this value is null.
  * @param options An object that contains one or more property/value pairs to apply to the new Repeater. Each property of the options object corresponds to one of the object's properties or events. Event names must begin with "on".
  **/
class Repeater ()
  extends StObject
     with typings.winjs.WinJS.UI.Repeater {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object Repeater {
  
  @JSGlobal("WinJS.UI.Repeater")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.Repeater.isDeclarativeControlContainer")
  @js.native
  def isDeclarativeControlContainer: js.Any = js.native
  inline def isDeclarativeControlContainer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDeclarativeControlContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.Repeater.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays a collection, such as a set of photos, one item at a time.
  **/
@JSGlobal("WinJS.UI.FlipView")
@js.native
//#region Constructors
/**
  * Creates a new FlipView.
  * @param element The DOM element that hosts the control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the pageselected event, add a property named "onpageselected" and set its value to the event handler.
  **/
open class FlipView[T] ()
  extends StObject
     with typings.winjs.WinJS.UI.FlipView[T] {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: Any) = this()
  def this(element: HTMLElement, options: Any) = this()
}
object FlipView {
  
  @JSGlobal("WinJS.UI.FlipView")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Event Name
    **/
  /* static member */
  @JSGlobal("WinJS.UI.FlipView.datasourceCountChangedEvent")
  @js.native
  def datasourceCountChangedEvent: String = js.native
  inline def datasourceCountChangedEvent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datasourceCountChangedEvent")(x.asInstanceOf[js.Any])
  
  /**
    * Event Name
    **/
  /* static member */
  @JSGlobal("WinJS.UI.FlipView.pageCompletedEvent")
  @js.native
  def pageCompletedEvent: String = js.native
  inline def pageCompletedEvent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageCompletedEvent")(x.asInstanceOf[js.Any])
  
  /**
    * Event Name
    **/
  /* static member */
  @JSGlobal("WinJS.UI.FlipView.pageSelectedEvent")
  @js.native
  def pageSelectedEvent: String = js.native
  inline def pageSelectedEvent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageSelectedEvent")(x.asInstanceOf[js.Any])
  
  /**
    * Event Name
    **/
  /* static member */
  @JSGlobal("WinJS.UI.FlipView.pageVisibilityChangedEvent")
  @js.native
  def pageVisibilityChangedEvent: String = js.native
  inline def pageVisibilityChangedEvent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageVisibilityChangedEvent")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.FlipView.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

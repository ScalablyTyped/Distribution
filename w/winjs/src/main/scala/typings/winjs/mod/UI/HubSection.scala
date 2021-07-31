package typings.winjs.mod.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a section of a Hub.
  **/
@JSImport("winjs", "UI.HubSection")
@js.native
//#region Constructors
/**
  * Creates a new HubSection.
  * @constructor
  * @param element The DOM element hosts the new HubSection.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class HubSection ()
  extends StObject
     with typings.winjs.WinJS.UI.HubSection {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the HubSection control's content.
    **/
  /* CompleteClass */
  var contentElement: HTMLElement = js.native
  
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this HubSection. Call this method when the HubSection is no longer needed. After calling this method, the HubSection becomes unusable.
    **/
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Gets the DOM element that hosts this HubSection.
    **/
  /* CompleteClass */
  var element: HTMLElement = js.native
  
  /**
    * Gets or sets the header for this HubSection.
    **/
  /* CompleteClass */
  var header: String = js.native
  
  /**
    * Gets a value that specifies whether the header is static.
    **/
  /* CompleteClass */
  var isHeaderStatic: Boolean = js.native
}
object HubSection {
  
  @JSImport("winjs", "UI.HubSection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  /* static member */
  @JSImport("winjs", "UI.HubSection.isDeclarativeControlContainer")
  @js.native
  def isDeclarativeControlContainer: js.Any = js.native
  @scala.inline
  def isDeclarativeControlContainer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDeclarativeControlContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.HubSection.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

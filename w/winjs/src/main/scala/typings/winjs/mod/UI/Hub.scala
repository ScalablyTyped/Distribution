package typings.winjs.mod.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a hub navigation pattern consisting of sections that can be navigated to. Each section is defined by a HubSection object.
  **/
@JSImport("winjs", "UI.Hub")
@js.native
//#region Constructors
/**
  * Creates a new Hub control.
  * @constructor
  * @param element The DOM element that will host the Hub control.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the contentanimating event, add a property named "oncontentanimating" to the options object and set its value to the event handler.
  **/
class Hub ()
  extends StObject
     with typings.winjs.WinJS.UI.Hub {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object Hub {
  
  @JSImport("winjs", "UI.Hub")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Specifies whether the Hub animation is an entrance animation or a transition animation.
    **/
  /* static member */
  object AnimationType {
    
    @JSImport("winjs", "UI.Hub.AnimationType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The animation plays when the Hub is changing its content.
      **/
    @JSImport("winjs", "UI.Hub.AnimationType.contentTransition")
    @js.native
    def contentTransition: String = js.native
    inline def contentTransition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentTransition")(x.asInstanceOf[js.Any])
    
    /**
      * The animation plays when the Hub is first displayed.
      **/
    @JSImport("winjs", "UI.Hub.AnimationType.entrance")
    @js.native
    def entrance: String = js.native
    inline def entrance_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("entrance")(x.asInstanceOf[js.Any])
    
    /**
      * The animation plays when a section is inserted into the Hub.
      **/
    @JSImport("winjs", "UI.Hub.AnimationType.insert")
    @js.native
    def insert: String = js.native
    inline def insert_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insert")(x.asInstanceOf[js.Any])
    
    /**
      * The animation plays when a section is removed into the Hub.
      **/
    @JSImport("winjs", "UI.Hub.AnimationType.remove")
    @js.native
    def remove: String = js.native
    inline def remove_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Gets the current loading state of the Hub.
    **/
  /* static member */
  object LoadingState {
    
    @JSImport("winjs", "UI.Hub.LoadingState")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * All sections are loaded and animations are complete.
      **/
    @JSImport("winjs", "UI.Hub.LoadingState.complete")
    @js.native
    def complete: String = js.native
    inline def complete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("complete")(x.asInstanceOf[js.Any])
    
    /**
      * The Hub is loading sections.
      **/
    @JSImport("winjs", "UI.Hub.LoadingState.loading")
    @js.native
    def loading: String = js.native
    inline def loading_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loading")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.Hub.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

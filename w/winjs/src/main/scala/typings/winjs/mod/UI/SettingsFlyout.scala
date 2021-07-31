package typings.winjs.mod.UI

import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides users with fast, in-context access to settings that affect the current Windows Store app.
  **/
@JSImport("winjs", "UI.SettingsFlyout")
@js.native
//#region Constructors
/**
  * Creates a new SettingsFlyout object.
  * @constructor
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new SettingsFlyout.
  **/
class SettingsFlyout ()
  extends StObject
     with typings.winjs.WinJS.UI.SettingsFlyout {
  def this(element: HTMLElement) = this()
  def this(element: Unit, options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}
object SettingsFlyout {
  
  @JSImport("winjs", "UI.SettingsFlyout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Loads a fragment of the SettingsFlyout. Your app calls this when the user invokes a settings command and the WinJS.Application.onsettings event occurs.
    * @param e An object that contains information about the event, received from the WinJS.Application.onsettings event. The detail property of this object contains the applicationcommands sub-property that you set to an array of settings commands. You then populate the SettingsFlyout with these commands by a call to populateSettings.
    **/
  /* static member */
  @scala.inline
  def populateSettings(e: CustomEvent[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("populateSettings")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Shows the SettingsPane UI, if hidden, regardless of other state.
    **/
  /* static member */
  @scala.inline
  def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
  
  /**
    * Show the Settings flyout using the Settings element identifier (ID) and the path of the page that contains the Settings element.
    * @param id The ID of the Settings element.
    * @param path The path of the page that contains the Settings element.
    **/
  /* static member */
  @scala.inline
  def showSettings(id: String, path: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showSettings")(id.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.SettingsFlyout.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}

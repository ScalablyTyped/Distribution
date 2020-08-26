package typings.winjs.mod.UI

import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends typings.winjs.WinJS.UI.SettingsFlyout {
  def this(element: HTMLElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.SettingsFlyout")
@js.native
object SettingsFlyout extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
  /**
    * Loads a fragment of the SettingsFlyout. Your app calls this when the user invokes a settings command and the WinJS.Application.onsettings event occurs.
    * @param e An object that contains information about the event, received from the WinJS.Application.onsettings event. The detail property of this object contains the applicationcommands sub-property that you set to an array of settings commands. You then populate the SettingsFlyout with these commands by a call to populateSettings.
    **/
  def populateSettings(e: CustomEvent[_]): Unit = js.native
  /**
    * Shows the SettingsPane UI, if hidden, regardless of other state.
    **/
  def show(): Unit = js.native
  /**
    * Show the Settings flyout using the Settings element identifier (ID) and the path of the page that contains the Settings element.
    * @param id The ID of the Settings element.
    * @param path The path of the page that contains the Settings element.
    **/
  def showSettings(id: String, path: js.Any): Unit = js.native
}


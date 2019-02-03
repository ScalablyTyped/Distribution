package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The entry point to all services provided by the Windows core text APIs and the text input server. This object is associated with an application's UI thread (the thread that CoreWindow runs on). */
@JSGlobal("Windows.UI.Text.Core.CoreTextServicesManager")
@js.native
abstract class CoreTextServicesManager () extends js.Object {
  /** Gets a Language object representing the current input language. */
  var inputLanguage: winrtDashUwpLib.WindowsNs.GlobalizationNs.Language = js.native
  /** Occurs when the current input language has changed. */
  @JSName("oninputlanguagechanged")
  var oninputlanguagechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextServicesManager, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inputlanguagechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.inputlanguagechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextServicesManager, _]
  ): scala.Unit = js.native
  /**
    * Creates a context object used by a text input control to communicate with the text input server. Each text input control must create its own context object.
    * @return A CoreTextEditContext instance, which is the primary object used for communicating with the text input server.
    */
  def createEditContext(): CoreTextEditContext = js.native
  /** Occurs when the current input language has changed. */
  def oninputlanguagechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[CoreTextServicesManager]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_inputlanguagechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.inputlanguagechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CoreTextServicesManager, _]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.UI.Text.Core.CoreTextServicesManager")
@js.native
object CoreTextServicesManager extends js.Object {
  /**
    * Gets the CoreTextServicesManager object for the currently active view.
    * @return A CoreTextServicesManager instance, which can be used to create further objects to support the app's text input scenarios.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs.CoreTextServicesManager = js.native
}


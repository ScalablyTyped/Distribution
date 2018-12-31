package typings
package xrmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object XrmNs {
  /**
    * Client Types for {@link ClientContext.getClient clientContext.getClient()}.
    * @see {@link XrmEnum.Client}
    */
  type Client = xrmLib.xrmLibStrings.Web | xrmLib.xrmLibStrings.Outlook | xrmLib.xrmLibStrings.Mobile | xrmLib.xrmLibStrings.UnifiedServiceDesk
  /**
    * Client States for {@link ClientContext.getClientState clientContext.getClientState()}.
    * @see {@link XrmEnum.ClientState}
    */
  type ClientState = xrmLib.xrmLibStrings.Online | xrmLib.xrmLibStrings.Offline
  /**
    * Display States for setDisplayState() on {@link Controls.ProcessControl.setDisplayState Processes} and {@link Controls.Tab.setDisplayState Tabs}.
    * @see {@link XrmEnum.DisplayState}
    */
  type DisplayState = xrmLib.xrmLibStrings.collapsed | xrmLib.xrmLibStrings.expanded
  /**
    * The {@link Entity.save Entity}'s Save Mode
    * @see {@link XrmEnum.EntitySaveMode}
    * @see {@link Entity}
    * @see {@link Entity.save}
    */
  type EntitySaveMode = xrmLib.xrmLibStrings.saveandclose | xrmLib.xrmLibStrings.saveandnew
  /**
    * Form Notification Levels for {@link Ui.setFormNotification formContext.ui.setFormNotification()}.
    * @see {@link XrmEnum.FormNotificationLevel}
    */
  type FormNotificationLevel = xrmLib.xrmLibStrings.ERROR | xrmLib.xrmLibStrings.INFO | xrmLib.xrmLibStrings.WARNING
  /**
    * Submit Mode for {@link Attributes.Attribute.setSubmitMode} Attributes.Attribute.setSubmitMode().
    * @see {@link XrmEnum.SubmitMode}
    */
  type SubmitMode = xrmLib.xrmLibStrings.always | xrmLib.xrmLibStrings.dirty | xrmLib.xrmLibStrings.never
  /**
    * Themes for {@link GlobalContext.getCurrentTheme globalContext.getCurrentTheme()}.
    * @remarks getCurrentTheme() does not work with Dynamics CRM for tablets or in the unified interface.
    * @see {@link XrmEnum.Theme}
    */
  type Theme = xrmLib.xrmLibStrings.default | xrmLib.xrmLibStrings.Office12Blue | xrmLib.xrmLibStrings.Office14Silver
}

package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uiNs {
  /**
               * Display States for Xrm.ui.ProcessMonitor.setDisplayState().
               * @deprecated Use {@link Xrm.DisplayState} instead.
               */
  type DisplayState = xrmLib.XrmNs.DisplayState
  /**
               * Form Notification Levels for Xrm.Ui.setFormNotification().
               * @deprecated Use {@link Xrm.FormNotificationLevel} instead.
               */
  type FormNotificationLevel = xrmLib.XrmNs.FormNotificationLevel
  /**
               * Interface for Xrm.Page.ui.process API
               * @deprecated Use {@link Xrm.Controls.ProcessControl} instead.
               */
  type ProcessManager = xrmLib.XrmNs.ControlsNs.ProcessControl
  /**
               * Interface for a quick view control instance on a form.
               * @see {@link https://msdn.microsoft.com/en-us/library/mt736908.aspx External Link: Xrm.Page.ui quickForms (client-side reference)}
               * @deprecated Use {@link Xrm.Controls.ViewSelectorItem} instead.
               */
  type QuickForm = xrmLib.XrmNs.ControlsNs.QuickFormControl
}

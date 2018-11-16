package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Interface for Auto Lookup Control.
         * This is not an Entity Lookup, but a control that supports AutoComplete / KeyPress Events (Text or Number)
         * @remarks This interface is not supported for CRM mobile clients (phones or tablets) and the interactive service hub.  It is only available for Updated entities.
         * @deprecated Deprecated in v9.
         * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
         * @see {@link StandardControl}
         */
@js.native
trait AutoLookupControl
  extends StandardControl
     with UiKeyPressable {
  /**
               * Gets the latest value in a control as the user types characters in a specific text or number field.
               * This method helps you to build interactive experiences by validating data and alerting users as they type characters in a control.
               * The getValue method is different from the attribute getValue method because the control method retrieves the value from the control
               * as the user is typing in the control as opposed to the attribute getValue method that retrieves the value after the user commits (saves) the field.
               */
  def getValue(): java.lang.String = js.native
  /**
               * Hides the auto-completion drop-down list configured for a specific text field
               * @deprecated Deprecated in v9.
               * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
               */
  def hideAutoComplete(): scala.Unit = js.native
  /**
               * Shows upt to 10 matching strings in a drop-down list as users press keys to type charactrer in a specific text field.
               * On selecting an item in the drop-down list, the value in the text field changes to the selected item, the drop-down list disappears, and the OnChange event for the text field is invoked
               * @deprecated Deprecated in v9.
               * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
               * @param resultSet The results to show
               */
  def showAutoComplete(resultSet: AutoCompleteResultSet): scala.Unit = js.native
}


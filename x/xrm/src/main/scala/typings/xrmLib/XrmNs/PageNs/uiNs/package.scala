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
    * Interface for a grid.  Use Grid methods to access information about data in the grid. Grid is returned by the
    * GridControl.getGrid method.
    * @deprecated Use {@link Xrm.Controls.Grid} instead.
    */
  type Grid = xrmLib.XrmNs.ControlsNs.Grid
  /**
    * Interface for a grid entity.  Use the GridEntity methods to access data about the specific records in the rows.
    * GridEntity is returned by the GridRowData.getEntity method.
    * @deprecated Use {@link Xrm.Controls.Grid.GridRowData} instead.v
    */
  type GridEntity = xrmLib.XrmNs.ControlsNs.GridNs.GridEntity
  /**
    * Interface for a grid row.  Use the GridRow.getData method to access the GridRowData. A collection of GridRow is
    * returned by Grid.getRows and Grid.getSelectedRows methods.
    * In V9 - this is essentailly a form context.
    * @deprecated Use {@link Xrm.Controls.Grid.GridRow} instead.
    */
  type GridRow = xrmLib.XrmNs.ControlsNs.GridNs.GridRow
  /**
    * Interface for grid row data.  Use the GridRowData.getEntity method to access the GridEntity. GridRowData is
    * returned by the GridRow.getData method.
    * @deprecated Use {@link Xrm.Controls.Grid.GridRowData} instead.
    */
  type GridRowData = xrmLib.XrmNs.ControlsNs.GridNs.GridRowData
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
  /**
    * Interface for the view selector.  Use the ViewSelector methods to get or set information about the view selector
    * of the grid control.
    * @deprecated Use {@link Xrm.Controls.ViewSelector} instead.
    */
  type ViewSelector = xrmLib.XrmNs.ControlsNs.ViewSelector
  /**
    * Interface for a view selector item. This object contains data that identifies a view. Use this as a parameter to
    * the ViewSelector.setCurrentView method.
    * @deprecated Use {@link Xrm.Controls.ViewSelectorItem} instead.
    */
  type ViewSelectorItem = xrmLib.XrmNs.ControlsNs.ViewSelectorItem
}

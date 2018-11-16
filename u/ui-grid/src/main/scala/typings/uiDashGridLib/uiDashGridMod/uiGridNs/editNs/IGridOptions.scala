package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.editNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGridOptions extends js.Object {
  /**
               * If specified, either a value or function to be used by all columns before editing.
               * If falsy, then editing of cell is not allowed
               */
  var cellEditableCondition: js.UndefOr[js.Any | uiDashGridLib.Anon_Scope] = js.undefined
  /**
               * If specified, cellTemplate to use as the editor for all columns.
               * defaults to 'ui-grid/cellTextEditor'
               * @default 'ui-grid/cellTextEditor'
               */
  var editableCellTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
               * If defined, sets the default value for the editable flag on each individual colDefs if their individual
               * enableCellEdit configuration is not defined.
               * Defaults to undefined.
               * @default undefined
               */
  var enableCellEdit: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * If true, then editor is invoked as soon as cell receives focus.
               * Default false.
               * _requires cellNav feature and the edit feature to be enabled_
               * @default false
               */
  var enableCellEditOnFocus: js.UndefOr[scala.Boolean] = js.undefined
}


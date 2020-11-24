package typings.uiGrid.mod.edit

import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridOptions extends js.Object {
  
  /**
    * If specified, either a value or function to be used by all columns before editing.
    * If falsy, then editing of cell is not allowed
    */
  var cellEditableCondition: js.UndefOr[js.Any | (js.Function1[/* $scope */ IScope, Boolean])] = js.native
  
  /**
    * If specified, cellTemplate to use as the editor for all columns.
    * defaults to 'ui-grid/cellTextEditor'
    * @default 'ui-grid/cellTextEditor'
    */
  var editableCellTemplate: js.UndefOr[String] = js.native
  
  /**
    * If defined, sets the default value for the editable flag on each individual colDefs if their individual
    * enableCellEdit configuration is not defined.
    * Defaults to undefined.
    * @default undefined
    */
  var enableCellEdit: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, then editor is invoked as soon as cell receives focus.
    * Default false.
    * _requires cellNav feature and the edit feature to be enabled_
    * @default false
    */
  var enableCellEditOnFocus: js.UndefOr[Boolean] = js.native
}
object IGridOptions {
  
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellEditableConditionFunction1(value: /* $scope */ IScope => Boolean): Self = this.set("cellEditableCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellEditableCondition(value: js.Any | (js.Function1[/* $scope */ IScope, Boolean])): Self = this.set("cellEditableCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellEditableCondition: Self = this.set("cellEditableCondition", js.undefined)
    
    @scala.inline
    def setEditableCellTemplate(value: String): Self = this.set("editableCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditableCellTemplate: Self = this.set("editableCellTemplate", js.undefined)
    
    @scala.inline
    def setEnableCellEdit(value: Boolean): Self = this.set("enableCellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellEdit: Self = this.set("enableCellEdit", js.undefined)
    
    @scala.inline
    def setEnableCellEditOnFocus(value: Boolean): Self = this.set("enableCellEditOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellEditOnFocus: Self = this.set("enableCellEditOnFocus", js.undefined)
  }
}

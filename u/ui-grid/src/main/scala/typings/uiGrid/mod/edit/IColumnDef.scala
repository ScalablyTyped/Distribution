package typings.uiGrid.mod.edit

import typings.angular.mod.IScope
import typings.std.FileList
import typings.uiGrid.mod.IGridColumnOf
import typings.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnDef[TEntity] extends js.Object {
  /**
    * If specified, either a value or function evaluated before editing cell.
    * If falsy, then editing of cell is not allowed.
    */
  var cellEditableCondition: js.UndefOr[js.Any | (js.Function1[/* $scope */ IScope, Boolean])] = js.native
  /** A filter that you would like to apply to the values in the options list of the dropdown */
  var editDropdownFilter: js.UndefOr[String] = js.native
  /** the label for the "id" field in the editDropdownOptionsArray. Defaults to 'id' */
  var editDropdownIdLabel: js.UndefOr[String] = js.native
  /** an array of values in the format [ {id: xxx, value: xxx} ], which is populated into the edit dropdown */
  var editDropdownOptionsArray: js.UndefOr[js.Array[IEditDropdown]] = js.native
  /**
    * a path to a property on row.entity containing an array of values in the format `[{id: xxx, value:
    * xxx}]`,
    * which will be used to populate the edit dropdown.  This can be used when the dropdown values are
    * dependent on the backing row entity.  If this property is set then editDropdownOptionsArray will be
    * ignored.
    */
  var editDropdownRowEntityOptionsArrayPath: js.UndefOr[String] = js.native
  /** the label of the 'value' field in the editDropdownOptionsArray.  Defaults to 'value' */
  var editDropdownValueLabel: js.UndefOr[String] = js.native
  /**
    * A function that should be called when any files have been chosen by the user.
    * You should use this to process the files appropriately for your application.
    *
    * It passes the gridCol, the gridRow (from which you can get gridRow.entity), and the files.
    * The files are in the format as returned from the file chooser, an array of files,
    * with each having useful information such as:
    *
    * * files[0].lastModifiedDate
    * * files[0].name
    * * files[0].size (appears to be in bytes)
    * * files[0].type (MIME type)
    *
    * Typically you would do something with these files.
    * Most commonly you would use the filename or read the file itself in. This example does both:
    * @example
    editFileChooserCallBack: (gridRow, gridCol, files) => {
    // ignore all but the first file, it can only choose one anyway
    // set the filename into this column
    gridRow.entity.filename = file[0].name;
    // read the file and set it into a hidden column, which we may do stuff with later
    var setFile = function(fileContent){
    gridRow.entity.file = fileContent.currentTarget.result;
    };
    var reader = new FileReader();
    reader.onload = setFile;
    reader.readAsText( files[0] );
    }
    */
  var editFileChooserCallback: js.UndefOr[
    js.Function3[
      /* gridRow */ IGridRowOf[TEntity], 
      /* gridCol */ IGridColumnOf[TEntity], 
      /* files */ FileList, 
      Unit
    ]
  ] = js.native
  /**
    * A bindable string value that is used when binding to edit controls instead of colDef.field
    * For example if you have a complex property on an object like:
    * ```typescript
    * state: {abbrev:'MS',name:'Mississippi'}.
    * ```
    * The grid should display `state.name` in the cell and sort/filter based on the state.name property, but
    * the editor requires the full state object. so this let's you bind to that
    * @example
    colDef.field = 'state.name';
    colDef.editModelField = 'state';
    */
  var editModelField: js.UndefOr[String] = js.native
  /**
    * Cell template to be used when editing this column. Can be Url or text template.
    * Defaults to gridOptions.editableCellTemplate
    */
  var editableCellTemplate: js.UndefOr[String] = js.native
  /** Enable editing on a column */
  var enableCellEdit: js.UndefOr[Boolean] = js.native
  /** If true, then editor is invoked as soon as cell receives focus. Default false.
    * _Requires both the cellNav feature and the edit feature to be enabled_
    */
  var enableCellEditOnFocus: js.UndefOr[Boolean] = js.native
}

object IColumnDef {
  @scala.inline
  def apply[TEntity](): IColumnDef[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDef[TEntity]]
  }
  @scala.inline
  implicit class IColumnDefOps[Self <: IColumnDef[_], TEntity] (val x: Self with IColumnDef[TEntity]) extends AnyVal {
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
    def setEditDropdownFilter(value: String): Self = this.set("editDropdownFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditDropdownFilter: Self = this.set("editDropdownFilter", js.undefined)
    @scala.inline
    def setEditDropdownIdLabel(value: String): Self = this.set("editDropdownIdLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditDropdownIdLabel: Self = this.set("editDropdownIdLabel", js.undefined)
    @scala.inline
    def setEditDropdownOptionsArrayVarargs(value: IEditDropdown*): Self = this.set("editDropdownOptionsArray", js.Array(value :_*))
    @scala.inline
    def setEditDropdownOptionsArray(value: js.Array[IEditDropdown]): Self = this.set("editDropdownOptionsArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditDropdownOptionsArray: Self = this.set("editDropdownOptionsArray", js.undefined)
    @scala.inline
    def setEditDropdownRowEntityOptionsArrayPath(value: String): Self = this.set("editDropdownRowEntityOptionsArrayPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditDropdownRowEntityOptionsArrayPath: Self = this.set("editDropdownRowEntityOptionsArrayPath", js.undefined)
    @scala.inline
    def setEditDropdownValueLabel(value: String): Self = this.set("editDropdownValueLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditDropdownValueLabel: Self = this.set("editDropdownValueLabel", js.undefined)
    @scala.inline
    def setEditFileChooserCallback(
      value: (/* gridRow */ IGridRowOf[TEntity], /* gridCol */ IGridColumnOf[TEntity], /* files */ FileList) => Unit
    ): Self = this.set("editFileChooserCallback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteEditFileChooserCallback: Self = this.set("editFileChooserCallback", js.undefined)
    @scala.inline
    def setEditModelField(value: String): Self = this.set("editModelField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditModelField: Self = this.set("editModelField", js.undefined)
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


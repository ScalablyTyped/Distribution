package typings.uiGrid.mod

import typings.angular.JQueryEventObject
import typings.angular.mod.IScope
import typings.std.FileList
import typings.uiGrid.anon.AfterCellEdit
import typings.uiGrid.anon.BEGINCELLEDIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object edit {
  
  trait IColumnDef[TEntity] extends StObject {
    
    /**
      * If specified, either a value or function evaluated before editing cell.
      * If falsy, then editing of cell is not allowed.
      */
    var cellEditableCondition: js.UndefOr[Any | (js.Function1[/* $scope */ IScope, Boolean])] = js.undefined
    
    /** A filter that you would like to apply to the values in the options list of the dropdown */
    var editDropdownFilter: js.UndefOr[String] = js.undefined
    
    /** the label for the "id" field in the editDropdownOptionsArray. Defaults to 'id' */
    var editDropdownIdLabel: js.UndefOr[String] = js.undefined
    
    /** an array of values in the format [ {id: xxx, value: xxx} ], which is populated into the edit dropdown */
    var editDropdownOptionsArray: js.UndefOr[js.Array[IEditDropdown]] = js.undefined
    
    /**
      * a path to a property on row.entity containing an array of values in the format `[{id: xxx, value:
      * xxx}]`,
      * which will be used to populate the edit dropdown.  This can be used when the dropdown values are
      * dependent on the backing row entity.  If this property is set then editDropdownOptionsArray will be
      * ignored.
      */
    var editDropdownRowEntityOptionsArrayPath: js.UndefOr[String] = js.undefined
    
    /** the label of the 'value' field in the editDropdownOptionsArray.  Defaults to 'value' */
    var editDropdownValueLabel: js.UndefOr[String] = js.undefined
    
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
      ] = js.undefined
    
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
    var editModelField: js.UndefOr[String] = js.undefined
    
    /**
      * Cell template to be used when editing this column. Can be Url or text template.
      * Defaults to gridOptions.editableCellTemplate
      */
    var editableCellTemplate: js.UndefOr[String] = js.undefined
    
    /** Enable editing on a column */
    var enableCellEdit: js.UndefOr[Boolean] = js.undefined
    
    /** If true, then editor is invoked as soon as cell receives focus. Default false.
      * _Requires both the cellNav feature and the edit feature to be enabled_
      */
    var enableCellEditOnFocus: js.UndefOr[Boolean] = js.undefined
  }
  object IColumnDef {
    
    inline def apply[TEntity](): typings.uiGrid.mod.edit.IColumnDef[TEntity] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.edit.IColumnDef[TEntity]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.uiGrid.mod.edit.IColumnDef[?], TEntity] (val x: Self & typings.uiGrid.mod.edit.IColumnDef[TEntity]) extends AnyVal {
      
      inline def setCellEditableCondition(value: Any | (js.Function1[/* $scope */ IScope, Boolean])): Self = StObject.set(x, "cellEditableCondition", value.asInstanceOf[js.Any])
      
      inline def setCellEditableConditionFunction1(value: /* $scope */ IScope => Boolean): Self = StObject.set(x, "cellEditableCondition", js.Any.fromFunction1(value))
      
      inline def setCellEditableConditionUndefined: Self = StObject.set(x, "cellEditableCondition", js.undefined)
      
      inline def setEditDropdownFilter(value: String): Self = StObject.set(x, "editDropdownFilter", value.asInstanceOf[js.Any])
      
      inline def setEditDropdownFilterUndefined: Self = StObject.set(x, "editDropdownFilter", js.undefined)
      
      inline def setEditDropdownIdLabel(value: String): Self = StObject.set(x, "editDropdownIdLabel", value.asInstanceOf[js.Any])
      
      inline def setEditDropdownIdLabelUndefined: Self = StObject.set(x, "editDropdownIdLabel", js.undefined)
      
      inline def setEditDropdownOptionsArray(value: js.Array[IEditDropdown]): Self = StObject.set(x, "editDropdownOptionsArray", value.asInstanceOf[js.Any])
      
      inline def setEditDropdownOptionsArrayUndefined: Self = StObject.set(x, "editDropdownOptionsArray", js.undefined)
      
      inline def setEditDropdownOptionsArrayVarargs(value: IEditDropdown*): Self = StObject.set(x, "editDropdownOptionsArray", js.Array(value*))
      
      inline def setEditDropdownRowEntityOptionsArrayPath(value: String): Self = StObject.set(x, "editDropdownRowEntityOptionsArrayPath", value.asInstanceOf[js.Any])
      
      inline def setEditDropdownRowEntityOptionsArrayPathUndefined: Self = StObject.set(x, "editDropdownRowEntityOptionsArrayPath", js.undefined)
      
      inline def setEditDropdownValueLabel(value: String): Self = StObject.set(x, "editDropdownValueLabel", value.asInstanceOf[js.Any])
      
      inline def setEditDropdownValueLabelUndefined: Self = StObject.set(x, "editDropdownValueLabel", js.undefined)
      
      inline def setEditFileChooserCallback(
        value: (/* gridRow */ IGridRowOf[TEntity], /* gridCol */ IGridColumnOf[TEntity], /* files */ FileList) => Unit
      ): Self = StObject.set(x, "editFileChooserCallback", js.Any.fromFunction3(value))
      
      inline def setEditFileChooserCallbackUndefined: Self = StObject.set(x, "editFileChooserCallback", js.undefined)
      
      inline def setEditModelField(value: String): Self = StObject.set(x, "editModelField", value.asInstanceOf[js.Any])
      
      inline def setEditModelFieldUndefined: Self = StObject.set(x, "editModelField", js.undefined)
      
      inline def setEditableCellTemplate(value: String): Self = StObject.set(x, "editableCellTemplate", value.asInstanceOf[js.Any])
      
      inline def setEditableCellTemplateUndefined: Self = StObject.set(x, "editableCellTemplate", js.undefined)
      
      inline def setEnableCellEdit(value: Boolean): Self = StObject.set(x, "enableCellEdit", value.asInstanceOf[js.Any])
      
      inline def setEnableCellEditOnFocus(value: Boolean): Self = StObject.set(x, "enableCellEditOnFocus", value.asInstanceOf[js.Any])
      
      inline def setEnableCellEditOnFocusUndefined: Self = StObject.set(x, "enableCellEditOnFocus", js.undefined)
      
      inline def setEnableCellEditUndefined: Self = StObject.set(x, "enableCellEdit", js.undefined)
    }
  }
  
  trait IEditDropdown extends StObject {
    
    var id: Double | String
    
    var value: Any
  }
  object IEditDropdown {
    
    inline def apply(id: Double | String, value: Any): IEditDropdown = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEditDropdown]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEditDropdown] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGridEditApi[TEntity] extends StObject {
    
    var on: AfterCellEdit[TEntity]
  }
  object IGridEditApi {
    
    inline def apply[TEntity](on: AfterCellEdit[TEntity]): IGridEditApi[TEntity] = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridEditApi[TEntity]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGridEditApi[?], TEntity] (val x: Self & IGridEditApi[TEntity]) extends AnyVal {
      
      inline def setOn(value: AfterCellEdit[TEntity]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGridOptions extends StObject {
    
    /**
      * If specified, either a value or function to be used by all columns before editing.
      * If falsy, then editing of cell is not allowed
      */
    var cellEditableCondition: js.UndefOr[Any | (js.Function1[/* $scope */ IScope, Boolean])] = js.undefined
    
    /**
      * If specified, cellTemplate to use as the editor for all columns.
      * defaults to 'ui-grid/cellTextEditor'
      * @default 'ui-grid/cellTextEditor'
      */
    var editableCellTemplate: js.UndefOr[String] = js.undefined
    
    /**
      * If defined, sets the default value for the editable flag on each individual colDefs if their individual
      * enableCellEdit configuration is not defined.
      * Defaults to undefined.
      * @default undefined
      */
    var enableCellEdit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, then editor is invoked as soon as cell receives focus.
      * Default false.
      * _requires cellNav feature and the edit feature to be enabled_
      * @default false
      */
    var enableCellEditOnFocus: js.UndefOr[Boolean] = js.undefined
  }
  object IGridOptions {
    
    inline def apply(): typings.uiGrid.mod.edit.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.edit.IGridOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.uiGrid.mod.edit.IGridOptions] (val x: Self) extends AnyVal {
      
      inline def setCellEditableCondition(value: Any | (js.Function1[/* $scope */ IScope, Boolean])): Self = StObject.set(x, "cellEditableCondition", value.asInstanceOf[js.Any])
      
      inline def setCellEditableConditionFunction1(value: /* $scope */ IScope => Boolean): Self = StObject.set(x, "cellEditableCondition", js.Any.fromFunction1(value))
      
      inline def setCellEditableConditionUndefined: Self = StObject.set(x, "cellEditableCondition", js.undefined)
      
      inline def setEditableCellTemplate(value: String): Self = StObject.set(x, "editableCellTemplate", value.asInstanceOf[js.Any])
      
      inline def setEditableCellTemplateUndefined: Self = StObject.set(x, "editableCellTemplate", js.undefined)
      
      inline def setEnableCellEdit(value: Boolean): Self = StObject.set(x, "enableCellEdit", value.asInstanceOf[js.Any])
      
      inline def setEnableCellEditOnFocus(value: Boolean): Self = StObject.set(x, "enableCellEditOnFocus", value.asInstanceOf[js.Any])
      
      inline def setEnableCellEditOnFocusUndefined: Self = StObject.set(x, "enableCellEditOnFocus", js.undefined)
      
      inline def setEnableCellEditUndefined: Self = StObject.set(x, "enableCellEdit", js.undefined)
    }
  }
  
  trait IGridRow extends StObject {
    
    /** enable editing on row, grouping for example might disable editing on group header rows */
    var enableCellEdit: js.UndefOr[Boolean] = js.undefined
  }
  object IGridRow {
    
    inline def apply(): typings.uiGrid.mod.edit.IGridRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.edit.IGridRow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.uiGrid.mod.edit.IGridRow] (val x: Self) extends AnyVal {
      
      inline def setEnableCellEdit(value: Boolean): Self = StObject.set(x, "enableCellEdit", value.asInstanceOf[js.Any])
      
      inline def setEnableCellEditUndefined: Self = StObject.set(x, "enableCellEdit", js.undefined)
    }
  }
  
  trait IUiGridEditConstants extends StObject {
    
    var EDITABLE_CELL_DIRECTIVE: String
    
    var EDITABLE_CELL_TEMPLATE: String
    
    var events: BEGINCELLEDIT
  }
  object IUiGridEditConstants {
    
    inline def apply(EDITABLE_CELL_DIRECTIVE: String, EDITABLE_CELL_TEMPLATE: String, events: BEGINCELLEDIT): IUiGridEditConstants = {
      val __obj = js.Dynamic.literal(EDITABLE_CELL_DIRECTIVE = EDITABLE_CELL_DIRECTIVE.asInstanceOf[js.Any], EDITABLE_CELL_TEMPLATE = EDITABLE_CELL_TEMPLATE.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUiGridEditConstants]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IUiGridEditConstants] (val x: Self) extends AnyVal {
      
      inline def setEDITABLE_CELL_DIRECTIVE(value: String): Self = StObject.set(x, "EDITABLE_CELL_DIRECTIVE", value.asInstanceOf[js.Any])
      
      inline def setEDITABLE_CELL_TEMPLATE(value: String): Self = StObject.set(x, "EDITABLE_CELL_TEMPLATE", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: BEGINCELLEDIT): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    }
  }
  
  type afterCellEditHandler[TEntity] = js.Function4[
    /* rowEntity */ TEntity, 
    /* colDef */ IColumnDefOf[TEntity], 
    /* newValue */ Any, 
    /* oldValue */ Any, 
    Unit
  ]
  
  type beginCellEditHandler[TEntity] = js.Function3[
    /* rowEntity */ TEntity, 
    /* colDef */ IColumnDefOf[TEntity], 
    /* triggerEvent */ JQueryEventObject, 
    Unit
  ]
  
  type cancelCellEditHandler[TEntity] = js.Function2[/* rowEntity */ TEntity, /* colDef */ IColumnDefOf[TEntity], Unit]
}

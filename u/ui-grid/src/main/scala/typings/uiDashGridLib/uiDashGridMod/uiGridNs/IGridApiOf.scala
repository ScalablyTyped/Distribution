package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridApiOf[TEntity] extends js.Object {
  /**
           * Cell Nav Api
           */
  var cellNav: uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs.ICellNavApi[TEntity] = js.native
  /**
           * Move Columns Api
           */
  var colMovable: uiDashGridLib.uiDashGridMod.uiGridNs.moveColumnsNs.IGridMoveColumnsApi = js.native
  /**
           * Grid row resizable Api
           */
  var colResizable: uiDashGridLib.uiDashGridMod.uiGridNs.resizeColumnsNs.IGridResizeColumnsApi = js.native
  /**
           * Core Api
           */
  var core: IGridCoreApi[TEntity] = js.native
  /**
           * Edit Api
           */
  var edit: uiDashGridLib.uiDashGridMod.uiGridNs.editNs.IGridEditApi[TEntity] = js.native
  /**
           * Expandable Api
           */
  var expandable: uiDashGridLib.uiDashGridMod.uiGridNs.expandableNs.IGridExpandableApi[TEntity] = js.native
  /**
           * Exporter Api
           */
  var exporter: uiDashGridLib.uiDashGridMod.uiGridNs.exporterNs.IGridExporterApi = js.native
  /**
           * A grid instance is made available in the gridApi.
           */
  var grid: IGridInstanceOf[TEntity] = js.native
  /**
           * Grouping Api
           */
  var grouping: uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs.IGridGroupingApi[TEntity] = js.native
  /**
           * Importer Api
           */
  var importer: uiDashGridLib.uiDashGridMod.uiGridNs.importerNs.IGridImporterApi = js.native
  /**
           * Infinite Scroll Api
           */
  var infiniteScroll: uiDashGridLib.uiDashGridMod.uiGridNs.infiniteScrollNs.IGridInfiniteScrollApi[TEntity] = js.native
  /**
           * Pagination Api
           */
  var pagination: uiDashGridLib.uiDashGridMod.uiGridNs.paginationNs.IGridPaginationApi = js.native
  /**
           * Pinning Api
           */
  var pinning: uiDashGridLib.uiDashGridMod.uiGridNs.pinningNs.IGridPinningApi[TEntity] = js.native
  /**
           * Grid Row Edit Api
           */
  var rowEdit: uiDashGridLib.uiDashGridMod.uiGridNs.rowEditNs.IGridRowEditApi[TEntity] = js.native
  /**
           * Grid Save State Api
           */
  var saveState: uiDashGridLib.uiDashGridMod.uiGridNs.saveStateNs.IGridSaveStateApi = js.native
  /**
           * Selection Api
           */
  var selection: uiDashGridLib.uiDashGridMod.uiGridNs.selectionNs.IGridSelectionApi[TEntity] = js.native
  /**
           * Tree Base Api
           */
  var treeBase: uiDashGridLib.uiDashGridMod.uiGridNs.treeBaseNs.IGridTreeBaseApi[TEntity] = js.native
  /**
           * Registers a new event for the given feature. The event will get a .raise and .on prepended to it
           *
           * .raise.eventName() - takes no arguments
           *
           * .on.eventName(scope, callBackFn, _this)
           * scope - a scope reference to add a deregister call to the scopes .$on('destroy').
           * Scope is optional and can be a null value, but in this case you must deregister it yourself via the returned
           * deregister function
           * callBackFn - The function to call
           * _this - optional this context variable for callbackFn. If omitted, grid.api will be used for the context
           *
           * .on.eventName returns a dereg function that will remove the listener. It's not necessary to use it as the
           * listener will be removed when the scope is destroyed.
           * @param featureName name of the feature that raises the event
           * @param eventName name of the event
           */
  def registerEvent(featureName: java.lang.String, eventName: java.lang.String): scala.Unit = js.native
  /**
           * Registers features and events from a simple objectMap.
           * eventObjectMap must be in this format (multiple features allowed)
           * @param eventObjectMap map of feature/event names
           */
  def registerEventsFromObject(eventObjectMap: js.Any): scala.Unit = js.native
  /**
           * Registers a new event for the given feature
           * @param featureName name of the feature
           * @param methodName name of the method
           * @param callBackFn function to execute
           * @param _this binds to callBackFn. Defaults to gridApi.grid
           */
  def registerMethod(
    featureName: java.lang.String,
    methodName: java.lang.String,
    callBackFn: angularLib.angularMod.Global.Function,
    _this: js.Any
  ): scala.Unit = js.native
  /**
           * Registers features and methods from a simple objectMap.
           * eventObjectMap must be in this format (multiple features allowed)
           * {featureName: { methodNameOne:function(args){}, methodNameTwo:function(args){} }
           * @param eventObjectMap map of feature/event names
           * @param _this binds this to _this for all functions. Defaults to gridApi.grid
           */
  def registerMethodsFromObject(eventObjectMap: js.Any, _this: js.Any): scala.Unit = js.native
  /**
           * Used to execute a function while disabling the specified event listeners.
           * Disables the listenerFunctions, executes the callbackFn, and then enables the listenerFunctions again
           * @param listenerFuncs listenerFunc or array of listenerFuncs to suppress.
           *                      These must be the same functions that were used in the .on.eventName method
           * @param callBackFn function to execute
           */
  def suppressEvents(
    listenerFuncs: angularLib.angularMod.Global.Function,
    callBackFn: angularLib.angularMod.Global.Function
  ): scala.Unit = js.native
  /**
           * Used to execute a function while disabling the specified event listeners.
           * Disables the listenerFunctions, executes the callbackFn, and then enables the listenerFunctions again
           * @param listenerFuncs listenerFunc or array of listenerFuncs to suppress.
           *                      These must be the same functions that were used in the .on.eventName method
           * @param callBackFn function to execute
           */
  def suppressEvents(
    listenerFuncs: js.Array[angularLib.angularMod.Global.Function],
    callBackFn: angularLib.angularMod.Global.Function
  ): scala.Unit = js.native
}


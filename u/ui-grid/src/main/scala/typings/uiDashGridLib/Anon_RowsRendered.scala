package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_RowsRendered[TEntity] extends js.Object {
  /**
               * is raised when the canvas height has changed
               * @param {ng.IScope} scope Grid scope
               * @param {canvasHeightChangedHandler} handler Callback
               */
  var canvasHeightChanged: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.canvasHeightChangedHandler, 
    scala.Unit
  ]
  /**
               * The visibility of a column has changed, the column itself is passed out as a parameter of the event
               * @param {ng.IScope} scope The scope of the controller. This is used to deregister this event when the
               *        scope is destroyed
               * @param {columnVisibilityChangedHandler} callBack Will be called when the event is emited.
               *        The function passes back the GridCol that has changed
               */
  var columnVisibilityChanged: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* callBack */ uiDashGridLib.uiDashGridMod.uiGridNs.columnVisibilityChangedHandler[TEntity], 
    scala.Unit
  ]
  /**
               * is raised after the filter is changed.
               * The nature of the watch expression doesn't allow notification of what changed,
               * so the receiver of this event will need to re-extract the filter conditions from the columns.
               * @param {ng.IScope} scope Grid scope
               * @param {filterChangedHandler} handler Callback
               */
  var filterChanged: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.filterChangedHandler[TEntity], 
    scala.Unit
  ]
  /**
               * is raised after the cache of visible rows is changed
               * @param {ng.IScope} scope Grid scope
               * @param {rowsRenderedHandler} handler callback
               */
  var rowsRendered: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.rowsRenderedHandler[TEntity], 
    scala.Unit
  ]
  /**
               * is raised after the rows that are visible change.
               * The filtering is zero-based, so it isn't possible to say which rows changed
               * (unlike in the selection feature). We can plausibly know which row was changed when setRowInvisible is
               * called, but in that situation the user already knows which row they changed.
               * When a filter runs we don't know what changed, and that is the one that would have been useful.
               * @param {ng.IScope} scope Grid scope
               * @param {rowsVisibleChangedHandler} handler callback
               */
  var rowsVisibleChanged: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.rowsVisibleChangedHandler[TEntity], 
    scala.Unit
  ]
  /**
               * is raised when scroll begins. Is throttled, so won't be raised too frequently
               * @param {ng.IScope} scope Grid scope
               * @param {scrollBeginHandler} handler callback
               */
  var scrollBegin: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.scrollBeginHandler, 
    scala.Unit
  ]
  /**
               * is raised when scroll has finished. Is throttled, so won't be raised too frequently
               * @param {ng.IScope} scope Grid scope
               * @param {scrollEndHandler} handler callback
               */
  var scrollEnd: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.scrollEndHandler, 
    scala.Unit
  ]
  /**
               * is raised after the sort criteria on one or more columns have changed
               * @param {ng.IScope} scope Grid scope
               * @param {sortChangedHandler} handler callback
               */
  var sortChanged: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.sortChangedHandler[TEntity], 
    scala.Unit
  ]
}


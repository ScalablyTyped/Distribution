package typings.uiGrid.mod

import typings.angular.mod.IScope
import typings.uiGrid.anon.RowExpandedStateChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandable {
  
  @js.native
  trait IGridExpandableApi[TEntity] extends StObject {
    
    // Methods
    /**
      * Collapse all subgrids.
      */
    def collapseAllRows(): Unit = js.native
    
    /**
      * expand all subgrids
      */
    def expandAllRows(): Unit = js.native
    
    // Events
    var on: RowExpandedStateChanged[TEntity] = js.native
    
    /**
      * Toggle all subgrids
      */
    def toggleAllRows(): Unit = js.native
    
    /**
      * Toggle a specific row
      * @param {TEntity} rowEntity The data entity for the row you want to expand
      */
    def toggleRowExpansion(rowEntity: TEntity): Unit = js.native
  }
  object IGridExpandableApi {
    
    @scala.inline
    def apply[TEntity](
      collapseAllRows: () => Unit,
      expandAllRows: () => Unit,
      on: RowExpandedStateChanged[TEntity],
      toggleAllRows: () => Unit,
      toggleRowExpansion: TEntity => Unit
    ): IGridExpandableApi[TEntity] = {
      val __obj = js.Dynamic.literal(collapseAllRows = js.Any.fromFunction0(collapseAllRows), expandAllRows = js.Any.fromFunction0(expandAllRows), on = on.asInstanceOf[js.Any], toggleAllRows = js.Any.fromFunction0(toggleAllRows), toggleRowExpansion = js.Any.fromFunction1(toggleRowExpansion))
      __obj.asInstanceOf[IGridExpandableApi[TEntity]]
    }
    
    @scala.inline
    implicit class IGridExpandableApiMutableBuilder[Self <: IGridExpandableApi[_], TEntity] (val x: Self with IGridExpandableApi[TEntity]) extends AnyVal {
      
      @scala.inline
      def setCollapseAllRows(value: () => Unit): Self = StObject.set(x, "collapseAllRows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExpandAllRows(value: () => Unit): Self = StObject.set(x, "expandAllRows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOn(value: RowExpandedStateChanged[TEntity]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleAllRows(value: () => Unit): Self = StObject.set(x, "toggleAllRows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggleRowExpansion(value: TEntity => Unit): Self = StObject.set(x, "toggleRowExpansion", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IGridOptions extends StObject {
    
    /**
      * Whether or not to use expandable feature.  Allows you to turn off expandable on specific grids within
      * your application, or in specific modes on this grid.
      * Defaults to true.
      */
    var enableExpandable: js.UndefOr[Boolean] = js.native
    
    /**
      * Show a rowHeader to provide the expandable buttons. If set to false then implies you're going to use a
      * custom method for expanding and collapsing the subgrids.
      * Defaults to true.
      */
    var enableExpandableRowHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * Width in pixels of the expandable column. Defaults to 40
      */
    var expandableRowHeaderWidth: js.UndefOr[Double] = js.native
    
    /**
      * Height in pixels of the expanded subgrid.
      * Defaults to 150
      */
    var expandableRowHeight: js.UndefOr[Double] = js.native
    
    /**
      * reference to the parent grid scope (the parent scope of the sub-grid element)
      */
    var expandableRowScope: js.UndefOr[IScope | js.Object] = js.native
    
    /**
      * Mandatory. The template for your expanded row
      */
    var expandableRowTemplate: js.UndefOr[String] = js.native
  }
  object IGridOptions {
    
    @scala.inline
    def apply(): typings.uiGrid.mod.expandable.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.expandable.IGridOptions]
    }
    
    @scala.inline
    implicit class IGridOptionsMutableBuilder[Self <: typings.uiGrid.mod.expandable.IGridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableExpandable(value: Boolean): Self = StObject.set(x, "enableExpandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableExpandableRowHeader(value: Boolean): Self = StObject.set(x, "enableExpandableRowHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableExpandableRowHeaderUndefined: Self = StObject.set(x, "enableExpandableRowHeader", js.undefined)
      
      @scala.inline
      def setEnableExpandableUndefined: Self = StObject.set(x, "enableExpandable", js.undefined)
      
      @scala.inline
      def setExpandableRowHeaderWidth(value: Double): Self = StObject.set(x, "expandableRowHeaderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableRowHeaderWidthUndefined: Self = StObject.set(x, "expandableRowHeaderWidth", js.undefined)
      
      @scala.inline
      def setExpandableRowHeight(value: Double): Self = StObject.set(x, "expandableRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableRowHeightUndefined: Self = StObject.set(x, "expandableRowHeight", js.undefined)
      
      @scala.inline
      def setExpandableRowScope(value: IScope | js.Object): Self = StObject.set(x, "expandableRowScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableRowScopeUndefined: Self = StObject.set(x, "expandableRowScope", js.undefined)
      
      @scala.inline
      def setExpandableRowTemplate(value: String): Self = StObject.set(x, "expandableRowTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableRowTemplateUndefined: Self = StObject.set(x, "expandableRowTemplate", js.undefined)
    }
  }
  
  @js.native
  trait IGridRow extends StObject {
    
    /**
      * If set to true, the row is expanded and the expanded view is visible
      * Defaults to false
      * @default false
      */
    var isExpanded: js.UndefOr[Boolean] = js.native
  }
  object IGridRow {
    
    @scala.inline
    def apply(): typings.uiGrid.mod.expandable.IGridRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.expandable.IGridRow]
    }
    
    @scala.inline
    implicit class IGridRowMutableBuilder[Self <: typings.uiGrid.mod.expandable.IGridRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    }
  }
  
  type rowExpandedStateChangedHandler[TEntity] = js.Function1[/* row */ IGridRowOf[TEntity], Unit]
}

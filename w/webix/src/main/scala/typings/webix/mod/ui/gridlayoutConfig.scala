package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait gridlayoutConfig extends StObject {
  
  var animate: js.UndefOr[js.Any] = js.native
  
  var autoplace: js.UndefOr[Boolean] = js.native
  
  var borderless: js.UndefOr[Boolean] = js.native
  
  var cellHeight: js.UndefOr[Double] = js.native
  
  var cellWidth: js.UndefOr[Double] = js.native
  
  var cells: js.UndefOr[js.Array[_]] = js.native
  
  var cols: js.UndefOr[js.Array[_]] = js.native
  
  var container: js.UndefOr[String | HTMLElement] = js.native
  
  var css: js.UndefOr[js.Any] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var factory: js.UndefOr[WebixCallback] = js.native
  
  var gravity: js.UndefOr[Double] = js.native
  
  var gridColumns: js.UndefOr[Double] = js.native
  
  var gridRows: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  var margin: js.UndefOr[Double] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var on: js.UndefOr[EventHash] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var paddingX: js.UndefOr[Double] = js.native
  
  var paddingY: js.UndefOr[Double] = js.native
  
  var responsive: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[js.Array[_]] = js.native
  
  var view: js.UndefOr[String] = js.native
  
  var visibleBatch: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object gridlayoutConfig {
  
  @scala.inline
  def apply(): gridlayoutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gridlayoutConfig]
  }
  
  @scala.inline
  implicit class gridlayoutConfigMutableBuilder[Self <: gridlayoutConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAutoplace(value: Boolean): Self = StObject.set(x, "autoplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplaceUndefined: Self = StObject.set(x, "autoplace", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    @scala.inline
    def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
    
    @scala.inline
    def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellWidthUndefined: Self = StObject.set(x, "cellWidth", js.undefined)
    
    @scala.inline
    def setCells(value: js.Array[_]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    @scala.inline
    def setCellsVarargs(value: js.Any*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    @scala.inline
    def setCols(value: js.Array[_]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    @scala.inline
    def setColsVarargs(value: js.Any*): Self = StObject.set(x, "cols", js.Array(value :_*))
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFactory(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    
    @scala.inline
    def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    @scala.inline
    def setGridColumns(value: Double): Self = StObject.set(x, "gridColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridColumnsUndefined: Self = StObject.set(x, "gridColumns", js.undefined)
    
    @scala.inline
    def setGridRows(value: Double): Self = StObject.set(x, "gridRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridRowsUndefined: Self = StObject.set(x, "gridRows", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
    
    @scala.inline
    def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
    
    @scala.inline
    def setResponsive(value: String): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[_]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Any*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setVisibleBatch(value: String): Self = StObject.set(x, "visibleBatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleBatchUndefined: Self = StObject.set(x, "visibleBatch", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

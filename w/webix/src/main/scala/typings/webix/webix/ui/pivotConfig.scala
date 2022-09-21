package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.EventHash
import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pivotConfig extends StObject {
  
  var animate: js.UndefOr[Any] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var columnWidth: js.UndefOr[Double] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var css: js.UndefOr[Any] = js.undefined
  
  var data: js.UndefOr[String | js.Array[Any]] = js.undefined
  
  var datatable: js.UndefOr[Any] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var defaultOperation: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var externalProcessing: js.UndefOr[Boolean] = js.undefined
  
  var fieldMap: js.UndefOr[Any] = js.undefined
  
  var filterLabelAlign: js.UndefOr[String] = js.undefined
  
  var filterLabelWidth: js.UndefOr[Double] = js.undefined
  
  var filterMap: js.UndefOr[Any] = js.undefined
  
  var filterMinWidth: js.UndefOr[Double] = js.undefined
  
  var filterPlaceholder: js.UndefOr[Boolean | String] = js.undefined
  
  var filterWidth: js.UndefOr[Double] = js.undefined
  
  var footer: js.UndefOr[String | Boolean] = js.undefined
  
  var format: js.UndefOr[WebixCallback] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var headerTemplate: js.UndefOr[WebixCallback] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var max: js.UndefOr[Boolean] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Boolean] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var padding: js.UndefOr[Any] = js.undefined
  
  var paddingX: js.UndefOr[Double] = js.undefined
  
  var paddingY: js.UndefOr[Double] = js.undefined
  
  var ping: js.UndefOr[WebixCallback] = js.undefined
  
  var popup: js.UndefOr[Any] = js.undefined
  
  var profile: js.UndefOr[Boolean] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var readonlyTitle: js.UndefOr[String] = js.undefined
  
  var ready: js.UndefOr[WebixCallback] = js.undefined
  
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  
  var scheme: js.UndefOr[Any] = js.undefined
  
  var separateLabel: js.UndefOr[Boolean] = js.undefined
  
  var stableRowId: js.UndefOr[Boolean] = js.undefined
  
  var structure: js.UndefOr[Any] = js.undefined
  
  var totalColumn: js.UndefOr[String | Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[Any] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var webWorker: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var yScaleWidth: js.UndefOr[Double] = js.undefined
}
object pivotConfig {
  
  inline def apply(): pivotConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pivotConfig]
  }
  
  extension [Self <: pivotConfig](x: Self) {
    
    inline def setAnimate(value: Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCss(value: Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setData(value: String | js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDatatable(value: Any): Self = StObject.set(x, "datatable", value.asInstanceOf[js.Any])
    
    inline def setDatatableUndefined: Self = StObject.set(x, "datatable", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDefaultOperation(value: String): Self = StObject.set(x, "defaultOperation", value.asInstanceOf[js.Any])
    
    inline def setDefaultOperationUndefined: Self = StObject.set(x, "defaultOperation", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExternalProcessing(value: Boolean): Self = StObject.set(x, "externalProcessing", value.asInstanceOf[js.Any])
    
    inline def setExternalProcessingUndefined: Self = StObject.set(x, "externalProcessing", js.undefined)
    
    inline def setFieldMap(value: Any): Self = StObject.set(x, "fieldMap", value.asInstanceOf[js.Any])
    
    inline def setFieldMapUndefined: Self = StObject.set(x, "fieldMap", js.undefined)
    
    inline def setFilterLabelAlign(value: String): Self = StObject.set(x, "filterLabelAlign", value.asInstanceOf[js.Any])
    
    inline def setFilterLabelAlignUndefined: Self = StObject.set(x, "filterLabelAlign", js.undefined)
    
    inline def setFilterLabelWidth(value: Double): Self = StObject.set(x, "filterLabelWidth", value.asInstanceOf[js.Any])
    
    inline def setFilterLabelWidthUndefined: Self = StObject.set(x, "filterLabelWidth", js.undefined)
    
    inline def setFilterMap(value: Any): Self = StObject.set(x, "filterMap", value.asInstanceOf[js.Any])
    
    inline def setFilterMapUndefined: Self = StObject.set(x, "filterMap", js.undefined)
    
    inline def setFilterMinWidth(value: Double): Self = StObject.set(x, "filterMinWidth", value.asInstanceOf[js.Any])
    
    inline def setFilterMinWidthUndefined: Self = StObject.set(x, "filterMinWidth", js.undefined)
    
    inline def setFilterPlaceholder(value: Boolean | String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
    
    inline def setFilterWidth(value: Double): Self = StObject.set(x, "filterWidth", value.asInstanceOf[js.Any])
    
    inline def setFilterWidthUndefined: Self = StObject.set(x, "filterWidth", js.undefined)
    
    inline def setFooter(value: String | Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFormat(value: WebixCallback): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setHeaderTemplate(value: WebixCallback): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMax(value: Boolean): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setPadding(value: Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
    
    inline def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
    
    inline def setPing(value: WebixCallback): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    inline def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
    
    inline def setPopup(value: Any): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyTitle(value: String): Self = StObject.set(x, "readonlyTitle", value.asInstanceOf[js.Any])
    
    inline def setReadonlyTitleUndefined: Self = StObject.set(x, "readonlyTitle", js.undefined)
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setReady(value: WebixCallback): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setRemoveMissed(value: Boolean): Self = StObject.set(x, "removeMissed", value.asInstanceOf[js.Any])
    
    inline def setRemoveMissedUndefined: Self = StObject.set(x, "removeMissed", js.undefined)
    
    inline def setScheme(value: Any): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setSeparateLabel(value: Boolean): Self = StObject.set(x, "separateLabel", value.asInstanceOf[js.Any])
    
    inline def setSeparateLabelUndefined: Self = StObject.set(x, "separateLabel", js.undefined)
    
    inline def setStableRowId(value: Boolean): Self = StObject.set(x, "stableRowId", value.asInstanceOf[js.Any])
    
    inline def setStableRowIdUndefined: Self = StObject.set(x, "stableRowId", js.undefined)
    
    inline def setStructure(value: Any): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    inline def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    inline def setTotalColumn(value: String | Boolean): Self = StObject.set(x, "totalColumn", value.asInstanceOf[js.Any])
    
    inline def setTotalColumnUndefined: Self = StObject.set(x, "totalColumn", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWebWorker(value: String): Self = StObject.set(x, "webWorker", value.asInstanceOf[js.Any])
    
    inline def setWebWorkerUndefined: Self = StObject.set(x, "webWorker", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setYScaleWidth(value: Double): Self = StObject.set(x, "yScaleWidth", value.asInstanceOf[js.Any])
    
    inline def setYScaleWidthUndefined: Self = StObject.set(x, "yScaleWidth", js.undefined)
  }
}

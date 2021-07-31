package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pivotConfig extends StObject {
  
  var animate: js.UndefOr[js.Any] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var columnWidth: js.UndefOr[Double] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var css: js.UndefOr[js.Any] = js.undefined
  
  var data: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  
  var datatable: js.UndefOr[js.Any] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var defaultOperation: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var externalProcessing: js.UndefOr[Boolean] = js.undefined
  
  var fieldMap: js.UndefOr[js.Any] = js.undefined
  
  var filterLabelAlign: js.UndefOr[String] = js.undefined
  
  var filterLabelWidth: js.UndefOr[Double] = js.undefined
  
  var filterMap: js.UndefOr[js.Any] = js.undefined
  
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
  
  var padding: js.UndefOr[js.Any] = js.undefined
  
  var paddingX: js.UndefOr[Double] = js.undefined
  
  var paddingY: js.UndefOr[Double] = js.undefined
  
  var ping: js.UndefOr[WebixCallback] = js.undefined
  
  var popup: js.UndefOr[js.Any] = js.undefined
  
  var profile: js.UndefOr[Boolean] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var readonlyTitle: js.UndefOr[String] = js.undefined
  
  var ready: js.UndefOr[WebixCallback] = js.undefined
  
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  
  var scheme: js.UndefOr[js.Any] = js.undefined
  
  var separateLabel: js.UndefOr[Boolean] = js.undefined
  
  var stableRowId: js.UndefOr[Boolean] = js.undefined
  
  var structure: js.UndefOr[js.Any] = js.undefined
  
  var totalColumn: js.UndefOr[String | Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[js.Any] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var webWorker: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var yScaleWidth: js.UndefOr[Double] = js.undefined
}
object pivotConfig {
  
  @scala.inline
  def apply(): pivotConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pivotConfig]
  }
  
  @scala.inline
  implicit class pivotConfigMutableBuilder[Self <: pivotConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setData(value: String | js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDatatable(value: js.Any): Self = StObject.set(x, "datatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatableUndefined: Self = StObject.set(x, "datatable", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setDefaultOperation(value: String): Self = StObject.set(x, "defaultOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOperationUndefined: Self = StObject.set(x, "defaultOperation", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setExternalProcessing(value: Boolean): Self = StObject.set(x, "externalProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalProcessingUndefined: Self = StObject.set(x, "externalProcessing", js.undefined)
    
    @scala.inline
    def setFieldMap(value: js.Any): Self = StObject.set(x, "fieldMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMapUndefined: Self = StObject.set(x, "fieldMap", js.undefined)
    
    @scala.inline
    def setFilterLabelAlign(value: String): Self = StObject.set(x, "filterLabelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterLabelAlignUndefined: Self = StObject.set(x, "filterLabelAlign", js.undefined)
    
    @scala.inline
    def setFilterLabelWidth(value: Double): Self = StObject.set(x, "filterLabelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterLabelWidthUndefined: Self = StObject.set(x, "filterLabelWidth", js.undefined)
    
    @scala.inline
    def setFilterMap(value: js.Any): Self = StObject.set(x, "filterMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterMapUndefined: Self = StObject.set(x, "filterMap", js.undefined)
    
    @scala.inline
    def setFilterMinWidth(value: Double): Self = StObject.set(x, "filterMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterMinWidthUndefined: Self = StObject.set(x, "filterMinWidth", js.undefined)
    
    @scala.inline
    def setFilterPlaceholder(value: Boolean | String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
    
    @scala.inline
    def setFilterWidth(value: Double): Self = StObject.set(x, "filterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterWidthUndefined: Self = StObject.set(x, "filterWidth", js.undefined)
    
    @scala.inline
    def setFooter(value: String | Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setFormat(value: WebixCallback): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: WebixCallback): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
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
    def setMax(value: Boolean): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
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
    def setPing(value: WebixCallback): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
    
    @scala.inline
    def setPopup(value: js.Any): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    @scala.inline
    def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyTitle(value: String): Self = StObject.set(x, "readonlyTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyTitleUndefined: Self = StObject.set(x, "readonlyTitle", js.undefined)
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setReady(value: WebixCallback): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setRemoveMissed(value: Boolean): Self = StObject.set(x, "removeMissed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMissedUndefined: Self = StObject.set(x, "removeMissed", js.undefined)
    
    @scala.inline
    def setScheme(value: js.Any): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    @scala.inline
    def setSeparateLabel(value: Boolean): Self = StObject.set(x, "separateLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparateLabelUndefined: Self = StObject.set(x, "separateLabel", js.undefined)
    
    @scala.inline
    def setStableRowId(value: Boolean): Self = StObject.set(x, "stableRowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStableRowIdUndefined: Self = StObject.set(x, "stableRowId", js.undefined)
    
    @scala.inline
    def setStructure(value: js.Any): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    @scala.inline
    def setTotalColumn(value: String | Boolean): Self = StObject.set(x, "totalColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalColumnUndefined: Self = StObject.set(x, "totalColumn", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWebWorker(value: String): Self = StObject.set(x, "webWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebWorkerUndefined: Self = StObject.set(x, "webWorker", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setYScaleWidth(value: Double): Self = StObject.set(x, "yScaleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYScaleWidthUndefined: Self = StObject.set(x, "yScaleWidth", js.undefined)
  }
}

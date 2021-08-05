package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait filemanagerConfig extends StObject {
  
  var animate: js.UndefOr[js.Any] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var css: js.UndefOr[js.Any] = js.undefined
  
  var data: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  
  var datathrottle: js.UndefOr[Double] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var filterMode: js.UndefOr[js.Any] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var handlers: js.UndefOr[js.Any] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var icons: js.UndefOr[js.Any] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var legacyUploader: js.UndefOr[Boolean] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var menuFilter: js.UndefOr[WebixCallback] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var modes: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var noFileCache: js.UndefOr[Boolean] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var padding: js.UndefOr[js.Any] = js.undefined
  
  var paddingX: js.UndefOr[Double] = js.undefined
  
  var paddingY: js.UndefOr[Double] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var ready: js.UndefOr[WebixCallback] = js.undefined
  
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  
  var save: js.UndefOr[js.Any] = js.undefined
  
  var scheme: js.UndefOr[js.Any] = js.undefined
  
  var structure: js.UndefOr[js.Any] = js.undefined
  
  var templateCreate: js.UndefOr[WebixCallback] = js.undefined
  
  var templateDate: js.UndefOr[WebixCallback] = js.undefined
  
  var templateIcon: js.UndefOr[WebixCallback] = js.undefined
  
  var templateName: js.UndefOr[WebixCallback] = js.undefined
  
  var templateSize: js.UndefOr[WebixCallback] = js.undefined
  
  var templateType: js.UndefOr[WebixCallback] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var uploadProgress: js.UndefOr[js.Any] = js.undefined
  
  var url: js.UndefOr[js.Any] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object filemanagerConfig {
  
  inline def apply(): filemanagerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[filemanagerConfig]
  }
  
  extension [Self <: filemanagerConfig](x: Self) {
    
    inline def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setData(value: String | js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDatathrottle(value: Double): Self = StObject.set(x, "datathrottle", value.asInstanceOf[js.Any])
    
    inline def setDatathrottleUndefined: Self = StObject.set(x, "datathrottle", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFilterMode(value: js.Any): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
    
    inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
    
    inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setHandlers(value: js.Any): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIcons(value: js.Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLegacyUploader(value: Boolean): Self = StObject.set(x, "legacyUploader", value.asInstanceOf[js.Any])
    
    inline def setLegacyUploaderUndefined: Self = StObject.set(x, "legacyUploader", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMenuFilter(value: WebixCallback): Self = StObject.set(x, "menuFilter", value.asInstanceOf[js.Any])
    
    inline def setMenuFilterUndefined: Self = StObject.set(x, "menuFilter", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setModes(value: js.Array[js.Any]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
    
    inline def setModesVarargs(value: js.Any*): Self = StObject.set(x, "modes", js.Array(value :_*))
    
    inline def setNoFileCache(value: Boolean): Self = StObject.set(x, "noFileCache", value.asInstanceOf[js.Any])
    
    inline def setNoFileCacheUndefined: Self = StObject.set(x, "noFileCache", js.undefined)
    
    inline def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
    
    inline def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setReady(value: WebixCallback): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setRemoveMissed(value: Boolean): Self = StObject.set(x, "removeMissed", value.asInstanceOf[js.Any])
    
    inline def setRemoveMissedUndefined: Self = StObject.set(x, "removeMissed", js.undefined)
    
    inline def setSave(value: js.Any): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setScheme(value: js.Any): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setStructure(value: js.Any): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    inline def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    inline def setTemplateCreate(value: WebixCallback): Self = StObject.set(x, "templateCreate", value.asInstanceOf[js.Any])
    
    inline def setTemplateCreateUndefined: Self = StObject.set(x, "templateCreate", js.undefined)
    
    inline def setTemplateDate(value: WebixCallback): Self = StObject.set(x, "templateDate", value.asInstanceOf[js.Any])
    
    inline def setTemplateDateUndefined: Self = StObject.set(x, "templateDate", js.undefined)
    
    inline def setTemplateIcon(value: WebixCallback): Self = StObject.set(x, "templateIcon", value.asInstanceOf[js.Any])
    
    inline def setTemplateIconUndefined: Self = StObject.set(x, "templateIcon", js.undefined)
    
    inline def setTemplateName(value: WebixCallback): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
    
    inline def setTemplateSize(value: WebixCallback): Self = StObject.set(x, "templateSize", value.asInstanceOf[js.Any])
    
    inline def setTemplateSizeUndefined: Self = StObject.set(x, "templateSize", js.undefined)
    
    inline def setTemplateType(value: WebixCallback): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
    
    inline def setTemplateTypeUndefined: Self = StObject.set(x, "templateType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUploadProgress(value: js.Any): Self = StObject.set(x, "uploadProgress", value.asInstanceOf[js.Any])
    
    inline def setUploadProgressUndefined: Self = StObject.set(x, "uploadProgress", js.undefined)
    
    inline def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

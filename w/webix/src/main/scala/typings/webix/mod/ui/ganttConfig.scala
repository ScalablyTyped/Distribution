package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ganttConfig extends StObject {
  
  var animate: js.UndefOr[Boolean | obj] = js.undefined
  
  var baseline: js.UndefOr[Boolean] = js.undefined
  
  var body: js.UndefOr[obj] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  var compactWidth: js.UndefOr[Double] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var criticalPath: js.UndefOr[Boolean] = js.undefined
  
  var css: js.UndefOr[String | obj] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var display: js.UndefOr[String] = js.undefined
  
  var excludeHolidays: js.UndefOr[Boolean] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var isHoliday: js.UndefOr[WebixCallback] = js.undefined
  
  var links: js.UndefOr[Any] = js.undefined
  
  var locale: js.UndefOr[obj] = js.undefined
  
  var markers: js.UndefOr[js.Array[Any] | Boolean] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var `override`: js.UndefOr[js.Array[Any]] = js.undefined
  
  var preciseTimeUnit: js.UndefOr[Boolean] = js.undefined
  
  var projects: js.UndefOr[Boolean] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var resourceCalendars: js.UndefOr[Boolean] = js.undefined
  
  var resources: js.UndefOr[Boolean] = js.undefined
  
  var resourcesDiagram: js.UndefOr[Boolean] = js.undefined
  
  var scaleCellWidth: js.UndefOr[Double] = js.undefined
  
  var scaleEnd: js.UndefOr[obj] = js.undefined
  
  var scaleStart: js.UndefOr[obj] = js.undefined
  
  var scales: js.UndefOr[js.Array[Any]] = js.undefined
  
  var serverUTC: js.UndefOr[Boolean] = js.undefined
  
  var split: js.UndefOr[Boolean] = js.undefined
  
  var treeWidth: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ganttConfig {
  
  inline def apply(): ganttConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ganttConfig]
  }
  
  extension [Self <: ganttConfig](x: Self) {
    
    inline def setAnimate(value: Boolean | obj): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBaseline(value: Boolean): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setBody(value: obj): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setCompactWidth(value: Double): Self = StObject.set(x, "compactWidth", value.asInstanceOf[js.Any])
    
    inline def setCompactWidthUndefined: Self = StObject.set(x, "compactWidth", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCriticalPath(value: Boolean): Self = StObject.set(x, "criticalPath", value.asInstanceOf[js.Any])
    
    inline def setCriticalPathUndefined: Self = StObject.set(x, "criticalPath", js.undefined)
    
    inline def setCss(value: String | obj): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setExcludeHolidays(value: Boolean): Self = StObject.set(x, "excludeHolidays", value.asInstanceOf[js.Any])
    
    inline def setExcludeHolidaysUndefined: Self = StObject.set(x, "excludeHolidays", js.undefined)
    
    inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsHoliday(value: WebixCallback): Self = StObject.set(x, "isHoliday", value.asInstanceOf[js.Any])
    
    inline def setIsHolidayUndefined: Self = StObject.set(x, "isHoliday", js.undefined)
    
    inline def setLinks(value: Any): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLocale(value: obj): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMarkers(value: js.Array[Any] | Boolean): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setMarkersVarargs(value: Any*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setOverride(value: js.Array[Any]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setOverrideVarargs(value: Any*): Self = StObject.set(x, "override", js.Array(value*))
    
    inline def setPreciseTimeUnit(value: Boolean): Self = StObject.set(x, "preciseTimeUnit", value.asInstanceOf[js.Any])
    
    inline def setPreciseTimeUnitUndefined: Self = StObject.set(x, "preciseTimeUnit", js.undefined)
    
    inline def setProjects(value: Boolean): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setResourceCalendars(value: Boolean): Self = StObject.set(x, "resourceCalendars", value.asInstanceOf[js.Any])
    
    inline def setResourceCalendarsUndefined: Self = StObject.set(x, "resourceCalendars", js.undefined)
    
    inline def setResources(value: Boolean): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesDiagram(value: Boolean): Self = StObject.set(x, "resourcesDiagram", value.asInstanceOf[js.Any])
    
    inline def setResourcesDiagramUndefined: Self = StObject.set(x, "resourcesDiagram", js.undefined)
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setScaleCellWidth(value: Double): Self = StObject.set(x, "scaleCellWidth", value.asInstanceOf[js.Any])
    
    inline def setScaleCellWidthUndefined: Self = StObject.set(x, "scaleCellWidth", js.undefined)
    
    inline def setScaleEnd(value: obj): Self = StObject.set(x, "scaleEnd", value.asInstanceOf[js.Any])
    
    inline def setScaleEndUndefined: Self = StObject.set(x, "scaleEnd", js.undefined)
    
    inline def setScaleStart(value: obj): Self = StObject.set(x, "scaleStart", value.asInstanceOf[js.Any])
    
    inline def setScaleStartUndefined: Self = StObject.set(x, "scaleStart", js.undefined)
    
    inline def setScales(value: js.Array[Any]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
    
    inline def setScalesVarargs(value: Any*): Self = StObject.set(x, "scales", js.Array(value*))
    
    inline def setServerUTC(value: Boolean): Self = StObject.set(x, "serverUTC", value.asInstanceOf[js.Any])
    
    inline def setServerUTCUndefined: Self = StObject.set(x, "serverUTC", js.undefined)
    
    inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    
    inline def setTreeWidth(value: Double): Self = StObject.set(x, "treeWidth", value.asInstanceOf[js.Any])
    
    inline def setTreeWidthUndefined: Self = StObject.set(x, "treeWidth", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

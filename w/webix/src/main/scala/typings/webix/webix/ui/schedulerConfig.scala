package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.EventHash
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait schedulerConfig extends StObject {
  
  var animate: js.UndefOr[Boolean | obj] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var calendars: js.UndefOr[Boolean] = js.undefined
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  var compactWidth: js.UndefOr[Any] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var copypaste: js.UndefOr[Boolean] = js.undefined
  
  var css: js.UndefOr[String | obj] = js.undefined
  
  var date: js.UndefOr[obj] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var dragCreate: js.UndefOr[Boolean] = js.undefined
  
  var dynamic: js.UndefOr[String] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var locale: js.UndefOr[obj] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var `override`: js.UndefOr[js.Array[Any]] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var recurring: js.UndefOr[Boolean] = js.undefined
  
  var serverUTC: js.UndefOr[Boolean] = js.undefined
  
  var timeline: js.UndefOr[Boolean] = js.undefined
  
  var timelineMode: js.UndefOr[String] = js.undefined
  
  var units: js.UndefOr[Boolean] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object schedulerConfig {
  
  inline def apply(): schedulerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[schedulerConfig]
  }
  
  extension [Self <: schedulerConfig](x: Self) {
    
    inline def setAnimate(value: Boolean | obj): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    inline def setCalendars(value: Boolean): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    inline def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setCompactWidth(value: Any): Self = StObject.set(x, "compactWidth", value.asInstanceOf[js.Any])
    
    inline def setCompactWidthUndefined: Self = StObject.set(x, "compactWidth", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCopypaste(value: Boolean): Self = StObject.set(x, "copypaste", value.asInstanceOf[js.Any])
    
    inline def setCopypasteUndefined: Self = StObject.set(x, "copypaste", js.undefined)
    
    inline def setCss(value: String | obj): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setDate(value: obj): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDragCreate(value: Boolean): Self = StObject.set(x, "dragCreate", value.asInstanceOf[js.Any])
    
    inline def setDragCreateUndefined: Self = StObject.set(x, "dragCreate", js.undefined)
    
    inline def setDynamic(value: String): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
    
    inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLocale(value: obj): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setOverride(value: js.Array[Any]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setOverrideVarargs(value: Any*): Self = StObject.set(x, "override", js.Array(value*))
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRecurring(value: Boolean): Self = StObject.set(x, "recurring", value.asInstanceOf[js.Any])
    
    inline def setRecurringUndefined: Self = StObject.set(x, "recurring", js.undefined)
    
    inline def setServerUTC(value: Boolean): Self = StObject.set(x, "serverUTC", value.asInstanceOf[js.Any])
    
    inline def setServerUTCUndefined: Self = StObject.set(x, "serverUTC", js.undefined)
    
    inline def setTimeline(value: Boolean): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineMode(value: String): Self = StObject.set(x, "timelineMode", value.asInstanceOf[js.Any])
    
    inline def setTimelineModeUndefined: Self = StObject.set(x, "timelineMode", js.undefined)
    
    inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    
    inline def setUnits(value: Boolean): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

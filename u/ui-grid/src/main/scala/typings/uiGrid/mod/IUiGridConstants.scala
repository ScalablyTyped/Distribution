package typings.uiGrid.mod

import typings.std.RegExp
import typings.uiGrid.anon.ALL
import typings.uiGrid.anon.ALT
import typings.uiGrid.anon.ALWAYS
import typings.uiGrid.anon.Avg
import typings.uiGrid.anon.COLUMNHEADERCLICK
import typings.uiGrid.anon.CONTAINS
import typings.uiGrid.anon.DOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUiGridConstants extends StObject {
  
  var APOS_REGEXP: RegExp
  
  var ASC: String
  
  var BRACKET_REGEXP: RegExp
  
  var COL_CLASS_PREFIX: String
  
  var COL_FIELD: RegExp
  
  var CURRENCY_SYMBOLS: js.Array[String]
  
  var CUSTOM_FILTERS: RegExp
  
  var DESC: String
  
  var DISPLAY_CELL_TEMPLATE: RegExp
  
  var DOT_REGEXP: RegExp
  
  var FUNC_REGEXP: RegExp
  
  var LOG_DEBUG_MESSAGES: Boolean
  
  var LOG_ERROR_MESSAGES: Boolean
  
  var LOG_WARN_MESSAGES: Boolean
  
  var MODEL_COL_FIELD: RegExp
  
  var TEMPLATE_REGEXP: RegExp
  
  var TOOLTIP: RegExp
  
  var aggregationTypes: Avg
  
  var dataChange: ALL
  
  var events: COLUMNHEADERCLICK
  
  var filter: CONTAINS
  
  var keymap: ALT
  
  var scrollDirection: DOWN
  
  var scrollbars: ALWAYS
}
object IUiGridConstants {
  
  inline def apply(
    APOS_REGEXP: RegExp,
    ASC: String,
    BRACKET_REGEXP: RegExp,
    COL_CLASS_PREFIX: String,
    COL_FIELD: RegExp,
    CURRENCY_SYMBOLS: js.Array[String],
    CUSTOM_FILTERS: RegExp,
    DESC: String,
    DISPLAY_CELL_TEMPLATE: RegExp,
    DOT_REGEXP: RegExp,
    FUNC_REGEXP: RegExp,
    LOG_DEBUG_MESSAGES: Boolean,
    LOG_ERROR_MESSAGES: Boolean,
    LOG_WARN_MESSAGES: Boolean,
    MODEL_COL_FIELD: RegExp,
    TEMPLATE_REGEXP: RegExp,
    TOOLTIP: RegExp,
    aggregationTypes: Avg,
    dataChange: ALL,
    events: COLUMNHEADERCLICK,
    filter: CONTAINS,
    keymap: ALT,
    scrollDirection: DOWN,
    scrollbars: ALWAYS
  ): IUiGridConstants = {
    val __obj = js.Dynamic.literal(APOS_REGEXP = APOS_REGEXP.asInstanceOf[js.Any], ASC = ASC.asInstanceOf[js.Any], BRACKET_REGEXP = BRACKET_REGEXP.asInstanceOf[js.Any], COL_CLASS_PREFIX = COL_CLASS_PREFIX.asInstanceOf[js.Any], COL_FIELD = COL_FIELD.asInstanceOf[js.Any], CURRENCY_SYMBOLS = CURRENCY_SYMBOLS.asInstanceOf[js.Any], CUSTOM_FILTERS = CUSTOM_FILTERS.asInstanceOf[js.Any], DESC = DESC.asInstanceOf[js.Any], DISPLAY_CELL_TEMPLATE = DISPLAY_CELL_TEMPLATE.asInstanceOf[js.Any], DOT_REGEXP = DOT_REGEXP.asInstanceOf[js.Any], FUNC_REGEXP = FUNC_REGEXP.asInstanceOf[js.Any], LOG_DEBUG_MESSAGES = LOG_DEBUG_MESSAGES.asInstanceOf[js.Any], LOG_ERROR_MESSAGES = LOG_ERROR_MESSAGES.asInstanceOf[js.Any], LOG_WARN_MESSAGES = LOG_WARN_MESSAGES.asInstanceOf[js.Any], MODEL_COL_FIELD = MODEL_COL_FIELD.asInstanceOf[js.Any], TEMPLATE_REGEXP = TEMPLATE_REGEXP.asInstanceOf[js.Any], TOOLTIP = TOOLTIP.asInstanceOf[js.Any], aggregationTypes = aggregationTypes.asInstanceOf[js.Any], dataChange = dataChange.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], keymap = keymap.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], scrollbars = scrollbars.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridConstants]
  }
  
  extension [Self <: IUiGridConstants](x: Self) {
    
    inline def setAPOS_REGEXP(value: RegExp): Self = StObject.set(x, "APOS_REGEXP", value.asInstanceOf[js.Any])
    
    inline def setASC(value: String): Self = StObject.set(x, "ASC", value.asInstanceOf[js.Any])
    
    inline def setAggregationTypes(value: Avg): Self = StObject.set(x, "aggregationTypes", value.asInstanceOf[js.Any])
    
    inline def setBRACKET_REGEXP(value: RegExp): Self = StObject.set(x, "BRACKET_REGEXP", value.asInstanceOf[js.Any])
    
    inline def setCOL_CLASS_PREFIX(value: String): Self = StObject.set(x, "COL_CLASS_PREFIX", value.asInstanceOf[js.Any])
    
    inline def setCOL_FIELD(value: RegExp): Self = StObject.set(x, "COL_FIELD", value.asInstanceOf[js.Any])
    
    inline def setCURRENCY_SYMBOLS(value: js.Array[String]): Self = StObject.set(x, "CURRENCY_SYMBOLS", value.asInstanceOf[js.Any])
    
    inline def setCURRENCY_SYMBOLSVarargs(value: String*): Self = StObject.set(x, "CURRENCY_SYMBOLS", js.Array(value :_*))
    
    inline def setCUSTOM_FILTERS(value: RegExp): Self = StObject.set(x, "CUSTOM_FILTERS", value.asInstanceOf[js.Any])
    
    inline def setDESC(value: String): Self = StObject.set(x, "DESC", value.asInstanceOf[js.Any])
    
    inline def setDISPLAY_CELL_TEMPLATE(value: RegExp): Self = StObject.set(x, "DISPLAY_CELL_TEMPLATE", value.asInstanceOf[js.Any])
    
    inline def setDOT_REGEXP(value: RegExp): Self = StObject.set(x, "DOT_REGEXP", value.asInstanceOf[js.Any])
    
    inline def setDataChange(value: ALL): Self = StObject.set(x, "dataChange", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: COLUMNHEADERCLICK): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setFUNC_REGEXP(value: RegExp): Self = StObject.set(x, "FUNC_REGEXP", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: CONTAINS): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setKeymap(value: ALT): Self = StObject.set(x, "keymap", value.asInstanceOf[js.Any])
    
    inline def setLOG_DEBUG_MESSAGES(value: Boolean): Self = StObject.set(x, "LOG_DEBUG_MESSAGES", value.asInstanceOf[js.Any])
    
    inline def setLOG_ERROR_MESSAGES(value: Boolean): Self = StObject.set(x, "LOG_ERROR_MESSAGES", value.asInstanceOf[js.Any])
    
    inline def setLOG_WARN_MESSAGES(value: Boolean): Self = StObject.set(x, "LOG_WARN_MESSAGES", value.asInstanceOf[js.Any])
    
    inline def setMODEL_COL_FIELD(value: RegExp): Self = StObject.set(x, "MODEL_COL_FIELD", value.asInstanceOf[js.Any])
    
    inline def setScrollDirection(value: DOWN): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
    
    inline def setScrollbars(value: ALWAYS): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
    
    inline def setTEMPLATE_REGEXP(value: RegExp): Self = StObject.set(x, "TEMPLATE_REGEXP", value.asInstanceOf[js.Any])
    
    inline def setTOOLTIP(value: RegExp): Self = StObject.set(x, "TOOLTIP", value.asInstanceOf[js.Any])
  }
}

package typings.uiGrid.mod

import typings.std.RegExp
import typings.uiGrid.anon.ALL
import typings.uiGrid.anon.ALT
import typings.uiGrid.anon.ALWAYS
import typings.uiGrid.anon.Avg
import typings.uiGrid.anon.COLUMNHEADERCLICK
import typings.uiGrid.anon.CONTAINS
import typings.uiGrid.anon.DOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridConstants extends js.Object {
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
  @scala.inline
  def apply(
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
}


package typings.tableauJsApi

import typings.std.HTMLElement
import typings.tableauJsApi.vizMod.VizCreateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object tableau {
    
    @JSGlobal("tableau.DashboardObjectType")
    @js.native
    object DashboardObjectType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.DashboardObjectType & String] = js.native
      
      /* "addIn" */ val ADDIN: typings.tableauJsApi.enumsMod.DashboardObjectType.ADDIN & String = js.native
      
      /* "blank" */ val BLANK: typings.tableauJsApi.enumsMod.DashboardObjectType.BLANK & String = js.native
      
      /* "image" */ val IMAGE: typings.tableauJsApi.enumsMod.DashboardObjectType.IMAGE & String = js.native
      
      /* "legend" */ val LEGEND: typings.tableauJsApi.enumsMod.DashboardObjectType.LEGEND & String = js.native
      
      /* "pageFilter" */ val PAGE_FILTER: typings.tableauJsApi.enumsMod.DashboardObjectType.PAGE_FILTER & String = js.native
      
      /* "parameterControl" */ val PARAMETER_CONTROL: typings.tableauJsApi.enumsMod.DashboardObjectType.PARAMETER_CONTROL & String = js.native
      
      /* "quickFilter" */ val QUICK_FILTER: typings.tableauJsApi.enumsMod.DashboardObjectType.QUICK_FILTER & String = js.native
      
      /* "text" */ val TEXT: typings.tableauJsApi.enumsMod.DashboardObjectType.TEXT & String = js.native
      
      /* "title" */ val TITLE: typings.tableauJsApi.enumsMod.DashboardObjectType.TITLE & String = js.native
      
      /* "webPage" */ val WEB_PAGE: typings.tableauJsApi.enumsMod.DashboardObjectType.WEB_PAGE & String = js.native
      
      /* "worksheet" */ val WORKSHEET: typings.tableauJsApi.enumsMod.DashboardObjectType.WORKSHEET & String = js.native
    }
    
    @JSGlobal("tableau.DateRangeType")
    @js.native
    object DateRangeType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.DateRangeType & String] = js.native
      
      /* "curr" */ val CURR: typings.tableauJsApi.enumsMod.DateRangeType.CURR & String = js.native
      
      /* "last" */ val LAST: typings.tableauJsApi.enumsMod.DateRangeType.LAST & String = js.native
      
      /* "lastn" */ val LASTN: typings.tableauJsApi.enumsMod.DateRangeType.LASTN & String = js.native
      
      /* "next" */ val NEXT: typings.tableauJsApi.enumsMod.DateRangeType.NEXT & String = js.native
      
      /* "nextn" */ val NEXTN: typings.tableauJsApi.enumsMod.DateRangeType.NEXTN & String = js.native
      
      /* "todate" */ val TODATE: typings.tableauJsApi.enumsMod.DateRangeType.TODATE & String = js.native
    }
    
    @JSGlobal("tableau.ErrorCode")
    @js.native
    object ErrorCode extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.ErrorCode & String] = js.native
      
      /* "browserNotCapable" */ val BROWSER_NOT_CAPABLE: typings.tableauJsApi.enumsMod.ErrorCode.BROWSER_NOT_CAPABLE & String = js.native
      
      /* "downloadWorkbookNotAllowed" */ val DOWNLOAD_WORKBOOK_NOT_ALLOWED: typings.tableauJsApi.enumsMod.ErrorCode.DOWNLOAD_WORKBOOK_NOT_ALLOWED & String = js.native
      
      /* "filterCannotBePerformed" */ val FILTER_CANNOT_BE_PERFORMED: typings.tableauJsApi.enumsMod.ErrorCode.FILTER_CANNOT_BE_PERFORMED & String = js.native
      
      /* "indexOutOfRange" */ val INDEX_OUT_OF_RANGE: typings.tableauJsApi.enumsMod.ErrorCode.INDEX_OUT_OF_RANGE & String = js.native
      
      /* "internalError" */ val INTERNAL_ERROR: typings.tableauJsApi.enumsMod.ErrorCode.INTERNAL_ERROR & String = js.native
      
      /* "invalidAggregationFieldName" */ val INVALID_AGGREGATION_FIELD_NAME: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_AGGREGATION_FIELD_NAME & String = js.native
      
      /* "invalidCustomViewName" */ val INVALID_CUSTOM_VIEW_NAME: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_CUSTOM_VIEW_NAME & String = js.native
      
      /* "invalidDateParameter" */ val INVALID_DATE_PARAMETER: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_DATE_PARAMETER & String = js.native
      
      /* "invalidFilterFieldName" */ val INVALID_FILTER_FIELDNAME: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_FILTER_FIELDNAME & String = js.native
      
      /* "invalidFilterFieldNameOrValue" */ val INVALID_FILTER_FIELDNAME_OR_VALUE: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_FILTER_FIELDNAME_OR_VALUE & String = js.native
      
      /* "invalidFilterFieldValue" */ val INVALID_FILTER_FIELDVALUE: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_FILTER_FIELDVALUE & String = js.native
      
      /* "invalidParameter" */ val INVALID_PARAMETER: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_PARAMETER & String = js.native
      
      /* "invalidSelectionDate" */ val INVALID_SELECTION_DATE: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_SELECTION_DATE & String = js.native
      
      /* "invalidSelectionFieldname" */ val INVALID_SELECTION_FIELDNAME: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_SELECTION_FIELDNAME & String = js.native
      
      /* "invalidSelectionValue" */ val INVALID_SELECTION_VALUE: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_SELECTION_VALUE & String = js.native
      
      /* "invalidSize" */ val INVALID_SIZE: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_SIZE & String = js.native
      
      /* "invalidSizeBehaviorOnWorksheet" */ val INVALID_SIZE_BEHAVIOR_ON_WORKSHEET: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_SIZE_BEHAVIOR_ON_WORKSHEET & String = js.native
      
      /* "invalidUrl" */ val INVALID_URL: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_URL & String = js.native
      
      /* "missingMaxSize" */ val MISSING_MAX_SIZE: typings.tableauJsApi.enumsMod.ErrorCode.MISSING_MAX_SIZE & String = js.native
      
      /* "missingMinMaxSize" */ val MISSING_MINMAX_SIZE: typings.tableauJsApi.enumsMod.ErrorCode.MISSING_MINMAX_SIZE & String = js.native
      
      /* "missingMinSize" */ val MISSING_MIN_SIZE: typings.tableauJsApi.enumsMod.ErrorCode.MISSING_MIN_SIZE & String = js.native
      
      /* "missingRangeNForRelativeDateFilters" */ val MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS: typings.tableauJsApi.enumsMod.ErrorCode.MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS & String = js.native
      
      /* "notActiveSheet" */ val NOT_ACTIVE_SHEET: typings.tableauJsApi.enumsMod.ErrorCode.NOT_ACTIVE_SHEET & String = js.native
      
      /* "noUrlForHiddenWorksheet" */ val NO_URL_FOR_HIDDEN_WORKSHEET: typings.tableauJsApi.enumsMod.ErrorCode.NO_URL_FOR_HIDDEN_WORKSHEET & String = js.native
      
      /* "noUrlOrParentElementNotFound" */ val NO_URL_OR_PARENT_ELEMENT_NOT_FOUND: typings.tableauJsApi.enumsMod.ErrorCode.NO_URL_OR_PARENT_ELEMENT_NOT_FOUND & String = js.native
      
      /* "nullOrEmptyParameter" */ val NULL_OR_EMPTY_PARAMETER: typings.tableauJsApi.enumsMod.ErrorCode.NULL_OR_EMPTY_PARAMETER & String = js.native
      
      /* "serverError" */ val SERVER_ERROR: typings.tableauJsApi.enumsMod.ErrorCode.SERVER_ERROR & String = js.native
      
      /* "sheetNotInWorkbook" */ val SHEET_NOT_IN_WORKBOOK: typings.tableauJsApi.enumsMod.ErrorCode.SHEET_NOT_IN_WORKBOOK & String = js.native
      
      /* "staleDataReference" */ val STALE_DATA_REFERENCE: typings.tableauJsApi.enumsMod.ErrorCode.STALE_DATA_REFERENCE & String = js.native
      
      /* "unsupportedEventName" */ val UNSUPPORTED_EVENT_NAME: typings.tableauJsApi.enumsMod.ErrorCode.UNSUPPORTED_EVENT_NAME & String = js.native
      
      /* "vizAlreadyInManager" */ val VIZ_ALREADY_IN_MANAGER: typings.tableauJsApi.enumsMod.ErrorCode.VIZ_ALREADY_IN_MANAGER & String = js.native
    }
    
    @JSGlobal("tableau.FieldAggregationType")
    @js.native
    object FieldAggregationType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.FieldAggregationType & String] = js.native
      
      /* "ATTR" */ val ATTR: typings.tableauJsApi.enumsMod.FieldAggregationType.ATTR & String = js.native
      
      /* "AVG" */ val AVG: typings.tableauJsApi.enumsMod.FieldAggregationType.AVG & String = js.native
      
      /* "COLLECT" */ val COLLECT: typings.tableauJsApi.enumsMod.FieldAggregationType.COLLECT & String = js.native
      
      /* "COUNT" */ val COUNT: typings.tableauJsApi.enumsMod.FieldAggregationType.COUNT & String = js.native
      
      /* "COUNTD" */ val COUNTD: typings.tableauJsApi.enumsMod.FieldAggregationType.COUNTD & String = js.native
      
      /* "DAY" */ val DAY: typings.tableauJsApi.enumsMod.FieldAggregationType.DAY & String = js.native
      
      /* "END" */ val END: typings.tableauJsApi.enumsMod.FieldAggregationType.END & String = js.native
      
      /* "HOUR" */ val HOUR: typings.tableauJsApi.enumsMod.FieldAggregationType.HOUR & String = js.native
      
      /* "INOUT" */ val INOUT: typings.tableauJsApi.enumsMod.FieldAggregationType.INOUT & String = js.native
      
      /* "KURTOSIS" */ val KURTOSIS: typings.tableauJsApi.enumsMod.FieldAggregationType.KURTOSIS & String = js.native
      
      /* "MAX" */ val MAX: typings.tableauJsApi.enumsMod.FieldAggregationType.MAX & String = js.native
      
      /* "MDY" */ val MDY: typings.tableauJsApi.enumsMod.FieldAggregationType.MDY & String = js.native
      
      /* "MEDIAN" */ val MEDIAN: typings.tableauJsApi.enumsMod.FieldAggregationType.MEDIAN & String = js.native
      
      /* "MIN" */ val MIN: typings.tableauJsApi.enumsMod.FieldAggregationType.MIN & String = js.native
      
      /* "MINUTE" */ val MINUTE: typings.tableauJsApi.enumsMod.FieldAggregationType.MINUTE & String = js.native
      
      /* "MONTH" */ val MONTH: typings.tableauJsApi.enumsMod.FieldAggregationType.MONTH & String = js.native
      
      /* "MONTHYEAR" */ val MONTHYEAR: typings.tableauJsApi.enumsMod.FieldAggregationType.MONTHYEAR & String = js.native
      
      /* "NONE" */ val NONE: typings.tableauJsApi.enumsMod.FieldAggregationType.NONE & String = js.native
      
      /* "PERCENTILE" */ val PERCENTILE: typings.tableauJsApi.enumsMod.FieldAggregationType.PERCENTILE & String = js.native
      
      /* "QTR" */ val QTR: typings.tableauJsApi.enumsMod.FieldAggregationType.QTR & String = js.native
      
      /* "QUART1" */ val QUART1: typings.tableauJsApi.enumsMod.FieldAggregationType.QUART1 & String = js.native
      
      /* "QUART3" */ val QUART3: typings.tableauJsApi.enumsMod.FieldAggregationType.QUART3 & String = js.native
      
      /* "SECOND" */ val SECOND: typings.tableauJsApi.enumsMod.FieldAggregationType.SECOND & String = js.native
      
      /* "SKEWNESS" */ val SKEWNESS: typings.tableauJsApi.enumsMod.FieldAggregationType.SKEWNESS & String = js.native
      
      /* "STDEV" */ val STDEV: typings.tableauJsApi.enumsMod.FieldAggregationType.STDEV & String = js.native
      
      /* "STDEVP" */ val STDEVP: typings.tableauJsApi.enumsMod.FieldAggregationType.STDEVP & String = js.native
      
      /* "SUM" */ val SUM: typings.tableauJsApi.enumsMod.FieldAggregationType.SUM & String = js.native
      
      /* "SUM_XSQR" */ val SUM_XSQR: typings.tableauJsApi.enumsMod.FieldAggregationType.SUM_XSQR & String = js.native
      
      /* "TRUNC_DAY" */ val TRUNC_DAY: typings.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_DAY & String = js.native
      
      /* "TRUNC_HOUR" */ val TRUNC_HOUR: typings.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_HOUR & String = js.native
      
      /* "TRUNC_MINUTE" */ val TRUNC_MINUTE: typings.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_MINUTE & String = js.native
      
      /* "TRUNC_MONTH" */ val TRUNC_MONTH: typings.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_MONTH & String = js.native
      
      /* "TRUNC_QTR" */ val TRUNC_QTR: typings.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_QTR & String = js.native
      
      /* "TRUNC_SECOND" */ val TRUNC_SECOND: typings.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_SECOND & String = js.native
      
      /* "TRUNC_WEEK" */ val TRUNC_WEEK: typings.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_WEEK & String = js.native
      
      /* "TRUNC_YEAR" */ val TRUNC_YEAR: typings.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_YEAR & String = js.native
      
      /* "USER" */ val USER: typings.tableauJsApi.enumsMod.FieldAggregationType.USER & String = js.native
      
      /* "VAR" */ val VAR: typings.tableauJsApi.enumsMod.FieldAggregationType.VAR & String = js.native
      
      /* "VARP" */ val VARP: typings.tableauJsApi.enumsMod.FieldAggregationType.VARP & String = js.native
      
      /* "WEEK" */ val WEEK: typings.tableauJsApi.enumsMod.FieldAggregationType.WEEK & String = js.native
      
      /* "WEEKDAY" */ val WEEKDAY: typings.tableauJsApi.enumsMod.FieldAggregationType.WEEKDAY & String = js.native
      
      /* "YEAR" */ val YEAR: typings.tableauJsApi.enumsMod.FieldAggregationType.YEAR & String = js.native
    }
    
    @JSGlobal("tableau.FieldRoleType")
    @js.native
    object FieldRoleType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.FieldRoleType & String] = js.native
      
      /* "dimension" */ val DIMENSION: typings.tableauJsApi.enumsMod.FieldRoleType.DIMENSION & String = js.native
      
      /* "measure" */ val MEASURE: typings.tableauJsApi.enumsMod.FieldRoleType.MEASURE & String = js.native
      
      /* "unknown" */ val UNKNOWN: typings.tableauJsApi.enumsMod.FieldRoleType.UNKNOWN & String = js.native
    }
    
    @JSGlobal("tableau.FilterType")
    @js.native
    object FilterType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.FilterType & String] = js.native
      
      /* "categorical" */ val CATEGORICAL: typings.tableauJsApi.enumsMod.FilterType.CATEGORICAL & String = js.native
      
      /* "hierarchical" */ val HIERARCHICAL: typings.tableauJsApi.enumsMod.FilterType.HIERARCHICAL & String = js.native
      
      /* "quantitative" */ val QUANTITATIVE: typings.tableauJsApi.enumsMod.FilterType.QUANTITATIVE & String = js.native
      
      /* "relativedate" */ val RELATIVEDATE: typings.tableauJsApi.enumsMod.FilterType.RELATIVEDATE & String = js.native
    }
    
    @JSGlobal("tableau.FilterUpdateType")
    @js.native
    object FilterUpdateType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.FilterUpdateType & String] = js.native
      
      /* "add" */ val ADD: typings.tableauJsApi.enumsMod.FilterUpdateType.ADD & String = js.native
      
      /* "all" */ val ALL: typings.tableauJsApi.enumsMod.FilterUpdateType.ALL & String = js.native
      
      /* "remove" */ val REMOVE: typings.tableauJsApi.enumsMod.FilterUpdateType.REMOVE & String = js.native
      
      /* "replace" */ val REPLACE: typings.tableauJsApi.enumsMod.FilterUpdateType.REPLACE & String = js.native
    }
    
    @JSGlobal("tableau.NullOption")
    @js.native
    object NullOption extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.NullOption & String] = js.native
      
      /* "allValues" */ val ALL_VALUES: typings.tableauJsApi.enumsMod.NullOption.ALL_VALUES & String = js.native
      
      /* "nonNullValues" */ val NON_NULL_VALUES: typings.tableauJsApi.enumsMod.NullOption.NON_NULL_VALUES & String = js.native
      
      /* "nullValues" */ val NULL_VALUES: typings.tableauJsApi.enumsMod.NullOption.NULL_VALUES & String = js.native
    }
    
    @JSGlobal("tableau.ParameterAllowableValuesType")
    @js.native
    object ParameterAllowableValuesType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.ParameterAllowableValuesType & String] = js.native
      
      /* "all" */ val ALL: typings.tableauJsApi.enumsMod.ParameterAllowableValuesType.ALL & String = js.native
      
      /* "list" */ val LIST: typings.tableauJsApi.enumsMod.ParameterAllowableValuesType.LIST & String = js.native
      
      /* "range" */ val RANGE: typings.tableauJsApi.enumsMod.ParameterAllowableValuesType.RANGE & String = js.native
    }
    
    @JSGlobal("tableau.ParameterDataType")
    @js.native
    object ParameterDataType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.ParameterDataType & String] = js.native
      
      /* "boolean" */ val BOOLEAN: typings.tableauJsApi.enumsMod.ParameterDataType.BOOLEAN & String = js.native
      
      /* "date" */ val DATE: typings.tableauJsApi.enumsMod.ParameterDataType.DATE & String = js.native
      
      /* "datetime" */ val DATETIME: typings.tableauJsApi.enumsMod.ParameterDataType.DATETIME & String = js.native
      
      /* "float" */ val FLOAT: typings.tableauJsApi.enumsMod.ParameterDataType.FLOAT & String = js.native
      
      /* "integer" */ val INTEGER: typings.tableauJsApi.enumsMod.ParameterDataType.INTEGER & String = js.native
      
      /* "string" */ val STRING: typings.tableauJsApi.enumsMod.ParameterDataType.STRING & String = js.native
    }
    
    @JSGlobal("tableau.PeriodType")
    @js.native
    object PeriodType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.PeriodType & String] = js.native
      
      /* "day" */ val DAY: typings.tableauJsApi.enumsMod.PeriodType.DAY & String = js.native
      
      /* "hour" */ val HOUR: typings.tableauJsApi.enumsMod.PeriodType.HOUR & String = js.native
      
      /* "minute" */ val MINUTE: typings.tableauJsApi.enumsMod.PeriodType.MINUTE & String = js.native
      
      /* "month" */ val MONTH: typings.tableauJsApi.enumsMod.PeriodType.MONTH & String = js.native
      
      /* "quarter" */ val QUARTER: typings.tableauJsApi.enumsMod.PeriodType.QUARTER & String = js.native
      
      /* "second" */ val SECOND: typings.tableauJsApi.enumsMod.PeriodType.SECOND & String = js.native
      
      /* "week" */ val WEEK: typings.tableauJsApi.enumsMod.PeriodType.WEEK & String = js.native
      
      /* "year" */ val YEAR: typings.tableauJsApi.enumsMod.PeriodType.YEAR & String = js.native
    }
    
    @JSGlobal("tableau.SelectionUpdateType")
    @js.native
    object SelectionUpdateType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.SelectionUpdateType & String] = js.native
      
      /* "add" */ val ADD: typings.tableauJsApi.enumsMod.SelectionUpdateType.ADD & String = js.native
      
      /* "remove" */ val REMOVE: typings.tableauJsApi.enumsMod.SelectionUpdateType.REMOVE & String = js.native
      
      /* "replace" */ val REPLACE: typings.tableauJsApi.enumsMod.SelectionUpdateType.REPLACE & String = js.native
    }
    
    @JSGlobal("tableau.SheetSizeBehavior")
    @js.native
    object SheetSizeBehavior extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.SheetSizeBehavior & String] = js.native
      
      /* "atleast" */ val ATLEAST: typings.tableauJsApi.enumsMod.SheetSizeBehavior.ATLEAST & String = js.native
      
      /* "atmost" */ val ATMOST: typings.tableauJsApi.enumsMod.SheetSizeBehavior.ATMOST & String = js.native
      
      /* "automatic" */ val AUTOMATIC: typings.tableauJsApi.enumsMod.SheetSizeBehavior.AUTOMATIC & String = js.native
      
      /* "exactly" */ val EXACTLY: typings.tableauJsApi.enumsMod.SheetSizeBehavior.EXACTLY & String = js.native
      
      /* "range" */ val RANGE: typings.tableauJsApi.enumsMod.SheetSizeBehavior.RANGE & String = js.native
    }
    
    @JSGlobal("tableau.SheetType")
    @js.native
    object SheetType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.SheetType & String] = js.native
      
      /* "dashboard" */ val DASHBOARD: typings.tableauJsApi.enumsMod.SheetType.DASHBOARD & String = js.native
      
      /* "story" */ val STORY: typings.tableauJsApi.enumsMod.SheetType.STORY & String = js.native
      
      /* "worksheet" */ val WORKSHEET: typings.tableauJsApi.enumsMod.SheetType.WORKSHEET & String = js.native
    }
    
    @JSGlobal("tableau.TableauEventName")
    @js.native
    object TableauEventName extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.TableauEventName & String] = js.native
      
      /* "customviewload" */ val CUSTOM_VIEW_LOAD: typings.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_LOAD & String = js.native
      
      /* "customviewremove" */ val CUSTOM_VIEW_REMOVE: typings.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_REMOVE & String = js.native
      
      /* "customviewsave" */ val CUSTOM_VIEW_SAVE: typings.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_SAVE & String = js.native
      
      /* "customviewsetdefault" */ val CUSTOM_VIEW_SET_DEFAULT: typings.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_SET_DEFAULT & String = js.native
      
      /* "filterchange" */ val FILTER_CHANGE: typings.tableauJsApi.enumsMod.TableauEventName.FILTER_CHANGE & String = js.native
      
      /* "firstinteractive" */ val FIRST_INTERACTIVE: typings.tableauJsApi.enumsMod.TableauEventName.FIRST_INTERACTIVE & String = js.native
      
      /* "firstvizsizeknown" */ val FIRST_VIZ_SIZE_KNOWN: typings.tableauJsApi.enumsMod.TableauEventName.FIRST_VIZ_SIZE_KNOWN & String = js.native
      
      /* "markshighlight" */ val MARKS_HIGHLIGHT: typings.tableauJsApi.enumsMod.TableauEventName.MARKS_HIGHLIGHT & String = js.native
      
      /* "marksselection" */ val MARKS_SELECTION: typings.tableauJsApi.enumsMod.TableauEventName.MARKS_SELECTION & String = js.native
      
      /* "parametervaluechange" */ val PARAMETER_VALUE_CHANGE: typings.tableauJsApi.enumsMod.TableauEventName.PARAMETER_VALUE_CHANGE & String = js.native
      
      /* "storypointswitch" */ val STORY_POINT_SWITCH: typings.tableauJsApi.enumsMod.TableauEventName.STORY_POINT_SWITCH & String = js.native
      
      /* "tabswitch" */ val TAB_SWITCH: typings.tableauJsApi.enumsMod.TableauEventName.TAB_SWITCH & String = js.native
      
      /* "toolbarstatechange" */ val TOOLBAR_STATE_CHANGE: typings.tableauJsApi.enumsMod.TableauEventName.TOOLBAR_STATE_CHANGE & String = js.native
      
      /* "urlaction" */ val URL_ACTION: typings.tableauJsApi.enumsMod.TableauEventName.URL_ACTION & String = js.native
      
      /* "vizresize" */ val VIZ_RESIZE: typings.tableauJsApi.enumsMod.TableauEventName.VIZ_RESIZE & String = js.native
    }
    
    @JSGlobal("tableau.ToolbarButtonName")
    @js.native
    object ToolbarButtonName extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.ToolbarButtonName & String] = js.native
      
      /* "redo" */ val REDO: typings.tableauJsApi.enumsMod.ToolbarButtonName.REDO & String = js.native
      
      /* "undo" */ val UNDO: typings.tableauJsApi.enumsMod.ToolbarButtonName.UNDO & String = js.native
    }
    
    @JSGlobal("tableau.ToolbarPosition")
    @js.native
    object ToolbarPosition extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.tableauJsApi.enumsMod.ToolbarPosition & String] = js.native
      
      /* "bottom" */ val BOTTOM: typings.tableauJsApi.enumsMod.ToolbarPosition.BOTTOM & String = js.native
      
      /* "top" */ val TOP: typings.tableauJsApi.enumsMod.ToolbarPosition.TOP & String = js.native
    }
    
    @JSGlobal("tableau.ToolbarState")
    @js.native
    open class ToolbarState ()
      extends typings.tableauJsApi.mod.ToolbarState
    
    @JSGlobal("tableau.Viz")
    @js.native
    open class Viz protected ()
      extends typings.tableauJsApi.mod.Viz {
      def this(parentElement: HTMLElement, url: String, options: VizCreateOptions) = this()
    }
    
    @JSGlobal("tableau.VizManager")
    @js.native
    open class VizManager ()
      extends typings.tableauJsApi.mod.VizManager
  }
}

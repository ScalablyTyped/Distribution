package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCode extends js.Object

@JSGlobal("tableau.ErrorCode")
@js.native
object ErrorCode extends js.Object {
  /** The browser is not capable of supporting the Tableau JavaScript API. */
  @js.native
  sealed trait BROWSER_NOT_CAPABLE
    extends tableauLib.tableauNs.ErrorCode
  
  /** The permissions on a workbook or a view do not allow downloading the workbook. */
  @js.native
  sealed trait DOWNLOAD_WORKBOOK_NOT_ALLOWED
    extends tableauLib.tableauNs.ErrorCode
  
  /** An error occurred while attempting to perform a filter operation. */
  @js.native
  sealed trait FILTER_CANNOT_BE_PERFORMED
    extends tableauLib.tableauNs.ErrorCode
  
  /** Attempted to switch to a sheet by index that does not exist in the workbook. */
  @js.native
  sealed trait INDEX_OUT_OF_RANGE
    extends tableauLib.tableauNs.ErrorCode
  
  /** An error occurred within the Tableau JavaScript API. Contact Tableau Support. */
  @js.native
  sealed trait INTERNAL_ERROR
    extends tableauLib.tableauNs.ErrorCode
  
  /** An invalid aggregation was specified for the filter, such as setting a range filter to "SUM(Sales)" instead of "Sales". */
  @js.native
  sealed trait INVALID_AGGREGATION_FIELD_NAME
    extends tableauLib.tableauNs.ErrorCode
  
  /** An operation was attempted on a custom view that does not exist. */
  @js.native
  sealed trait INVALID_CUSTOM_VIEW_NAME
    extends tableauLib.tableauNs.ErrorCode
  
  /** An invalid date was specified in a method that required a date parameter. */
  @js.native
  sealed trait INVALID_DATE_PARAMETER
    extends tableauLib.tableauNs.ErrorCode
  
  /** A filter operation was attempted on a field that does not exist in the data source. */
  @js.native
  sealed trait INVALID_FILTER_FIELDNAME
    extends tableauLib.tableauNs.ErrorCode
  
  /**
           * Either a filter operation was attempted on a field that does not exist in the data source,
           * or the value supplied in the filter operation is the wrong data type or format.
           */
  @js.native
  sealed trait INVALID_FILTER_FIELDNAME_OR_VALUE
    extends tableauLib.tableauNs.ErrorCode
  
  /** A filter operation was attempted using a value that is the wrong data type or format. */
  @js.native
  sealed trait INVALID_FILTER_FIELDVALUE
    extends tableauLib.tableauNs.ErrorCode
  
  /** A parameter is not the correct data type or format. The name of the parameter is specified in the Error.message field. */
  @js.native
  sealed trait INVALID_PARAMETER
    extends tableauLib.tableauNs.ErrorCode
  
  /** An invalid date value was specified in a Sheet.selectMarksAsync() call for a date field. */
  @js.native
  sealed trait INVALID_SELECTION_DATE
    extends tableauLib.tableauNs.ErrorCode
  
  /** A field was specified in a Sheet.selectMarksAsync() call that does not exist in the data source. */
  @js.native
  sealed trait INVALID_SELECTION_FIELDNAME
    extends tableauLib.tableauNs.ErrorCode
  
  /** An invalid value was specified in a Sheet.selectMarksAsync() call. */
  @js.native
  sealed trait INVALID_SELECTION_VALUE
    extends tableauLib.tableauNs.ErrorCode
  
  /** A negative size was specified or the maxSize value is less than minSize in Sheet.changeSizeAsync(). */
  @js.native
  sealed trait INVALID_SIZE
    extends tableauLib.tableauNs.ErrorCode
  
  /**
           * A behavior other than SheetSizeBehavior.AUTOMATIC was specified in
           * Sheet.changeSizeAsync() when the sheet is a Worksheet instance.
           */
  @js.native
  sealed trait INVALID_SIZE_BEHAVIOR_ON_WORKSHEET
    extends tableauLib.tableauNs.ErrorCode
  
  @js.native
  sealed trait INVALID_TOOLBAR_BUTTON_NAME
    extends tableauLib.tableauNs.ErrorCode
  
  /** The URL specified in the Viz class constructor is not valid. */
  @js.native
  sealed trait INVALID_URL
    extends tableauLib.tableauNs.ErrorCode
  
  @js.native
  sealed trait MAX_VIZ_RESIZE_ATTEMPTS
    extends tableauLib.tableauNs.ErrorCode
  
  /** The maxSize field is missing in Sheet.changeSizeAsync() when specifying SheetSizeBehavior.ATMOST. */
  @js.native
  sealed trait MISSING_MAX_SIZE
    extends tableauLib.tableauNs.ErrorCode
  
  /**
           * Either or both of the minSize or maxSize fields is missing in
           * Sheet.changeSizeAsync() when specifying SheetSizeBehavior.RANGE.
           */
  @js.native
  sealed trait MISSING_MINMAX_SIZE
    extends tableauLib.tableauNs.ErrorCode
  
  /** The minSize field is missing in Sheet.changeSizeAsync() when specifying SheetSizeBehavior.ATLEAST. */
  @js.native
  sealed trait MISSING_MIN_SIZE
    extends tableauLib.tableauNs.ErrorCode
  
  /** The rangeN field is missing for a relative date filter of type LASTN or NEXTN. */
  @js.native
  sealed trait MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS
    extends tableauLib.tableauNs.ErrorCode
  
  /** An operation was attempted on a sheet that is not active or embedded within the active dashboard. */
  @js.native
  sealed trait NOT_ACTIVE_SHEET
    extends tableauLib.tableauNs.ErrorCode
  
  /** An attempt was made to access Sheet.getUrl() on a hidden sheet. Hidden sheets do not have URLs. */
  @js.native
  sealed trait NO_URL_FOR_HIDDEN_WORKSHEET
    extends tableauLib.tableauNs.ErrorCode
  
  /** One or both of the parentElement or the URL parameters is not specified in the Viz constructor. */
  @js.native
  sealed trait NO_URL_OR_PARENT_ELEMENT_NOT_FOUND
    extends tableauLib.tableauNs.ErrorCode
  
  /** A required parameter was not specified, null, or an empty string/array. */
  @js.native
  sealed trait NULL_OR_EMPTY_PARAMETER
    extends tableauLib.tableauNs.ErrorCode
  
  /** A general-purpose server error occurred. Details are contained in the Error object. */
  @js.native
  sealed trait SERVER_ERROR
    extends tableauLib.tableauNs.ErrorCode
  
  /** An operation was attempted on a sheet that does not exist in the workbook. */
  @js.native
  sealed trait SHEET_NOT_IN_WORKBOOK
    extends tableauLib.tableauNs.ErrorCode
  
  /** An operation is performed on a CustomView object that is no longer valid (it has been removed). */
  @js.native
  sealed trait STALE_DATA_REFERENCE
    extends tableauLib.tableauNs.ErrorCode
  
  /** An unknown event name was specified in the call to Viz.addEventListener or Viz.removeEventListener. */
  @js.native
  sealed trait UNSUPPORTED_EVENT_NAME
    extends tableauLib.tableauNs.ErrorCode
  
  /** A Viz object has already been created as a child of the parentElement specified in the Viz constructor. */
  @js.native
  sealed trait VIZ_ALREADY_IN_MANAGER
    extends tableauLib.tableauNs.ErrorCode
  
  /* "browserNotCapable" */ val BROWSER_NOT_CAPABLE: BROWSER_NOT_CAPABLE with java.lang.String = js.native
  /* "downloadWorkbookNotAllowed" */ val DOWNLOAD_WORKBOOK_NOT_ALLOWED: DOWNLOAD_WORKBOOK_NOT_ALLOWED with java.lang.String = js.native
  /* "filterCannotBePerformed" */ val FILTER_CANNOT_BE_PERFORMED: FILTER_CANNOT_BE_PERFORMED with java.lang.String = js.native
  /* "indexOutOfRange" */ val INDEX_OUT_OF_RANGE: INDEX_OUT_OF_RANGE with java.lang.String = js.native
  /* "internalError" */ val INTERNAL_ERROR: INTERNAL_ERROR with java.lang.String = js.native
  /* "invalidAggregationFieldName" */ val INVALID_AGGREGATION_FIELD_NAME: INVALID_AGGREGATION_FIELD_NAME with java.lang.String = js.native
  /* "invalidCustomViewName" */ val INVALID_CUSTOM_VIEW_NAME: INVALID_CUSTOM_VIEW_NAME with java.lang.String = js.native
  /* "invalidDateParameter" */ val INVALID_DATE_PARAMETER: INVALID_DATE_PARAMETER with java.lang.String = js.native
  /* "invalidFilterFieldName" */ val INVALID_FILTER_FIELDNAME: INVALID_FILTER_FIELDNAME with java.lang.String = js.native
  /* "invalidFilterFieldNameOrValue" */ val INVALID_FILTER_FIELDNAME_OR_VALUE: INVALID_FILTER_FIELDNAME_OR_VALUE with java.lang.String = js.native
  /* "invalidFilterFieldValue" */ val INVALID_FILTER_FIELDVALUE: INVALID_FILTER_FIELDVALUE with java.lang.String = js.native
  /* "invalidParameter" */ val INVALID_PARAMETER: INVALID_PARAMETER with java.lang.String = js.native
  /* "invalidSelectionDate" */ val INVALID_SELECTION_DATE: INVALID_SELECTION_DATE with java.lang.String = js.native
  /* "invalidSelectionFieldName" */ val INVALID_SELECTION_FIELDNAME: INVALID_SELECTION_FIELDNAME with java.lang.String = js.native
  /* "invalidSelectionValue" */ val INVALID_SELECTION_VALUE: INVALID_SELECTION_VALUE with java.lang.String = js.native
  /* "invalidSize" */ val INVALID_SIZE: INVALID_SIZE with java.lang.String = js.native
  /* "invalidSizeBehaviorOnWorksheet" */ val INVALID_SIZE_BEHAVIOR_ON_WORKSHEET: INVALID_SIZE_BEHAVIOR_ON_WORKSHEET with java.lang.String = js.native
  /* "invalidToolbarButtonName" */ val INVALID_TOOLBAR_BUTTON_NAME: INVALID_TOOLBAR_BUTTON_NAME with java.lang.String = js.native
  /* "invalidUrl" */ val INVALID_URL: INVALID_URL with java.lang.String = js.native
  /* "maxVizResizeAttempts" */ val MAX_VIZ_RESIZE_ATTEMPTS: MAX_VIZ_RESIZE_ATTEMPTS with java.lang.String = js.native
  /* "missingMaxSize" */ val MISSING_MAX_SIZE: MISSING_MAX_SIZE with java.lang.String = js.native
  /* "missingMinMaxSize" */ val MISSING_MINMAX_SIZE: MISSING_MINMAX_SIZE with java.lang.String = js.native
  /* "missingMinSize" */ val MISSING_MIN_SIZE: MISSING_MIN_SIZE with java.lang.String = js.native
  /* "missingRangeNForRelativeDateFilters" */ val MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS: MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS with java.lang.String = js.native
  /* "notActiveSheet" */ val NOT_ACTIVE_SHEET: NOT_ACTIVE_SHEET with java.lang.String = js.native
  /* "noUrlForHiddenWorksheet" */ val NO_URL_FOR_HIDDEN_WORKSHEET: NO_URL_FOR_HIDDEN_WORKSHEET with java.lang.String = js.native
  /* "noUrlOrParentElementNotFound" */ val NO_URL_OR_PARENT_ELEMENT_NOT_FOUND: NO_URL_OR_PARENT_ELEMENT_NOT_FOUND with java.lang.String = js.native
  /* "nullOrEmptyParameter" */ val NULL_OR_EMPTY_PARAMETER: NULL_OR_EMPTY_PARAMETER with java.lang.String = js.native
  /* "serverError" */ val SERVER_ERROR: SERVER_ERROR with java.lang.String = js.native
  /* "sheetNotInWorkbook" */ val SHEET_NOT_IN_WORKBOOK: SHEET_NOT_IN_WORKBOOK with java.lang.String = js.native
  /* "staleDataReference" */ val STALE_DATA_REFERENCE: STALE_DATA_REFERENCE with java.lang.String = js.native
  /* "unsupportedEventName" */ val UNSUPPORTED_EVENT_NAME: UNSUPPORTED_EVENT_NAME with java.lang.String = js.native
  /* "vizAlreadyInManager" */ val VIZ_ALREADY_IN_MANAGER: VIZ_ALREADY_IN_MANAGER with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.ErrorCode with java.lang.String] = js.native
}


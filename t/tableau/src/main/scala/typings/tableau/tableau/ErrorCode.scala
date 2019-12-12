package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
import typings.tableau.tableau.ErrorCode.BROWSER_NOT_CAPABLE
import typings.tableau.tableau.ErrorCode.DOWNLOAD_WORKBOOK_NOT_ALLOWED
import typings.tableau.tableau.ErrorCode.FILTER_CANNOT_BE_PERFORMED
import typings.tableau.tableau.ErrorCode.INDEX_OUT_OF_RANGE
import typings.tableau.tableau.ErrorCode.INTERNAL_ERROR
import typings.tableau.tableau.ErrorCode.INVALID_AGGREGATION_FIELD_NAME
import typings.tableau.tableau.ErrorCode.INVALID_CUSTOM_VIEW_NAME
import typings.tableau.tableau.ErrorCode.INVALID_DATE_PARAMETER
import typings.tableau.tableau.ErrorCode.INVALID_FILTER_FIELDNAME
import typings.tableau.tableau.ErrorCode.INVALID_FILTER_FIELDNAME_OR_VALUE
import typings.tableau.tableau.ErrorCode.INVALID_FILTER_FIELDVALUE
import typings.tableau.tableau.ErrorCode.INVALID_PARAMETER
import typings.tableau.tableau.ErrorCode.INVALID_SELECTION_DATE
import typings.tableau.tableau.ErrorCode.INVALID_SELECTION_FIELDNAME
import typings.tableau.tableau.ErrorCode.INVALID_SELECTION_VALUE
import typings.tableau.tableau.ErrorCode.INVALID_SIZE
import typings.tableau.tableau.ErrorCode.INVALID_SIZE_BEHAVIOR_ON_WORKSHEET
import typings.tableau.tableau.ErrorCode.INVALID_TOOLBAR_BUTTON_NAME
import typings.tableau.tableau.ErrorCode.INVALID_URL
import typings.tableau.tableau.ErrorCode.MAX_VIZ_RESIZE_ATTEMPTS
import typings.tableau.tableau.ErrorCode.MISSING_MAX_SIZE
import typings.tableau.tableau.ErrorCode.MISSING_MINMAX_SIZE
import typings.tableau.tableau.ErrorCode.MISSING_MIN_SIZE
import typings.tableau.tableau.ErrorCode.MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS
import typings.tableau.tableau.ErrorCode.NOT_ACTIVE_SHEET
import typings.tableau.tableau.ErrorCode.NO_URL_FOR_HIDDEN_WORKSHEET
import typings.tableau.tableau.ErrorCode.NO_URL_OR_PARENT_ELEMENT_NOT_FOUND
import typings.tableau.tableau.ErrorCode.NULL_OR_EMPTY_PARAMETER
import typings.tableau.tableau.ErrorCode.SERVER_ERROR
import typings.tableau.tableau.ErrorCode.SHEET_NOT_IN_WORKBOOK
import typings.tableau.tableau.ErrorCode.STALE_DATA_REFERENCE
import typings.tableau.tableau.ErrorCode.UNSUPPORTED_EVENT_NAME
import typings.tableau.tableau.ErrorCode.VIZ_ALREADY_IN_MANAGER
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
  sealed trait BROWSER_NOT_CAPABLE extends ErrorCode
  
  /** The permissions on a workbook or a view do not allow downloading the workbook. */
  @js.native
  sealed trait DOWNLOAD_WORKBOOK_NOT_ALLOWED extends ErrorCode
  
  /** An error occurred while attempting to perform a filter operation. */
  @js.native
  sealed trait FILTER_CANNOT_BE_PERFORMED extends ErrorCode
  
  /** Attempted to switch to a sheet by index that does not exist in the workbook. */
  @js.native
  sealed trait INDEX_OUT_OF_RANGE extends ErrorCode
  
  /** An error occurred within the Tableau JavaScript API. Contact Tableau Support. */
  @js.native
  sealed trait INTERNAL_ERROR extends ErrorCode
  
  /** An invalid aggregation was specified for the filter, such as setting a range filter to "SUM(Sales)" instead of "Sales". */
  @js.native
  sealed trait INVALID_AGGREGATION_FIELD_NAME extends ErrorCode
  
  /** An operation was attempted on a custom view that does not exist. */
  @js.native
  sealed trait INVALID_CUSTOM_VIEW_NAME extends ErrorCode
  
  /** An invalid date was specified in a method that required a date parameter. */
  @js.native
  sealed trait INVALID_DATE_PARAMETER extends ErrorCode
  
  /** A filter operation was attempted on a field that does not exist in the data source. */
  @js.native
  sealed trait INVALID_FILTER_FIELDNAME extends ErrorCode
  
  /**
    * Either a filter operation was attempted on a field that does not exist in the data source,
    * or the value supplied in the filter operation is the wrong data type or format.
    */
  @js.native
  sealed trait INVALID_FILTER_FIELDNAME_OR_VALUE extends ErrorCode
  
  /** A filter operation was attempted using a value that is the wrong data type or format. */
  @js.native
  sealed trait INVALID_FILTER_FIELDVALUE extends ErrorCode
  
  /** A parameter is not the correct data type or format. The name of the parameter is specified in the Error.message field. */
  @js.native
  sealed trait INVALID_PARAMETER extends ErrorCode
  
  /** An invalid date value was specified in a Sheet.selectMarksAsync() call for a date field. */
  @js.native
  sealed trait INVALID_SELECTION_DATE extends ErrorCode
  
  /** A field was specified in a Sheet.selectMarksAsync() call that does not exist in the data source. */
  @js.native
  sealed trait INVALID_SELECTION_FIELDNAME extends ErrorCode
  
  /** An invalid value was specified in a Sheet.selectMarksAsync() call. */
  @js.native
  sealed trait INVALID_SELECTION_VALUE extends ErrorCode
  
  /** A negative size was specified or the maxSize value is less than minSize in Sheet.changeSizeAsync(). */
  @js.native
  sealed trait INVALID_SIZE extends ErrorCode
  
  /**
    * A behavior other than SheetSizeBehavior.AUTOMATIC was specified in
    * Sheet.changeSizeAsync() when the sheet is a Worksheet instance.
    */
  @js.native
  sealed trait INVALID_SIZE_BEHAVIOR_ON_WORKSHEET extends ErrorCode
  
  @js.native
  sealed trait INVALID_TOOLBAR_BUTTON_NAME extends ErrorCode
  
  /** The URL specified in the Viz class constructor is not valid. */
  @js.native
  sealed trait INVALID_URL extends ErrorCode
  
  @js.native
  sealed trait MAX_VIZ_RESIZE_ATTEMPTS extends ErrorCode
  
  /** The maxSize field is missing in Sheet.changeSizeAsync() when specifying SheetSizeBehavior.ATMOST. */
  @js.native
  sealed trait MISSING_MAX_SIZE extends ErrorCode
  
  /**
    * Either or both of the minSize or maxSize fields is missing in
    * Sheet.changeSizeAsync() when specifying SheetSizeBehavior.RANGE.
    */
  @js.native
  sealed trait MISSING_MINMAX_SIZE extends ErrorCode
  
  /** The minSize field is missing in Sheet.changeSizeAsync() when specifying SheetSizeBehavior.ATLEAST. */
  @js.native
  sealed trait MISSING_MIN_SIZE extends ErrorCode
  
  /** The rangeN field is missing for a relative date filter of type LASTN or NEXTN. */
  @js.native
  sealed trait MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS extends ErrorCode
  
  /** An operation was attempted on a sheet that is not active or embedded within the active dashboard. */
  @js.native
  sealed trait NOT_ACTIVE_SHEET extends ErrorCode
  
  /** An attempt was made to access Sheet.getUrl() on a hidden sheet. Hidden sheets do not have URLs. */
  @js.native
  sealed trait NO_URL_FOR_HIDDEN_WORKSHEET extends ErrorCode
  
  /** One or both of the parentElement or the URL parameters is not specified in the Viz constructor. */
  @js.native
  sealed trait NO_URL_OR_PARENT_ELEMENT_NOT_FOUND extends ErrorCode
  
  /** A required parameter was not specified, null, or an empty string/array. */
  @js.native
  sealed trait NULL_OR_EMPTY_PARAMETER extends ErrorCode
  
  /** A general-purpose server error occurred. Details are contained in the Error object. */
  @js.native
  sealed trait SERVER_ERROR extends ErrorCode
  
  /** An operation was attempted on a sheet that does not exist in the workbook. */
  @js.native
  sealed trait SHEET_NOT_IN_WORKBOOK extends ErrorCode
  
  /** An operation is performed on a CustomView object that is no longer valid (it has been removed). */
  @js.native
  sealed trait STALE_DATA_REFERENCE extends ErrorCode
  
  /** An unknown event name was specified in the call to Viz.addEventListener or Viz.removeEventListener. */
  @js.native
  sealed trait UNSUPPORTED_EVENT_NAME extends ErrorCode
  
  /** A Viz object has already been created as a child of the parentElement specified in the Viz constructor. */
  @js.native
  sealed trait VIZ_ALREADY_IN_MANAGER extends ErrorCode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCode with String] = js.native
  /* "browserNotCapable" */ @js.native
  object BROWSER_NOT_CAPABLE extends TopLevel[BROWSER_NOT_CAPABLE with String]
  
  /* "downloadWorkbookNotAllowed" */ @js.native
  object DOWNLOAD_WORKBOOK_NOT_ALLOWED extends TopLevel[DOWNLOAD_WORKBOOK_NOT_ALLOWED with String]
  
  /* "filterCannotBePerformed" */ @js.native
  object FILTER_CANNOT_BE_PERFORMED extends TopLevel[FILTER_CANNOT_BE_PERFORMED with String]
  
  /* "indexOutOfRange" */ @js.native
  object INDEX_OUT_OF_RANGE extends TopLevel[INDEX_OUT_OF_RANGE with String]
  
  /* "internalError" */ @js.native
  object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with String]
  
  /* "invalidAggregationFieldName" */ @js.native
  object INVALID_AGGREGATION_FIELD_NAME extends TopLevel[INVALID_AGGREGATION_FIELD_NAME with String]
  
  /* "invalidCustomViewName" */ @js.native
  object INVALID_CUSTOM_VIEW_NAME extends TopLevel[INVALID_CUSTOM_VIEW_NAME with String]
  
  /* "invalidDateParameter" */ @js.native
  object INVALID_DATE_PARAMETER extends TopLevel[INVALID_DATE_PARAMETER with String]
  
  /* "invalidFilterFieldName" */ @js.native
  object INVALID_FILTER_FIELDNAME extends TopLevel[INVALID_FILTER_FIELDNAME with String]
  
  /* "invalidFilterFieldNameOrValue" */ @js.native
  object INVALID_FILTER_FIELDNAME_OR_VALUE extends TopLevel[INVALID_FILTER_FIELDNAME_OR_VALUE with String]
  
  /* "invalidFilterFieldValue" */ @js.native
  object INVALID_FILTER_FIELDVALUE extends TopLevel[INVALID_FILTER_FIELDVALUE with String]
  
  /* "invalidParameter" */ @js.native
  object INVALID_PARAMETER extends TopLevel[INVALID_PARAMETER with String]
  
  /* "invalidSelectionDate" */ @js.native
  object INVALID_SELECTION_DATE extends TopLevel[INVALID_SELECTION_DATE with String]
  
  /* "invalidSelectionFieldName" */ @js.native
  object INVALID_SELECTION_FIELDNAME extends TopLevel[INVALID_SELECTION_FIELDNAME with String]
  
  /* "invalidSelectionValue" */ @js.native
  object INVALID_SELECTION_VALUE extends TopLevel[INVALID_SELECTION_VALUE with String]
  
  /* "invalidSize" */ @js.native
  object INVALID_SIZE extends TopLevel[INVALID_SIZE with String]
  
  /* "invalidSizeBehaviorOnWorksheet" */ @js.native
  object INVALID_SIZE_BEHAVIOR_ON_WORKSHEET extends TopLevel[INVALID_SIZE_BEHAVIOR_ON_WORKSHEET with String]
  
  /* "invalidToolbarButtonName" */ @js.native
  object INVALID_TOOLBAR_BUTTON_NAME extends TopLevel[INVALID_TOOLBAR_BUTTON_NAME with String]
  
  /* "invalidUrl" */ @js.native
  object INVALID_URL extends TopLevel[INVALID_URL with String]
  
  /* "maxVizResizeAttempts" */ @js.native
  object MAX_VIZ_RESIZE_ATTEMPTS extends TopLevel[MAX_VIZ_RESIZE_ATTEMPTS with String]
  
  /* "missingMaxSize" */ @js.native
  object MISSING_MAX_SIZE extends TopLevel[MISSING_MAX_SIZE with String]
  
  /* "missingMinMaxSize" */ @js.native
  object MISSING_MINMAX_SIZE extends TopLevel[MISSING_MINMAX_SIZE with String]
  
  /* "missingMinSize" */ @js.native
  object MISSING_MIN_SIZE extends TopLevel[MISSING_MIN_SIZE with String]
  
  /* "missingRangeNForRelativeDateFilters" */ @js.native
  object MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS extends TopLevel[MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS with String]
  
  /* "notActiveSheet" */ @js.native
  object NOT_ACTIVE_SHEET extends TopLevel[NOT_ACTIVE_SHEET with String]
  
  /* "noUrlForHiddenWorksheet" */ @js.native
  object NO_URL_FOR_HIDDEN_WORKSHEET extends TopLevel[NO_URL_FOR_HIDDEN_WORKSHEET with String]
  
  /* "noUrlOrParentElementNotFound" */ @js.native
  object NO_URL_OR_PARENT_ELEMENT_NOT_FOUND extends TopLevel[NO_URL_OR_PARENT_ELEMENT_NOT_FOUND with String]
  
  /* "nullOrEmptyParameter" */ @js.native
  object NULL_OR_EMPTY_PARAMETER extends TopLevel[NULL_OR_EMPTY_PARAMETER with String]
  
  /* "serverError" */ @js.native
  object SERVER_ERROR extends TopLevel[SERVER_ERROR with String]
  
  /* "sheetNotInWorkbook" */ @js.native
  object SHEET_NOT_IN_WORKBOOK extends TopLevel[SHEET_NOT_IN_WORKBOOK with String]
  
  /* "staleDataReference" */ @js.native
  object STALE_DATA_REFERENCE extends TopLevel[STALE_DATA_REFERENCE with String]
  
  /* "unsupportedEventName" */ @js.native
  object UNSUPPORTED_EVENT_NAME extends TopLevel[UNSUPPORTED_EVENT_NAME with String]
  
  /* "vizAlreadyInManager" */ @js.native
  object VIZ_ALREADY_IN_MANAGER extends TopLevel[VIZ_ALREADY_IN_MANAGER with String]
  
}


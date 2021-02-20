package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
@JSGlobal("tableau.ErrorCode")
@js.native
object ErrorCode extends StObject {
  
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
}

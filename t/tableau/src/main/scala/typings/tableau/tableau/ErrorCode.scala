package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
@JSGlobal("tableau.ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  /** The browser is not capable of supporting the Tableau JavaScript API. */
  @js.native
  sealed trait BROWSER_NOT_CAPABLE
    extends StObject
       with ErrorCode
  
  /** The permissions on a workbook or a view do not allow downloading the workbook. */
  @js.native
  sealed trait DOWNLOAD_WORKBOOK_NOT_ALLOWED
    extends StObject
       with ErrorCode
  
  /** An error occurred while attempting to perform a filter operation. */
  @js.native
  sealed trait FILTER_CANNOT_BE_PERFORMED
    extends StObject
       with ErrorCode
  
  /** Attempted to switch to a sheet by index that does not exist in the workbook. */
  @js.native
  sealed trait INDEX_OUT_OF_RANGE
    extends StObject
       with ErrorCode
  
  /** An error occurred within the Tableau JavaScript API. Contact Tableau Support. */
  @js.native
  sealed trait INTERNAL_ERROR
    extends StObject
       with ErrorCode
  
  /** An invalid aggregation was specified for the filter, such as setting a range filter to "SUM(Sales)" instead of "Sales". */
  @js.native
  sealed trait INVALID_AGGREGATION_FIELD_NAME
    extends StObject
       with ErrorCode
  
  /** An operation was attempted on a custom view that does not exist. */
  @js.native
  sealed trait INVALID_CUSTOM_VIEW_NAME
    extends StObject
       with ErrorCode
  
  /** An invalid date was specified in a method that required a date parameter. */
  @js.native
  sealed trait INVALID_DATE_PARAMETER
    extends StObject
       with ErrorCode
  
  /** A filter operation was attempted on a field that does not exist in the data source. */
  @js.native
  sealed trait INVALID_FILTER_FIELDNAME
    extends StObject
       with ErrorCode
  
  /**
    * Either a filter operation was attempted on a field that does not exist in the data source,
    * or the value supplied in the filter operation is the wrong data type or format.
    */
  @js.native
  sealed trait INVALID_FILTER_FIELDNAME_OR_VALUE
    extends StObject
       with ErrorCode
  
  /** A filter operation was attempted using a value that is the wrong data type or format. */
  @js.native
  sealed trait INVALID_FILTER_FIELDVALUE
    extends StObject
       with ErrorCode
  
  /** A parameter is not the correct data type or format. The name of the parameter is specified in the Error.message field. */
  @js.native
  sealed trait INVALID_PARAMETER
    extends StObject
       with ErrorCode
  
  /** An invalid date value was specified in a Sheet.selectMarksAsync() call for a date field. */
  @js.native
  sealed trait INVALID_SELECTION_DATE
    extends StObject
       with ErrorCode
  
  /** A field was specified in a Sheet.selectMarksAsync() call that does not exist in the data source. */
  @js.native
  sealed trait INVALID_SELECTION_FIELDNAME
    extends StObject
       with ErrorCode
  
  /** An invalid value was specified in a Sheet.selectMarksAsync() call. */
  @js.native
  sealed trait INVALID_SELECTION_VALUE
    extends StObject
       with ErrorCode
  
  /** A negative size was specified or the maxSize value is less than minSize in Sheet.changeSizeAsync(). */
  @js.native
  sealed trait INVALID_SIZE
    extends StObject
       with ErrorCode
  
  /**
    * A behavior other than SheetSizeBehavior.AUTOMATIC was specified in
    * Sheet.changeSizeAsync() when the sheet is a Worksheet instance.
    */
  @js.native
  sealed trait INVALID_SIZE_BEHAVIOR_ON_WORKSHEET
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait INVALID_TOOLBAR_BUTTON_NAME
    extends StObject
       with ErrorCode
  
  /** The URL specified in the Viz class constructor is not valid. */
  @js.native
  sealed trait INVALID_URL
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait MAX_VIZ_RESIZE_ATTEMPTS
    extends StObject
       with ErrorCode
  
  /** The maxSize field is missing in Sheet.changeSizeAsync() when specifying SheetSizeBehavior.ATMOST. */
  @js.native
  sealed trait MISSING_MAX_SIZE
    extends StObject
       with ErrorCode
  
  /**
    * Either or both of the minSize or maxSize fields is missing in
    * Sheet.changeSizeAsync() when specifying SheetSizeBehavior.RANGE.
    */
  @js.native
  sealed trait MISSING_MINMAX_SIZE
    extends StObject
       with ErrorCode
  
  /** The minSize field is missing in Sheet.changeSizeAsync() when specifying SheetSizeBehavior.ATLEAST. */
  @js.native
  sealed trait MISSING_MIN_SIZE
    extends StObject
       with ErrorCode
  
  /** The rangeN field is missing for a relative date filter of type LASTN or NEXTN. */
  @js.native
  sealed trait MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS
    extends StObject
       with ErrorCode
  
  /** An operation was attempted on a sheet that is not active or embedded within the active dashboard. */
  @js.native
  sealed trait NOT_ACTIVE_SHEET
    extends StObject
       with ErrorCode
  
  /** An attempt was made to access Sheet.getUrl() on a hidden sheet. Hidden sheets do not have URLs. */
  @js.native
  sealed trait NO_URL_FOR_HIDDEN_WORKSHEET
    extends StObject
       with ErrorCode
  
  /** One or both of the parentElement or the URL parameters is not specified in the Viz constructor. */
  @js.native
  sealed trait NO_URL_OR_PARENT_ELEMENT_NOT_FOUND
    extends StObject
       with ErrorCode
  
  /** A required parameter was not specified, null, or an empty string/array. */
  @js.native
  sealed trait NULL_OR_EMPTY_PARAMETER
    extends StObject
       with ErrorCode
  
  /** A general-purpose server error occurred. Details are contained in the Error object. */
  @js.native
  sealed trait SERVER_ERROR
    extends StObject
       with ErrorCode
  
  /** An operation was attempted on a sheet that does not exist in the workbook. */
  @js.native
  sealed trait SHEET_NOT_IN_WORKBOOK
    extends StObject
       with ErrorCode
  
  /** An operation is performed on a CustomView object that is no longer valid (it has been removed). */
  @js.native
  sealed trait STALE_DATA_REFERENCE
    extends StObject
       with ErrorCode
  
  /** An unknown event name was specified in the call to Viz.addEventListener or Viz.removeEventListener. */
  @js.native
  sealed trait UNSUPPORTED_EVENT_NAME
    extends StObject
       with ErrorCode
  
  /** A Viz object has already been created as a child of the parentElement specified in the Viz constructor. */
  @js.native
  sealed trait VIZ_ALREADY_IN_MANAGER
    extends StObject
       with ErrorCode
}

package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
@JSImport("tableau-js-api/enums", "ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCode & String] = js.native
  
  @js.native
  sealed trait BROWSER_NOT_CAPABLE
    extends StObject
       with ErrorCode
  /* "browserNotCapable" */ val BROWSER_NOT_CAPABLE: typings.tableauJsApi.enumsMod.ErrorCode.BROWSER_NOT_CAPABLE & String = js.native
  
  @js.native
  sealed trait DOWNLOAD_WORKBOOK_NOT_ALLOWED
    extends StObject
       with ErrorCode
  /* "downloadWorkbookNotAllowed" */ val DOWNLOAD_WORKBOOK_NOT_ALLOWED: typings.tableauJsApi.enumsMod.ErrorCode.DOWNLOAD_WORKBOOK_NOT_ALLOWED & String = js.native
  
  @js.native
  sealed trait FILTER_CANNOT_BE_PERFORMED
    extends StObject
       with ErrorCode
  /* "filterCannotBePerformed" */ val FILTER_CANNOT_BE_PERFORMED: typings.tableauJsApi.enumsMod.ErrorCode.FILTER_CANNOT_BE_PERFORMED & String = js.native
  
  @js.native
  sealed trait INDEX_OUT_OF_RANGE
    extends StObject
       with ErrorCode
  /* "indexOutOfRange" */ val INDEX_OUT_OF_RANGE: typings.tableauJsApi.enumsMod.ErrorCode.INDEX_OUT_OF_RANGE & String = js.native
  
  @js.native
  sealed trait INTERNAL_ERROR
    extends StObject
       with ErrorCode
  /* "internalError" */ val INTERNAL_ERROR: typings.tableauJsApi.enumsMod.ErrorCode.INTERNAL_ERROR & String = js.native
  
  @js.native
  sealed trait INVALID_AGGREGATION_FIELD_NAME
    extends StObject
       with ErrorCode
  /* "invalidAggregationFieldName" */ val INVALID_AGGREGATION_FIELD_NAME: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_AGGREGATION_FIELD_NAME & String = js.native
  
  @js.native
  sealed trait INVALID_CUSTOM_VIEW_NAME
    extends StObject
       with ErrorCode
  /* "invalidCustomViewName" */ val INVALID_CUSTOM_VIEW_NAME: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_CUSTOM_VIEW_NAME & String = js.native
  
  @js.native
  sealed trait INVALID_DATE_PARAMETER
    extends StObject
       with ErrorCode
  /* "invalidDateParameter" */ val INVALID_DATE_PARAMETER: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_DATE_PARAMETER & String = js.native
  
  @js.native
  sealed trait INVALID_FILTER_FIELDNAME
    extends StObject
       with ErrorCode
  /* "invalidFilterFieldName" */ val INVALID_FILTER_FIELDNAME: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_FILTER_FIELDNAME & String = js.native
  
  @js.native
  sealed trait INVALID_FILTER_FIELDNAME_OR_VALUE
    extends StObject
       with ErrorCode
  /* "invalidFilterFieldNameOrValue" */ val INVALID_FILTER_FIELDNAME_OR_VALUE: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_FILTER_FIELDNAME_OR_VALUE & String = js.native
  
  @js.native
  sealed trait INVALID_FILTER_FIELDVALUE
    extends StObject
       with ErrorCode
  /* "invalidFilterFieldValue" */ val INVALID_FILTER_FIELDVALUE: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_FILTER_FIELDVALUE & String = js.native
  
  @js.native
  sealed trait INVALID_PARAMETER
    extends StObject
       with ErrorCode
  /* "invalidParameter" */ val INVALID_PARAMETER: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_PARAMETER & String = js.native
  
  @js.native
  sealed trait INVALID_SELECTION_DATE
    extends StObject
       with ErrorCode
  /* "invalidSelectionDate" */ val INVALID_SELECTION_DATE: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_SELECTION_DATE & String = js.native
  
  @js.native
  sealed trait INVALID_SELECTION_FIELDNAME
    extends StObject
       with ErrorCode
  /* "invalidSelectionFieldname" */ val INVALID_SELECTION_FIELDNAME: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_SELECTION_FIELDNAME & String = js.native
  
  @js.native
  sealed trait INVALID_SELECTION_VALUE
    extends StObject
       with ErrorCode
  /* "invalidSelectionValue" */ val INVALID_SELECTION_VALUE: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_SELECTION_VALUE & String = js.native
  
  @js.native
  sealed trait INVALID_SIZE
    extends StObject
       with ErrorCode
  /* "invalidSize" */ val INVALID_SIZE: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_SIZE & String = js.native
  
  @js.native
  sealed trait INVALID_SIZE_BEHAVIOR_ON_WORKSHEET
    extends StObject
       with ErrorCode
  /* "invalidSizeBehaviorOnWorksheet" */ val INVALID_SIZE_BEHAVIOR_ON_WORKSHEET: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_SIZE_BEHAVIOR_ON_WORKSHEET & String = js.native
  
  @js.native
  sealed trait INVALID_URL
    extends StObject
       with ErrorCode
  /* "invalidUrl" */ val INVALID_URL: typings.tableauJsApi.enumsMod.ErrorCode.INVALID_URL & String = js.native
  
  @js.native
  sealed trait MISSING_MAX_SIZE
    extends StObject
       with ErrorCode
  /* "missingMaxSize" */ val MISSING_MAX_SIZE: typings.tableauJsApi.enumsMod.ErrorCode.MISSING_MAX_SIZE & String = js.native
  
  @js.native
  sealed trait MISSING_MINMAX_SIZE
    extends StObject
       with ErrorCode
  /* "missingMinMaxSize" */ val MISSING_MINMAX_SIZE: typings.tableauJsApi.enumsMod.ErrorCode.MISSING_MINMAX_SIZE & String = js.native
  
  @js.native
  sealed trait MISSING_MIN_SIZE
    extends StObject
       with ErrorCode
  /* "missingMinSize" */ val MISSING_MIN_SIZE: typings.tableauJsApi.enumsMod.ErrorCode.MISSING_MIN_SIZE & String = js.native
  
  @js.native
  sealed trait MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS
    extends StObject
       with ErrorCode
  /* "missingRangeNForRelativeDateFilters" */ val MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS: typings.tableauJsApi.enumsMod.ErrorCode.MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS & String = js.native
  
  @js.native
  sealed trait NOT_ACTIVE_SHEET
    extends StObject
       with ErrorCode
  /* "notActiveSheet" */ val NOT_ACTIVE_SHEET: typings.tableauJsApi.enumsMod.ErrorCode.NOT_ACTIVE_SHEET & String = js.native
  
  @js.native
  sealed trait NO_URL_FOR_HIDDEN_WORKSHEET
    extends StObject
       with ErrorCode
  /* "noUrlForHiddenWorksheet" */ val NO_URL_FOR_HIDDEN_WORKSHEET: typings.tableauJsApi.enumsMod.ErrorCode.NO_URL_FOR_HIDDEN_WORKSHEET & String = js.native
  
  @js.native
  sealed trait NO_URL_OR_PARENT_ELEMENT_NOT_FOUND
    extends StObject
       with ErrorCode
  /* "noUrlOrParentElementNotFound" */ val NO_URL_OR_PARENT_ELEMENT_NOT_FOUND: typings.tableauJsApi.enumsMod.ErrorCode.NO_URL_OR_PARENT_ELEMENT_NOT_FOUND & String = js.native
  
  @js.native
  sealed trait NULL_OR_EMPTY_PARAMETER
    extends StObject
       with ErrorCode
  /* "nullOrEmptyParameter" */ val NULL_OR_EMPTY_PARAMETER: typings.tableauJsApi.enumsMod.ErrorCode.NULL_OR_EMPTY_PARAMETER & String = js.native
  
  @js.native
  sealed trait SERVER_ERROR
    extends StObject
       with ErrorCode
  /* "serverError" */ val SERVER_ERROR: typings.tableauJsApi.enumsMod.ErrorCode.SERVER_ERROR & String = js.native
  
  @js.native
  sealed trait SHEET_NOT_IN_WORKBOOK
    extends StObject
       with ErrorCode
  /* "sheetNotInWorkbook" */ val SHEET_NOT_IN_WORKBOOK: typings.tableauJsApi.enumsMod.ErrorCode.SHEET_NOT_IN_WORKBOOK & String = js.native
  
  @js.native
  sealed trait STALE_DATA_REFERENCE
    extends StObject
       with ErrorCode
  /* "staleDataReference" */ val STALE_DATA_REFERENCE: typings.tableauJsApi.enumsMod.ErrorCode.STALE_DATA_REFERENCE & String = js.native
  
  @js.native
  sealed trait UNSUPPORTED_EVENT_NAME
    extends StObject
       with ErrorCode
  /* "unsupportedEventName" */ val UNSUPPORTED_EVENT_NAME: typings.tableauJsApi.enumsMod.ErrorCode.UNSUPPORTED_EVENT_NAME & String = js.native
  
  @js.native
  sealed trait VIZ_ALREADY_IN_MANAGER
    extends StObject
       with ErrorCode
  /* "vizAlreadyInManager" */ val VIZ_ALREADY_IN_MANAGER: typings.tableauJsApi.enumsMod.ErrorCode.VIZ_ALREADY_IN_MANAGER & String = js.native
}

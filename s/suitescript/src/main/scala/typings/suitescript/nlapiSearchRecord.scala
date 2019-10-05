package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSearchRecord")
@js.native
object nlapiSearchRecord extends js.Object {
  /**
    * Perform a record search using an existing search or filters and columns.
    * @governance 10 units
    * @restriction returns the first 1000 rows in the search
    *
    * @param {string}        type record type ID.
    * @param {int, string} [id] The internal ID or script ID for the saved search to use for search.
    * @param {nlobjSearchFilter, nlobjSearchFilter[]} [filters] [optional] A single nlobjSearchFilter object - or - an array of nlobjSearchFilter objects.
    * @param {nlobjSearchColumn, nlobjSearchColumn[]} [columns] [optional] A single nlobjSearchColumn object - or - an array of nlobjSearchColumn objects.
    * @return {nlobjSearchResult[]} Returns an array of nlobjSearchResult objects corresponding to the searched records.
    *
    * @exception {SSS_INVALID_RECORD_TYPE}
    * @exception {SSS_TYPE_ARG_REQD}
    * @exception {SSS_INVALID_SRCH_ID}
    * @exception {SSS_INVALID_SRCH_FILTER}
    * @exception {SSS_INVALID_SRCH_FILTER_JOIN}
    * @exception {SSS_INVALID_SRCH_OPERATOR}
    * @exception {SSS_INVALID_SRCH_COL_NAME}
    * @exception {SSS_INVALID_SRCH_COL_JOIN}
    *
    * @since    2007.0
    * @param type
    * @param id
    * @param filters
    * @param columns
    */
  def apply(`type`: String, id: js.Any, filters: js.Any, columns: js.Any): js.Array[nlobjSearchResult] = js.native
}


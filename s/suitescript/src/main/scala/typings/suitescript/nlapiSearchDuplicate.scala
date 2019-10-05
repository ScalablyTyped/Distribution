package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiSearchDuplicate")
@js.native
object nlapiSearchDuplicate extends js.Object {
  /**
    * Perform a duplicate record search using Duplicate Detection criteria.
    * @governance 10 units
    * @restriction returns the first 1000 rows in the search
    *
    * @param {string}        type The recordType you are checking duplicates for (for example, customer|lead|prospect|partner|vendor|contact).
    * @param {string[]}    [fields] array of field names used to detect duplicate (for example, companyname|email|name|phone|address1|city|state|zipcode).
    * @param {int}        [id] internal ID of existing record. Depending on the use case, id may or may not be a required argument.
    * @return {nlobjSearchResult[]} Returns an Array of nlobjSearchResult objects corresponding to the duplicate records.
    *
    * @since    2008.1
    * @param type
    * @param fields
    * @param id?
    */
  def apply(`type`: String, fields: js.Any): js.Array[nlobjSearchResult] = js.native
  def apply(`type`: String, fields: js.Any, id: js.Any): js.Array[nlobjSearchResult] = js.native
}


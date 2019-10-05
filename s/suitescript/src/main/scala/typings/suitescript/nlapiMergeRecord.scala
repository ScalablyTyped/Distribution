package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiMergeRecord")
@js.native
object nlapiMergeRecord extends js.Object {
  /**
    * Perform a mail merge operation using any template and up to 2 records and returns an nlobjFile with the results.
    * @restriction only supported for record types that are available in mail merge: transactions, entities, custom records, and cases
    * @restriction Server SuiteScript only
    * @governance 10 units
    *
    * @param {int}    id internal ID of template
    * @param {string}    baseType primary record type
    * @param {int}    baseId internal ID of primary record
    * @param {string}    [altType] secondary record type
    * @param {int}    [altId] internal ID of secondary record
    * @param {Object}    [fields] Object of merge field values to use in the mail merge (by default all field values are obtained from records) which overrides those from the record.
    * @return {nlobjFile}
    *
    * @since 2008.2
    * @param id
    * @param baseType
    * @param baseId
    * @param altType?
    * @param altId?
    * @param fields?
    * @return
    */
  def apply(id: js.Any, baseType: String, baseId: js.Any): js.Any = js.native
  def apply(id: js.Any, baseType: String, baseId: js.Any, altType: String): js.Any = js.native
  def apply(id: js.Any, baseType: String, baseId: js.Any, altType: String, altId: js.Any): js.Any = js.native
  def apply(id: js.Any, baseType: String, baseId: js.Any, altType: String, altId: js.Any, fields: js.Any): js.Any = js.native
}


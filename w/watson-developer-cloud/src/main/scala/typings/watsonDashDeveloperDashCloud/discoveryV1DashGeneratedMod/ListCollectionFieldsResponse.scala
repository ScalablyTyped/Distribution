package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The list of fetched fields. The fields are returned using a fully qualified name format, however, the format differs slightly from that used by the query operations. * Fields which contain nested JSON objects are assigned a type of "nested". * Fields which belong to a nested object are prefixed with `.properties` (for example, `warnings.properties.severity` means that the `warnings` object has a property called `severity`). * Fields returned from the News collection are prefixed with `v{N}-fullnews-t3-{YEAR}.mappings` (for example, `v5-fullnews-t3-2016.mappings.text.properties.author`). */
trait ListCollectionFieldsResponse extends js.Object {
  /** An array containing information about each field in the collections. */
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
}

object ListCollectionFieldsResponse {
  @scala.inline
  def apply(fields: js.Array[Field] = null): ListCollectionFieldsResponse = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[ListCollectionFieldsResponse]
  }
}

